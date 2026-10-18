
// Static block

class Static3
{
    static 
    {
        System.out.println("Inside 1st static");
    }
    
    static
    {
        System.out.println("Inside 2nd static");
    }

    Static3()                                      // Constractor
    {
       System.out.println("Inside Constractor");
    }
    
    public static void main(String A[]) 
    {
        System.out.println("Inside main");

        Static3 sobj = new Static3();            // Constractor obj
    }
}