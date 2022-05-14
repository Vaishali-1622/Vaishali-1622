package Methods;

public class MethodOverloading4 {

	public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
    public void callMe() {
    	System.out.println("I am callMe() of DisplayOverloading class");
    }

   public static void main(String args[])
   {
	   MethodOverloading4 obj = new MethodOverloading4();
       obj.disp('a');
       obj.disp('a',10);
       obj.callMe();
       
   }
}