public class Game
{

//methods
int numBases;
public int teamHits(Team x)
{
    //Team X hits, loops through team until there is three outs, then returns amount of hits / 4
    int strikeouts = 0;
    numBases = 0;
    int i = 0;
    while(strikeouts < 3)
    {
 
        Player p = x.getRoster().get(i);
        numBases += p.Hit();
        if(i==9){
            i=0;
        }
        else{
            i++;
        }
    
        
    }
    return numBases/4;
}

}

// public int getRuns(Team x)
// {
//     for(int i=0 ; i < 9 ; i++)
//     {
//     
//     //return 0;
//     //Player.Hits()/4 = runs;
//     //return runs;
//     }
// }
// }