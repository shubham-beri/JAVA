class Table{
void printTab(int n){
for (int i =0 ; i<=10; i++){
System.out.println("Chota table" + n*i);
try{
Thread.sleep(1000);}catch(Exception e){System.out.println(e);}
}


synchronized(this)
{
for (int i =0 ; i<=10; i++){
System.out.println(n*i);
try{
Thread.sleep(1000);}catch(Exception e){System.out.println(e);}
}
}


}}
class th1 extends Thread{
Table t;
th1(Table t){
this.t = t;
}
public void run(){
t.printTab(10);
}
}


class th2 extends Thread{
Table t;
th2(Table t){
this.t = t;
}
public void run(){
t.printTab(8);

}
}
public class Test11{
public static void main(String[] args){
Table to = new Table();
th1 yo1 = new th1(to);
th2 yo2 = new th2(to);
yo1.start();
yo2.start();
}
}