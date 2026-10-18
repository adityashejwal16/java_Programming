

// Static block

class Aadix
{
    static int i = 10;
    static 
    {
       i = i + 5; 
    
        System.out.println(i);
    }
}

class Static6
{   
    public static void main(String A[]) 
    {
        Aadix aobj = new Aadix();

    }
}