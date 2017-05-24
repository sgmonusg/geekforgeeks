import java.io.*;
import java.util.*;
public class b{
	static boolean isPower(int n){
		for(int i = 2 ; i <= Math.sqrt(n) ; i++){
			//System.out.println(i);
			int temp  = i ;
			//System.out.println(temp);
			while(temp <=n){				
				if(temp == n){
					return true;
				}
				temp = temp * i ;
			//	System.out.println("inner"+temp);
			}
			//System.out.println("out");
		}
		return false;
	}
	static void xxory(int x , int y){
		x  = x^y;
		y = Integer.bitCount(x);
		System.out.println(x);
		System.out.println(y);
	}

	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		int x  = sc.nextInt();
		int y  = sc.nextInt();
		//boolean r = isPower(x);
		xxory(x , y);
		//System.out.println(r);
	}
}