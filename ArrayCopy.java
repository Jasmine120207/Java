import java.util.Arrays;
import java.util.Scanner;
class ArrayCopy{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter array size:");
       int n=sc.nextInt();
       System.out.println("enter array elements:");
       int [] src=new int[n];
       for(int i=0;i<src.length;i++){
           src[i]=sc.nextInt();
       }
       int [] dest=new int[n];
       System.arraycopy(src,1,dest,0,3);
       System.out.println(Arrays.toString(src));
       System.out.println(Arrays.toString(dest));
    }
}
