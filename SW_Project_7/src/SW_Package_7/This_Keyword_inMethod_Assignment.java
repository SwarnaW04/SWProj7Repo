package SW_Package_7;

public class This_Keyword_inMethod_Assignment // Definition of class This_Keyword_inMethod_Assignment
{ 
	public void m0() // Default method 
	{   this.m3(3,3,3); // Call 3 parameterized method 
		System.out.println("Method m0 - Deafult method"); 
	}
	public void m1(int a) // 1 parameterized method
	{   this.m2(2,2); // Call 2 parameterized method 
		System.out.println("Method m1 - 1 Parameterised method " +a);	
	}
	public void m2(int a, int b) // 2 parameterized method
	{   this.m0(); // Call default method 
		System.out.println("Method m2 - 2 Parameterised method " +a +b);
	}
	public void m3(int a, int b, int c) // 3 parameterized method
	{System.out.println("Method m3 - 3 Parameterised method " +a +b +c);	
	}
	public void m4(int a, int b, int c, int d) // 4 parameterized method
	{this.m1(1); //Call 1 parameterized method
		System.out.println("Method m4 - 4 Parameterised method "+a+b+c+d);	
	}

    public static void main(String[] args) // main method 
    { 
    	This_Keyword_inMethod_Assignment ob = new This_Keyword_inMethod_Assignment(); // Create Class Object 
	     ob.m4(4,4,4,4); // Call 4 parameterized method
    }

}
