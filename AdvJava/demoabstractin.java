abstract class vehicle{
    public void start(){
        System.out.println("Vehicle Started");
    }
    public abstract void move();
}
class car extends vehicle{
    public void move(){
        System.out.println("Car runs on Road ");
    }
}
class boat extends vehicle{
    public void move(){
        System.out.println("boat sails on the river");
    }
}
public class demoabstractin {
    public static void main(String[] args) {
    vehicle v; //= new boat()
        v= new car();
        v.move();
 
        v=new boat();
        v.move();
    //    System.out.println();


    }
}

