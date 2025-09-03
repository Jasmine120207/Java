import java.util.ArrayList;
class ArrayListExampleDemo1{
     public static void main(String[] args){
        ArrayList<Integer>List=new ArrayList<>();
        for(int i=1;i<=5;i++){
             List.add(i*10);
        }
        for(int ele:List){
            System.out.println(ele);
        }
     }
}
