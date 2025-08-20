class ReverseArray{
      static void Rev(int...arr){
         for(int ele:arr){
            System.out.println(ele);
          }
          System.out.println("The reverse of an array is:");
          for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
          }
          for(int ele:arr){
            System.out.println(ele);
          }
         // int void toString(){
           // Sytem.out.println(a[i]);
          //}
      }
}
public class Reverse{
   public static void main(String[] args){
        ReverseArray.Rev(1,2,3,4);
   }
}
