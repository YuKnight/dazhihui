package com.tencent.beacon.a;

import android.content.Context;
import com.tencent.beacon.event.UserAction;

public final class f
{
  private static f n = null;
  private Context a = null;
  private String b = "";
  private String c = "";
  private byte d = -1;
  private String e = "";
  private String f = "";
  private String g = "";
  private String h = "";
  private String i = "";
  private long j = 0L;
  private String k = "";
  private String l = "";
  private String m = "";
  
  private void a(byte paramByte)
  {
    try
    {
      this.d = 1;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void a(Context paramContext)
  {
    if (paramContext != null) {}
    for (;;)
    {
      try
      {
        if (n == null) {
          n = new f();
        }
        synchronized (n)
        {
          com.tencent.beacon.e.b.e("init cominfo", new Object[0]);
          n.a = paramContext;
          h localh = h.a(paramContext);
          n.b = h.b();
          n.c = localh.a();
          n.a((byte)1);
          n.f(b.e(paramContext));
          n.a(b.f(paramContext));
          n.g("beacon");
          n.h("1.9.9");
          n.b("unknown");
          n.c(h.b(paramContext));
          paramContext = b.a(paramContext);
          if (!"".equals(paramContext))
          {
            n.e(paramContext);
            return;
          }
          if ((UserAction.getAppkey() != null) && (!"".equals(UserAction.getAppkey()))) {
            n.e(UserAction.getAppkey());
          }
        }
        n.e(n.n());
      }
      finally {}
    }
  }
  
  private void f(String paramString)
  {
    try
    {
      this.e = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private void g(String paramString)
  {
    try
    {
      this.g = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private void h(String paramString)
  {
    try
    {
      this.h = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public static f m()
  {
    try
    {
      f localf = n;
      return localf;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private String n()
  {
    try
    {
      String str = this.e;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String a()
  {
    return this.b;
  }
  
  public final void a(long paramLong)
  {
    try
    {
      this.j = paramLong;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(String paramString)
  {
    try
    {
      this.f = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final String b()
  {
    return this.c;
  }
  
  public final void b(String paramString)
  {
    try
    {
      this.i = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final byte c()
  {
    try
    {
      byte b1 = this.d;
      return b1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final void c(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 35
    //   4: aload_1
    //   5: invokevirtual 117	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   8: istore_3
    //   9: iload_3
    //   10: ifne +14 -> 24
    //   13: aload_0
    //   14: getfield 33	com/tencent/beacon/a/f:a	Landroid/content/Context;
    //   17: ldc -113
    //   19: aload_1
    //   20: invokestatic 146	com/tencent/beacon/a/b:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    //   23: pop
    //   24: aload_0
    //   25: aload_1
    //   26: putfield 55	com/tencent/beacon/a/f:k	Ljava/lang/String;
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    //   37: astore_2
    //   38: goto -14 -> 24
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	f
    //   0	41	1	paramString	String
    //   37	1	2	localException	Exception
    //   8	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	9	32	finally
    //   13	24	32	finally
    //   24	29	32	finally
    //   13	24	37	java/lang/Exception
  }
  
  public final String d()
  {
    try
    {
      String str = this.f;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void d(String paramString)
  {
    try
    {
      this.m = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final String e()
  {
    try
    {
      String str = this.g;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void e(String paramString)
  {
    try
    {
      this.l = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final String f()
  {
    try
    {
      String str = this.h;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String g()
  {
    try
    {
      String str = this.i;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final long h()
  {
    try
    {
      long l1 = this.j;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final String i()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 35
    //   4: aload_0
    //   5: getfield 55	com/tencent/beacon/a/f:k	Ljava/lang/String;
    //   8: invokevirtual 117	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   11: istore_2
    //   12: iload_2
    //   13: ifeq +18 -> 31
    //   16: aload_0
    //   17: aload_0
    //   18: getfield 33	com/tencent/beacon/a/f:a	Landroid/content/Context;
    //   21: ldc -113
    //   23: ldc 35
    //   25: invokestatic 150	com/tencent/beacon/a/b:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   28: putfield 55	com/tencent/beacon/a/f:k	Ljava/lang/String;
    //   31: aload_0
    //   32: getfield 55	com/tencent/beacon/a/f:k	Ljava/lang/String;
    //   35: astore_1
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_1
    //   39: areturn
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    //   45: astore_1
    //   46: goto -15 -> 31
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	f
    //   35	4	1	str	String
    //   40	4	1	localObject	Object
    //   45	1	1	localException	Exception
    //   11	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	12	40	finally
    //   16	31	40	finally
    //   31	36	40	finally
    //   16	31	45	java/lang/Exception
  }
  
  public final String j()
  {
    try
    {
      String str = this.l;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String k()
  {
    try
    {
      String str = this.m;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final Context l()
  {
    try
    {
      Context localContext = this.a;
      return localContext;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */