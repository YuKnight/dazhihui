package qalsdk;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.util.QLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.SimpleDateFormat;

class az
  extends Thread
{
  az(av paramav) {}
  
  void a()
  {
    if (QLog.isColorLevel()) {
      QLog.d("MSF.C.NetConnTag", 2, "start tcpdump now");
    }
    for (;;)
    {
      try
      {
        localObject5 = this.a.b.r.getAssets();
        localObject4 = null;
        localObject1 = null;
        localObject3 = localObject4;
      }
      catch (Exception localException2)
      {
        Object localObject5;
        Object localObject4;
        Object localObject1;
        Object localObject3;
        int j;
        int i;
        int k;
        Object localObject2;
        if (!QLog.isColorLevel()) {
          return;
        }
        QLog.d("MSF.C.NetConnTag", 2, "tcpdump: readLine Exception" + localException2);
        return;
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.d("MSF.C.NetConnTag", 2, "tcpdump started Sleep for 2 minutes");
        this.a.s = System.currentTimeMillis();
        Thread.sleep(120000L);
        localException2.close();
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.d("MSF.C.NetConnTag", 2, "tcpdump end Sleep for 2 minutes");
        av.j();
        this.a.r = true;
        return;
        continue;
        if (localObject3 != null) {
          continue;
        }
      }
      try
      {
        localObject5 = ((AssetManager)localObject5).list("");
        localObject3 = localObject4;
        j = localObject5.length;
        i = 0;
        localObject3 = localObject1;
        if (i >= j) {
          continue;
        }
        localObject4 = localObject5[i];
        localObject3 = localObject1;
        k = ((String)localObject4).indexOf("tcpdump");
        if (k == -1) {
          continue;
        }
        localObject1 = localObject4;
        i += 1;
        continue;
        this.a.b.r.getDir("assets", 0).toString();
      }
      catch (Exception localException1)
      {
        localException1.printStackTrace();
      }
    }
    localObject2 = new StringBuilder();
    av.a(this.a.b.r);
    new ProcessBuilder(new String[0]).command(new String[] { "chmod", "777", this.a.b.r.getFilesDir().getParent() + "/txlib/" + "tcpdump" }).redirectErrorStream(true).start();
    if (QLog.isColorLevel()) {
      QLog.d("MSF.C.NetConnTag", 2, "start tcpdump");
    }
    ((StringBuilder)localObject2).setLength(0);
    localObject3 = this.a.b.r.getPackageName();
    localObject3 = Environment.getExternalStorageDirectory().getPath() + "/tencent/" + ((String)localObject3).replace(".", "/") + "/";
    localObject4 = new File((String)localObject3);
    if (!((File)localObject4).exists()) {
      ((File)localObject4).mkdirs();
    }
    localObject4 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date(System.currentTimeMillis()));
    ((StringBuilder)localObject2).append((String)localObject3);
    ((StringBuilder)localObject2).append((String)localObject4);
    ((StringBuilder)localObject2).append(".pcap");
    try
    {
      localObject2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[] { "su", "-c", this.a.b.r.getFilesDir().getParent() + "/txlib/" + "tcpdump  -p -vv -s 0 -w " + localObject2 }).getErrorStream()));
      if (!((BufferedReader)localObject2).readLine().toLowerCase().contains("syntax error")) {
        break label533;
      }
      ((BufferedReader)localObject2).close();
      return;
    }
    catch (IOException localIOException)
    {
      if (!QLog.isColorLevel()) {
        return;
      }
    }
    QLog.d("MSF.C.NetConnTag", 2, "Error running tcpdump, msg=" + localIOException.getMessage());
    return;
    label533:
  }
  
  public void run()
  {
    try
    {
      a();
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */