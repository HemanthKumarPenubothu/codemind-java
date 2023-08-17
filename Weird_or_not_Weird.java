import java.util.*;
public class Cmind{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    if(x%2!=0 || (x>=6 && x<=20)){
	    System.out.print("weird");
	    }
	    else {
	    System.out.print("not weird");
	    }
	}
}