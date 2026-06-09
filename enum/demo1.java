enum status{
Running, Pending , Failed , Success;
}


public class demo1 {
    public static void main(String[] args) {
        status s=status.Running;

        switch(s)
        {
          	case Running:
    			System.out.println("All Good");
    			break;
    			
    		case Failed:
    			System.out.println("Try Again");
    			break;
    			
    		case Pending:
    			System.out.println("Please Wait");
    			break;
    		
    		default:
    			System.out.println("Done");
    			break;
        }
    }
}
