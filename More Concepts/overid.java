
// class A{
//     public void show(){
//         System.out.println("This is class A");

//     }
//     public void display(){
//         System.out.println("Display method in class A");
//     }
// }
// class B extends A{
//     // @Override
//     public void show(){
//         System.out.println("This is class B");
//     }
//     // @Override
//     public void display(){
//         System.out.println("Display method in class B");
//     }
// }

class Calc{
    public int add(int a, int b){
        return a + b;

    }
}
    class AdvCalc extends Calc{
        public int add(int a, int b){
            return a + b + 10; // Adding 10 for demonstration for overriding
        }
}


public class overid {
    public static void main(String[] args) {

        // B obj = new B();
        // obj.show(); // This will call the overridden method in class B
AdvCalc advCalc = new AdvCalc();
int result = advCalc.add(5,10);
System.out.println("Result of addition: " + result); // This will call the overridden add method in AdvCalc
    }
}

