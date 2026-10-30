
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


class Array6
{
    public static void main(String A[])
    {
        int Arr[] = new int[4];

        Arr[0] = 15;
        Arr[1] = 25;
        Arr[2] = 35;
        Arr[3] = 45;

        ArrayX aobj = new ArrayX();

        aobj.Display(Arr);
    }
}