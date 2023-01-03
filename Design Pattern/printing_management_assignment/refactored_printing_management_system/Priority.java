package refactored_printing_management_system;

class PrioritySetting {
    private PriorityLevel priorityLevel;
    
    // getter and setter for priorityLevel
    public PriorityLevel getPriorityLevel() {
        return priorityLevel;
    }
    
    public void setPriorityLevel(PriorityLevel priorityLevel) {
        this.priorityLevel = priorityLevel;
  }
  
    
  //solved blacksheep
  private void changePriority()
  {
    //change the priority of a job respectively. 
    
  }
}
enum PriorityLevel
{
  HIGH,
  MEDIUM,
  LOW
}
