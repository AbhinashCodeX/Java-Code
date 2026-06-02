public class revarray {
    public static void main(String[] args) {
        reversestring("Stop! Hammertime!");
    }

    public static void reversestring(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println(reversed);
}
}