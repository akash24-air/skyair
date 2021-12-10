import java.util.Scanner;
public class Divide{
	public static void main(String[] args){
	System.out.println("Enter a Number");
	Scanner sc= new Scanner(System.in);
	int x = sc.nextInt();
	
	if(x%5==0&&x%3==0){
		System.out.println("Divide by 5 & 3");
		
	}else if(x%3==0){
		System.out.println("Divide by3");
	}else if(x%5==0){
		System.out.println("Divide by 5");
		}else{
					System.out.println("Error");
		}
	}
}