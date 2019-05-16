package company;

public class Quest {

    int QuestID;
    String content;

    public Quest(int QuestID, String content) {

        this.QuestID = QuestID;
        this.content = content;

    }
    
    public String getContent()
    {
        return content;
    }

    public boolean isCompleted1 (Player player, Lands[]continent,int qID)
    {
            for (Lands a : continent) {
                if (a.ownerID != player.PlayerID) {
                    return false;
                }
            }
            
            
            
            return true;
    }
    public boolean isCompleted2 (Player player,int qID,int qindex){
        if (player.defendcount!=qindex)
        return false;
        
        
         return true;
    }
    public boolean isCompleted3 (Player player,int qID,int qindex){
        if (player.attackcount!=qindex)
        return false;
        
        
        return true;
    }
    public boolean isCompleted4(Player player,Lands land,int qID){
        if(land.ownerTime<5)
        return  false;
        
        return true;
    }
}




