package com.tencent.beaconimsdk.a;

import android.util.SparseArray;
import com.tencent.beaconimsdk.c.a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class b$a
  extends b
{
  private ScheduledExecutorService b = null;
  private SparseArray<ScheduledFuture<?>> c = null;
  
  public final void a(int paramInt)
  {
    try
    {
      ScheduledFuture localScheduledFuture = (ScheduledFuture)this.c.get(paramInt);
      if ((localScheduledFuture != null) && (!localScheduledFuture.isCancelled()))
      {
        a.b("cancel a old future!", new Object[0]);
        localScheduledFuture.cancel(true);
      }
      this.c.remove(paramInt);
      return;
    }
    finally {}
  }
  
  public final void a(int paramInt, Runnable paramRunnable, long paramLong1, long paramLong2)
  {
    long l = 0L;
    if (paramRunnable == null) {}
    try
    {
      a.d("task runner should not be null", new Object[0]);
      return;
    }
    finally {}
    if (paramLong1 > 0L) {
      l = paramLong1;
    }
    if (a) {
      if (paramLong2 > 10000L) {
        break label128;
      }
    }
    for (;;)
    {
      a(paramInt);
      paramRunnable = this.b.scheduleAtFixedRate(paramRunnable, l, paramLong1, TimeUnit.MILLISECONDS);
      if (paramRunnable == null) {
        break;
      }
      a.b("add a new future! taskId: %d , periodTime: %d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong1) });
      this.c.put(paramInt, paramRunnable);
      break;
      paramLong2 = 10000L;
      break label128;
      paramLong1 = paramLong2;
      continue;
      label128:
      paramLong1 = paramLong2;
    }
  }
  
  public final void a(Runnable paramRunnable)
  {
    if (paramRunnable == null) {}
    for (;;)
    {
      try
      {
        a.d("task runner should not be null", new Object[0]);
        return;
      }
      finally {}
      this.b.execute(paramRunnable);
    }
  }
  
  public final void a(Runnable paramRunnable, long paramLong)
  {
    if (paramRunnable == null) {}
    try
    {
      a.d("task runner should not be null", new Object[0]);
      return;
    }
    finally {}
    if (paramLong > 0L) {}
    for (;;)
    {
      this.b.schedule(paramRunnable, paramLong, TimeUnit.MILLISECONDS);
      break;
      paramLong = 0L;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\a\b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */