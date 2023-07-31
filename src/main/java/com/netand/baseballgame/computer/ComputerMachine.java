package com.netand.baseballgame.computer;

import com.netand.baseballgame.common.Ball;

import java.util.ArrayList;
import java.util.List;

/**
 * 컴퓨터 번호 추출 머신 로직 (도메인)
 * 중복되는 번호 없이 3개의 공을 뽑는다.
 */
public class ComputerMachine {
    private static final int LENGTH = 3;
    public static final List< Ball > COMPUTER_BALLS = new ArrayList<>( LENGTH );

    public void createComputerBall() {
        while ( COMPUTER_BALLS.size() < LENGTH ) {
            validBall( new Ball() );
        }
    }

    private void validBall( Ball createBall ) {
        if ( COMPUTER_BALLS.contains( createBall ) ) {
            return;
        }

        COMPUTER_BALLS.add( createBall );
    }
}
