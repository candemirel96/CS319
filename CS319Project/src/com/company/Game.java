package com.company;
import java.util.Scanner;


public class Game {

    public Game() {

        int turn_count=0;

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter The Number of Players Between 3 to 6");
        int player_count=scan.nextInt();

    if(player_count<=6 && player_count>=3) {

        Player player1 = new Player(10, 1);
        Player player2 = new Player(10, 2);
        Player player3 = new Player(10, 3);
        Player player4 = new Player(10, 4);
        Player player5 = new Player(10, 5);
        Player player6 = new Player(10, 6);


        Player[] players = new Player[player_count];

        players[0] = player1;
        players[1] = player2;
        players[2] = player3;

        if (player_count == 4) {
            players[3] = player4;
        } else if (player_count == 5) {
            players[3] = player4;
            players[4] = player5;
        } else if (player_count == 6) {
            players[3] = player4;
            players[4] = player5;
            players[5] = player6;
        }

        Lands land0 = new Lands("Alaska", "0", "1,2");
        Lands land1 = new Lands("Northwest Territory", "1", "0,2,3");
        Lands land2 = new Lands("Alberta", "2", "0,1,3");
        Lands land3 = new Lands("Ontario", "3", "1,2");

        Lands[] world = new Lands[4];

        world[0] = land0;
        world[1] = land1;
        world[2] = land2;
        world[3] = land3;

        Menu menu1 = new Menu();


        turn(players, menu1, world, turn_count,player_count);
    }
    else
        System.out.println("Incorrect Number Of Players Please Try Again");
    }
     void turn(Player[] players,Menu menu,Lands[] world,int turn_count,int playercount){

        Scanner scan=new Scanner(System.in);

        System.out.println("Player"+players[turn_count%playercount].PlayerID+"'s Turn");
        System.out.println("1-Recruit,2-Attack,3-Move,4-End Turn");
        int selection=scan.nextInt();


        switch (selection){
            case 1://Recruit
                System.out.println("Please Enter The Land That You Own");
                String selectedOwnedlandID=scan.next();

                Lands selectedLand = menu.selectLand(world,selectedOwnedlandID);

                System.out.println("Please Enter The Troop Amount");
                int troop_amount=scan.nextInt();

                menu.recruit(selectedLand,players[turn_count%playercount],troop_amount);
                System.out.println("Turn : "+turn_count);
                turn(players,menu,world,turn_count,playercount);

            case 2://Attack
                System.out.println("Please Enter The Land That You Own");
                String selectedOwnedAttackinglandID=scan.next();

                Lands selectedAttacingLand = menu.selectLand(world,selectedOwnedAttackinglandID);

                System.out.println("Please Enter The Land That You Want Attack");
                String selectedOwnedAttackedlandID=scan.next();

                Lands selectedAttackedLand = menu.selectLand(world,selectedOwnedAttackedlandID);

                menu.attack(players[turn_count%playercount],selectedAttacingLand,selectedAttackedLand);

                System.out.println("Turn : "+turn_count);
                turn(players,menu,world,turn_count,playercount);

            case 3://Move

                System.out.println("Please Enter The Land That You Own");
                String selectedOwnedMovinglandID=scan.next();

                Lands selectedMovingLand = menu.selectLand(world,selectedOwnedMovinglandID);

                System.out.println("Please Enter The Land That You Wish To Travel");
                String selectedOwnedTargettedlandID=scan.next();

                Lands selectedTargettedLand = menu.selectLand(world,selectedOwnedTargettedlandID);

                System.out.println("Please Enter The Troop Amount You Want to Move");
                int moving_troop_amount=scan.nextInt();

                menu.move(players[turn_count%playercount],selectedMovingLand,selectedTargettedLand,moving_troop_amount);

                System.out.println("Turn : "+turn_count);
                turn(players,menu,world,turn_count,playercount);

            case 4://End Turn
                players[turn_count%playercount].troops += 3;
                turn_count++;
                System.out.println("Turn : "+turn_count);
                turn(players,menu,world,turn_count,playercount);
        }
    }
}
