

class AbhiException extends Exception
        {
            public AbhiException(String string)
            {
                super(string);
            }
        }
        class z
        {
            public void show() throws ClassNotFoundException
            {
//    	try
//    	{
//    		Class.forName("Calc");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}

                Class.forName("Calc");
            }
        }

        public class E3 {

            static {
                System.out.println("Class Loader");
            }

            public static void main(String[] args) {

//    	try
//    	{
//    		Class.forName("Class");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}

                z obj=new z();
                try {
                    obj.show();
                }catch(ClassNotFoundException e)
                {
                    e.printStackTrace();
                }


            }
        }
