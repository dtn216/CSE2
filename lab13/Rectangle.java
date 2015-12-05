//Duc Ngo
//CSE002
//Lab13

public class Rectangle {
    public double width;
    public double height;
    
    public void setWidth (double x) {
        width = x;
    }
    public void setHeight (double y) {
        height = y;
    }
    
    public double getArea() {
         return width * height;
    }
    
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        r1.setHeight(5.3);
        r1.setWidth(7.3);
        System.out.println(r1.getArea());
    }
}