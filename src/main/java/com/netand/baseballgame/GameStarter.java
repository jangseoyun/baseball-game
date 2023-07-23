package com.netand.baseballgame;

import com.netand.baseballgame.computer.ComputerMachine;
import com.netand.baseballgame.common.Result;
import com.netand.baseballgame.machine.CompareMachine;
import com.netand.baseballgame.player.InputNumber;
import com.netand.baseballgame.view.View;

import static com.netand.baseballgame.computer.ComputerMachine.COMPUTER_BALLS;
import static com.netand.baseballgame.player.InputNumber.PLAYER_BALLS;

public class GameStarter {
    public static void main(String[] args) {
        /**
         * 객체 정의
         * - View
         * - ComputerMachine
         * - InputNumber
         * - CompareMachine
         */
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
