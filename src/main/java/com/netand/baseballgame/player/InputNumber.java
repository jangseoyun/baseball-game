package com.netand.baseballgame.player;

import com.netand.baseballgame.common.Ball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputNumber {
    private static final int LENGTH = 3;
    public static final List<Ball> PLAYER_BALLS = new ArrayList<>(LENGTH);
    private Scanner sc;

    public InputNumber() {
        this.sc = new Scanner(System.in);
    }

    public List<Ball> setData() {
        String request = sc.next();
        splitInputNumber(request);
        return PLAYER_BALLS;
    }

    public boolean setPlayStateData() {
        int playState = sc.nextInt();

        if (playState == 1) {
            return true;
        }

        return false;
    }

    private List<Ball> splitInputNumber(String request) {
        String[] split = request.split("");

        for (String number : split) {
            PLAYER_BALLS.add(
                    new Ball(Integer.parseInt(number))
            );
        }

        return PLAYER_BALLS;
    }
}
