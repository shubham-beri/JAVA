import java.util.*;
public class Palindrome{
public static void main(String []args){
Scanner s = new  Scanner(System.in);
System.out.println("Enter the number:");
int i,n,k,temp = 0,rev = 0;
n = s.nextInt();
k = n;
while(n!=0)
{temp = n%10;
rev =  temp + rev*10;
n = n/10;
}
if(rev == k)
System.out.println("Your number is palindrome.");
else 
System.out.println("Your number is not a palindrome one.");
}
}