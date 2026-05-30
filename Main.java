class Human{
    private int age;
    private String name;

    public Human(){ //This is a constructor which is used to initialize the values of the variables
                    //same name as the class name and no return type
         age=20;
         name="Abhinash Panigrahi";
    }
    public Human(int age, String name){
        this.age=age;
        this.name=name;
        
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Main {

    public static void main(String[] args) {
        Human h=new Human();//default 
        Human h1=new Human(24,"Abhinash Panigrahi");//paramaterized constructor value is passed as an argument
        System.out.println(h.getName()+":"+h.getAge());
        System.out.println(h1.getName()+":"+h1.getAge()); //paramameterized constructor 
        // h.setAge(20);
        // h.setName("Abhinash Panigrahi");
     
    }
}
