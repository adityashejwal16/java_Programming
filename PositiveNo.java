
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

    public boolean CheckAllPositive()
    {
        node temp = this.first;

        while(temp != null)
        {
            if(temp.data <= 0)
            {
                return false;
            }
            temp = temp.next;
        }
        return true;
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

class PositiveNo
{
    public static void main(String A[]) 
    {
        SinglyL obj = new SinglyL();
        int iRet = 0;

        obj.InsertFirst(30);
        obj.InsertFirst(12);
        obj.InsertFirst(10);
        obj.InsertFirst(20);

        obj.Display();

       if(obj.CheckAllPositive())
       {
          System.out.println("All number are Positive : ");

       }
       else
       {
             System.out.println("All number are negative : ");
       }

    }
}