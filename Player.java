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
        double x = Math.random();
        if( x < strikeOutChance){
        System.out.println("stttrrrriiiiikkkkeeee 3 you're out!");
        return 0;
       }
       else if( x<strikeOutChance + singleChance){
        System.out.println("And that's a single for" + name);
        return 1;
       }
       else if( x< strikeOutChance + singleChance + doubleChance){
        System.out.println("That's a double for" + name);
        return 2;
       }
       else if( x< strikeOutChance + singleChance + doubleChance + tripleChance){
        System.out.println("That's a triple for" + name);
        return 3;
       }
       else {
        System.out.println("It's a home run for" + name);
        return 4;
       }
    }
}
