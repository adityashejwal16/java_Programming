
// Static block

class Static5
{
    static 
    {
        System.out.println("Inside  static");
    }

    {
        System.out.println("Instance initialization");   // Now obj creat then instance initialize befor the Constractor  
    }

    Static5()                                      // Constractor
    {
       System.out.println("Inside Constractor");
    }
    
    public static void main(String A[]) 
    {
        System.out.println("Inside main");

        Static5 sobj = new Static5();            // Constractor obj
    }
}