package com.netand.baseballgame.common;

import lombok.Getter;

import static com.netand.baseballgame.GameStarter.GAME_ACTION;

/**
 * 게임 결과 응답.
 * 객체 생성시 번호 전체 정답 여부 확인
 */
@Getter
public class Result {

    private static final int MAX = 3;
    private int ballCount;
    private int strikeCount;
    private String nothing;

    public Result( int ballCount, int strikeCount ) {
        this.nothing = "-";
        this.ballCount = ballCount;
        this.strikeCount = checkAll( strikeCount );

        checkNothing( ballCount + strikeCount );
    }

    private int checkAll( int strikeCount ) {
        if ( strikeCount == MAX ) {
            GAME_ACTION = false;
        }
        return strikeCount;
    }

    private void checkNothing(int allCount ) {
        if ( allCount == 0 ) {
            this.nothing = "일치하는 공이 없습니다.";
        }
    }
}
