class Demo{
    void loadclass() throws ClassNotFoundException //throws keyword helps in exception ducking to the main method
    {
        Class.forName("student");
    }
}
public class n1 {
    public static void main(String[] args) {
Demo d=new Demo();
try{
    d.loadclass();
}catch (Exception e){
    System.out.println("class not found");
}
    }
}