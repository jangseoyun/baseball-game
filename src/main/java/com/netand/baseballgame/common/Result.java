package com.netand.baseballgame.common;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Result {
    private int ballCount;
    private int strikeCount;
    private String nothing;
    private boolean gameAction;

    public Result(int ballCount, int strikeCount, boolean gameAction) {
        this.nothing = "-";
        this.ballCount = ballCount;
        this.strikeCount = strikeCount;
        this.gameAction = gameAction;

        checkNoting(ballCount + strikeCount);
    }

    private void checkNoting(int allCount) {
        if (allCount == 0) {
            this.nothing = "일치하는 공이 없습니다.";
        }
    }

}
