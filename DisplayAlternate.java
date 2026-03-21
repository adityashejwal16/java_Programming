
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

    public void DisplayAlternate()
   {
    node temp = this.first;

    System.out.print("Alternate nodes : ");

    while(temp != null)
    {
        System.out.print(temp.data + " ");

        if(temp.next != null)
        {
            temp = temp.next.next;   // move 2 steps
        }
        else
        {
            break;
        }
     }
      System.out.println();
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

class DisplayAlternate
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

        obj.DisplayAlternate();
    
    }
}