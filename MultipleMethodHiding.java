class A{
    static void display(){
       System.out.println(" display method in class A");
    }
}
class B extends A{
    static void display(){
       System.out.println("display method in class B");
    }
}
class C extends B{
   static void display(){
       System.out.println("display method in class C");
   }
}
class MultipleMethodHiding{
   public static void main(String[] args){
        A a=new A();
        a.display();
        A b=new B();
        b.display();
        A c=new C();
        c.display();
   }
}
    
