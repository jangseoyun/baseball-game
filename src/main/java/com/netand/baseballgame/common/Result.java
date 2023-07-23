package com.netand.baseballgame.common;

import lombok.Getter;

@Getter
public class Result {
    private int ballCount;
    private int strikeCount;

    public Result(int ballCount, int strikeCount) {
        this.ballCount = ballCount;
        this.strikeCount = strikeCount;
    }
}
