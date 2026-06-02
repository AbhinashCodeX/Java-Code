public class scpe {
//     public static void main(String[] args) {
//        // Code here CANNOT use x

//     int x = 100;

//     // Code here CAN use x
//     System.out.println(x);
//   }

 public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
}
