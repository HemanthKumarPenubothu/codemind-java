import java.util.*;
public class cmind{
    public static void main(String srgs[]){
    Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double da,hra;
        if(x<=10000){
            da=x*0.8;
            hra=x*0.2;
            System.out.printf("%.2f",x+da+hra);
        }
        else if(x<=20000){
            da=x*0.9;
            hra=x*0.25;
            System.out.printf("%.2f",x+da+hra);
        }
        else{
            da=x*0.95;
            hra=0.3*x;
            System.out.printf("%.2f",x+da+hra);
        }
    }
}