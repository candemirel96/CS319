package company;

import java.util.ArrayList;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

public class Player {

    int troops;
    int PlayerID;
    int colourID;
    int defendcount = 0;
    int attackcount = 0;
    
    ArrayList<Quest> Quests;

    public Player(int troops,int PlayerID,int colourID) {

        this.troops=troops;
        this.PlayerID=PlayerID;
        this.colourID=colourID;
        this.Quests = new ArrayList();
    }
    
    public void setTroops(int a)
    {
        troops += a;
    }
    
    public int getPlayerId()
    {
        return PlayerID;
    }
    
    public int getTroops()
    {
        return troops;
    }
    
    public int getColourID()
    {
        return colourID;
    }
    
    public Quest getQuest(int i)
    {
        return Quests.get(i);
    }
    
    public ArrayList<Quest> getArrayList()
    {
        return Quests;
    }
}
