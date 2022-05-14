package Inheritance;

public class AssignmentInheritance {
		public static void main(String[] args) {
			Emp e1= new Emp(61);// call child constructor
			System.out.println("****************************************************");
			Emp e2= new Emp(65.78);// call child constructor
			System.out.println("****************************************************");
			e1.getid(11);// call child employee method
			System.out.println("****************************************************");
			e2.getid(5.8);// call child employee method	
		}
	}
		class Comp {//parent class
			int id=99; //non static global variable
			// Constructor Overloading
		Comp (int id ){
				//this(35.67);
				System.out.println("Constuctor of Parent class: "+id);
				System.out.println("Constuctor Of Parent class is: "+this.id);
			}
			Comp(double id){
				System.out.println("Constuctor having double type in Parent Class: "+id);
				System.out.println("Constuctor having double type in Parent class is: "+this.id);
			}
			// Method Overloading
			void getid(int id) {
          //	we can call only one method from child object by using "this" 
				//this.getid(67.89);// shows error
				System.out.println("Method of Parent class: "+id);
				System.out.println("Method of Parent class is : "+this.id);

			}
			void getid(double id) {
				this.getid(3400);
				System.out.println("Method having double type in Parent class: "+id);
				System.out.println("Method having double type in Parent class is: "+this.id);
		}
		}	
		// child class of Company
		class Emp extends Comp {
			    int id=45;            
			    Emp (int id ){
					super(35.67);// use to call parent constructor
					System.out.println("Employee Id of child class: "+id);
					System.out.println("Employee Id of child class is: "+super.id);
			    }
			        // super use to call global variable of parent object
				   // while this is use to call global variable of current object
				Emp(double id){
					this(56);// use to call parent constructor
					System.out.println("Employee Id of child class: "+id);
					System.out.println("Employee Id of child class as: "+this.id);
				}
			    void getid(int id) {
			    	super.getid(89);// use to call parent method (int)
					System.out.println("Method having Id of child class: "+id);
					System.out.println("Method having Id of child class as: "+this.id);
				}
				void getid(double id) {
					super.getid(3400);//use to call parent method (double)
					System.out.println("Method having double type Id of child class: "+id);
					System.out.println("Method having double type Id of child class as: "+super.id);

				}
				
			}

		
