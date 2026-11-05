

class Array28
{
    public static void main(String A[])
    {
        int Arr[] = {10, 50, 80, 40, 90};

        int i = 0;
        int iSearch = 40;
        boolean bFlag = false;

        for(i = 0; i < Arr.length; i++)
        {
           if(Arr[i] == iSearch)
           {
              bFlag = true;
           }
        }
        if(bFlag == true)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element Not found");
        }
    }
}