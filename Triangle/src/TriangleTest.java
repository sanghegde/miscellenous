//main class
import java.util.Scanner;
public class TriangleTest {
	public static void main(String args[])
	{
		Triangle triangle=new Triangle(0, 0, 0);
		int side1,side2,side3;
		Scanner scanner=new Scanner(System.in);
		
                System.out.println("Enter the first side");
		side1=scanner.nextInt();
		triangle.setSide1(side1);
		System.out.println("Enter the second side");
		side2=scanner.nextInt();
		triangle.setSide2(side2);
		System.out.println("Enter the third side");
		side3=scanner.nextInt();
		triangle.setSide3(side3);
		
		int result1,result2;
		boolean result3;
		
		result1=triangle.equilateral( side1, side2, side3);
		if(result1==1)
		{
			System.out.println("equilateral:yes");
		}
		else
		{
			System.out.println("equilateral:no");
		}
		
		result2=triangle.isIsosceles( side1, side2, side3);
		if(result2==1)
		{
			System.out.println("Isoceles:yes");
		}
		else
		{
			System.out.println("Isoceles:no");
		}
		
	boolean	result31=triangle.isRight( side1, side2, side3);
		if(result31==true)
		{
			System.out.println("Right ANGLE:yes");
		}
		else
		{
			System.out.println("Right ANGLE:no");
		}
		
		
			
		
	}

}
