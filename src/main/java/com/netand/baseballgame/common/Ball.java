package com.netand.baseballgame.common;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Random;

@Getter
@ToString
@EqualsAndHashCode( of = "value" )
public class Ball {
    private static final int MAX = 9;
    private final Integer value;

    public Ball() {

        this(new Random().nextInt(MAX) + 1);
    }

    public Ball(Integer value) {

        if (value < 1 || value > MAX) {
            throw new IllegalArgumentException("1~9까지의 숫자만 가능합니다.");
        }

        this.value = value;
    }
}
