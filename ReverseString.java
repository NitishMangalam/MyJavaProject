      import java.util.Scanner;       
  public class ReverseString {
               public static void main(String [] args) {
                    Scanner sc = new Scanner (System.in);
                     System.out.println("Enter a String");
			String str = sc.nextLine();
			String reversed = new StringBuilder(str).reverse().toString();
				System.out.println("ReversedString: " + reversed);
							}
				}
