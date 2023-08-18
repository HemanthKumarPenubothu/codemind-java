import java.util.*;
public class Codemind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        for(int i=0; i<=n;i++){
            s=(n*(n+1))/2;
        }
         System.out.println(s);
    }
}