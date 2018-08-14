import java.util.*;
public class Reverse{
public static void main(String []args){
Scanner s = new  Scanner(System.in);
System.out.println("Enter the number:");
int i,n,temp = 0,rev = 0;
n = s.nextInt();
while(n!=0)
{temp = n%10;
rev =  temp + rev*10;
n = n/10;
}
System.out.println("Reverse of your no is: " + rev);
}
}
