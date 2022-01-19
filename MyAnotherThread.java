public class MyAnotherThread  extends Thread{

      public void run()
      {
          for(int i=10; i>=1; i--)
          {
              System.out.println("Another Thread  is Runing " + i);
          }

          try{
              Thread.sleep(2000);

          }catch(Exception e)
          {

          }
      }
    
}
