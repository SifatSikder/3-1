package workshop_FizzBuzz;
public class FizzBuzz {
    public static String printAppropriateString(int number) {
        
        String str="";
        str += number%3 ==0 ? "Fizz" : "";
        str += number%5 ==0 ? "Buzz" : "";
        return str.length()<1 ? String.valueOf(number) : str;
        
    }

}


