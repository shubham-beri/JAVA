import java.util.Scanner;
public class pattern3{
public static void main(String []args){
Scanner sc = new  Scanner(System.in);
System.out.println("Enter the number:");
int rows,i,j;
rows = sc.nextInt();
for(i = 1; i<=rows;i++)
{
for(j=1;j <= i; j++){
System.out.print(j+" ");}
System.out.println( );
}sc.close();
}}
