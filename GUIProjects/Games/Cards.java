package Games;

import java.awt.*;
import java.util.Random;
import Games.Suit;
import Games.Rank;


public class Cards{
    
    private Rank rank;
    private Suit suit;
    private boolean face;

    public Cards(Rank r,Suit s){
        rank = r;
        suit = s;
        this.face = false;
    } 

    public void flipCards(){
        this.face = true;
    }

    public Rank getRank(){
        return rank;
    }

    public Suit getSuit(){
        return suit;
    }

    public String toString(){
        if (face = true){
            return "Rank: " + rank;
        }else{
            return "You cant see this card!";
        }
    }

    public String compareTo(Cards s){
        return "New Suit --> " + s.getSuit() + " Old Suit --> " + suit;
    }
}