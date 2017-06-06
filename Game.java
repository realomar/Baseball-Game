public class Game
{

//methods

public int teamHits(Team x)
{
    //Team X hits, loops through team until there is three outs, then returns amount of hits / 4
    int strikeouts = 0;
    int numBases = 0;
    while(strikeouts < 3)
    {
        numBases += Player.Hit();
        return numBases/4;
    }
}

public int getRuns(Team x)
{
    for(int i=0 ; i < 9 ; i++)
    {
    
    //return 0;
    //Player.Hits()/4 = runs;
    //return runs;
    }
}
}