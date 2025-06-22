package question1;

public class Results extends Test implements Sports{
  public void DisplayResult(){
      int total = maths+science;
      print_roll();
      displayMarks();
      System.out.println("Total marks you obtain in 2 subject is: "+total);
      System.out.println("Sports weight is : "+sport_wt);
  }
    public static void main(String[] args) {
        Results r1 = new Results();
        r1.setRoll_no(9);
        r1.setMarks(45,67);
        r1.DisplayResult();
    }
}


