
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

    public int Difference()
    {
        if(this.first == null)
        {
            return 0;
        }

        int max = first.data;
        int min = first.data;

        node temp = first;

        while(temp != null)
        {
            if(temp.data > max)
            {
                max = temp.data;
            }
            if (temp.data < min)
            {
               min = temp.data; 
            }
            temp = temp.next;
        }
        return (max - min);
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

class MaxMin
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

       iRet = obj.Difference(); 

        System.out.println("Difference is : "+ iRet);

    }
}