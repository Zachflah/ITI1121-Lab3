//Zachary Flahaut
//300056316
//ITI1121-Z01

public class Combination{

  private int a,b,c,d;

  public Combination(int first,int second, int third, int fourth){
    a = first;
    b = second;
    c = third;
    d = fourth;
  }
  public boolean equals(Combination other){
    if (this.a == other.a && this.b == other.b && this.c == other.c && this.d == other.d){
      return true;
    }
    else{
      return false;
    }
  }
  public String toString(){
    StringBuffer str = new StringBuffer();
    str.append(a);
    str.append(" , ");
    str.append(b);
    str.append(" , ");
    str.append(c);
    str.append(" , ");
    str.append(d);
    return str.toString();
  }
}
