//class trangle which includes the  all fields ande methods
public class Triangle {
   private int side1;
   private int side2;
   private int side3;
  //constructor
   public Triangle(int side1, int side2, int side3)
{
	super();
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;
}

public int getSide1() {
	return side1;
}

public void setSide1(int side1) {
	this.side1 = side1;
}

public int getSide2() {
	return side2;
}

public void setSide2(int side2) {
	this.side2 = side2;
}

public int getSide3() {
	return side3;
}

public void setSide3(int side3) {
	this.side3 = side3;
}
    //method to check for rightangled traingle
   public boolean isRight(int side1,int side2,int side3)
   {
	   if((side1*side1)==((side2*side2)+(side3*side3))||(side2*side2)==((side1*side1)+(side3*side3))||(side3*side3)==((side2*side2)+(side1*side1)))
	   
		   return true;
		   
	   
	   else
		   return false;
   }
   
//method for checking isosceles traingle
   public int isIsosceles(int side1,int side2,int side3)
   {
	   if((side1==side2)||(side2==side3)||(side3==side1))
		   
		   return 1;
		   
	   else return 0;
 
  }
//method for checking equilateral
   public int equilateral(int side1,int side2,int side3)
   {
	   if((side1==side2)&&(side2==side3))
		   return 1;
	   else return 0;
   }
   
}
   
