package com.netand.baseballgame.common;

import lombok.Getter;

import static com.netand.baseballgame.GameStarter.GAME_ACTION;

@Getter
public class Result {
    private final int MAX = 3;
    private int ballCount;
    private int strikeCount;
    private String nothing;

    public Result(int ballCount, int strikeCount) {
        this.nothing = "-";
        this.ballCount = ballCount;
        this.strikeCount = checkAll(strikeCount);

        checkNoting(ballCount + strikeCount);
    }

    private int checkAll(int strikeCount) {
        if (strikeCount == MAX) {
            GAME_ACTION = false;
        }
        return strikeCount;
    }

    private void checkNoting(int allCount) {
        if (allCount == 0) {
            this.nothing = "일치하는 공이 없습니다.";
        }
    }
}
