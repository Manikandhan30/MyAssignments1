package org.system;



    class Computer {

       public void computerModel() {
	   System.out.println("HP");
	  
	  		  
    }
}

             class Desktop extends Computer{
  	         public void desktopSize() {
	         System.out.println("15-18 inch");
      }
}


               public class SingleInheritance {
	   

		       public static void main(String[] args) {
			   Desktop obj=new Desktop();
			   obj.computerModel();
			   obj.desktopSize();
		}
	}


