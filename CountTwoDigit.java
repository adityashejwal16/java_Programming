
class node
{
    int data;
    node next;

    public node(int no)
    {
        this.data = no;
        this.next = null; 
    }
}

class SinglyL
{
    private node first;
    private int iCount;

    public void InsertFirst(int no)
    {
        node newn = null;

        newn = new node (no);

        newn.next = this.first;
        this.first = newn;

        this.iCount++;
    }

     public int CountTwoDigit()
     {
        node temp = this.first;

        int iCount = 0;

        while(temp != null)
        {
            if((temp.data >= 10 && temp.data <= 99) || (temp.data <= -10 && temp.data >= -99))
            {
                iCount++;
            }
            temp = temp.next;
        }
        return iCount;
     }

    public void Display()
    {
        node temp = this.first;

        while(temp != null)
        {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }

        System.out.print("null\n");
    }
}

class CountTwoDigit
{
    public static void main(String A[]) 
    {
        SinglyL obj = new SinglyL();
        int iRet = 0;

        obj.InsertFirst(301);
        obj.InsertFirst(12);
        obj.InsertFirst(111);
        obj.InsertFirst(91);
        obj.InsertFirst(75);

        obj.Display();

       
       iRet = obj.CountTwoDigit();
       System.out.println("Two number Count are : " + iRet);

    }
}