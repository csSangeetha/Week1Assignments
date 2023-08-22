package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Fibonacci Series");
		int a=-1; 
		int b=1;
		int c;
		for (int i=0;i<=10;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
