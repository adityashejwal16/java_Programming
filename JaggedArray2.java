
class JaggedArray2
{
    public static void main(String A[])
    {
        int Arr[][] = new int[3][];

        Arr[0] = new int[2];  //for row 0 have 2 elements
        Arr[1] = new int[3];  //for row 1 have 3 elements
        Arr[2] = new int[4];  //for row 2 have 4 elements

        Arr[0][0] = 10;
        Arr[0][1] = 20;

        Arr[1][0] = 30;
        Arr[1][1] = 40;
        Arr[1][2] = 50;

        Arr[2][0] = 60;
        Arr[2][1] = 70;
        Arr[2][2] = 80;
        Arr[2][3] = 90;


        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}