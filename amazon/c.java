import java.io.*;
import java.util.*;
public class c{
	static boolean ispair(int arr[] , int num){
		int arr_hash[] = new int[1000];
		for(int i = 0 ; i < arr.length ; i++){
			arr_hash[arr[i]+500] = 1;
		}
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] == 0){
				if(num ==0 ){
					return true;
				}
			}
			else if(num%arr[i] == 0 && arr_hash[(num/arr[i])+500] == 1){
				return true;
			}
		}
		return false;
	}
	static int equil(int arr[]){
		int sum = 0 ;
		int left_sum = 0;
		for(int i = 0 ;i< arr.length ; i++){
			sum =sum+arr[i];
		}
		left_sum = 0;
		for(int i = 0 ;i< arr.length ; i++){
			left_sum = left_sum + arr[i];
			sum =sum -arr[i];
			if(left_sum == sum){
				return i;
			}
		}
		return -1;
	}
	static int first_occur(int arr[] , int n , int low , int high , int x){
		if(high > low){
			int mid = (high+low)/2;
			if(mid ==0 || arr[mid-1]<x && arr[mid] ==x){
				return mid;
			}
			if(arr[mid]>x){
				return first_occur(arr , n , low  , mid-1 , x);
			}
			else{
				return first_occur(arr , n , mid+1 , high , x);
			}
		}
		return -1;
	}
	static int last_occur(int arr[] , int n , int low , int high , int x){
		if(high > low){
			int mid = (high+low)/2;
			if(mid ==0 || arr[mid+1]>x && arr[mid] ==x){
				return mid;
			}
			if(arr[mid]>x){
				return last_occur(arr , n , low  , mid-1 , x);
			}
			else{
				return last_occur(arr , n , mid+1 , high , x);
			}
		}
		return -1;
	}
	static void occur(int arr[] , int n , int x){
		int a = first_occur(arr , n , 0 , n , x);
		int b = last_occur(arr , n , 0 , n , x );
		System.out.println(a);
		System.out.println(b);
	}
	static int miss(int arr[] , int n){
		int sum  =0 ;
		for(int i = 0 ; i < n ; i++){
			sum = sum + arr[i];
		}
		int original_sum = (n*(n+1))/2;
		return original_sum-sum;
	}
	static int odd_occur(int arr[] , int n){
		int result = 0 ;
		for(int i = 0 ; i < n ; i++){
			result = result^arr[i];
		}
		return result;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
<<<<<<< HEAD
	}
}
=======
	}
>>>>>>> 3d0a654e11fb489b73a72f2f2bf82c31d23bd5cb
