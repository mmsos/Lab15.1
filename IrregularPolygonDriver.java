import java.awt.geom.*; //import for Point2D.Double

public class IrregularPolygonDriver
{
    public static void main(String [] args)
    {
        IrregularPolygon polygon1 = new IrregularPolygon();
        System.out.println("Student name: " + polygon1.getName()); //expects your name to be returned
        polygon1.add(new Point2D.Double(0, 0));
        polygon1.add(new Point2D.Double(0, 10));
        polygon1.add(new Point2D.Double(10, 10));
        polygon1.add(new Point2D.Double(10, 0));
        
        polygon1.draw(); //expects a square
        System.out.println("Area: " + polygon1.area()); //expects 100
        System.out.println("Perimeter: " + polygon1.perimeter()); //expects 40
        
        IrregularPolygon polygon2 = new IrregularPolygon();
        System.out.println("Student name: " + polygon1.getName()); //expects your name to be returned
        polygon2.add(new Point2D.Double(0, 0));
        polygon2.add(new Point2D.Double(0, 10));
        polygon2.add(new Point2D.Double(10, 0));
        
        polygon2.draw(); //expects a triangle
        System.out.println("Area: " + polygon2.area()); //expects 50
        System.out.println("Perimeter: " + polygon2.perimeter()); //expects 34.14
        
        IrregularPolygon polygon3 = new IrregularPolygon();
        System.out.println("Student name: " + polygon1.getName()); //expects your name to be returned
        polygon3.add(new Point2D.Double(0, 0));
        polygon3.add(new Point2D.Double(0, 10));
        
        polygon3.draw(); //expects a line
        System.out.println("Area: " + polygon3.area()); //expects -1 OR 0
        System.out.println("Perimeter: " + polygon3.perimeter()); //expects -1 OR 0 OR 10 OR 20
    }
        
}