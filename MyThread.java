

public class MyThread  implements  Runnable {
    
    public void run()
    {
        for(int i=0; i<=10; i++)
        {
            System.out.println("value of i is = " +i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }


     public static void main(String[] args) {
         MyThread t1 = new MyThread();

         Thread thr =  new Thread(t1);
          thr.start();
           MyAnotherThread t2 = new MyAnotherThread();
            t2.start();
        
    }
}
