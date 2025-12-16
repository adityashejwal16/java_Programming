class Logic
{
    void displayGrade(int marks)
    {
       int i = marks;
       if(i >= 80)
       {
          System.out.println("A Grade");
       }
       else if(i >= 70)
       {
        System.out.println("B Grade");
       }
       else if(i>=50)
       {
        System.out.println("C Grade");
       }
    }
}
class gradestudent
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}