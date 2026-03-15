
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

    public void DisplayEvenPosition()
    {
        int pos = 1;
        node temp = this.first;

        while(temp != null)
        {
            if(pos % 2 == 0)  // Even Pos
            {
               System.out.println("Even Pos :" +temp.data);
            }
            pos++;
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

class EvenPos4
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

        obj.DisplayEvenPosition();

        System.out.println("Even Position is : ");
        obj.Display();


    }
}