package com.android.volley.toolbox;

import com.android.volley.Request;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class RequestFuture<T>
  implements Response.ErrorListener, Response.Listener<T>, Future<T>
{
  private VolleyError mException;
  private Request<?> mRequest;
  private T mResult;
  private boolean mResultReceived = false;
  
  private T doGet(Long paramLong)
  {
    try
    {
      if (this.mException != null) {
        throw new ExecutionException(this.mException);
      }
    }
    finally {}
    if (this.mResultReceived) {}
    for (paramLong = this.mResult;; paramLong = this.mResult)
    {
      return paramLong;
      if (paramLong == null) {
        wait(0L);
      }
      while (this.mException != null)
      {
        throw new ExecutionException(this.mException);
        if (paramLong.longValue() > 0L) {
          wait(paramLong.longValue());
        }
      }
      if (!this.mResultReceived) {
        throw new TimeoutException();
      }
    }
  }
  
  public static <E> RequestFuture<E> newFuture()
  {
    return new RequestFuture();
  }
  
  /* Error */
  public boolean cancel(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 62	com/android/volley/toolbox/RequestFuture:mRequest	Lcom/android/volley/Request;
    //   8: astore_2
    //   9: aload_2
    //   10: ifnonnull +7 -> 17
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: aload_0
    //   18: invokevirtual 66	com/android/volley/toolbox/RequestFuture:isDone	()Z
    //   21: ifne -8 -> 13
    //   24: aload_0
    //   25: getfield 62	com/android/volley/toolbox/RequestFuture:mRequest	Lcom/android/volley/Request;
    //   28: invokevirtual 70	com/android/volley/Request:cancel	()V
    //   31: iconst_1
    //   32: istore_1
    //   33: goto -20 -> 13
    //   36: astore_2
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_2
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	RequestFuture
    //   0	41	1	paramBoolean	boolean
    //   8	2	2	localRequest	Request
    //   36	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	9	36	finally
    //   17	31	36	finally
  }
  
  public T get()
  {
    try
    {
      Object localObject = doGet(null);
      return (T)localObject;
    }
    catch (TimeoutException localTimeoutException)
    {
      throw new AssertionError(localTimeoutException);
    }
  }
  
  public T get(long paramLong, TimeUnit paramTimeUnit)
  {
    return (T)doGet(Long.valueOf(TimeUnit.MILLISECONDS.convert(paramLong, paramTimeUnit)));
  }
  
  public boolean isCancelled()
  {
    if (this.mRequest == null) {
      return false;
    }
    return this.mRequest.isCanceled();
  }
  
  /* Error */
  public boolean isDone()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 27	com/android/volley/toolbox/RequestFuture:mResultReceived	Z
    //   6: ifne +25 -> 31
    //   9: aload_0
    //   10: getfield 32	com/android/volley/toolbox/RequestFuture:mException	Lcom/android/volley/VolleyError;
    //   13: ifnonnull +18 -> 31
    //   16: aload_0
    //   17: invokevirtual 102	com/android/volley/toolbox/RequestFuture:isCancelled	()Z
    //   20: istore_2
    //   21: iload_2
    //   22: ifne +9 -> 31
    //   25: iconst_0
    //   26: istore_2
    //   27: aload_0
    //   28: monitorexit
    //   29: iload_2
    //   30: ireturn
    //   31: iconst_1
    //   32: istore_2
    //   33: goto -6 -> 27
    //   36: astore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	RequestFuture
    //   36	4	1	localObject	Object
    //   20	13	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	21	36	finally
  }
  
  public void onErrorResponse(VolleyError paramVolleyError)
  {
    try
    {
      this.mException = paramVolleyError;
      notifyAll();
      return;
    }
    finally
    {
      paramVolleyError = finally;
      throw paramVolleyError;
    }
  }
  
  public void onResponse(T paramT)
  {
    try
    {
      this.mResultReceived = true;
      this.mResult = paramT;
      notifyAll();
      return;
    }
    finally
    {
      paramT = finally;
      throw paramT;
    }
  }
  
  public void setRequest(Request<?> paramRequest)
  {
    this.mRequest = paramRequest;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\toolbox\RequestFuture.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */