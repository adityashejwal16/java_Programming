
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

    public void MultiplyByTwo()
    {
        node temp = this.first;

        while(temp != null)
        {
            temp.data = temp.data * 3;   // Value Multi 2 modify
            temp = temp.next;            // pointer next
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

class Multiply3
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

        obj.MultiplyByTwo();

        System.out.println("Multily numbers is : ");

    }
}