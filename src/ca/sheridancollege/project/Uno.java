/*
 * Gurmannat Singh Oberoi
 *  Student ID: 991548921
 * Davis Campus
 */
package ca.sheridancollege.project;

import java.util.*;

/**
 *
 * @author Gurmannat
 */
public class Uno extends Game{
    
     private Scanner input = new Scanner(System.in);
     private GroupOfCards deck = new GroupOfCards(7);
     private ArrayList<Card> playerCards = new ArrayList<>();
     Card.Color calledColor;
     private ArrayList<Player> players = new ArrayList<>();
     
    public Uno(String name){
        super(name);
    }
    
    public void play(){
    
        int userInput = start();
        
        createPlayers();
        Random rand = new Random();
        
        
  
        Card top = new NumCard(Card.Color.getColor(rand.nextInt(4)), Card.Value.getValue(rand.nextInt(11)));
        System.out.println("The first card on table is "+top.getColor()+" "+ top.getValue());
        
        for (int i = 0; i < getPlayers().size(); i++) {
            System.out.println("");
            
            System.out.print("Player "+(i+1)+":");
            
            System.out.println(getPlayers().get(i).getPlayerID());
            /*for (int j = 0; j < getPlayers().get(i).getCards().size(); j++) {
                    
                Card.Color c = getPlayers().get(i).getCards().get(j).getColor();
                
                System.out.println(c +" ");
                
                
            }**/
            
            
        }
       
        
        
         
        
        
    }
    
    
    
    public void createPlayers(){
        int userInput;

        while(true){
            System.out.print("Enter the number of Players: ");
            while(true){
                try{
                    userInput = input.nextInt();
                    break;
                }
                catch(Exception ex){
                    
                    System.out.print("Try Again: ");
                    input.nextLine();
                }
            }

            if(userInput < 2){
                System.out.println("Minimum number is 2.");
            }
            else if(userInput > 4){
                System.out.println("Maximum number of players allowed is 4.");
            }
            else{
                break;
            }
           
        }
        input.nextLine();
        GroupOfCards grp = new GroupOfCards();
        
        Deck d = new Deck();
        

        Card[] dd = new Card[108];
        dd = Arrays.copyOf(d.reset(),108);
        Random r= new Random();
        for (int i = 0; i < 7; i++) {
            playerCards.add(dd[r.nextInt(108)]);
            
        }
        playerCards.add(dd[r.nextInt(108)]);
        ArrayList<Player> players = new ArrayList<>();
        for(int i = 0; i < userInput; i++){
            System.out.print("Enter the name of player " + (i + 1) + ": ");
            String name = input.nextLine();
            players.add(new PlayerChild(name,playerCards));
            
            
        }

        setPlayers(players);
    }
    
    public int start(){
        System.out.println();
        System.out.print("Press 1 to start the game ");
        int userInput;
        while(true){
            try{
                userInput = input.nextInt();
                System.out.println();
                if(userInput != 1 ){
                    throw new InputMismatchException();
                }
                break;
            }
            catch(InputMismatchException ex){
                System.out.println("Wrong number entered.");
                System.out.print("Try again: ");
                input.nextLine();
            }
        }
        return userInput;
    }
    @Override 
    public void declareWinner(){
        for (int i = 0; i < getPlayers().size(); i++) {
           int m= getPlayers().get(i).getCards().size();
           if(m==0){
               System.out.println("Player : "+i + "  "+getPlayers().get(i).getPlayerID() +" is winner." );
           }
           break;
        }
        
    }
    public void again(){
    
        System.out.println("Wanna play again!!");
        Scanner i = new Scanner(System.in);
        System.out.println("Press y for again");
        String st = i.nextLine();
        if(st.toLowerCase().charAt(0) == 'y'){
            play();
        }
    }
     
}
