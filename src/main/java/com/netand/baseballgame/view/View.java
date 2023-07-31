package com.netand.baseballgame.view;

import com.netand.baseballgame.common.Ball;
import com.netand.baseballgame.common.Result;

import java.util.List;

/**
 * 콘솔창 view print
 */
public class View {
    public void startPrint() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("------------------------[ 야구 게임을 시작합니다 ]------------------");
        System.out.println("--------------------------------------------------------------");
    }

    public void playerPrint() {
        System.out.println( "----[player]---- 1~9 사이의 숫자를 3자리를 입력해 주세요 --------------" );
    }

    public void computerSetting( List< Ball > computerBalls ) {
        System.out.println( "computer number setting: " + computerBalls );

    }

    public void playerInputPrint( List< Ball > playerBalls ) {
        System.out.println("player input number: " + playerBalls);
    }

    public void gameResultPrint( Result result ) {
        System.out.println("--------------------------------------------------------------");
        System.out.println("----------------------------[ Result ]------------------------");
        System.out.print("---- [ball: " + result.getBallCount() + "]");
        System.out.print("----[strike: " + result.getStrikeCount() + "]");
        System.out.println("----[nothing: " + result.getNothing() + "]");
        System.out.println("--------------------------------------------------------------");
    }

    public void gameStatePrint() {
        System.out.println("---- 게임을 다시 시작하시겠습니까? [ 다시 시작: 1 ] / [ 종료: 0 ] ");
        System.out.println("--------------------------------------------------------------");
    }

    public void endPrint() {
        System.out.println( "프로그램을 종료 합니다." );
    }
}
