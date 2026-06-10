

enum Statu{
    PENDING , RUNNING ,SUCCESS, FAILED ;

}
public class task1 {
    public static void main(String[] args) {
Statu s = Statu.RUNNING;
        System.out.println(s.ordinal());   //ye enum constant ka id return krta hai
        System.out.println(s.name());     //Ye enum constant ka exact name string ke form me return krta hai


if(s==Statu.PENDING){
    System.out.println("Task is Pending");
}else if (s==Statu.RUNNING) {
    System.out.println("Task is Running");
} else if (s==Statu.FAILED) {
        System.out.println("Task is Failed");
    } else if (s==Statu.SUCCESS) {
        System.out.println("Task is Success");

    }
}
}
