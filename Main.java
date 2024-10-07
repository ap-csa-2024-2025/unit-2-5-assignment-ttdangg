import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // problem 1
    Circle circle1 = new Circle(10.1);
    System.out.println(circle1.toString());
    Circle circle2 = new Circle(14);
    System.out.println(circle2.toString());
    Circle circle3 = new Circle(20.5);
    System.out.println(circle3.toString());
    

    // problem 2
    Scanner sc = new Scanner(System.in);

    System.out.println("Type a number for length and width: ");
    double lenWid = sc.nextDouble();

    System.out.println("Type a length: ");
    double length = sc.nextDouble();

    System.out.println("Type a width: ");
    double width = sc.nextDouble();

    Rectangle rect1 = new Rectangle(lenWid);
    System.out.println(rect1.toString());
    Rectangle rect2 = new Rectangle(length,width);
    System.out.println(rect2.toString());

    // problem 3
    System.out.println("Type a side length: ");
    double sideLength = sc.nextDouble();
    RegularPolygon triangle = new RegularPolygon(sideLength);
    System.out.println(triangle.toString());
    RegularPolygon square = new RegularPolygon(4,sideLength);
    System.out.println(square.toString());

  
  }
  
}
