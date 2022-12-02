import Games.Clicker1;
import GUIWin.GUIWindow;
import Games.ColorButton;
import Games.Cards;
import Games.Suit;
import Games.Rank;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {
  public static void main(String[] args) {
    //new ColorText();
      Cards c1 = new Cards(Rank.ACE, Suit.HEARTS);
      c1.flipCards();
      System.out.println(c1.toString());

      //GANG
  }
}
