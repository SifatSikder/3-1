package printing_management_system;

public abstract class PrintMode {
    private int number_of_pages; 
    private int page_size;
    private int orientation;
    private int color_intensity;
    private double cost_per_page;


    public abstract void saveToner();
    public abstract void savePage();
    public abstract void boost(); 
    
    public int getNumber_of_pages() {
        return number_of_pages;
    }
    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }
    public int getPage_size() {
        return page_size;
    }
    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }
    public int getOrientation() {
        return orientation;
    }
    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }
    public int getColor_intensity() {
        return color_intensity;
    }
    public void setColor_intensity(int color_intensity) {
        this.color_intensity = color_intensity;
    }
    public double getCost_per_page() {
        return cost_per_page;
    }
    public void setCost_per_page(int cost_per_page) {
        this.cost_per_page = cost_per_page;
    }



      
}
