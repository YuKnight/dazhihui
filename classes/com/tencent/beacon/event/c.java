package com.tencent.beacon.event;

import android.content.Context;
import com.tencent.beacon.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c
  extends com.tencent.beacon.upload.a
{
  private Context f = null;
  private Long[] g = null;
  private List<Long> h = null;
  private byte[] i = null;
  private boolean j = false;
  
  public c(Context paramContext)
  {
    super(paramContext, 1, 4);
    this.f = paramContext;
  }
  
  private com.tencent.beacon.c.a.a a(List<k> paramList)
  {
    int m = 1;
    if ((paramList == null) || (paramList.size() <= 0)) {
      return null;
    }
    Object localObject1 = new ArrayList(5);
    ArrayList localArrayList1 = new ArrayList(5);
    ArrayList localArrayList2 = new ArrayList(5);
    Object localObject2 = new ArrayList();
    int n = paramList.size();
    this.h = new ArrayList();
    int k = 0;
    k localk;
    Object localObject3;
    if (k < n) {
      try
      {
        localk = (k)paramList.get(k);
        localObject3 = localk.e();
        com.tencent.beacon.e.b.a(" bean.getTP: " + localk.b(), new Object[0]);
        if (localObject3 != null) {
          if ("IP".equals(localk.b()))
          {
            localObject3 = b.b(localk);
            if (localObject3 != null) {
              ((ArrayList)localObject1).add(localObject3);
            } else {
              this.h.add(Long.valueOf(localk.a()));
            }
          }
        }
      }
      catch (Throwable paramList)
      {
        paramList.printStackTrace();
        com.tencent.beacon.e.b.d(" CommonRecordUploadDatas.encode2MixPackage() error1", new Object[0]);
      }
    }
    for (;;)
    {
      try
      {
        paramList = new com.tencent.beacon.c.d.c();
        k = m;
        if (localArrayList2.size() > 0)
        {
          paramList.c = localArrayList2;
          k = 0;
        }
        if (localArrayList1.size() > 0)
        {
          paramList.b = localArrayList1;
          k = 0;
        }
        if (((ArrayList)localObject1).size() <= 0) {
          break label738;
        }
        paramList.a = ((ArrayList)localObject1);
        k = 0;
      }
      catch (Exception paramList)
      {
        label270:
        paramList.printStackTrace();
        com.tencent.beacon.e.b.d(" CommonRecordUploadDatas.encode2MixPackage() error2", new Object[0]);
        b();
        return null;
      }
      if (((ArrayList)localObject2).size() > 0)
      {
        localObject1 = new com.tencent.beacon.c.b.b();
        ((com.tencent.beacon.c.b.b)localObject1).a = ((ArrayList)localObject2);
        if ((paramList == null) && (localObject1 == null))
        {
          return null;
          if ("DN".equals(localk.b()))
          {
            localObject3 = b.c(localk);
            if (localObject3 != null) {
              localArrayList1.add(localObject3);
            } else {
              this.h.add(Long.valueOf(localk.a()));
            }
          }
          else if ("HO".equals(localk.b()))
          {
            localObject3 = b.d(localk);
            if (localObject3 != null) {
              localArrayList2.add(localObject3);
            } else {
              this.h.add(Long.valueOf(localk.a()));
            }
          }
          else if ("UA".equals(localk.b()))
          {
            com.tencent.beacon.e.b.f(" Pack2Upload eventName:}%s ", new Object[] { localk.d() });
            localObject3 = b.e(localk);
            if (localObject3 != null)
            {
              ((ArrayList)localObject2).add(localObject3);
            }
            else
            {
              this.h.add(Long.valueOf(localk.a()));
              break label729;
              if (this.h.size() > 0) {
                h.a(this.f, (Long[])this.h.toArray(new Long[this.h.size()]));
              }
              com.tencent.beacon.e.b.b(" up hmList:" + localArrayList2.size(), new Object[0]);
              com.tencent.beacon.e.b.b(" up dmList:" + localArrayList1.size(), new Object[0]);
              com.tencent.beacon.e.b.b(" up ipList:" + ((ArrayList)localObject1).size(), new Object[0]);
              com.tencent.beacon.e.b.b(" up erList:" + ((ArrayList)localObject2).size(), new Object[0]);
            }
          }
        }
        else
        {
          localObject2 = new HashMap();
          if (paramList != null) {
            ((Map)localObject2).put(Integer.valueOf(3), paramList.a());
          }
          if (localObject1 != null) {
            ((Map)localObject2).put(Integer.valueOf(1), ((com.tencent.beacon.c.b.b)localObject1).a());
          }
          paramList = new com.tencent.beacon.c.a.a();
          paramList.a = ((Map)localObject2);
          return paramList;
        }
      }
      else
      {
        localObject1 = null;
        continue;
      }
      label729:
      label738:
      do
      {
        break label270;
        k += 1;
        break;
      } while (k == 0);
      paramList = null;
    }
  }
  
  private boolean g()
  {
    try
    {
      boolean bool = this.j;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final com.tencent.beacon.c.a.b a()
  {
    Object localObject9 = null;
    int m = 0;
    Object localObject6;
    try
    {
      Object localObject1 = p.d();
      if ((localObject1 == null) || (!((p)localObject1).g()))
      {
        com.tencent.beacon.e.b.c(" imposiable! ua not ready!", new Object[0]);
        localObject1 = localObject9;
      }
      for (;;)
      {
        return (com.tencent.beacon.c.a.b)localObject1;
        localObject6 = ((p)localObject1).i();
        if (localObject6 == null)
        {
          com.tencent.beacon.e.b.c(" imposiable! ua S not ready!", new Object[0]);
          localObject1 = localObject9;
        }
        else
        {
          try
          {
            if (g())
            {
              localObject7 = com.tencent.beacon.a.a.a.a(this.f);
              if ((localObject7 != null) && (((List)localObject7).size() > 0))
              {
                localObject3 = (byte[])((List)localObject7).get(3);
                this.d = String.valueOf(((List)localObject7).get(1));
                this.e = ((Integer)((List)localObject7).get(4)).intValue();
                if (localObject3 != null)
                {
                  localObject3 = a(this.c, this.a, (byte[])localObject3);
                  continue;
                }
                n = ((g)localObject6).e();
                k = n;
                if (!com.tencent.beacon.e.c.a(this.f)) {
                  k = n / 2;
                }
                if (k >= 0)
                {
                  localObject6 = h.a(this.f, null, k);
                  if ((localObject6 == null) || (((List)localObject6).size() <= 0))
                  {
                    com.tencent.beacon.e.b.h(" no up datas", new Object[0]);
                    localObject3 = localObject9;
                  }
                }
              }
            }
          }
          catch (Throwable localThrowable)
          {
            localThrowable.printStackTrace();
            com.tencent.beacon.e.b.d(" get req datas error: %s", new Object[] { localThrowable.toString() });
            localObject4 = localObject9;
          }
        }
      }
    }
    finally {}
    for (;;)
    {
      Object localObject7;
      Object localObject3;
      int n;
      break;
      int k = ((List)localObject6).size();
      com.tencent.beacon.e.b.h(" size:%d", new Object[] { Integer.valueOf(k) });
      this.e = k;
      Object localObject8;
      try
      {
        localObject7 = a((List)localObject6);
        this.g = new Long[k];
        k = m;
        while (k < this.g.length)
        {
          this.g[k] = Long.valueOf(((k)((List)localObject6).get(k)).a());
          k += 1;
        }
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          b();
          localObject8 = null;
        }
        ((List)localObject6).clear();
        if (localObject8 == null) {
          break label451;
        }
      }
      Object localObject4 = ((com.tencent.beacon.c.a.a)localObject8).a();
      label451:
      for (;;)
      {
        this.i = new byte[localObject4.length];
        System.arraycopy(localObject4, 0, this.i, 0, localObject4.length);
        this.d = com.tencent.beacon.b.a.a(this.c, 4);
        com.tencent.beacon.e.b.a("comm rid:%s", new Object[] { this.d });
        try
        {
          localObject4 = a(this.c, this.a, (byte[])localObject4);
        }
        catch (Exception localException1)
        {
          for (;;)
          {
            b();
            localObject5 = null;
          }
        }
      }
      localObject6 = null;
      continue;
      Object localObject5 = null;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    try
    {
      this.j = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void b()
  {
    try
    {
      com.tencent.beacon.e.b.c(" encode failed, clear db data", new Object[0]);
      if ((this.g != null) && (this.g.length > 0))
      {
        int k = h.a(this.f, this.g);
        com.tencent.beacon.e.b.b(" remove num :" + k, new Object[0]);
        this.g = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final void b(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 24	com/tencent/beacon/event/c:g	[Ljava/lang/Long;
    //   8: ifnull +9 -> 17
    //   11: aload_0
    //   12: getfield 24	com/tencent/beacon/event/c:g	[Ljava/lang/Long;
    //   15: arraylength
    //   16: istore_3
    //   17: iload_3
    //   18: ifle +41 -> 59
    //   21: aload_0
    //   22: getfield 22	com/tencent/beacon/event/c:f	Landroid/content/Context;
    //   25: aload_0
    //   26: getfield 24	com/tencent/beacon/event/c:g	[Ljava/lang/Long;
    //   29: invokestatic 167	com/tencent/beacon/a/h:a	(Landroid/content/Context;[Ljava/lang/Long;)I
    //   32: istore 4
    //   34: new 63	java/lang/StringBuilder
    //   37: dup
    //   38: ldc_w 302
    //   41: invokespecial 68	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   44: iload 4
    //   46: invokevirtual 172	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   49: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   52: iconst_0
    //   53: anewarray 81	java/lang/Object
    //   56: invokestatic 174	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   59: aload_0
    //   60: aconst_null
    //   61: putfield 24	com/tencent/beacon/event/c:g	[Ljava/lang/Long;
    //   64: iload_1
    //   65: ifeq +30 -> 95
    //   68: aload_0
    //   69: invokespecial 230	com/tencent/beacon/event/c:g	()Z
    //   72: ifeq +23 -> 95
    //   75: aload_0
    //   76: getfield 22	com/tencent/beacon/event/c:f	Landroid/content/Context;
    //   79: aload_0
    //   80: getfield 242	com/tencent/beacon/event/c:d	Ljava/lang/String;
    //   83: invokestatic 305	com/tencent/beacon/a/a/a:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   86: pop
    //   87: aload_0
    //   88: aconst_null
    //   89: putfield 28	com/tencent/beacon/event/c:i	[B
    //   92: aload_0
    //   93: monitorexit
    //   94: return
    //   95: iload_1
    //   96: ifne -9 -> 87
    //   99: aload_0
    //   100: getfield 28	com/tencent/beacon/event/c:i	[B
    //   103: ifnull -16 -> 87
    //   106: ldc_w 307
    //   109: iconst_1
    //   110: anewarray 81	java/lang/Object
    //   113: dup
    //   114: iconst_0
    //   115: aload_0
    //   116: getfield 242	com/tencent/beacon/event/c:d	Ljava/lang/String;
    //   119: aastore
    //   120: invokestatic 86	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   123: aload_0
    //   124: getfield 22	com/tencent/beacon/event/c:f	Landroid/content/Context;
    //   127: aload_0
    //   128: getfield 28	com/tencent/beacon/event/c:i	[B
    //   131: aload_0
    //   132: getfield 242	com/tencent/beacon/event/c:d	Ljava/lang/String;
    //   135: iload_3
    //   136: invokestatic 310	com/tencent/beacon/a/a/a:a	(Landroid/content/Context;[BLjava/lang/String;I)Z
    //   139: pop
    //   140: goto -53 -> 87
    //   143: astore_2
    //   144: aload_0
    //   145: monitorexit
    //   146: aload_2
    //   147: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	this	c
    //   0	148	1	paramBoolean	boolean
    //   143	4	2	localObject	Object
    //   1	135	3	k	int
    //   32	13	4	m	int
    // Exception table:
    //   from	to	target	type
    //   4	17	143	finally
    //   21	59	143	finally
    //   59	64	143	finally
    //   68	87	143	finally
    //   87	92	143	finally
    //   99	140	143	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */