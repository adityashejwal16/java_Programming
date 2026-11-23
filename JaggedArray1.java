
class JaggedArray1
{
    public static void main(String A[])
    {
        int Arr[][] = {  {10,20}, 
                         {40,50,60}, 
                         {70,80,90,30}  };

        System.out.println(Arr.length);
        System.out.println(Arr[2][3]);   // 30
        System.out.println(Arr[0][1]);   // 20
        System.out.println(Arr[2][1]);    // 80
    }
}