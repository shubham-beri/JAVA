class Multi implements Runnable {  
public void run(){  
System.out.println("thread is running...");  
}
Multi(){
System.out.println("thread1 is running...");}   
public static void main(String args[]){  
Multi m1=new Multi();  
Thread t1 = new Thread(m1);
t1.start();  
 }  
}  