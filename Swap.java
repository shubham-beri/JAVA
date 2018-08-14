import java.util.*;
public class swap{
public static void main(String []args){
int a,b;
System.out.println("Enter the numbers you wanna swap: \n");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
a = a+ b;
b = a - b;
a =  a - b;
System.out.println(a + "     " + b);}}


