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
            try{
                Scanner scanner = new Scanner(new File("BaseballStats.csv"));
                scanner.useDelimiter(",");
                for(int i = 0; i < 9; i++){
                    roster.add(new Player(scanner.next(), scanner.nextDouble(), scanner.nextDouble(),scanner.nextDouble(),
                                      scanner.nextDouble(), scanner.nextDouble()));
                }
            catch(FileNotFoundException ex){
                System.out.println("No team found.");
            }
        }
        
        // insert csv scanner;
    }
