class Shape{
    void Perimeter()
    {
        System.out.println("This is Perimeter");
    }
    void Area()
    {
        System.out.println("This is area");
    }
}
class Circle extends Shape{
    @Override
 void Perimeter()
 {
    int radius=2;
    double p=2.17*radius*radius;
    System.out.println("Perimeter of Circle="+p);
 }
}
class Square extends Shape{
    @Override
    void Perimeter()
    {
       int side=4;
       double p=4*side;
       System.out.println("Perimeter of Square="+p);
    }
}
class Rectangle extends Shape{
    @Override
    void Perimeter()
    {
       int length=4;
       int breadth=2;
       double p=2*length*breadth;
       System.out.println("Perimeter of Rectangle="+p);
    }
}

public class ShapeExample{
    public static void main(String[] args) {
        //ShapeExample shape= new ShapeExample();
        // ShapeExample s= new ShapeExample();
        Shape shape1=new Circle();
        shape1.Perimeter();
        shape1.Area();
        Circle circle= new Circle();
        circle.Perimeter();
        circle.Area();
        Square square=new Square();
        Rectangle rectangle= new Rectangle();
        //Circle c=(Circle)s;
        //System.out.println(c.Perimeter());
        
    }
}

