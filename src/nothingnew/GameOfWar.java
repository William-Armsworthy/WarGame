package nothingnew;

import java.util.ArrayList;

public class GameOfWar {
private ArrayList<Card> p1Hand;
private ArrayList<Card> p2Hand;

GameOfWar theGame = new GameOfWar ();

public GameOfWar()
{
    p1Hand = new ArrayList<>();
    p2Hand = new ArrayList<>();
    
    DeckOfCards theDeck = new DeckOfCards();
    theDeck.shuffle();
    
    dealTheCards(theDeck);
    
}//End of GameOfWar

/**
 * This method will deal all of the cards to the payers
 */

private void dealTheCards(DeckOfCards theDeck)
{
    for (int cardNum=0; cardNum<52; cardNum++)
    {
        if (cardNum % 2==0)
            p1Hand.add(theDeck.dealTopCard());
        else
            p2Hand.add(theDeck.dealTopCard());
 
    }
}



    
}//End of public class
