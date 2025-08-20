import java.util.Scanner;
class Odd{
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the arry size:");
         int n=sc.nextInt();
         System.out.println("enter array elements");
         int [] a=new int[n];
         for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
         }
         for(int i=0;i<=n-1;i++){
            if(a[i]%2==0){
               System.out.println(a[i]+"-" +"even");
            }
            else{
               System.out.println(a[i]+"-" +"odd");
            }
         }
    }
}
            
         
         
