/*This is a simple calculator code*/
public class Calculator{
	public Calculator(){
  }
 
public int add(int a, int b){
	int sum = (a+b);
  return sum;
}

public int subtract (int x, int y) {
	int subtraction= x-y;
  return subtraction;
}

public int multiply (int c, int d){
 int multiple=c*d;
	return multiple;
}

public int divide (int a, int b){
	if (b==0) {
  System.out.println("Error! Dividing by zero is not allowed");
    return 0;
      } else{
  int division = a/b;
  return division;
  }
}
 public int modulo (int a, int b){
 if (b==0) {
  System.out.println("Error! Dividing by zero is not allowed");
    return 0;
  } 
  else{
  int remainder=a%b;
  return remainder;
  }
  }
 
 public static void main(String[] args){
   
   Calculator myCalculator = new Calculator();
   int addition= myCalculator.add(5,7);
   
   System.out.println(addition);
   System.out.println(myCalculator.subtract(45,11));
   System.out.println(myCalculator.multiply(5,11));
   System.out.println(myCalculator.modulo(11,5));
 
 }
  }