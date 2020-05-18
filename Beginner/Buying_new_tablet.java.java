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
		    int n = sc.nextInt();
		    int max = -1;
		    int b = sc.nextInt();
		    for(int i =0;i<n;i++){
		        int size = sc.nextInt()*sc.nextInt();
		        if(sc.nextInt()<=b && size > max){
		            max = size;
		        }
		    }
		    System.out.println(max == -1? "no tablet":max);
		}
		
	}
}