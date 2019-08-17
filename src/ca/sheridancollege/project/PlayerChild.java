/*
 * Gurmannat Singh Oberoi
 *  Student ID: 991548921
 * Davis Campus
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Gurmannat
 */
public class PlayerChild extends Player {
    
    private GroupOfCards deck = new GroupOfCards(7);
    
    public PlayerChild(String name,ArrayList<Card> cards)
    {
        super(name,cards);
        
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
    
    public GroupOfCards getGroupOfCards(){
        return this.deck;
    }
    
    public void setGroupOfCards(ArrayList<Card> array){
        deck.setCards(array);
        deck.setSize(array.size());
    }
    @Override
    public void play(){
        
    }
}
