// to find the largest among three numbers x,y, and z. You should use if-then-else construct in Java.
import java.util.Scanner;  
public class Exercise1_2 {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
        int x = s.nextInt(); 
        int y = s.nextInt();
int z = s.nextInt();
int result = 0;

x = 0;
y = 1;
z = 2;
if(x > y) {
    if(z > x) {
      result = z;
      System.out.println(result);
    }
    else {
        result = x;
      System.out.println(result);
    }
  }
  else if(y > x) {
    if(z > y) {
      result = z;
        System.out.println(result);
    }
    else {
        result = y;
      System.out.println(result);
    }
  }
  else {
    if(y > z) {
       result = y;
      System.out.println(result);
    }
    else {
      result = z;
      System.out.println(result);
    }
  }
}
} 