package com.netand.baseballgame;

import com.netand.baseballgame.computer.ComputerMachine;
import com.netand.baseballgame.common.Result;
import com.netand.baseballgame.machine.CompareMachine;
import com.netand.baseballgame.player.InputNumber;
import com.netand.baseballgame.view.View;

import static com.netand.baseballgame.computer.ComputerMachine.COMPUTER_BALLS;
import static com.netand.baseballgame.player.InputNumber.PLAYER_BALLS;

public class GameStarter {
    /**
     * 객체 정의
     * - View: 콘솔(화면) 출력 역할
     * - ComputerMachine: 컴퓨터 번호 추출 역할
     * - InputNumber: 플레이어 입력값 검증 및 가공 역할
     * - CompareMachine: 컴퓨터와 플레이어 숫자 비교 역할
     */
    public static void main(String[] args) {
        View view = new View();
        InputNumber inputNumber = new InputNumber();
        CompareMachine compareMachine = new CompareMachine();
        boolean gameAction = true;

        view.startPrint();

        while ( gameAction ) {
            //computer ball setting
            ComputerMachine computerMachine = new ComputerMachine();
            view.computerSetting(COMPUTER_BALLS);

            //player input value
            view.playerSetting();
            inputNumber.setData();
            view.playerInputPrint(PLAYER_BALLS);

            //compare
            Result result = compareMachine.compareNumber(COMPUTER_BALLS, PLAYER_BALLS);
            view.gameResultPrint(result);
            view.gameStatePrint();
            gameAction = inputNumber.setPlayStateData();
        }

        view.endPrint();
    }
}
