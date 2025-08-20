import java.util.*;
class Constructor{
    String name;
    String roll;
    Constructor(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the properties");
        //name=sc.nextLine();
        //roll=sc.nextLine();
        name="Dev";
        roll="78264";
        System.out.println("NON");
    }
    Constructor(String name,String roll){
        this.name=name;
        this.roll=roll;
        System.out.println("Paramaterised constructor called");
    }
    void Properties(){
        System.out.println(this.name);
        System.out.println(this.roll);
        System.out.println("waste Fellow");
    }
    public static void main(String args[]){
        Constructor c1=new Constructor("karunya","24pa1a0672");
        c1.Properties();
        Constructor c2=new Constructor();
    }
}
