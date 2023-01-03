package refactored_printing_management_system;

import java.util.*;

public class PrintJob {
    
  private Queue<PrintRequest> printRequests ;
  private PrioritySetting PrioritySetting;

  public PrintJob(PrioritySetting PrioritySetting){
    this.PrioritySetting = PrioritySetting;
  }

  private void pullJob(){

    // send a specific job to production based on the priority setting
  }

  private void print()
  {
    //print that job
  }
}
