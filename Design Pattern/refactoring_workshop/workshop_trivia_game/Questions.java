package workshop_trivia_game;

import java.util.LinkedList;
import java.util.List;

public class Questions{
   
      private final List<String> popQuestions = new LinkedList<String>();
      private final List<String> scienceQuestions = new LinkedList<String>();
      private final List<String> sportsQuestions = new LinkedList<String>();
      private final List<String> rockQuestions = new LinkedList<String>();
      
   
      public Questions() {
         for (int i = 0; i < 50; i++) {
            popQuestions.add("Pop Question " + i);
            scienceQuestions.add("Science Question " + i);
            sportsQuestions.add("Sports Question " + i);
            rockQuestions.add("Rock Question " + i);
         }
      }


      enum QuestionCategory {
         Pop("Pop"), 
         Science("Science"), 
         Sports("Sports"), 
         Rock("Rock");
         private final String label;
   
         QuestionCategory(String label) {
            this.label=label;
         }
         public String getLabel() {
            return label;
         }
      }

      void askQuestion(int index) {
      // duplicate code
      if (currentQuestionCategory(index).equals("Pop"))System.out.println(popQuestions.remove(0));
      else if (currentQuestionCategory(index).equals("Science"))System.out.println(scienceQuestions.remove(0));
      else if (currentQuestionCategory(index).equals("Sports"))System.out.println(sportsQuestions.remove(0));
      else if (currentQuestionCategory(index).equals("Rock"))System.out.println(rockQuestions.remove(0));
   }

   //Duplicate
   Questions.QuestionCategory currentQuestionCategory(int index) {
      return QuestionCategory.values()[index%4];
   }
   }