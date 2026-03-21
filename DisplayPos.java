
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

     public void DisplayX(int pos)
    {
      if(pos <= 0 || pos > iCount)
     {
         System.out.println("Invalid Position");
         return;
     }

       node temp = this.first;
       int i = 1;

       while(i < pos)
       {
         temp = temp.next;
         i++;
       }

        System.out.println("Element at position " + pos + " is : " + temp.data);
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

class DisplayPos
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

        obj.DisplayX(3);
    
    }
}