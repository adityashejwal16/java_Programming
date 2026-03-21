
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

    public boolean CheckSorted()
    {
        if(first == null || first.next == null)
        {
            return true;
        }

        node temp = first;

        while(temp.next != null)
        {
            if(temp.data > temp.next.data)
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

class CheckSorting
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

        if(obj.CheckSorted())
        {
            System.out.println("Linked List is Sorted");
        }
        else
        {
            System.out.println("Linked List is NOT Sorted");
        }
    
    }
}