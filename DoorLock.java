//Zachary Flahaut
//300056316
//ITI1121-Z01

public class DoorLock{

  public static final int MAX_NUMBER_OF_ATTEMPTS = 6;
  private Combination combination;
  private double count;
  private boolean activate;
  private boolean open;

   public DoorLock(Combination combination){
     this.combination = combination;
     open = false;
     activate = true;
     count = 0;

   }
   public boolean isOpen(){
     if(open == true){
       return true;
     }
     else{
       return false;
     }
   }
   public boolean isActivated(){              ///the method isActivated == isEnabled
     if(activate == true){
       return true;
     }
     else{
       return false;
     }
   }
   public void activated( Combination c){     //the method activated == enabled
     if(combination.equals(c)){
       open = true;
     }
     else{
       open = false;
     }
   }
   public boolean open(Combination combination){
     count++;
     if(count == MAX_NUMBER_OF_ATTEMPTS){
       activate = false;
       count = 0;
       return false;
     }
     else if(this.combination.equals(combination)){
         open = true;
         count = 0;
         return true;
       }
      else{
        return false;
      }
    }
}
