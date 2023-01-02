package printing_management_system;

public class TonerSaveMode extends PrintMode {

    private String tonerSavingLevel;
    
    
    @Override
    public void saveToner() {

        if(tonerSavingLevel.equals("high"))
        {
            System.out.println("Using algorithm 2");
            setColor_intensity(0);
        }
        else if(tonerSavingLevel.equals("medium"))
        {
            System.out.println("Using algorithm 1");
            setColor_intensity(1);
        }
        else
        {
            System.out.println("Using algorithm 0");
            setColor_intensity(2);
        }
    }

    @Override
    public void savePage() {
        
        
    }

    @Override
    public void boost() {
        
        
    }

    public String getTonerSavingLevel() {
        return tonerSavingLevel;
    }

    public void setTonerSavingLevel(String tonerSavingLevel) {
        this.tonerSavingLevel = tonerSavingLevel;
    }



}
