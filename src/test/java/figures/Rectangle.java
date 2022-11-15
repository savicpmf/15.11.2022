package figures;

public class Rectangle
{
    int topleftX;
    int topleftY;
    double a;
    double b;

    public Rectangle(final double a, final double b)
    {
        this.a=a;
        this.b=b;
    }

    public double getA()
    {
        return a;
    }

    public void setA(double a)
    {
        this.a = a;
    }

    public double getB()
    {
        return b;
    }

    public void setB(double b)
    {
        this.b = b;
    }

    public double area()
    {
        return a*b;
    }

    public double circumfrence()
    {
        return 2*(a+b);
    }


}
