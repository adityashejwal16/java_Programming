class Demo extends Thread
{

    public void run()
    {
        System.out.println("Inside run method :" + Thread.currentThread().getName());
    }
}

class ThreadUserDefinedjoindXX
{
    public static void main(String A[]) 
    {
        System.out.println("Inside main thread");

        Demo dobj1=new Demo();
        Demo dobj2=new Demo();

        dobj1.setName("Frist");
        dobj1.setName("Secound");

        
        dobj1.start();
        dobj2.start();

        // Checked Exception

        try
        {
        dobj1.join();
         dobj2.join();
        }
        catch (InterruptedException iobj)
        {}
       System.out.println("End of Main thread");
    }
}