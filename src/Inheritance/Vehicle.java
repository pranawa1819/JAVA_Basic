package Inheritance;

// single, multilevel inheritance is important

public class Vehicle {
    public int noOfTyres;

    public void setNoOfTyres(int noOfTyres) {

        this.noOfTyres = noOfTyres;
    }

    public void commute(){
        System.out.printf("I am going from swoyambhu to surakhutte using %d tire ",noOfTyres);
    }

    void start(){
        System.out.println("Car is moving");
    }
}
