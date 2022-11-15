package Paket;

public class InheritanceDemo
{

    private static void info(final A a)
    {
        a.setX(1);
        System.out.println(a.getX());
        a.inc();
        System.out.println(a.getX());

    }
    private static void infoExtended(final B b)
    {
        info(b);
        b.inc(5);
        System.out.println(b.getX());
    }

    private static void infoGeneral(final A parameter)
    {
        if(parameter instanceof B)
        {
            infoExtended((B) parameter);
            return;
        }
        info(parameter);
    }

    public static void main(String[] args)
    {
        final A a =  new A();
        // info(a);
        infoGeneral(a);


        final B b =  new B();
        // infoExtended(b);
        infoGeneral(b);


    }

}
