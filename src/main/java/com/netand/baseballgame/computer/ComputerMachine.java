package com.netand.baseballgame.computer;

import com.netand.baseballgame.common.Ball;

import java.util.ArrayList;
import java.util.List;

import static com.netand.baseballgame.GameStarter.VIEW;

public class ComputerMachine {
    private static final int LENGTH = 3;
    public static final List<Ball> COMPUTER_BALLS = new ArrayList<>( LENGTH );

    public ComputerMachine() {
        while ( COMPUTER_BALLS.size() < LENGTH ) {
            validBall(new Ball());
        }
    }

    //computer ball setting
    public void computerBallSetting() {
        ComputerMachine computerMachine = new ComputerMachine();
        VIEW.computerSetting( COMPUTER_BALLS );
    }

    private void validBall( Ball createBall ) {
        if ( COMPUTER_BALLS.contains(createBall) ) {
            return;
        }

        COMPUTER_BALLS.add( createBall );
    }
}
