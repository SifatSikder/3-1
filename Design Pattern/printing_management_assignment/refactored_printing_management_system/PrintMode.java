package refactored_printing_management_system;

public abstract class PrintMode {
  private int number_of_pages;
  private PageSize page_size;
  private Orientation orientation;
  private ColorIntensity color_intensity;
  private double cost_per_page;
  
  //previously there were 3 abstract methods of which 
  //only 1method was need by its child classes each
  //but all child classes were forced to implement all 3 methods
  //so this was resulting in refused bequest smell
  //by making this applyMode() method I Have solved the refused bequest smell
  abstract void applyMode();

  public int getNumber_of_pages() {
    return number_of_pages;
  }
  public void setNumber_of_pages(int number_of_pages) {
    this.number_of_pages = number_of_pages;
  }
  public PageSize getPage_size() {
    return page_size;
  }
  public void setPage_size(PageSize page_size) {
    this.page_size = page_size;
  }
  public Orientation getOrientation() {
    return orientation;
  }
  public void setOrientation(Orientation orientation) {
    this.orientation = orientation;
  }
  public ColorIntensity getColor_intensity() {
    return color_intensity;
  }
  public void setColor_intensity(ColorIntensity color_intensity) {
    this.color_intensity = color_intensity;
  }
  public double getCost_per_page() {
    return cost_per_page;
  }
  public void setCost_per_page(double cost_per_page) {
    this.cost_per_page = cost_per_page;
  }
}


//By using enum I have refactored primitive obsession smell
enum PageSize {
  A4, A5, B5, LETTER
}

enum Orientation {
  PORTRAIT, LANDSCAPE
}

enum ColorIntensity {
  HIGH, MEDIUM, LOW
}
