class Static{
      static int count=0;
      Static(){
          count++;
          System.out.println("count :" + count);
      }
}
public class Counter{
      public static void main(String[] args){
           Static c1=new Static();
           Static c2=new Static();
           Static c3=new Static();
      }
}
