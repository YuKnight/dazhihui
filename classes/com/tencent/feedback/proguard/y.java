package com.tencent.feedback.proguard;

import android.content.Context;
import com.tencent.feedback.common.b;
import com.tencent.feedback.common.c;
import java.util.Calendar;
import java.util.Date;

public final class y
  implements Runnable
{
  private static y a;
  private Context b;
  private b c;
  private com.tencent.feedback.upload.e d;
  private boolean e = false;
  private long f = 60000L;
  private int g = 10;
  private boolean h = true;
  private final String i;
  private int j = 0;
  private long k = 0L;
  
  private y(Context paramContext, b paramb, com.tencent.feedback.upload.e parame)
  {
    this.b = paramContext;
    this.c = paramb;
    this.d = parame;
    this.i = com.tencent.feedback.common.a.h(this.b);
    this.k = e();
  }
  
  public static y a()
  {
    try
    {
      y localy = a;
      return localy;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public static y a(Context paramContext, b paramb, com.tencent.feedback.upload.e parame)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 65	com/tencent/feedback/proguard/y:a	Lcom/tencent/feedback/proguard/y;
    //   6: ifnonnull +20 -> 26
    //   9: aload_0
    //   10: ifnonnull +25 -> 35
    //   13: new 2	com/tencent/feedback/proguard/y
    //   16: dup
    //   17: aload_0
    //   18: aload_1
    //   19: aload_2
    //   20: invokespecial 68	com/tencent/feedback/proguard/y:<init>	(Landroid/content/Context;Lcom/tencent/feedback/common/b;Lcom/tencent/feedback/upload/e;)V
    //   23: putstatic 65	com/tencent/feedback/proguard/y:a	Lcom/tencent/feedback/proguard/y;
    //   26: getstatic 65	com/tencent/feedback/proguard/y:a	Lcom/tencent/feedback/proguard/y;
    //   29: astore_0
    //   30: ldc 2
    //   32: monitorexit
    //   33: aload_0
    //   34: areturn
    //   35: aload_0
    //   36: invokevirtual 74	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   39: astore_3
    //   40: aload_3
    //   41: ifnull -28 -> 13
    //   44: aload_3
    //   45: astore_0
    //   46: goto -33 -> 13
    //   49: astore_0
    //   50: ldc 2
    //   52: monitorexit
    //   53: aload_0
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	paramContext	Context
    //   0	55	1	paramb	b
    //   0	55	2	parame	com.tencent.feedback.upload.e
    //   39	6	3	localContext	Context
    // Exception table:
    //   from	to	target	type
    //   3	9	49	finally
    //   13	26	49	finally
    //   26	30	49	finally
    //   35	40	49	finally
  }
  
  private void b(int paramInt)
  {
    try
    {
      this.j = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  private boolean i()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: iconst_2
    //   6: invokevirtual 79	com/tencent/feedback/proguard/y:a	(I)Z
    //   9: ifne +16 -> 25
    //   12: ldc 81
    //   14: iconst_0
    //   15: anewarray 4	java/lang/Object
    //   18: invokestatic 86	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   21: aload_0
    //   22: monitorexit
    //   23: iload_2
    //   24: ireturn
    //   25: ldc 88
    //   27: iconst_0
    //   28: anewarray 4	java/lang/Object
    //   31: invokestatic 90	com/tencent/feedback/common/e:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   34: iconst_1
    //   35: istore_2
    //   36: goto -15 -> 21
    //   39: astore_1
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	y
    //   39	4	1	localObject	Object
    //   1	35	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   4	21	39	finally
    //   25	34	39	finally
  }
  
  private boolean j()
  {
    try
    {
      boolean bool = a(1);
      com.tencent.feedback.common.e.e("rqdp{ launch state record %b}", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private int k()
  {
    try
    {
      int m = this.j;
      return m;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int a(q[] paramArrayOfq)
  {
    try
    {
      int m = a.b(this.b, paramArrayOfq);
      return m;
    }
    finally
    {
      paramArrayOfq = finally;
      throw paramArrayOfq;
    }
  }
  
  protected final boolean a(int paramInt)
  {
    boolean bool2 = true;
    for (;;)
    {
      try
      {
        Object localObject1 = c.a(this.b);
        if (localObject1 != null)
        {
          q localq = new q();
          localq.a(paramInt);
          localq.a(new Date().getTime());
          localq.a(this.i);
          localq.b(((c)localObject1).h());
          if (a.a(this.b, new q[] { localq }) > 0)
          {
            bool1 = bool2;
            if (b(this.i) >= this.g)
            {
              com.tencent.feedback.common.e.e("rqdp{ state max upload}", new Object[0]);
              localObject1 = g();
              bool1 = bool2;
              if (localObject1 != null)
              {
                if (0L > 0L) {
                  continue;
                }
                ((b)localObject1).a(new y.3(this, (byte)2));
                bool1 = bool2;
              }
            }
            return bool1;
            bool1 = bool2;
            if (0L <= 0L) {
              continue;
            }
            ((b)localObject1).a(new y.4(this, (byte)2), 0L);
            bool1 = bool2;
            continue;
          }
        }
        boolean bool1 = false;
      }
      finally {}
    }
  }
  
  public final boolean a(long paramLong)
  {
    paramLong = 30000L;
    boolean bool2 = true;
    for (;;)
    {
      try
      {
        if (this.c != null)
        {
          if (60000L > 30000L) {
            paramLong = 60000L;
          }
          if (!this.e)
          {
            this.f = paramLong;
            this.e = true;
            this.c.a(19, this, 0L, this.f);
            long l1 = f();
            long l2 = new Date().getTime();
            paramLong = l1;
            if (l1 <= l2)
            {
              b(e());
              paramLong = f();
            }
            bool1 = bool2;
            if (paramLong > l2)
            {
              this.c.a(new y.1(this), paramLong - l2);
              com.tencent.feedback.common.e.b("rqdp{ next day %d}", new Object[] { Long.valueOf(paramLong - l2) });
              bool1 = bool2;
            }
            return bool1;
          }
          bool1 = bool2;
          if (paramLong == this.f) {
            continue;
          }
          this.f = paramLong;
          this.c.a(19, true);
          this.c.a(19, this, 0L, this.f);
          bool1 = bool2;
          continue;
        }
        boolean bool1 = false;
      }
      finally {}
    }
  }
  
  public final q[] a(String paramString)
  {
    try
    {
      paramString = a.a(this.b, paramString);
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final int b(String paramString)
  {
    try
    {
      int m = a.b(this.b, paramString);
      return m;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  protected final void b(long paramLong)
  {
    try
    {
      this.k = paramLong;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean b()
  {
    try
    {
      boolean bool = this.e;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean c()
  {
    try
    {
      boolean bool = b.b().a(new y.2(this));
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean d()
  {
    try
    {
      boolean bool = a(3);
      com.tencent.feedback.common.e.e("rqdp{ next day state record %b}", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final long e()
  {
    try
    {
      Calendar localCalendar = Calendar.getInstance();
      localCalendar.set(11, 0);
      localCalendar.set(12, 0);
      localCalendar.set(13, 0);
      localCalendar.add(6, 1);
      l = localCalendar.getTime().getTime();
      return l;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        localThrowable.printStackTrace();
        long l = new Date().getTime();
        l += 86400000L;
      }
    }
    finally {}
  }
  
  public final long f()
  {
    try
    {
      long l = this.k;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final b g()
  {
    try
    {
      b localb = this.c;
      return localb;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final com.tencent.feedback.upload.e h()
  {
    try
    {
      com.tencent.feedback.upload.e locale = this.d;
      return locale;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void run()
  {
    int m = k() + 1;
    b(m);
    if (m == 1)
    {
      this.h = com.tencent.feedback.common.a.b(this.b, this.i);
      j();
      return;
    }
    boolean bool = com.tencent.feedback.common.a.b(this.b, this.i);
    for (;;)
    {
      try
      {
        if (bool != this.h)
        {
          this.h = bool;
          if (bool)
          {
            m = 1;
            if (m == 0) {
              break;
            }
            com.tencent.feedback.common.e.b("process:%s is resumed!", new Object[] { this.i });
            i();
            return;
          }
        }
      }
      finally {}
      m = 0;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\proguard\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */