
class Area {	 	//Class Area to perform overloading of method
	
	public void Area() {		//default parameter/Method having no parameter
		System.out.println("No Parameters");   //printing the statement 
	}
	public void Area(int a) {		//Overloading Method Area and Passing one Parameter to the method
		System.out.println("Area of square is: " +(a*a));		//printing the area of Square
	}
	public void Area(int a, int b) {		//Overloading Method Area and Passing two Parameter to the method
		System.out.println("Area of rectangle is: " +(a*b));		//printing the area of rectangle
	}
}
/* Class to perform Overriding*/
class A {
	int i, j;   //initializing of variables in int type
	A(int a, int b) {   //constructor of class A and passing two variables in the method
		i = a;    //assigning the value of a to i
		j = b;	  //assigning the value of b to j
	}
	public void Show() {    //Show method displays the values
		System.out.println("Value of i is " +i+ " and value of j is " +j);  //displays the value of i and j
	}
}
class B extends A {    //Class B and extending the class A into the class
	int k;			//initializing of variables to integer type
	B(int a, int b, int c) {  //overriding method 
		super(a, b);   //super keyword to get the values from the inherited class
		k = c;     //assigning the value of c to k
		System.out.println("Value of k is: " +k);   //printing the value of k 
	}
	public void display() {    //displays the output 
		System.out.println("The sum of 3 numbers is: " +(i+j+k));   //displays the sum of 3 numbers
	}
}
public class OverloadingAndOverriding {   //main class of the program

	public static void main(String[] args) {		//main method of the program
		
		Area a = new Area();		//creating the object of Class Area
		B b = new B(5, 6 , 7);	// Creating the object of Class B and passing the values during the creating of object of the class
		b.Show();
		b.display();
		a.Area();				//calling of default method
		a.Area(13);				//calling of method having 1 parameter			
		a.Area(8, 12);			//calling of method having 2 parameters
	}
}
