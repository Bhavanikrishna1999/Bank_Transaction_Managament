package test;
import java.util.*;

   public final class TransLog
    {
       private final double tId;
       private final long hAccNo,bAccNo;
       private final float amt;
       private final Date dTime;
       
       public TransLog(double tId,long hAccNo,long bAccNo,float amt,Date dTime) 
       {
         this.tId=tId;
         this.hAccNo=hAccNo;
         this.bAccNo=bAccNo;
         this.amt=amt;
         this.dTime=dTime;
       }
      public final double gettId() 
      {
        return tId;
      }
public final long gethAccNo() 
{
 return hAccNo;
}
public final long getbAccNo() 
{
 return bAccNo;
}
public final float getAmt() 
{
 return amt;
}
public final Date getdTime() 
{
  return dTime;
}
public String gettId() {
	// TODO Auto-generated method stub
	return null;
}
}