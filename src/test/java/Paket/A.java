package Paket;

public class A
{
    //protected int x;
    private int x;
    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        if(x<0)
        {
            System.out.println("Error, value less than 0");
        }
        this.x = x;
    }

    public void inc()
    {
        this.x++;
    }
}
