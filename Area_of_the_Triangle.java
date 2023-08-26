import java.util.*;
public class AreaOfTriangle{
    public static void main(String[] args){
        double a,b,c;
        double s,Ar;
        Scanner sc = new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        s=(a+b+c)/2;
        Ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",Ar);
    }
}