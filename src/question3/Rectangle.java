package question3;

public class Rectangle {
    int length;
    int breadth;

    public void setData(int l, int b){
        length = l;
        breadth = b;


    }
    public synchronized int getArea(){
        return length*breadth;

    }
    public synchronized int getPerimeter(){
        return 2*(length+breadth);
    }
}
