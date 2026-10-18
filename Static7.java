

// Static block

class Aadix
{
    static int i = 10;

    static 
    {
       i = i + 5; 
       i++;
    
        System.out.println(i);
    }

    {
      i++;
      System.out.println(i);
    }

    Aadix()
    {
        i = i * 3;
        System.out.println(i);
    }
}

class Static7
{   
    public static void main(String A[]) 
    {
        Aadix aobj = new Aadix();
        Aadix aobjx = new Aadix();
    }
}