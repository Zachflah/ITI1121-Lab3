//Zachary Flahaut
//300056316
//ITI1121-Z01

public class Sum{

  public static void main(String[] args){
    int sum = 0;
    for(int i = 0; i < args.length; i++){
      sum += Integer.parseInt( args[ i ] );     ///takes each string inputed into the command line and changes it to a int which gets added
    }
    System.out.println("The sum is " + sum);
  }
}
