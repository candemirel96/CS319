package company;

import java.util.ArrayList;
import java.util.Collections;


public class Menu {
    public boolean attack(Player player1,Lands land1, Lands land2) {

        while ((land2.troopsonland > 0) && (land1.troopsonland-1 > 1)) {

            if (land1.troopsonland-1 >= 3 && land2.troopsonland >= 2) {

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
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land2.troopsonland);
                }
                if ((int) attacker_dices.get(1) <= (int) defender_dices.get(0)) {
                    land1.troopsonland--;
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land2.troopsonland);
                }
            }
            if (land1.troopsonland-1 == 2 && land2.troopsonland >= 2){

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
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    //System.out.println("Player "+player1.PlayerID+ "lost Remaining troopsonland :"+land2.troopsonland);
                }
                if ((int) attacker_dices.get(0) <= (int) defender_dices.get(0)) {
                    land1.troopsonland--;
                    //System.out.println("Player "+player1.PlayerID+ "lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land2.troopsonland);
                }
            }
            
            if (land1.troopsonland-1 >= 3 && land2.troopsonland == 1) {

                ArrayList attacker_dices = new ArrayList();
                ArrayList defender_dices = new ArrayList();
                attacker_dices.add((int) (6.0 * Math.random()) + 1);
                attacker_dices.add((int) (6.0 * Math.random()) + 1);
                attacker_dices.add((int) (6.0 * Math.random()) + 1);

                defender_dices.add((int) (6.0 * Math.random()) + 1);


                Collections.sort(attacker_dices);


                if ((int) attacker_dices.get(2) <= (int) defender_dices.get(0)) {
                    land1.troopsonland--;
                    //System.out.println("Player"+player1.PlayerID+"lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    //System.out.println("Player"+player1.PlayerID+"lost Remaining troopsonland :"+land2.troopsonland);
                }

            }
            if (land1.troopsonland-1 == 2 && land2.troopsonland == 1) {

                ArrayList attacker_dices = new ArrayList();
                ArrayList defender_dices = new ArrayList();
                attacker_dices.add((int) (6.0 * Math.random()) + 1);
                attacker_dices.add((int) (6.0 * Math.random()) + 1);


                defender_dices.add((int) (6.0 * Math.random()) + 1);


                Collections.sort(attacker_dices);


                if ((int) attacker_dices.get(1) <= (int) defender_dices.get(0)) {
                    land1.troopsonland--;
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonlandonland :"+land2.troopsonland);
                }

            }
        }
        if(land2.troopsonland==0) {
            
            land2.ownerID = player1.PlayerID;
            land2.troopsonland++;
            land1.troopsonland--;
            
            //System.out.println("Player "+player1.PlayerID+ "Conquered "+land2.Landname);
            return true;
        }
        else
            return false;
            //System.out.println("Player "+player1.PlayerID+" Failed to Conquer "+land2.Landname);
        
    }
    public void recruit(Lands land,Player player,int troop_ammount) {
        if (land.troopsonland == 0) {
            land.ownerID = player.PlayerID;
            land.troopsonland += troop_ammount;
            player.troops -= troop_ammount;

        }
        else if (land.ownerID == player.PlayerID) {
            land.troopsonland += troop_ammount;
            player.troops -= troop_ammount;
        }        
    }
    boolean isNeighbor(Lands land1,Lands land2){
        if(land1.neighbor.contains(land2.LandID)){
            return true;
        }
        else
            return false;
    }
    public void move(Player player,Lands land1,Lands land2,int troop_amount){
        if(player.PlayerID==land1.ownerID && player.PlayerID==land2.ownerID && isNeighbor(land1,land2)){
            land1.troopsonland-=troop_amount;
            land2.troopsonland+=troop_amount;
        }

    }
    public Lands selectLand(String LandID){
        for(int i=0;i<Game.world.length;i++){

            if(Game.world[i].LandID.contains(LandID)){
                return Game.world[i];
            }
        }
        return null;

    }
    public Lands selectLandbyName(String LandName){
        for(int i=0;i<Game.world.length;i++){

            if(Game.world[i].Landname.contains(LandName)){
                return Game.world[i];
            }
        }
        return null;

    }
    public boolean questCheck(Quest q,Player[] players,Lands[] world,int playercount){
        if(1<=q.QuestID && q.QuestID<=7){
           boolean result= q.isCompleted1(players[Game.turn_count%playercount],selectcontinent(world,q.QuestID),q.QuestID);
           return result;
        }
        if(8<=q.QuestID && q.QuestID<=10) {
            if(q.QuestID==8)
            return q.isCompleted2(players[Game.turn_count % playercount], q.QuestID, 3);
            if(q.QuestID==9)
                return q.isCompleted2(players[Game.turn_count % playercount], q.QuestID, 4);
            if(q.QuestID==10)
                return q.isCompleted2(players[Game.turn_count % playercount], q.QuestID, 5);
        }
        if(11<=q.QuestID && q.QuestID<=13) {
            if(q.QuestID==11)
                return q.isCompleted3(players[Game.turn_count % playercount], q.QuestID, 3);
            if(q.QuestID==12)
                return q.isCompleted3(players[Game.turn_count % playercount], q.QuestID, 4);
            if(q.QuestID==13)
                return q.isCompleted3(players[Game.turn_count % playercount], q.QuestID, 5);
        }
        if(14<=q.QuestID && q.QuestID<=23){
            if(q.QuestID==14)
            return q.isCompleted4(players[Game.turn_count % playercount],world[4],q.QuestID);
            if(q.QuestID==15)
                return q.isCompleted4(players[Game.turn_count % playercount],world[8],q.QuestID);
            if(q.QuestID==16)
                return q.isCompleted4(players[Game.turn_count % playercount],world[17],q.QuestID);
            if(q.QuestID==17)
                return q.isCompleted4(players[Game.turn_count % playercount],world[21],q.QuestID);
            if(q.QuestID==18)
                return q.isCompleted4(players[Game.turn_count % playercount],world[28],q.QuestID);
            if(q.QuestID==19)
                return q.isCompleted4(players[Game.turn_count % playercount],world[31],q.QuestID);
            if(q.QuestID==20)
                return q.isCompleted4(players[Game.turn_count % playercount],world[40],q.QuestID);
            if(q.QuestID==21)
                return q.isCompleted4(players[Game.turn_count % playercount],world[42],q.QuestID);
            if(q.QuestID==22)
                return q.isCompleted4(players[Game.turn_count % playercount],world[0],q.QuestID);
            if(q.QuestID==23)
                return q.isCompleted4(players[Game.turn_count % playercount],world[7],q.QuestID);

        }
        return false;
    }
    Lands[] selectcontinent(Lands[] world,int contID){
        //America
        if(contID==1) {
            Lands[] selected_continent = new Lands[1];
            for (int i=0;i<1;i++){
                selected_continent[i]=world[i];
            }
            return selected_continent;
        }
        //South America
        if(contID==2){
            Lands[] selected_continent = new Lands[4];
            for (int i=9,j=0;i<13;i++,j++){
                selected_continent[j]=world[i];
            }
            return selected_continent;
        }
        //Europe
        if(contID==3){
            Lands[] selected_continent = new Lands[7];
            for (int i=13,j=0;i<20;i++,j++){
                selected_continent[j]=world[i];
            }
            return selected_continent;
        }
        //Africa
        if(contID==4){
            Lands[] selected_continent = new Lands[6];
            for (int i=20,j=0;i<26;i++,j++){
                selected_continent[j]=world[i];
            }
            return selected_continent;
        }
        //Asia
        if(contID==5){
            Lands[] selected_continent = new Lands[12];
            for (int i=26,j=0;i<38;i++,j++){
                selected_continent[j]=world[i];
            }
            return selected_continent;
        }
        //Australia
        if(contID==6){
            Lands[] selected_continent = new Lands[4];
            for (int i=38,j=0;i<41;i++,j++){
                selected_continent[j]=world[i];
            }
            return selected_continent;
        }
        //Atlantis
        if(contID==7){
            Lands[] selected_continent = new Lands[1];
                selected_continent[0]=world[42];

            return selected_continent;
        }
        return world;
    }
    void updateOwnerShip(Lands[] world){
        for(Lands a:world) {
            if(a.ownerID!=0)
            a.ownerTime++;
        }
    }
    
}

/*
public boolean attack(Player player1,Lands land1, Lands land2) {

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
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land2.troopsonland);
                }
                if ((int) attacker_dices.get(1) <= (int) defender_dices.get(0)) {
                    land1.troopsonland--;
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land2.troopsonland);
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
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    //System.out.println("Player "+player1.PlayerID+ "lost Remaining troopsonland :"+land2.troopsonland);
                }
                if ((int) attacker_dices.get(0) <= (int) defender_dices.get(0)) {
                    land1.troopsonland--;
                    //System.out.println("Player "+player1.PlayerID+ "lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land2.troopsonland);
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
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land2.troopsonland);
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
                    //System.out.println("Player"+player1.PlayerID+"lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    //System.out.println("Player"+player1.PlayerID+"lost Remaining troopsonland :"+land2.troopsonland);
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
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonland :"+land1.troopsonland);
                }
                else {
                    land2.troopsonland--;
                    //System.out.println("Player "+player1.PlayerID+"lost Remaining troopsonlandonland :"+land2.troopsonland);
                }

            }
        }
        if(land2.troopsonland==0) {
            land2.ownerID = player1.PlayerID;
            //System.out.println("Player "+player1.PlayerID+ "Conquered "+land2.Landname);
            return true;
        }
        else
            return false;
            //System.out.println("Player "+player1.PlayerID+" Failed to Conquer "+land2.Landname);
        
    }
*/