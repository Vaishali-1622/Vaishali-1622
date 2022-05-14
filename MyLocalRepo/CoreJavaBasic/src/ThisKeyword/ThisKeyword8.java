package ThisKeyword;

 class ThisKeyword8 {

	    int a;
	    int b;     
	    // Parameterized constructor
	    ThisKeyword8(int a, int b)
	    {
	        this.a = a;
	        this.b = b;
	    } 
	    void display()
	    {
	        //Displaying value of variables a and b
	        System.out.println("a = " + a + "  b = " + b);
	    } 
	    public static void main(String[] args)
	    {
	    	ThisKeyword8 object = new  ThisKeyword8(10, 20);
	        object.display();
	        System.out.println(object.a+" "+object.b);
	        ThisKeyword8 object2 = new  ThisKeyword8(102, 201);
	        object2.display();
	        System.out.println(object2.a+" "+object2.b);
	    }
	}