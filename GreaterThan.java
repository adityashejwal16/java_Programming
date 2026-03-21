
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

    public void DisplayGreaterThanAvg()
{
    node temp = this.first;
    int sum = 0;

    // Step 1 : Calculate sum
    while(temp != null)
    {
        sum = sum + temp.data;
        temp = temp.next;
    }

    // Check empty list
    if(iCount == 0)
    {
        return;
    }

    int avg = sum / iCount;
    System.out.println("Average is : " + avg);

    
    temp = this.first;
    System.out.print("Elements greater than average : ");

    while(temp != null)
    {
        if(temp.data > avg)
        {
            System.out.print(temp.data + " ");
        }
        temp = temp.next;
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

class GreaterThan
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

        obj.DisplayGreaterThanAvg();
    
    }
}