import java.util.*;
public class digits{
public static void main(String []args){
Scanner s = new  Scanner(System.in);
System.out.println("Enter the number:");
int i,n,temp = 0,rev = 0;
n = s.nextInt();
while(n!=0)
{temp = n%10;
rev =  temp + rev;
n = n/10;
}
System.out.println("Sum of digits of your no is: " + rev);
}
}
