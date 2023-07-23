package com.netand.baseballgame.common;

import lombok.Getter;

@Getter
public class Result {
    private int ballCount;
    private int strikeCount;
    private String nothing;

    public Result(int ballCount, int strikeCount) {
        this.nothing = "-";
        this.ballCount = ballCount;
        this.strikeCount = strikeCount;

        checkNoting(ballCount + strikeCount);
    }

    private void checkNoting(int allCount) {
        if (allCount == 0) {
            this.nothing = "일치하는 공이 없습니다.";
        }
    }
}
