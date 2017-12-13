
import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*;            // for DrawingTool

public class MaxMoeller implements Polygon{
    ArrayList <Point2D.Double> myPolygon;
    double perim;
    double areaTotal;
    double x;
    double y;
    double total; 
    DrawingTool myPen;
    SketchPad myPaper;
    public String getName(){
        return "Maxwell Moeller";
    }

    public IrregularPolygon() { 
        myPolygon = new ArrayList <Point2D.Double> (); 
        x = 1;
        y = 1;
        perim = 0.0;
        areaTotal = 0.0;
        myPaper = new SketchPad(500,500);
        myPen = new DrawingTool(myPaper);
    }

    public void add(Point2D.Double aPoint) { 
        myPolygon.add(aPoint);    
    }

    public void draw() { 
        myPen.up();
        myPen.move(myPolygon.get(0).getX(),myPolygon.get(0).getY());
        myPen.down();
        //Loop through each given point
        for(int i = 1; i < myPolygon.size(); i++)
        {
            myPen.move(myPolygon.get(i).getX(), myPolygon.get(i).getY());
        }
        //Back to first point
        myPen.move(myPolygon.get(0).getX(), myPolygon.get(0).getY());
    }

    public double perimeter() { 
        if(myPolygon.size() < 3){
            return -1;
        }

        int arrayLength = myPolygon.size() - 1;
        for(int i = 0; i < myPolygon.size() - 1; i++)
        {
            perim += ((Point2D.Double)myPolygon.get(i)).distance((Point2D.Double)myPolygon.get(i + 1));    
        }
        perim += ((Point2D.Double)myPolygon.get(0)).distance((Point2D.Double)myPolygon.get(arrayLength));
        return perim;
    }

    public double area() { 

        for(int i = 0; i < myPolygon.size() - 1; i++)
        {
            double X1 = myPolygon.get(i).getX();
            double Y1 = myPolygon.get(i).getY();
            double X2 = myPolygon.get(i+1).getX();
            double Y2 = myPolygon.get(i+1).getY();
            total += (X1*Y2 - X2*Y1); 
        }
        if(total < 0){
            return total * -.5;
        }
        return .5 * total;
    }
}
