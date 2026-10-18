
// Static block

class Static4
{
    static 
    {
        System.out.println("Inside  static");
    }

    {
        System.out.println("Instance initialization");   // withount obj instance dos'nt call 
    }

    Static4()                                      // Constractor
    {
       System.out.println("Inside Constractor");
    }
    
    public static void main(String A[]) 
    {
        System.out.println("Inside main");

        //Static4 sobj = new Static4();            // Constractor obj
    }
}