package qalsdk;

import com.tencent.qalsdk.util.QLog;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;

class ax
  extends Thread
{
  ax(av paramav, String paramString, int paramInt) {}
  
  public void run()
  {
    try
    {
      this.c.w = false;
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.NetConnTag", 2, "start send checkNetConnectBySocket server:" + this.a + " port:" + this.b);
      }
      Object localObject1 = new Socket();
      Object localObject2 = new InetSocketAddress(this.a, this.b);
      ((Socket)localObject1).setSoTimeout(10000);
      ((Socket)localObject1).setTcpNoDelay(true);
      ((Socket)localObject1).setKeepAlive(true);
      ((Socket)localObject1).connect((SocketAddress)localObject2, 10000);
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.NetConnTag", 2, "checkNetConnectBySocket connect server:" + this.a + " port:" + this.b + " success");
      }
      localObject2 = new OutputStreamWriter(((Socket)localObject1).getOutputStream());
      Object localObject3 = new StringBuffer();
      ((StringBuffer)localObject3).append("GET http://3gimg.qq.com/qq_product_operations/nettest/index.html?mType=connCheck HTTP/1.1\r\n");
      ((StringBuffer)localObject3).append("Host: 3gimg.qq.com \r\n");
      ((StringBuffer)localObject3).append("Connection: close\r\n");
      ((StringBuffer)localObject3).append("\r\n");
      ((OutputStreamWriter)localObject2).write(((StringBuffer)localObject3).toString());
      ((OutputStreamWriter)localObject2).flush();
      localObject2 = ((Socket)localObject1).getInputStream();
      localObject1 = null;
      localObject3 = new byte[64];
      if (((InputStream)localObject2).read((byte[])localObject3) != -1) {
        localObject1 = new String((byte[])localObject3, av.o());
      }
      if (((String)localObject1).indexOf("302") != -1) {
        this.c.w = true;
      }
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.NetConnTag", 2, "checkNetConnectBySocket get header:" + (String)localObject1);
      }
      for (;;)
      {
        ((InputStream)localObject2).close();
        return;
        QLog.d("MSF.C.NetConnTag", 1, "checkNetConnectBySocket " + ((String)localObject1).hashCode() + " len: " + ((String)localObject1).length());
      }
      return;
    }
    catch (UnknownHostException localUnknownHostException)
    {
      QLog.d("MSF.C.NetConnTag", 1, "checkNetConnectBySocket connect server UnknownHostException:" + this.a + " port:" + this.b + " failed" + localUnknownHostException, localUnknownHostException);
      return;
    }
    catch (IOException localIOException)
    {
      QLog.d("MSF.C.NetConnTag", 1, "checkNetConnectBySocket connect server IOException:" + this.a + " port:" + this.b + " failed" + localIOException, localIOException);
      return;
    }
    catch (Exception localException)
    {
      QLog.d("MSF.C.NetConnTag", 1, "checkNetConnectBySocket connect server:" + this.a + " port:" + this.b + " failed" + localException, localException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */