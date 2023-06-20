import java.util.*;

public class solution{
  public static void binarytodecimal(int binary){
    int power = 0 ;
    int decimalvalue = 0;
    
    while(binary > 0){
      int last_digit = binary % 10;
      decimalvalue = decimalvalue + (last_digit * (int)Math.pow(2,power));
      power ++;
      last_digit = last_digit / 10;
      
    }
    
    System.out.print("the decimal value of given input is " + decimalvalue);
  
  
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int binary = sc.nextInt();
    binarytodecimal(binary)
    sc.close();
  }
}
