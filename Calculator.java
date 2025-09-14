import java.util.*;
class Operation{
	int a;
	int b;
	Operation(int a,int b){
		this.a = a;
		this.b = b;
	}
	public void sum(){
		System.out.println("Sum is "+(a+b));
	}
	public void sub(){
		System.out.println("Sub is "+(a-b));
	}
	public void mul(){
		System.out.println("Multiplication of two number is "+(a*b));
	}
	public void div(){
		System.out.println("Division Of Two Number is "+(a/b));
	}
}
class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("What Operation you want to perfrom \n 1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
		int choose = sc.nextInt();
		System.out.println("Enter 1st Value");
		int a = sc.nextInt();
		System.out.println("Enter 1st Value");
		int b = sc.nextInt();
		Operation o1 = new Operation(a,b);
		if (choose == 1)
		{
			o1.sum();
		}
		else if (choose == 2)
		{
			o1.sub();
		}
		else if(choose == 3){
			o1.mul();
		}
		else if (choose == 4){
			o1.div();
		}
		else{
			System.out.println("Please Enter Correct Input");
		}
		System.out.println("You want to continue if Yes Press 1 \n for Exit 0");
		int check = sc.nextInt();
		if (check == 0)
			{
				break;
			}
		}	
		while(true);
	}	
}
