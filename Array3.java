

class ArrayX
{
    public void Display(int Brr[])
    {
        int i = 0;

        for(i = 0; i < Brr.length; i++)
        {
            System.out.println(Brr[i]);
        }
    }
}

class Array3
{
    public static void main(String A[])
    {
        int Arr[] = {10, 20, 30, 40, 50};

       ArrayX aobj = new ArrayX();

       aobj.Display(Arr);

    }
}

/*
      0    1   2   3   4
     {10, 20, 30, 40, 50}
*/ 