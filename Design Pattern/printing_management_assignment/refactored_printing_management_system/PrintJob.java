package refactored_printing_management_system;

import java.util.*;

class SortRequest{
    private Queue<PrintRequest> printRequestQueue;
    private Priority priority;
    
    // constructor and getters for printRequestQueue and priority
    

    private void setPriority(PrintRequest printRequest, Priority priority) {
      // update the priority of printRequest to newPriority
    }
    void addRequest(PrintRequest printRequest,Priority priority) {
      setPriority(printRequest, priority);
      printRequestQueue.add(printRequest);
    }
    PrintRequest getNextRequest() {
      return printRequestQueue.remove();
    }

    

  }