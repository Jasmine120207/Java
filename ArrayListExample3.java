import java.util.ArrayList;
import java.util.Collections;
class ArrayListExample3{
    public static void main(String[] args){
        ArrayList<String> List=new ArrayList<>();
        List.add("Hyderabad");
        List.add("Chennai");
        List.add("Kerela");
        List.add("AP");
        System.out.println("Before sorting:" +List);
        //Sorting in ascending order
        Collections.sort(List);
        System.out.println("After sorting "+List);
        //Sorting in decending order
        Collections.sort(List,Collections.reverseOrder());
        System.out.println("After sorting "+List);
    }
}
        
