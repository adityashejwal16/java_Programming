

class Array23
{
    public static void main(String A[])
    {
        int Arr[] = {10, 5, 15, 30, 45};

        int iMin = Arr[0];
        int iSecoundMin = Integer.MAX_VALUE;
        int i = 0;

        for(i = 1; i < Arr.length; i++)
        {
            if(Arr[i] < iMin)
            {
                iSecoundMin = iMin;
                iMin = Arr[i];
            }
            else if(Arr[i] < iSecoundMin && Arr[i] != iMin)
            {
                iSecoundMin = Arr[i];
            }
        }

        System.out.println("Secound last Min : "+iSecoundMin);
    }
}