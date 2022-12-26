package workshop_trivia_game;

public class Player {
   private final String name;
   private  int place = 0;
   private  int coins=0;
   private  boolean inPenaltyBox=false;

   public boolean isInPenaltyBox() {
      return inPenaltyBox;
   }
   public int place() {
      return place;
   }
   public Player(String name) {
      this.name = name;
   }
   public String name() {
      return name;
   }
   
   public void move(int roll) {
      place += roll;
      if (place >=12)
      place -= 12;
   }
   public void addcoin() {
      coins++;
   }
   public int coins(){
      return coins;
   }
   public void moveToPenaltyBox() {
      inPenaltyBox = true;
   }


}