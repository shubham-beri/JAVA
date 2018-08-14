public class TestThrow1{  
   static void validate(int age){  
     if(age<21)  
      throw new ArithmeticException("wayy tooooo young kidoooo");  
     else  
      System.out.println("welcome to the party..");  
   }  
   public static void main(String args[]){  
      validate(47);  
      System.out.println("Rest of the code executed..!!!!!");  
  }  
}