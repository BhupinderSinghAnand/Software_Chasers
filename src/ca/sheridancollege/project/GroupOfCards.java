/**
 * SYST 17796 Project Summer 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * 
 */
public class GroupOfCards  
{

    public GroupOfCards() {
    }
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    private int size;//the size of the grouping
    
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
        cards = new ArrayList<>();
        
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> makeHand(){       
       
    
        Deck d = new Deck();
        Card[] dd= new Card[d.reset().length];
        dd = Arrays.copyOf(d.reset(),d.reset().length);
                        
        for (int i = 0; i <dd.length; i++) {
            
            cards.add(dd[i]);
                                  
        }
        shuffle();
        cards.subList(8, dd.length-1).clear();
        return cards;
                
        
    }
    
    public void setCards(ArrayList<Card> cards){
        this.cards = cards;
    }
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
  
}//end class
