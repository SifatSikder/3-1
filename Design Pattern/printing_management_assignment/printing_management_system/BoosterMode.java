package printing_management_system;

public class BoosterMode extends PrintMode {

    private int intensity_threshold;

    @Override
    public void saveToner() {
        
        
    }

    @Override
    public void savePage() {

        
    }

    @Override
    public void boost() {
        setColor_intensity(intensity_threshold);
    }
    
    public int getIntensity_threshold() {
        return intensity_threshold;
    }

    public void setIntensity_threshold(int intensity_threshold) {
        this.intensity_threshold = intensity_threshold;
    }

}
