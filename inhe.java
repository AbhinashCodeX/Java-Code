public class inhe {
    public static void main(String[] args) {
    AdvCalculator ac = new AdvCalculator();
    int r1 = ac.add(10, 20);
    int r2 = ac.sub(10, 20);    
    int r3 = ac.mul(10, 20);
    int r4 = ac.div(10, 20);
    System.out.println("Add: "+r1);
    System.out.println("Sub: "+r2); 
    System.out.println("Mul: "+r3);
    System.out.println("Div: "+r4);
    }
    
}
