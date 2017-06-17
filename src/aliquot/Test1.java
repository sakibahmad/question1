/*
 * program to find the aliquot sum of a given number and checking it is perfect or not
 */
package aliquot;
		//importing util for Scanner usage
import java.util.*;
		//defing class Test1
public class Test1 {
		
	int a,b;
		//method to find aliquot
	public void aliquot(){
		//Scanner for user input
		Scanner object =new Scanner(System.in);
		System.out.println("Enter the no between 1 and 100");
		a=object.nextInt();
		for(int i=1;i<=a/2;i++){
			if(a%i==0){
			b=b+i;	
			}
			
		}
		System.out.println("Sum of all divisor is or aliquot of the no is "+b);
		
	}
		//method to find perfect no
	
	public void perfect(){
		if(a==b)
			System.out.println("the given no is perfect");
		else
			System.out.println("not a perfect no");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Find Aliquot of a number");
		//making object for class Test
		Test1 t1=new Test1();
		//accessing method
		t1.aliquot();
		t1.perfect();
	}

}
