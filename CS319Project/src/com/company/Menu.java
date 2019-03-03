package com.company;


import java.util.ArrayList;
import java.util.Collections;


public class Menu {
    void attack(Player player1,Lands land1, Lands land2) {
        if(isNeighbor(land1,land2)){
        while ((land2.troopsonland > 0) && (land1.troopsonland > 1)) {

            if (land1.troopsonland >= 3 && land2.troopsonland >= 2) {

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
                    land1.troopsonland--;
                    System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land2.troopsonland);
                }
                if ((int) attacker_dices.get(1) <= (int) defender_dices.get(0)) {
                    land1.troopsonland--;
                    System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land2.troopsonland);
                }
            }
            if (land1.troopsonland == 2 && land2.troopsonland >= 2){

                ArrayList attacker_dices = new ArrayList();
                ArrayList defender_dices = new ArrayList();

                attacker_dices.add((int) (6.0 * Math.random()) + 1);
                attacker_dices.add((int) (6.0 * Math.random()) + 1);

                defender_dices.add((int) (6.0 * Math.random()) + 1);
                defender_dices.add((int) (6.0 * Math.random()) + 1);

                Collections.sort(attacker_dices);
                Collections.sort(defender_dices);

                if ((int) attacker_dices.get(1) <= (int) defender_dices.get(1)) {
                    land1.troopsonland--;
                    System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    System.out.println("Player "+player1.PlayerID+ "lost Remaining troopsonland :"+land2.troopsonland);
                }
                if ((int) attacker_dices.get(0) <= (int) defender_dices.get(0)) {
                    land1.troopsonland--;
                    System.out.println("Player "+player1.PlayerID+ "lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land2.troopsonland);
                }
            }
            if (land1.troopsonland == 1 && land2.troopsonland >= 2) {

                ArrayList attacker_dices = new ArrayList();
                ArrayList defender_dices = new ArrayList();

                attacker_dices.add((int) (6.0 * Math.random()) + 1);

                defender_dices.add((int) (6.0 * Math.random()) + 1);
                defender_dices.add((int) (6.0 * Math.random()) + 1);

                Collections.sort(defender_dices);

                if ((int) attacker_dices.get(0) <= (int) defender_dices.get(1)) {
                    land1.troopsonland--;
                    System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land2.troopsonland);
                }

            }
            if (land1.troopsonland >= 3 && land2.troopsonland == 1) {

                ArrayList attacker_dices = new ArrayList();
                ArrayList defender_dices = new ArrayList();
                attacker_dices.add((int) (6.0 * Math.random()) + 1);
                attacker_dices.add((int) (6.0 * Math.random()) + 1);
                attacker_dices.add((int) (6.0 * Math.random()) + 1);

                defender_dices.add((int) (6.0 * Math.random()) + 1);


                Collections.sort(attacker_dices);


                if ((int) attacker_dices.get(2) <= (int) defender_dices.get(0)) {
                    land1.troopsonland--;
                    System.out.println("Player"+player1.PlayerID+"lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    System.out.println("Player"+player1.PlayerID+"lost Remaining troopsonland :"+land2.troopsonland);
                }

            }
            if (land1.troopsonland == 2 && land2.troopsonland == 1) {

                ArrayList attacker_dices = new ArrayList();
                ArrayList defender_dices = new ArrayList();
                attacker_dices.add((int) (6.0 * Math.random()) + 1);
                attacker_dices.add((int) (6.0 * Math.random()) + 1);


                defender_dices.add((int) (6.0 * Math.random()) + 1);


                Collections.sort(attacker_dices);


                if ((int) attacker_dices.get(1) <= (int) defender_dices.get(0)) {
                    land1.troopsonland--;
                    System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonlandonland :"+land2.troopsonland);
                }

            }
        }
        if(land2.troopsonland==0) {
            land2.ownerID = player1.PlayerID;
            System.out.println("Player "+player1.PlayerID+ "Conquered "+land2.Landname);
        }
        else
            System.out.println("Player "+player1.PlayerID+" Failed to Conquer "+land2.Landname);
        }
        else
            System.out.println("These lands are not neighbors");
    }
    void recruit(Lands land,Player player,int troop_ammount) {

        if (troop_ammount <= player.troops) {
            if (land.troopsonland == 0) {
                land.ownerID = player.PlayerID;
                land.troopsonland += troop_ammount;
                player.troops -= troop_ammount;
                System.out.println("Player" + player.PlayerID + " owned this land");
                System.out.println("Troops On Land :" + land.troopsonland);
            }
            else if (land.ownerID == player.PlayerID) {
                land.troopsonland += troop_ammount;
                player.troops -= troop_ammount;
                System.out.println("Troops On Land :" + land.troopsonland);
            }
            else
                System.out.println("You can not recruit on others land");
        }
        else
            System.out.println("You do not have enough troops");
    }
    boolean isNeighbor(Lands land1,Lands land2){
        if(land1.neighbor.contains(land2.LandID)){
            return true;
        }
        else
            return false;
    }
    void move(Player player,Lands land1,Lands land2,int troop_amount){
        if(player.PlayerID==land1.ownerID && player.PlayerID==land2.ownerID && isNeighbor(land1,land2)){
            land1.troopsonland-=troop_amount;
            land2.troopsonland+=troop_amount;
        }
        else
            System.out.println("Move Failed");
    }
    Lands selectLand(Lands[] world,String LandID){
        for(int i=0;i<world.length;i++){

            if(world[i].LandID.contains(LandID)){
                return world[i];
            }
        }
        return null;

    }
}
