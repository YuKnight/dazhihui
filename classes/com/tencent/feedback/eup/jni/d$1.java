package com.tencent.feedback.eup.jni;

import com.tencent.feedback.common.e;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

final class d$1
  implements FilenameFilter
{
  d$1(d paramd, int paramInt1, int paramInt2, List paramList) {}
  
  public final boolean accept(File paramFile, String paramString)
  {
    e.b("rqdp{  check dir} %s rqdp{  , filename} %s", new Object[] { paramFile, paramString });
    if (paramString.startsWith("tomb_"))
    {
      d.a(this.d);
      e.b("rqdp{  accept }%s", new Object[] { paramString });
    }
    try
    {
      long l = Long.parseLong(paramString.substring(this.a, paramString.length() - this.b));
      e.b("rqdp{  mRemoveBeforeDate }%d", new Object[] { Long.valueOf(d.b(this.d)) });
      if (l <= d.b(this.d))
      {
        e.b("rqdp{  recordTime} %d rqdp{  is old}", new Object[] { Long.valueOf(l) });
        return true;
      }
      e.b("rqdp{  newFileTimeList add} %d", new Object[] { Long.valueOf(l) });
      this.c.add(Long.valueOf(l));
      return false;
    }
    catch (Throwable paramFile)
    {
      e.c("rqdp{  filename is not formatted ,shoud do delete! \n path:}%s", new Object[] { paramString });
      paramFile.printStackTrace();
    }
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\eup\jni\d$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */