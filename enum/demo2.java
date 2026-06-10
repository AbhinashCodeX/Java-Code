enum Status {
    PENDING, RUNNING, SUCCESS, FAILED
}

public class demo2 {
    public static void main(String[] args) {
    Status s = Status.RUNNING;
        //use of enum in switch
        switch (s) {
            case PENDING:
                System.out.println("Pending");
                break;

            case RUNNING:
                System.out.println("Running");
                break;

            case SUCCESS:
                System.out.println("Success");
                break;

            case FAILED:
                System.out.println("Failed");
                break;
        }
}
}
