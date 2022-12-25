import java.lang.reflect.Method;
class Athlete {
     
    private String athleteName = "";
    public String getAthleteName() {return athleteName;}
    public void setAthleteName(String athleteName){ this.athleteName = athleteName; }
}


class GoldWinner extends Athlete{
    
    private GoldWinner(String athleteName){
        setAthleteName(athleteName);
    }
    
    private static GoldWinner goldWinner= null;
    
    public static Athlete getInstance(String athleteName){
        if(goldWinner== null) goldWinner= new GoldWinner(athleteName);
        return goldWinner;
    }
    
}




class SilverWinner extends Athlete{
    
    

    private SilverWinner(String athleteName){
        setAthleteName(athleteName);
    }
    
    private static SilverWinner silverWinner= null;
    
    public static Athlete getInstance(String athleteName){
        if(silverWinner== null) silverWinner= new SilverWinner(athleteName);
        return silverWinner;
    }
    
}





class BronzeWinner extends Athlete{
    
    private BronzeWinner(String athleteName){
        setAthleteName(athleteName);
    }
    
    private static BronzeWinner bronzeWinner= null;
    
    public static Athlete getInstance(String athleteName){
        if(bronzeWinner== null) bronzeWinner= new BronzeWinner(athleteName);
        return bronzeWinner;
    }
    
}


class AthleteFactory{
    
    public Athlete returnObject(String className,String athleteName){
       

               
               try {
                    
                    Class classObject= Class.forName(className);
                    
                    Class[] methodParameters = new class[]{String.class};
                    
                    Method privateMethodNameInString=classObject.getDeclaredMethod("getInstance",methodParameters);
                    
                    privateMethodNameInString.setAccessible(true);

                    Object[] methodArguments =new Object[]{new String(athleteName)}; 
                    
                    return (Athlete)privateMethodNameInString.invoke(null,methodArguments);

                    
                    
               }
               catch(Exception e){throw new IllegalArgumentException("Invalid Customer Type");}
       
    }
    
    
}


public class Main{
    public static void main(String[] args){
        AthleteFactory athleteFactory=new AthleteFactory();
        
        Athlete athlete= athleteFactory.returnObject("SilverWinner","Abhijit Paul");
        
        
        System.out.println("Athlete is name "+ athlete.getAthleteName());
        
        
    }
}


