package com.tencent.beacon.c.e;

import com.tencent.beacon.f.a;
import java.util.ArrayList;

public final class e
  extends com.tencent.beacon.f.c
{
  private static ArrayList<c> d;
  private static ArrayList<b> e;
  private static ArrayList<f> f;
  public ArrayList<c> a = null;
  public ArrayList<b> b = null;
  public ArrayList<f> c = null;
  
  public final void a(a parama)
  {
    Object localObject;
    if (d == null)
    {
      d = new ArrayList();
      localObject = new c();
      d.add(localObject);
    }
    this.a = ((ArrayList)parama.a(d, 0, true));
    if (e == null)
    {
      e = new ArrayList();
      localObject = new b();
      e.add(localObject);
    }
    this.b = ((ArrayList)parama.a(e, 1, true));
    if (f == null)
    {
      f = new ArrayList();
      localObject = new f();
      f.add(localObject);
    }
    this.c = ((ArrayList)parama.a(f, 2, false));
  }
  
  public final void a(com.tencent.beacon.f.b paramb)
  {
    paramb.a(this.a, 0);
    paramb.a(this.b, 1);
    if (this.c != null) {
      paramb.a(this.c, 2);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\c\e\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */