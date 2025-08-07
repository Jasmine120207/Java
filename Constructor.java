class Constructor{
    int radius;
    int height;
    void  Constructor(int radius,int height){
       this.radius=radius;
       this.height=height;
      System.out.println("radius:" +radius);
       System.out.println("height"+height);
    }
    void  getRh(){
        System.out.println("radius:"+radius);
        System.out.println("height:"+height);
    }
    double  getSa(){
        return (2*3.14*radius*(radius+height));
    }
    double getVol(){
        return 3.14*radius*radius*height;
    }
public class Main{
    public static void main(String[] args) {
        Constructor c=new Constructor();
        c.Constructor(7,3);
       // System.out.println(c.getRh());
       System.out.println("the surface area is:"+c.getSa());
       System.out.println("the volume is:"+c.getVol());
       
    }
}
}