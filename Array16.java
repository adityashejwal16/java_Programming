
 // Sum of Array

class ArrayX
{
    public int Display(int Brr[])
    {
        int i = 0, iSum = 0;

        System.out.println("Total Elements Are : "+Brr.length);

        for(i = 0; i < Brr.length; i++)
        {
            iSum = iSum + Brr[i];
           // System.out.println(Brr[i]);
        }
        return iSum;
    }
}

class Array16
{
    public static void main(String A[])
    {
        int Arr[] = {10, 20, 30, 40, 50};
        int iRet = 0;

        ArrayX aobj = new ArrayX();

       iRet = aobj.Display(Arr);

       System.out.println("Addition is : "+iRet);

    }
}