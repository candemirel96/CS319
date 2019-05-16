package company;

public class Lands {
    int troopsonland=0;
    int ownerID=-1;
    String Landname;
    String LandID;
    String neighbor;
    int ownerTime = 0;

    public Lands(String Landname,String LandID,String neighbor){
        this.Landname=Landname;
        this.LandID=LandID;
        this.neighbor=neighbor;

    }
    
    public int getTroopsOnLand()
    {
        return troopsonland;
    }
    
    public int getOwnerID()
    {
        return ownerID;
    }
    
    public String getLandName()
    {
        return Landname;
    }
    
    public String getLandID()
    {
        return LandID;
    }
    
    public String getNeighbor()
    {
        return neighbor;
    }
}
