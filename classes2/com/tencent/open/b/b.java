package com.tencent.open.b;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class b
  implements Serializable
{
  public final HashMap<String, String> a = new HashMap();
  
  public b(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        this.a.put(str, paramBundle.getString(str));
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */