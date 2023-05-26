package methodWithReturnType;

public class sample1 {

 public static int add(int a, int b) {
	 
	 int c= a+b;
	 return c;
 }
 
 public static int add (int x, int y, int z) {
	 
	int  w= x+y+z;
	return w;
 }
 
 public int mul (int h, int i) {
	 
	int j=h*i;
	
	return j;
	 
 }
 
 public static String name(String a) {
	 
	 String s2 = a.toUpperCase();
	 return s2;
 }

 public static void main(String[] args) {
	
	int num1 =sample1.add(10, 20);
	
	int num2 = sample1.add(15, 35, 32);
	
	System.out.println(num1);
	
	System.out.println(num2);
	
	System.out.println(num1*num2);
	
	sample1 s1= new sample1();
	int num3=s1.mul(45, 2);
	System.out.println(num3);
	System.out.println(num1+num2+num3);
}
}
