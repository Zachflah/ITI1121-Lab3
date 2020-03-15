//Zachary Flahaut
//300056316
//ITI1121-Z01

import java.util.*;

public class SecurityAgent{

  private Combination secret;
  private DoorLock myLock;

  public SecurityAgent(){
    secret  = new Combination(1,2,3,4);
    myLock = new DoorLock(secret);

  }
  /*
  public SecurityAgent(){
    Random rand = new Random();
    int first = rand.nextInt(10)+1;
    int second = rand.nextInt(10)+1;
    int third = rand.nextInt(10)+1;
    int fourth = rand.nextInt(10)+1;

    Combination secret = new Combination(frist,second,third, fourth);
    DoorLock door = new DoorLock(secret);
  }
  */

  public DoorLock getDoorLock(){
    return myLock;
  }
  public void activateDoorLock(){
    myLock.activated(secret);
  }
}
