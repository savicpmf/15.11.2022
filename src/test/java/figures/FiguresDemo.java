package figures;

public class FiguresDemo
{
    public static void args(String[] args)
    {
        final Rectangle rectangle =  new Rectangle(5,8);
        final Square square = new Square(6);

        System.out.println(rectangle.area());
        System.out.println(rectangle.circumfrence());
        System.out.println(square.area());
        System.out.println(square.circumfrence());
    }

}
