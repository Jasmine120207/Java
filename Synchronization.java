class SharedBuffer{
    private int data;
    private boolean hasData=false();
    public synchronized void produce(int value){
     while(hasData){
         try{
               wait();
            }
         catch(InterruptedException e){
              System.out.println(e);
         }
       }
       data=value;
       hasData=true;
       System.out.println("Produced:"+data);
       notify();
     }
     public synchronized void consumer(){
       while(!hasData){
         try{
               wait();
            }
         catch(InterruptedException e){
              System.out.println(e);
         }
       }
       System.out.println("Consumed:"+data);
       hasData=false;
       notify();
     }
}
class Producer extends Thread{
     SharedBuffr buffer;
     Producer(SharedBuffer buffe){
         this.buffer=buffer;
     }
     public void run(){
        for(int i=1;i<=5;i++){
            buffer.producer(i);
            try{
               Thread.sleep(500);
            }
            catche(InterruptedException e){
            }
       }
    }
}
class Consumer extends Thread{
     SharedBuffr buffer;
     Consumer(SharedBuffer buffe){
         this.buffer=buffer;
     }
     public void run(){
        for(int i=1;i<=5;i++){
            buffer.producer(i);
            try{
               Thread.sleep(500);
            }
            catche(InterruptedException e){
            }
       }
    }
}
public class ProducerConsumerDemo{
    public static void main(Syting[] args){
       SharedBuffer buffer=new SharedBuffer();
       Producer p=new Producer(buffer);
       Consumer c=new Consumer(buffer);
       p.start();
       c.start();
    }
}
