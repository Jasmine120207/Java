import java.util.ArrayList;
class Student{
     int id;
     String name;
     Student(int id,String name){
        this.id=id;
        this.name=name;
     }
     public String toString(){
        return id +"-"+name;
      }
}
class ArrayListExample4{
    public static void main(String[] args){
         ArrayList<Student> students=new ArrayList<>();
         students.add(new Student(101,"ABC"));
         students.add(new Student(102,"DEF"));
         students.add(new Student(103,"JK"));
         for(Student s:students){
            System.out.println(s);
          }
      }
}    
     
