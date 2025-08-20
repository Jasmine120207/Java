class Animal{
    void Sound(){
       System.out.println("Animals make sounds");
    }
}
class Dog extends Animal{
  @Override
  void Sound(){
       System.out.println("Dog barks");
  }
}
public class MethodOverriding{
    public static void main(String[] args){
       Animal a=new Dog();
       a.Sound();
    }
}
