import java.util.*;
public class c{
    public static void main(String[] args)
    {
        Scanner r=new Scanner(System.in);
        float a,b,c;
        a=r.nextFloat();
        b=r.nextFloat();
        c=r.nextFloat();
        System.out.printf("%.2f
%.2f",a*0.12,a*0.12+a+b+c);
    }
}