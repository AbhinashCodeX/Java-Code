abstract class A{
    abstract void sound();
}
public class anonymous {
    public static void main(String[] args) {
        A d=new A(){
            void sound(){
                System.out.println("woof");
            }

        };
      A c = new A(){
        void sound(){
            System.out.println("meow");
        }
      };

      A ow = new A(){
        void sound(){
            System.out.println("moo");
        }
      };
        d.sound();
        c.sound();
        ow.sound();
    }
    
}
