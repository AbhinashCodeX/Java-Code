enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;

}
public class task2 {
     public static void main(String[] args) {
        Day d = Day.WEDNESDAY;
        switch (d) {
            case MONDAY:
                System.out.println("1st day of the Week Starts ");
                break;
            case TUESDAY:
                System.out.println("2nd  Day of the Week Starts");
                break;
            case WEDNESDAY:
                System.out.println("Mid Week");
                break;
            case THURSDAY:
                System.out.println("4th Day of the Week Starts");
                break;
            case FRIDAY:
                System.out.println("5th  Day of the Week Starts");
                break;
            case SATURDAY:
                System.out.println("6th  Day of the Week Starts");

        }
    }
}
