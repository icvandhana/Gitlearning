import java.util.Scanner;

public class Java_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0,y=0,s=0,r=0,t=0,u=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number x\n");
		x = sc.nextInt();
		System.out.println("Enter number y\n");
		y = sc.nextInt();
		Java_methods j = new Java_methods();
		int num = j.add(x,y);
		System.out.println("sum is: " +num);
		
		java_methods2 j1= new java_methods2();
		int num1 = j1.mul(r, s);
		System.out.println("product is: " +num1);
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter number t\n");
		t = sc1.nextInt();
		System.out.println("Enter number u\n");
		u = sc1.nextInt();
		float num2 = j.div(t, u);
		System.out.println("Div is:" +num2);

	}
	public static int add(int a,int b)
	{
		
		int c = a+b;
		return(c);
	}
	public static float div(int d, int e)
	{
		
		float f = d/e;
		return f;
			}
}
