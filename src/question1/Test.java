package question1;

public class Test extends Student{
  int maths;
  int science;

  public void setMarks(int m1, int m2){
      maths = m1;
      science = m2;
  }
  public void displayMarks(){
      System.out.println("Marks of maths:"+maths);
      System.out.println("Marks of science: "+science);
  }
}
