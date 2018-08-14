import java.util.*;
public class evenorodd{
public static void main(String []args){
int a;
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
a = s.nextInt();
if(a%2 == 0)
System.out.println("Your number is Even.");
else
System.out.println("Your number is Odd.");

}
}