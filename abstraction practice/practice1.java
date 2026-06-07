abstract class Animal {
    abstract void sound();

    public void property(){
        System.out.println("Animal Class Called");
    }
}
class dog extends Animal{
    public void sound(){
        System.out.println("Dog Bark Woof!!");
    }
}
class cat extends Animal{
    public void sound(){
        System.out.println("Cat Sounds Meow!!!");
    }
}

class cow extends  Animal{
    public void sound(){
        System.out.println("Cow sounds mooohhhh!");
    }
}



public class practice1 {
    public static void main(String[] args) {
        Animal a;

        a = new dog();
        a.property();
        a.sound();

        a = new cat();
        a.property();
        a.sound();

        a = new cow();
        a.property();
        a.sound();


    }
}
