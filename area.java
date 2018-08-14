import java.util.*;
public class area{
public static void main(String []args){
int l,b, r;
double f;
System.out.println("Enter the length and breadth of the rectangle: \n");
Scanner s = new Scanner(System.in);
l = s.nextInt();
b = s.nextInt();
l = l * b;
System.out.println("Your rectangle's area is : \n" + l + "\nNow, Enter the radius of the circle:\n");
r = s.nextInt();
f = r*r*3.14;
System.out.println("Area: "+ f);
}
}