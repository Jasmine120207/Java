import java.util.ArrayList;
public class ArrayListEample2{
    public static void main(String[] args){
        ArrayList<String> List=new ArrayList<>();
        List.add("Alice");
        List.add("Bob");
        List.add("Charlie");
        String searchName="Bob";
        if(List.contains(searchName)){
            System.out.println(searchName +" is in the list");
        }
        else{
            System.out.println(searchName + " is not in the list");
        }
     }
}
