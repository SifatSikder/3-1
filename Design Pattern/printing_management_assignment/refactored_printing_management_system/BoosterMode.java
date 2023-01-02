package refactored_printing_management_system;

public class BoosterMode extends PrintMode {
    private ColorIntensity intensity_threshold;
    
    @Override
    void applyMode() {
          setColor_intensity(intensity_threshold); 
    }

    public ColorIntensity getIntensity_threshold() {
      return intensity_threshold;
    }
    public void setIntensity_threshold(ColorIntensity intensity_threshold) {
      this.intensity_threshold = intensity_threshold;
    }


}