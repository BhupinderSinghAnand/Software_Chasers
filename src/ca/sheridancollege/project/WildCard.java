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
public class WildCard extends Card{
    
    Color color;
    Value value;
    
    public WildCard(Color color, Value value){
        
       super(color,value);
       this.color=color;
       this.value=value;
        
    }
    
    @Override
    public String toString(){
        return color+" "+value;
    }
}