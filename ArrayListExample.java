import java.util.ArrayList;
class ArrayListExample{
   public static void main(String[] args){
      ArrayList<String> fruits=new ArrayList<>();
      //adding elements
      fruits.add("Apple");
      fruits.add("Orange");
      fruits.add("Mango");
      //printing elements
      System.out.println("Fruits:" +fruits);
      //Accesing elements by index
      System.out.println(fruits.get(2));
      //Removing an element
      fruits.remove("Mango");
      System.out.println("Fruits are"+ fruits);
   }
}
      
