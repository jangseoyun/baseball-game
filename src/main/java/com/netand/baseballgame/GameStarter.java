package com.netand.baseballgame;

import com.netand.baseballgame.common.Result;
import com.netand.baseballgame.computer.ComputerMachine;
import com.netand.baseballgame.machine.CompareMachine;
import com.netand.baseballgame.player.InputNumber;
import com.netand.baseballgame.view.View;

import static com.netand.baseballgame.player.InputNumber.PLAYER_BALLS;

/**
 * 객체 정의
 * - View: 콘솔(화면) 출력 역할
 * - ComputerMachine: 컴퓨터 번호 추출 역할
 * - InputNumber: 플레이어 입력값 검증 및 가공 역할
 * - CompareMachine: 컴퓨터와 플레이어 숫자 비교 역할
 */
public class GameStarter {
    public static View VIEW = new View();
    public static boolean GAME_ACTION = true;

    private static Result result = new Result();
    private static InputNumber inputNumber = new InputNumber();
    private static ComputerMachine computerMachine = new ComputerMachine();
    private static CompareMachine compareMachine = new CompareMachine();

    public static void main(String[] args) {
        VIEW.startPrint();

        while ( GAME_ACTION ) {
            computerMachine.computerBallSetting();
            playerInputSetting();
            result = compareMachine.compareNumber( PLAYER_BALLS );
            VIEW.gameResultPrint(result);
        }//맞출때까지 게임이 도는 것으로

        setGameAction();
        VIEW.endPrint();
    }

    private static void playerInputSetting() {

        VIEW.playerSetting();
        inputNumber.setData();
        VIEW.playerInputPrint(PLAYER_BALLS);

    }

    private static void setGameAction() {

        VIEW.gameStatePrint();
        GAME_ACTION = inputNumber.setPlayStateData();

    }

}
