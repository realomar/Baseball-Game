import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Team{
    //fields
    private String teamName;
    private ArrayList<Player> roster = new ArrayList<Player>();
    
    //constructor
    public Team(String name){
        teamName = name;
        for( int i=0 ; i<9 ; i++)
        {
            Scanner scanner = new Scanner(new File("BaseballStats.csv"));
      hug      scanner.useDelimiter(",");
          ss  roster.add(new Player(scanner.next(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.next()));
           }
        
        // insert csv scanner;
    }
    
}

