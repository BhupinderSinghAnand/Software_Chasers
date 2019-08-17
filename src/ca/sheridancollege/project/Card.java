/**
 * SYST 17796 Project Summer 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * 
 */
public abstract class Card 
{
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    enum Color{
        Red,Blue,Green, Yellow,Wild;
        
        private static final Color[] colors = Color.values();
        public static Color getColor(int i){
            return Color.colors[i];
        }
        
    }
    
    enum Value{
        Zero, One , Two, Three, Four, Five,Six, Seven, Eight,Nine,Ten, DrawTwo , Skip,Reverse,Wild,Wild_four;
        
        private static final Value[] values = Value.values();
        public static Value getValue(int i){
        
            return Value.values[i];
        }
    
    }
    
    public final Color color;
    public final Value value;

    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public Value getValue() {
        return value;
    }
    
    
    
    @Override
    public abstract String toString();
    
}
