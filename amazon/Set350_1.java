import java.io.*;
import java.util.*;
public class Set350_1{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]  =new int[n];
		int count  =0 ;
		// taken arr
		for(int i =0 ; i < n ;i++){
			int temp = sc.nextInt();
			if(temp == 0 ){
				count = count +1;
				arr[i] = -1;
			}
			else{
				arr[i] = temp;
			}
		}
		// maximun sum
		int start = 0;
		int end  = 0 ;
		int sum = 0 ;
		int s = 0 ;
		int temp = 0 ; 
		for(int i = 0 ; i < n ;i++){
			temp = temp + arr[i];
			//System.out.println(temp);
			if(temp > sum ){
			 	sum = temp ;
			 	start  = s;
			 	end = i ;
			}
			if(temp < 0){
				temp = 0 ;
				s = i+1 ;
			}
			
		}
		count =count+(end - start +1);
		System.out.println(start);
		System.out.println(end);
		System.out.println(count);

	}
}