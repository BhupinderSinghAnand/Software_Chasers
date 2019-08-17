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
public class NumCard extends Card{
    
    Color color;
    Value value;
    
    public NumCard(Color color, Value value){
        
       super(color,value);
       this.color=color;
       this.value=value;
        
    }
    
    @Override
    public String toString(){
        return color+" "+value;
    }
}
