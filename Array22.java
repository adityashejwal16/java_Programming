/*
     Java Constant	            Meaning
     Integer.MIN_VALUE	      सर्वात लहान int Value
     Integer.MAX_VALUE	      सर्वात मोठी int Value
*/



class Array22
{
public static void main(String A[])
{
int Arr[] = {10, 50, 20, 80, 30};

    int i = 0;

    int iMax = Arr[0];
    int iSecondMax = Integer.MIN_VALUE;

    for(i = 1; i < Arr.length; i++)
    {
        if(Arr[i] > iMax)
        {
            iSecondMax = iMax;
            iMax = Arr[i];
        }
        else if(Arr[i] > iSecondMax && Arr[i] != iMax)
        {
            iSecondMax = Arr[i];
        }
    }

    System.out.println("Largest Element: " + iMax);
    System.out.println("Second Largest Element: " + iSecondMax);
}


}
