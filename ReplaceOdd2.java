
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

    public void ReplaceOdd()
    {
        node temp = this.first;

        while(temp != null)
        {
            if(temp.data % 2 != 0)
            {
                temp.data = 1;       // Reaplace Odd NO
            }

            temp = temp.next;
        }
    }  

    public void Display()
    {
        node temp = this.first;

        while(temp != null)
        {
            System.out.println(temp.data + " ->");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

class ReplaceOdd2
{
    public static void main(String A[]) 
    {
        SinglyL obj = new SinglyL();
        int iRet = 0;

        obj.InsertFirst(51);
        obj.InsertFirst(22);
        obj.InsertFirst(10);
        obj.InsertFirst(17);

        obj.Display();

        obj.ReplaceOdd();

        System.out.println("After Replace : ");
        obj.Display();


    }
}