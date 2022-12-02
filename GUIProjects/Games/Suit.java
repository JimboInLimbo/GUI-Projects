package Games;

public enum Suit{
    HEARTS("HEARTS"),SPADES("SPADES"),DIAMONDS("DIAMONDS"),CLUBS("CLUBS");
    
    //private variables
    private final String text;
    
    //constructor is private
    private Suit(String text){
        this.text=text;
        
    }

    //print Suit
    public String printSuit(){
        return this.text;
    }
}