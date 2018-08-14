import java.util.*;
public class factorial{
static public void main(String []args){
int n,product = 1;
Scanner s = new Scanner(System.in);
System.out.println("Enter a number: ");
n = s.nextInt();
for(int i = 1;i <=n;i++)
{product *=  i;}
System.out.println("Factorial of " + n + " is: " + product);
}
}
 