package com.netand.baseballgame.computer;

import com.netand.baseballgame.common.Ball;

import java.util.ArrayList;
import java.util.List;

public class ComputerMachine {
    private static final int LENGTH = 3;
    public static final List<Ball> COMPUTER_BALLS = new ArrayList<>( LENGTH );

    public void createComputerBall() {
        while ( COMPUTER_BALLS.size() < LENGTH ) {
            validBall(new Ball());
        }
    }

    private void validBall( Ball createBall ) {
        if ( COMPUTER_BALLS.contains(createBall) ) {
            return;
        }

        COMPUTER_BALLS.add( createBall );
    }
}
