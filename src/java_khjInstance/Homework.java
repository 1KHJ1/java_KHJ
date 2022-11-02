 package java_khjInstance;
 
 public class Homework{

		/*
		 * public static void main(String[] args) { for(int i =1; i<6;i++) { for(int
		 * j=1;j<i+1;j++) { System.out.print("*"); } System.out.println(""); }
		 * 
		 * }
		 */
	  static void starPrint(int num) {
		 for(int i=0;i<num+1;i--) {
			 for(int j=1;j<i+1;j++) {
				 System.out.print("");
			 }System.out.print("*");
		 }
	 }
	  public static void main(String[]arg) {
		  Homework.starPrint(5);
	  }
 }