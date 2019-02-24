package com.company;


import java.util.ArrayList;
import java.util.Collections;

public class Menu {

    void attack(Player player1, Player player2) {

        while ((player2.troops > 0) && (player1.troops > 1)) {

            if (player1.troops >= 3 && player2.troops >= 2) {

                ArrayList attacker_dices = new ArrayList();
                ArrayList defender_dices = new ArrayList();
                attacker_dices.add((int) (6.0 * Math.random()) + 1);
                attacker_dices.add((int) (6.0 * Math.random()) + 1);
                attacker_dices.add((int) (6.0 * Math.random()) + 1);

                defender_dices.add((int) (6.0 * Math.random()) + 1);
                defender_dices.add((int) (6.0 * Math.random()) + 1);

                Collections.sort(attacker_dices);
                Collections.sort(defender_dices);

                if ((int) attacker_dices.get(2) <= (int) defender_dices.get(1)) {
                    player1.troops--;
                    System.out.println("Player1 lost Remaining Troops :"+player1.troops);
                }
                else {
                    player2.troops--;
                    System.out.println("Player2 lost Remaining Troops :"+player2.troops);
                }
                if ((int) attacker_dices.get(1) <= (int) defender_dices.get(0)) {
                    player1.troops--;
                    System.out.println("Player1 lost Remaining Troops :"+player1.troops);
                }
                else {
                    player2.troops--;
                    System.out.println("Player2 lost Remaining Troops :"+player2.troops);
                }
            }
            if (player1.troops == 2 && player2.troops >= 2){

                ArrayList attacker_dices = new ArrayList();
                ArrayList defender_dices = new ArrayList();

                attacker_dices.add((int) (6.0 * Math.random()) + 1);
                attacker_dices.add((int) (6.0 * Math.random()) + 1);

                defender_dices.add((int) (6.0 * Math.random()) + 1);
                defender_dices.add((int) (6.0 * Math.random()) + 1);

                Collections.sort(attacker_dices);
                Collections.sort(defender_dices);

                if ((int) attacker_dices.get(1) <= (int) defender_dices.get(1)) {
                    player1.troops--;
                    System.out.println("Player1 lost Remaining Troops :"+player1.troops);
                }
                else {
                    player2.troops--;
                    System.out.println("Player2 lost Remaining Troops :"+player2.troops);
                }
                if ((int) attacker_dices.get(0) <= (int) defender_dices.get(0)) {
                    player1.troops--;
                    System.out.println("Player1 lost Remaining Troops :"+player1.troops);
                }
                else {
                    player2.troops--;
                    System.out.println("Player2 lost Remaining Troops :"+player2.troops);
                }
            }
            if (player1.troops == 1 && player2.troops >= 2) {

                ArrayList attacker_dices = new ArrayList();
                ArrayList defender_dices = new ArrayList();

                attacker_dices.add((int) (6.0 * Math.random()) + 1);

                defender_dices.add((int) (6.0 * Math.random()) + 1);
                defender_dices.add((int) (6.0 * Math.random()) + 1);

                Collections.sort(defender_dices);

                if ((int) attacker_dices.get(0) <= (int) defender_dices.get(1)) {
                    player1.troops--;
                    System.out.println("Player1 lost Remaining Troops :"+player1.troops);
                }
                else {
                    player2.troops--;
                    System.out.println("Player2 lost Remaining Troops :"+player2.troops);
                }

            }
            if (player1.troops >= 3 && player2.troops == 1) {

                ArrayList attacker_dices = new ArrayList();
                ArrayList defender_dices = new ArrayList();
                attacker_dices.add((int) (6.0 * Math.random()) + 1);
                attacker_dices.add((int) (6.0 * Math.random()) + 1);
                attacker_dices.add((int) (6.0 * Math.random()) + 1);

                defender_dices.add((int) (6.0 * Math.random()) + 1);


                Collections.sort(attacker_dices);


                if ((int) attacker_dices.get(2) <= (int) defender_dices.get(0)) {
                    player1.troops--;
                    System.out.println("Player1 lost Remaining Troops :"+player1.troops);
                }
                else {
                    player2.troops--;
                    System.out.println("Player2 lost Remaining Troops :"+player2.troops);
                }

            }
            if (player1.troops == 2 && player2.troops == 1) {

                ArrayList attacker_dices = new ArrayList();
                ArrayList defender_dices = new ArrayList();
                attacker_dices.add((int) (6.0 * Math.random()) + 1);
                attacker_dices.add((int) (6.0 * Math.random()) + 1);


                defender_dices.add((int) (6.0 * Math.random()) + 1);


                Collections.sort(attacker_dices);


                if ((int) attacker_dices.get(1) <= (int) defender_dices.get(0)) {
                    player1.troops--;
                    System.out.println("Player1 lost Remaining Troops :"+player1.troops);
                }
                else {
                    player2.troops--;
                    System.out.println("Player2 lost Remaining Troops :"+player2.troops);
                }

            }
        }
    }
}
