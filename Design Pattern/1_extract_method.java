//Extract method and temps
import java.util.ArrayList;


class FootballPlayer{
    
    private String name="";
    private double[] fortyYardDashTimes=null;
    
    public String getName(){return name;}
    
    public double[] getFortyYardDashTimes(){return fortyYardDashTimes;}
    
    public FootballPlayer(String name, double[] fortyYardDashTimes){
        this.name =name;
        this.fortyYardDashTimes =fortyYardDashTimes;
    }
    
}




class FootballPlayer40YardDashInfo{
	ArrayList<FootballPlayer> players = new ArrayList();
    
    public void addFootballPlayer(FootballPlayer player){
    	players.add(player);
    }
    
    public void printPlayerInfo(){
    
    printTitles();
        
    printAvg40YdTime();

    }

    private void printCharMultTimes(char charToPrint, int howManyTimes){
        for(int i = 0; i < howManyTimes; i++){ System.out.print(charToPrint); }
        System.out.println();
    }
    
    private void printTitles(){
        System.out.printf("%-15s %15s", "Name", "Avg 40 Time\n");
        printCharMultTimes('_',30);

    }
    
    private double[] printNameAndGetDashTimes(FootballPlayer player){
        System.out.printf("%-19s", player.getName());
        return player.getFortyYardDashTimes();
    }
    
    private double getAvgDashTime(double[] fortyYardDashTimes){
        double total40YdDashTimes = 0.0;
        for(int i = 0; i < fortyYardDashTimes.length; i++){
            
            total40YdDashTimes += fortyYardDashTimes[i];

        }
        return total40YdDashTimes /fortyYardDashTimes.length;
    }
    
    private void printAvg40YdTime() {
         for(FootballPlayer player : players)
        {
            double[] fortyYardDashTimes =printNameAndGetDashTimes(player) ;
            
            System.out.printf("%1$.2f", getAvgDashTime(fortyYardDashTimes));
            System.out.println();

        }
    }


    




}






public class Main {
  public static void main(String[] args) {
   FootballPlayer40YardDashInfo fb40Dash = new FootballPlayer40YardDashInfo();
   
    double[] cKent40YdDashTimes={4.36, 4.39, 4.41};
    FootballPlayer cKent =new FootballPlayer("Clerk Kent",cKent40YdDashTimes);
    fb40Dash.addFootballPlayer(cKent);
   
    double bWayne40YdDashTimes[] = {4.42, 4.43, 4.49};
    FootballPlayer bruceWayne = new FootballPlayer("Bruce Wayne", bWayne40YdDashTimes);
    fb40Dash.addFootballPlayer(bruceWayne);
    
    
    
    fb40Dash.printPlayerInfo();
    }


   
  }


