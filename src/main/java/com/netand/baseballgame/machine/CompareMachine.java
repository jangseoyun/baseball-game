package com.netand.baseballgame.machine;

import com.netand.baseballgame.common.Ball;
import com.netand.baseballgame.common.Result;

import java.util.List;

import static com.netand.baseballgame.GameStarter.GAME_ACTION;
import static com.netand.baseballgame.computer.ComputerMachine.COMPUTER_BALLS;

public class CompareMachine {
    private static final int ALL = 3;
    private int ballCount;
    private int strikeCount;

    public CompareMachine() {
        this.ballCount = 0;
        this.strikeCount = 0;
    }

    public Result compareNumber( List<Ball> playerBall ) {
        int locate = 0;
        for (Ball ball : playerBall) {
            match(ball, locate);
            locate++;
        }
        GAME_ACTION = ( ballCount != ALL );

        return new Result( (ballCount - strikeCount), strikeCount, GAME_ACTION );
    }

    private void match(Ball ball, int locate) {
        getStrikeCount(ball, locate);
        getBallCount(ball);
    }

    private void getBallCount(Ball ball) {
        if (COMPUTER_BALLS.contains(ball)) {
            ballCount++;
        }
    }

    private void getStrikeCount(Ball ball, int locate) {
        if (COMPUTER_BALLS.get(locate).equals(ball)) {
            strikeCount++;
        }
    }

}
