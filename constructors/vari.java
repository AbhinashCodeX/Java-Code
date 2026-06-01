

class Student {

    int info;
    String name;
    static String bloodGroup; //static variable is shared among all the objects of the class

    public void show() {
        System.out.println(info + ":" + name + ":" + bloodGroup);
    }

    static{
        bloodGroup = "B-";
        System.out.println("This is a static block which is executed when the class is loaded into memory");
    }

    public Student() {
        System.out.println("This is a constructor which is executed when an object of the class is created");
    }

}

public class vari {

    public static void main(String[] args) {
        Student s = new Student();
        s.info = 123;
        s.name = "Abhinash Panigrahi";
        s.bloodGroup = "B-";

        s.show();//static method can be called using the class name without creating an object of the class

    }

}
