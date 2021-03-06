package com.android.thinkive.framework.network.packet;

import com.android.thinkive.framework.util.ArrayUtil;
import com.android.thinkive.framework.util.ByteUtil;
import com.android.thinkive.framework.util.FlowNoGenerater;
import com.android.thinkive.framework.util.Log;
import java.io.OutputStream;

public class SpeedPacket
  implements IPacket
{
  public int getFlowNo()
  {
    return FlowNoGenerater.getInstance().generaterFlowNo();
  }
  
  public byte[] packingBody()
  {
    return null;
  }
  
  public byte[] packingHeader()
  {
    byte[] arrayOfByte1 = "TH".getBytes();
    byte[] arrayOfByte2 = ByteUtil.intToBytes(98);
    byte[] arrayOfByte3 = ByteUtil.intToBytes(0);
    return ArrayUtil.addArray(ArrayUtil.addArray(arrayOfByte1, arrayOfByte2), arrayOfByte3);
  }
  
  public void sendPacket(OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = packingHeader();
    Log.d("send speed packet length = " + arrayOfByte.length);
    paramOutputStream.write(arrayOfByte);
    paramOutputStream.flush();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\packet\SpeedPacket.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */