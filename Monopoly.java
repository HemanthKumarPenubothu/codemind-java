import java.util.*;
public class Monopoly{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int r1,r2,r3;
        for(int i=0;i<t;i++){
           r1=sc.nextInt();
           r2=sc.nextInt();
           r3=sc.nextInt();
           if(r1>(r2+r3)||r2>(r1+r3)||r3>(r1+r2)){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
        }
    }
}