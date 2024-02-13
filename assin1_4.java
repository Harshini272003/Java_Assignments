class InheritanceA
{
    double rad;
    public InheritanceA(double rad)
    {
        this.rad = rad;
    }
    public void findCircleArea()
    {
        System.out.println("Area of Circle is : "+(Math.PI*this.rad*this.rad)+"cm2");
    }

}
class InheritanceB extends InheritanceA
{
    double length;
    double breadth;
    public InheritanceB(double length,double breadth)
    {
        super(5);
        this.length = length;
        this.breadth = breadth;
    }
    public void findRectangleArea()
    {
        System.out.println("Area of rectangle is : "+(this.length*this.breadth)+"cm2");
    }

}
class InheritanceC extends InheritanceB
{
    double breadth;
    double height;
    public InheritanceC(double breadth,double height)
    {
        super(10,20);
        this.breadth = breadth;
        this.height = height;
    }
    public void findTriangleArea()
    {
        System.out.println("Area of traingle is : "+(this.breadth*this.height)+"cm2");
    }
}

public class assin1_4
{
    public static void main(String[] args) {
        InheritanceC obj = new InheritanceC(30,20);
        obj.findTriangleArea();
        obj.findRectangleArea();
        obj.findCircleArea();

    }
}