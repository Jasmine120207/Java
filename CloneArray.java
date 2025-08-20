import java.util.Arrays;
import java.util.Scanner;
class CloneArray{
    public static void main(String[] jasmine){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int [] clonedArr=arr.clone();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(clonedArr));
    }
}
