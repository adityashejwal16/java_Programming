

class Array29
{
    public static void main(String A[])
    {
        int Arr[] = {10, 20, 30, 40, 50};

        int iSum = 0, i = 0;
        double Avarage = 0;

        for(i = 0; i < Arr.length; i ++)
        {
            iSum = iSum + Arr[i];
            Avarage = iSum / Arr.length;
        }
        System.out.println(Avarage);
    }
}
