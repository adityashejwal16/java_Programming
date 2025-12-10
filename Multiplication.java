class Logic
{
    void printTable(int num)
    {

       for(int i =1; i <= 10; i++)
       {
            System.out.println(num + " x " + i + " = " + (num * i));
            
       }
    }
    
}
class Multiplication
{
     public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}