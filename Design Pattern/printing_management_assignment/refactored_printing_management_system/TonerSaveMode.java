package refactored_printing_management_system;


import java.util.*;

public class TonerSaveMode extends PrintMode {
    private TonerSavingLevel tonerSavingLevel;
    
    
    private Stack <ColorIntensity> reversed_color_intensity = new Stack <>();
    private void reverse_color_intensity_enum()
    {
      for (ColorIntensity color_intesity : ColorIntensity.values())
      {
        reversed_color_intensity.push (color_intesity);
      }
    }
    
    HashMap<TonerSavingLevel,ColorIntensity> toner_saving_level_color_intensity_pair=new HashMap<>();
    private  void toner_saving_level_color_intensity_pair_creation()
    {
      reverse_color_intensity_enum();
      for (TonerSavingLevel toner_saving_level : TonerSavingLevel.values()) {
        toner_saving_level_color_intensity_pair.put(toner_saving_level, reversed_color_intensity.pop());
      }
    }
    @Override
    
    //In the previous code I was checking if the color intensity is equals to high,medium or low
    //and based on that I was assigning the color intensity which was causing me to duplicate the if else code
    //so i create a hashmap to solve the duplicated code issue
    void applyMode() {
      toner_saving_level_color_intensity_pair_creation();
      setColor_intensity(toner_saving_level_color_intensity_pair.get(tonerSavingLevel));
    }
  

  
  
  }
  enum TonerSavingLevel {
    HIGH, MEDIUM, LOW
  }
