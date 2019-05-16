package company;
import java.util.Scanner;

public class Game {

    public static int player_count = 0;
    public static Player[] players;
    public static int turn_count=0; 
    public static Lands[] world;
    public static Menu menu1; 
    
    
    public Game() {

        Player player1 = new Player(10, 0, 0);
        Player player2 = new Player(10, 1, 1);
        Player player3 = new Player(10, 2, 2);
        Player player4 = new Player(10, 3, 3);
        Player player5 = new Player(10, 4, 4);
        Player player6 = new Player(10, 5, 5);


        players = new Player[player_count];

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


        Lands land0 = new Lands("Alaska", "0", "1,2,");
        Lands land1 = new Lands("Northwest Territory", "1", "0,2,3,");
        Lands land2 = new Lands("Alberta", "2", "0,1,3,6,");
        Lands land3 = new Lands("Ontario", "3", "1,2,4,5,6,");
        Lands land4 = new Lands("Quebec", "4", "3,5,");
        Lands land5 = new Lands("Greenland", "5", "1,3,4,");
        Lands land6 = new Lands("Western United States", "6", "2,3,7,8,");
        Lands land7 = new Lands("Eastern United States","7","3,4,6,8");
        Lands land8 = new Lands("Central America","8","6,7,9");
        Lands land9 = new Lands("Venezuela", "9", "8,10,11,42");
        Lands land10 = new Lands("Peru", "10", "9,11,12");
        Lands land11 = new Lands("Brazil", "11", "9,10,12,20");
        Lands land12= new Lands("Argentina", "12", "10,11");
        Lands land13 = new Lands("Iceland", "13", "5,14,19");
        Lands land14= new Lands("Scandinavia", "14", "13,15,16");
        Lands land15 = new Lands("Ukraine", "15", "14,16,17,26,33,35");
        Lands land16= new Lands("Northern Europe", "16", "14,15,17,18,19");
        Lands land17 = new Lands("Southern Europe", "17", "15,16,18,20,21");
        Lands land18= new Lands("Western Europe","18","16,15,16,42");
        Lands land19 = new Lands("Great Britain", "19", "13,14,16,18");
        Lands land20 = new Lands("North Africa", "20", "11,17,18,21,22");
        Lands land21 = new Lands("Egypt", "21", "17,20,23,35");
        Lands land22 = new Lands("Congo", "22", "20,24");
        Lands land23 = new Lands("East Africa", "23", "21,24,25,35");
        Lands land24 = new Lands("South Africa", "24", "22,23,25");
        Lands land25 = new Lands("Madagascar", "25", "24,25");
        Lands land26 = new Lands("Ural", "26", "15,27,33,34");
        Lands land27 = new Lands("Siberia", "27", "26,28,30,31,34");
        Lands land28 = new Lands("Yakutsk", "28", "27,29,30");
        Lands land29 = new Lands("Kamchatka", "29", "0,28,30,32");
        Lands land30 = new Lands("Irkutsk", "30", "27,28,29,31");
        Lands land31 = new Lands("Mongolia", "31", "27,29,30,32,34");
        Lands land32 = new Lands("Japan", "32", "29,31");
        Lands land33 = new Lands("Afghanistan", "33", "15,26,34,35,36");
        Lands land34 = new Lands("China", "34", "26,27,31,33,36,37");
        Lands land35 = new Lands("Middle East", "35", "15,17,21,33,36");
        Lands land36 = new Lands("India", "36", "33,34,35,37");
        Lands land37 = new Lands("Siam", "37", "34,36,38");
        Lands land38 = new Lands("Indonesia", "38", "37,39,40");
        Lands land39 = new Lands("New Guinea", "39", "38,40,41");
        Lands land40 = new Lands("Western Australia", "40", "38,39,41");
        Lands land41 = new Lands("Eastern Australia", "41", "39,40");
        Lands land42 = new Lands("Oldies but Goldies", "42", "7,9,18,20");

        

        world = new Lands[43];

        world[0] = land0;
        world[1] = land1;
        world[2] = land2;
        world[3] = land3;
        world[4] = land4;
        world[5] = land5;
        world[6] = land6;
        world[7] = land7;
        world[8] = land8;
        world[9] = land9;
        world[10] = land10;
        world[11] = land11;
        world[12] = land12;
        world[13] = land13;
        world[14] = land14;
        world[15] = land15;
        world[16] = land16;
        world[17] = land17;
        world[18] = land18;
        world[19] = land19;
        world[20] = land20;
        world[21] = land21;
        world[22] = land22;
        world[23] = land23;
        world[24] = land24;
        world[25] = land25;
        world[26] = land26;
        world[27] = land27;
        world[28] = land28;
        world[29] = land29;
        world[30] = land30;
        world[31] = land31;
        world[32] = land32;
        world[33] = land33;
        world[34] = land34;
        world[35] = land35;
        world[36] = land36;
        world[37] = land37;
        world[38] = land38;
        world[39] = land39;
        world[40] = land40;
        world[41] = land41;
        world[42] = land42;
        
        // -------------

        Quest q1 = new Quest(1, "Conquer America");
        player1.getArrayList().add(q1);
        
        Quest q8 = new Quest(8,"Defend your land 3 times");
        player1.getArrayList().add(q8);
        
        Quest q13 = new Quest(13,"Win 5 battles");
        player1.getArrayList().add(q13);
        
        Quest q16 = new Quest(16,"Hold Southern Europe 5 turns");
        player1.getArrayList().add(q16);
        
        // -------------
        
        Quest q2= new Quest(2,"Conquer Europe");
        player2.getArrayList().add(q2);
        
        Quest q9 = new Quest(9,"Defend your land 4 times");
        player2.getArrayList().add(q9);
        
        Quest q15 = new Quest(15,"Hold Central America 5 turns");
        player2.getArrayList().add(q15);
        
        Quest q12 = new Quest(12,"Win 4 battles");
        player2.getArrayList().add(q12);
        
        // -------------
        
        Quest q3= new Quest(3,"Conquer South America");
        player3.getArrayList().add(q3);
        
        Quest q10 = new Quest(10,"Defend your land 5 times");
        player3.getArrayList().add(q10);
        
        Quest q11 = new Quest(11,"Win 3 battles");
        player3.getArrayList().add(q11);
        
        Quest q14 = new Quest(14,"Hold Quebec 5 turns");
        player3.getArrayList().add(q14);
        
        menu1 = new Menu();
        
        //turn(players, menu1, world, turn_count,player_count);
    }
}
