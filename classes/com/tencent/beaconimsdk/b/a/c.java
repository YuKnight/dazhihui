package com.tencent.beaconimsdk.b.a;

import com.tencent.beaconimsdk.d.a;
import com.tencent.beaconimsdk.d.b;

public final class c
  extends com.tencent.beaconimsdk.d.c
{
  private static byte[] j;
  public byte a = 0;
  public int b = 0;
  public byte[] c = null;
  public String d = "";
  public long e = 0L;
  public String f = "";
  private byte g = 0;
  private byte h = 0;
  private String i = "";
  
  public final void a(a parama)
  {
    this.a = parama.a(this.a, 0, true);
    this.b = parama.a(this.b, 1, true);
    if (j == null)
    {
      arrayOfByte = (byte[])new byte[1];
      j = arrayOfByte;
      ((byte[])arrayOfByte)[0] = 0;
    }
    byte[] arrayOfByte = j;
    this.c = ((byte[])parama.b(2, true));
    this.d = parama.a(3, true);
    this.g = parama.a(this.g, 4, true);
    this.h = parama.a(this.h, 5, true);
    this.e = parama.a(this.e, 6, true);
    this.f = parama.a(7, false);
    this.i = parama.a(8, false);
  }
  
  public final void a(b paramb)
  {
    paramb.a(this.a, 0);
    paramb.a(this.b, 1);
    paramb.a(this.c, 2);
    paramb.a(this.d, 3);
    paramb.a(this.g, 4);
    paramb.a(this.h, 5);
    paramb.a(this.e, 6);
    if (this.f != null) {
      paramb.a(this.f, 7);
    }
    if (this.i != null) {
      paramb.a(this.i, 8);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\b\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */