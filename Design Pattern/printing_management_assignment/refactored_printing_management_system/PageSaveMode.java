package refactored_printing_management_system;

class PageSaveMode extends PrintMode {
    
    private void adjust_page_size()
    {
        //algorithm to adjust page size only
    }

    private void adjust_page_orientation()
    {
        //algorithm to adjust page orientation only
    }

    private void reduce_number_of_pages()
    {
        //algorithm to reduce number of pages only
    }


    
    
    
    //Previously when a single method is performing an algorithm which
    //was adjusting page size and orientation and hence was reducing the required
    //number of pages. So it was a long method doing so many things
    //Hence i have solve it using extract method technique 
    @Override
    void applyMode() {
      // implement algorithm to adjust page size and orientation
      adjust_page_size();
      adjust_page_orientation();
      reduce_number_of_pages();
    }
    
    void renderPreview() {
      // show a preview of the updated document
    }
  }
