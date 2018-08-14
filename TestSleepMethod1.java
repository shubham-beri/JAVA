class TestSleepMethod1 extends Thread{  
 public void run(){  

for(int i=1;i<5;i++){  
     
    System.out.println(i); 
try{

Thread.sleep(1500);}catch(Exception e){System.out.println("Th");}  
  } 
 
 }  
 public static void main(String args[]){  
  TestSleepMethod1 t1=new TestSleepMethod1();  
  TestSleepMethod1 t2=new TestSleepMethod1();  
   
  t1.start();  
  t2.start();  
 }  
}  