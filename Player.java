public class Player{
    
    // fields
    private String name;
    private double strikeOutChance;
    private double singleChance;
    private double doubleChance;
    private double tripleChance;
    private double homeRunChance;
    
    // constructors
    public Player (String name, double strikeOutChance, double singleChance, double doubleChance, double tripleChance, double homeRunChance){
        this.name = name;
        this.strikeOutChance = strikeOutChance;
        this.singleChance = singleChance;
        this.doubleChance = doubleChance;
        this.tripleChance = tripleChance;
        this.homeRunChance = homeRunChance;
    }
    
    //methods
    public String getName(){
        return name;
    }
    
    public double getStrikeOutChance(){
        return strikeOutChance;
    }
    
    public double getSingleChance(){
        return singleChance;
    }
    
    public double getDoubleChance(){
        return doubleChance;
    }
    
    public double getTripleChance(){
        return tripleChance;
    }
    
    public double getHomeRunChance(){
        return homeRunChance;
    }
    
    public int Hit(){
        
    }
    
    
}
