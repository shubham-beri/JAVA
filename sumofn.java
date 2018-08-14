import java.util.*;
public class sumofn{
static public void main(String []args){
int n,sum = 0;
Scanner s = new Scanner(System.in);
System.out.println("Enter a number: ");
n = s.nextInt();
for(int i = 1;i <=n;i++)
{sum +=  i;}
System.out.println("Sum of n terms is: " + sum);
}
}
 