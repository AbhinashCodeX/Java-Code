
class A
{
	public void show() 
	{
		System.out.println("in A show");
	}
}
//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B Show");
//	}
//}

public class  Demo3{
    public static void main(String[] args) {
    	
    	//A obj=new B();
    	
    	A obj=new A() 
    	{   //Annomous inner class
    		public void show()
    		{
    			System.out.println("in new show");  
    		}
    	};
    obj.show();
    }
}