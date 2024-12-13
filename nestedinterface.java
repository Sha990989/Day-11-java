import java.util.*;
interface out{
    void outm();
    interface in{
        void inm();
    }
}
class nestedinterface implements out.in{
    public void inm()
    {
        System.out.println("HELLO!I am inner method");
    }
public static void main(String args[])
{
    nestedinterface n=new nestedinterface();
    n.inm();
}
}