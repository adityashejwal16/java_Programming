import java.util.*;
import java.io.*;
import java.net.*;

class AdditionClient2
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Server is Runnig...");


        Socket sobj = new Socket("local host",2100);
        System.out.println("server succesfully connected");

         DataInputStream diobj = new DataInputStream(sobj.getInputStreem());
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());
    }
}