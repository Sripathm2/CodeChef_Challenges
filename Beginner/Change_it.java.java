/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		for(int t=sc.nextInt(); t>0 ; t--){
		    int max = 0;
		    int [] arr = new int[100];
		    int n = sc.nextInt();
		    for(int i=0;i<n;i++){
		        int temp = sc.nextInt() - 1;
		        arr[temp] +=1;
		        if(arr[max] < arr[temp]){
		            max = temp;
		        }
		    }
		    System.out.println(n-arr[max]);
		    
		}
		
	}
}