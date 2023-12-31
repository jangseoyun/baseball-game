package com.netand.baseballgame;

import com.netand.baseballgame.common.Result;
import com.netand.baseballgame.computer.ComputerMachine;
import com.netand.baseballgame.machine.CompareMachine;
import com.netand.baseballgame.player.InputNumber;
import com.netand.baseballgame.view.View;

import static com.netand.baseballgame.computer.ComputerMachine.COMPUTER_BALLS;
import static com.netand.baseballgame.player.InputNumber.PLAYER_BALLS;

/**
 * 객체 정의
 * - View: 콘솔(화면) 출력 역할
 * - ComputerMachine: 컴퓨터 번호 추출 역할
 * - InputNumber: 플레이어 입력값 검증 및 가공 역할
 * - CompareMachine: 컴퓨터와 플레이어 숫자 비교 역할
 * - GAME_ACTION: 게임 진행 여부
 * - PLAYER_BALLS / COMPUTER_BALLS: 컴퓨터 번호, 플레이어 입력 번호 리스트
 */

public class GameStarter {
    public static boolean GAME_ACTION = true;
    private static final View VIEW = new View();
    private static final ComputerMachine computerMachine = new ComputerMachine();
    private static final InputNumber inputNumber = new InputNumber();
    private static final CompareMachine compareMachine = new CompareMachine();

    public static void main(String[] args) {
        VIEW.startPrint();

        while ( GAME_ACTION ) {
            run();
            VIEW.gameStatePrint();
            GAME_ACTION = inputNumber.setPlayStateData();
        }

        VIEW.endPrint();
    }

    private static void run() {
        while ( GAME_ACTION ) {
            computerMachine.createComputerBall();
            VIEW.computerSetting( COMPUTER_BALLS );
            VIEW.playerPrint();
            inputNumber.setData();
            VIEW.playerInputPrint( PLAYER_BALLS );
            Result result = compareMachine.compareNumber( PLAYER_BALLS );
            VIEW.gameResultPrint( result );
            ballClear();
        }
    }

    private static void ballClear() {
        PLAYER_BALLS.clear();
        COMPUTER_BALLS.clear();
    }
}
