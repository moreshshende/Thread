 public class ThreadOp {

     public static void main(String[] args) {
         
        System.out.println("program started..");

               int x=56+34;
               System.out.println("Sum  is " +x);

               Thread  t= Thread.currentThread();
                String tnmae=t.getName();
                System.out.println("Current t runnig thread is : "+tnmae);
         
                 t.setName("MyMain");
                    System.out.println(t.getName());

                   try{
                       Thread.sleep(5000);
                   }catch (Exception e)
                   {

                   };

                   System.out.println(t.getId());
              
                 
     }
    
}
