import java.util.Scanner;
public class diff{
public static void main(String []args){
int a,b;
System.out.println("Enter two numbers: \n");
Scanner s = new Scanner(System.in);
a = s.nextInt();
b =s.nextInt();
a = a-b;
System.out.println("Difference of a and b is: " + a);
}

}