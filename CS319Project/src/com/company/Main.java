package com.company;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player(10);
        Player player2 = new Player(10);

        Menu menu1 = new Menu();

        menu1.attack(player1,player2);

        System.out.println("Player 1 Remaining Troops :"+player1.troops);
        System.out.println("Player 2 Remaining Troops :"+player2.troops);
        System.out.println("Battle Ended");

        if(player1.troops<=player2.troops)
            System.out.println("Player 2 Wins");
        else
            System.out.println("Player 1 Wins");
    }
}

