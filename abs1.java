abstract class Shape
{
    private double area;
    private double perimeter;
    private double side;

    abstract public void calculateaArea(Shape s);
    abstract public void calculatePerimeter(Shape s);

//    Shape(double side)
//    {
//        this.side = side;
//    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
class Square extends Shape
{

    public Square(double side)
    {
      //  super(side);
        super.setSide(side);
    }
    public void calculateaArea(Shape s) {
         double area = s.getSide()*s.getSide();
        super.setArea(area);
    }


    public void calculatePerimeter(Shape s) {
        double perimeter = 4*getSide();
        super.setPerimeter(perimeter);
    }


    public void display(Square s)
    {
        System.out.println(s.getArea()+" "+s.getPerimeter());
    }
}
class Circle extends Shape
{
    public Circle(double side)
    {
        super.setSide(side);
    }
    public void calculateaArea(Shape s) {
        double area = Math.PI*s.getSide()*s.getSide();
        super.setArea(area);
    }


    public void calculatePerimeter(Shape s) {
        double perimeter = 2*Math.PI*s.getSide();
        //System.out.println(s.getSide());
        super.setPerimeter(perimeter);
    }


    public void display(Circle s)
    {
        System.out.println(s.getArea()+" "+s.getPerimeter());
    }
}
public class abs1
{
    public static void main(String[] args) {
        Square s1 = new Square(10);
        s1.calculateaArea(s1);
        s1.calculatePerimeter(s1);
        s1.display(s1);

        Circle c1 = new Circle(20);
        c1.calculateaArea(c1);
        c1.calculatePerimeter(c1);
        c1.display(c1);
    }
}