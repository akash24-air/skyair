 import java.util.Scanner;
 public class EvenOdd{
	public static void main(String[] args){
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		
		int x= sc.nextInt();
		
		if(x%2==0){
			System.out.println("even number");
			}else{
						System.out.println("odd number");
			}
	}
}