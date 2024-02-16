package maccess;
import java.util.*;
import test.TransLog;
public class DemoPoly3 
{
    public static void main(String[] args) 
    {
       Scanner s = new Scanner(System.in);
       try(s;)
        {
          try {
             System.out.println("Enter hAccNo:");
              long hAccNo = s.nextLong();
             System.out.println("Enter bAccNo:");
              long bAccNo = s.nextLong();
             System.out.println("Enter the amt to be transffered:");
              float amt = s.nextFloat();
                                 //Immutable Object
              TransLog ob = new TransLog(Math.random(),hAccNo,bAccNo,amt,new Date());
               System.out.println("====Log-Details====");
               System.out.println("TransId:"+ob.gettId());
               System.out.println("HAccNo:"+ob.gethAccNo());
               System.out.println("BAccNo:"+ob.getbAccNo());
               System.out.println("Amt:"+ob.getAmt());

               System.out.println("DateTime:"+ob.getdTime());
               }catch(Exception e) 
                    {
            	          e.printStackTrace();
            	          }
                  }//end of try with resource
             }
}