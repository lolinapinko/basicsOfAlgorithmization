import java.util.Scanner;
public class Main{
    public static int factorial(int n) {
        int result = 1;
		for(int i = 1; i <= n; i++){
		    result *= i;
		}
		return result;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		
		int c = factorial(n-k);
		c *= factorial(k);
		c = factorial(n)/c;
		System.out.print(c);
		
	}
}
