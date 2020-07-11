package exam;

public class Calculator {
	
	public void add(int num,int num1) {
		System.out.println(num+num1);
			
	}
	public void add(double num,double num1 ) {
		System.out.println(num+num1);

	}
	public void add(int num,double num1 ) {
		System.out.println(num+num1);

	}
	public void add(double num,int num1 ) {
		System.out.println(num+num1);

	}
	public void diff(int num,int num1) {
		System.out.println(num-num1);
		
	}
	public void diff(double num,double num1) {
		System.out.println(num-num1);
	
	}
	public void diff(int num,double num1) {
		System.out.println(num-num1);
		
	}
	public void diff(double num,int num1) {
		System.out.println(num-num1);
		
	}
	public void mul(int num,int num1) {
		System.out.println(num*num1);
	
	
	}
	public void mul(double num,double num1) {
		System.out.println(num*num1);
				
	}	
	public void mul(int num,double num1) {
		
		System.out.println(num*num1);
		
	}	
	public void mul(double num,int num1) {
		
		System.out.println(num*num1);
		
	}
	public void div(int num,int num1) {
		System.out.println(num/num1);
}
	public void div(double num,double num1) {
		System.out.println(num/num1);
	}
	public void div(int num,double num1) {
		System.out.println(num/num1);
	}
	public void div(double num,int num1) {
		System.out.println(num/num1);
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(4, 2);
		c.add(4.0, 2.0);
		c.add(4, 2.0);
		c.add(4.0, 2);
		c.diff(8,4);
		c.diff(8.0,4.0);
		c.diff(8,4.0);
		c.diff(8.0,4);
		c.mul(10,5);
		c.mul(10.0,5.0);
		c.mul(10,5.0);
		c.mul(10.0,5);
		c.div(100, 50);
		c.div(100.0, 50.0);
		c.div(100, 50.0);
		c.div(100.0, 50);
	}
	
}