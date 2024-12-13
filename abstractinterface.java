import java.util.*;
abstract interface math{
    void print();
}
class d implements math
{
    //overriding
    public void print()
    {
        System.out.println("HELLO EVERYONE");
    }
}
public class abstractinterface
{
    public static void main(String args[])
    {
        d r=new d();
        r.print();
    }
}