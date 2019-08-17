/*
 * Gurmannat Singh Oberoi
 *  Student ID: 991548921
 * Davis Campus
 */
package ca.sheridancollege.project;

/**
 *
 * @author Gurmannat
 */
public class Deck{
    
    private Card[] cardDeck; 
    private int numDeck;
    
    public Deck(){
    
        cardDeck = new Card[108];
    } 
    
    public Card[] reset(){
    
        Card.Color[] colors = Card.Color.values();
        numDeck=0;
        
        for (int i = 0; i < colors.length-1; i++) {
            Card.Color color = colors[i];
            
            cardDeck[numDeck] = new NumCard(color, Card.Value.getValue(0));
            
            for (int j = 0; j < 10; j++) {
                 cardDeck[numDeck] = new NumCard(color, Card.Value.getValue(j));
                 cardDeck[numDeck] = new NumCard(color, Card.Value.getValue(0));                
                
            }
            Card.Value[] values = new Card.Value[]{Card.Value.DrawTwo,Card.Value.Skip,Card.Value.Reverse};
            
            for(Card.Value value: values){
            
                cardDeck[numDeck++]= new NumCard(color,value);
                cardDeck[numDeck++]= new NumCard(color,value);
            }
        }
         Card.Value[] values = new Card.Value[]{Card.Value.Wild,Card.Value.Wild_four};
         for(Card.Value value: values){
         
             for (int i = 0; i < 4; i++) {
                 cardDeck[numDeck++] = new WildCard(Card.Color.Wild,value);
                 
             }
         }
         
        return cardDeck;
        
    }
    
}
