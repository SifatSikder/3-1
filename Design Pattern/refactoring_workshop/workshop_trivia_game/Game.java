package workshop_trivia_game;

import java.util.ArrayList;
import java.util.List;


public class Game {
   private final  List<Player> players = new ArrayList<Player>();

   private int currentPlayer = 0;
   private boolean isGettingOutOfPenaltyBox;
   private final Questions questions = new Questions();
   
   //Oddball solution
   // public String createRockQuestion(int index) {
   //    return "Rock Question " + index;
   // }

   

   // deadcode
   // public boolean isPlayable() {
   // return (howManyPlayers() >= 2);
   // }

   public void add(String playerName) {

      players.add(new Player(playerName));
      System.out.println(playerName + " was added");
      System.out.println("They are player number " + players.size());
   }

   //deadcode
   // public int howManyPlayers() {
   //    return players.size();
   // }

   public void roll(int roll) {
      System.out.println(currentPlayer().name() + " is the current player");
      System.out.println("They have rolled a " + roll);

      if (currentPlayer().isInPenaltyBox()) 
      {
         if (roll % 2 != 0) 
         {
            isGettingOutOfPenaltyBox = true;
            System.out.println(currentPlayer().name() + " is getting out of the penalty box");
            currentPlayer().move(roll);
            System.out.println(currentPlayer().name()+ "'s new location is "+ currentPlayer().place());
            System.out.println("The category is " + questions.currentQuestionCategory(currentPlayer().place()));
            questions.askQuestion(currentPlayer().place());
         } 
         else 
         {
            System.out.println(currentPlayer().name() + " is not getting out of the penalty box");
            isGettingOutOfPenaltyBox = false;
         }

      } 
      else 
      {

         currentPlayer().move(roll);
         System.out.println(currentPlayer().name()+ "'s new location is "+ currentPlayer().place());
         System.out.println("The category is " + questions.currentQuestionCategory(currentPlayer().place()));
         questions.askQuestion(currentPlayer().place());
      }

   }

   public Game() {

   }

   private Player currentPlayer() {
      return players.get(currentPlayer);
   }

   public boolean wasCorrectlyAnswered() {
      if (currentPlayer().isInPenaltyBox()) 
      {
         if (isGettingOutOfPenaltyBox) {
            System.out.println("Answer was correct!!!!");
            currentPlayer().addcoin();
            System.out.println(currentPlayer().name()+ " now has "+ currentPlayer().coins()+ " Gold Coins.");
            return returnWinnerAndMoveToNextPlayer();
         } 
         else 
         {
            moveToNextPlayer();
            return true;
         }

      }
      else 
      {

         System.out.println("Answer was corrent!!!!");
         currentPlayer().addcoin();
         System.out.println(currentPlayer().name()+ " now has " + currentPlayer().coins()+ " Gold Coins.");
         return returnWinnerAndMoveToNextPlayer();
      }
   }

   private boolean returnWinnerAndMoveToNextPlayer() {
      boolean winner = didPlayerWin();
      moveToNextPlayer();
      return winner;
   }

   private void moveToNextPlayer() {
      currentPlayer++;
      if (currentPlayer == players.size())currentPlayer = 0;
   }

   public boolean wrongAnswer() {
      System.out.println("Question was incorrectly answered");
      System.out.println(currentPlayer().name() + " was sent to the penalty box");
      currentPlayer().moveToPenaltyBox();
      moveToNextPlayer();
      return true;
   }

   private boolean didPlayerWin() {
      return !(currentPlayer().coins() == 6);
   }
}
