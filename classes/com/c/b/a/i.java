package com.c.b.a;

import java.lang.reflect.Array;

public final class i
  extends g
{
  private a a;
  
  public i(com.c.b.g paramg)
  {
    super(paramg);
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < paramInt2) {
      return paramInt2;
    }
    if (paramInt1 > paramInt3) {
      return paramInt3;
    }
    return paramInt1;
  }
  
  private static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, a parama)
  {
    int i = paramInt2 * paramInt4 + paramInt1;
    int j = 0;
    while (j < 8)
    {
      int k = 0;
      while (k < 8)
      {
        if ((paramArrayOfByte[(i + k)] & 0xFF) <= paramInt3) {
          parama.b(paramInt1 + k, paramInt2 + j);
        }
        k += 1;
      }
      j += 1;
      i += paramInt4;
    }
  }
  
  private static void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[][] paramArrayOfInt, a parama)
  {
    int i = 0;
    int j;
    int k;
    if (i < paramInt2)
    {
      j = i << 3;
      k = paramInt4 - 8;
      if (j <= k) {
        break label215;
      }
      j = k;
    }
    label36:
    label212:
    label215:
    for (;;)
    {
      k = 0;
      int m;
      int n;
      if (k < paramInt1)
      {
        m = k << 3;
        n = paramInt3 - 8;
        if (m <= n) {
          break label212;
        }
        m = n;
      }
      for (;;)
      {
        int i2 = a(k, 2, paramInt1 - 3);
        int i3 = a(i, 2, paramInt2 - 3);
        int i1 = 0;
        n = -2;
        while (n <= 2)
        {
          int[] arrayOfInt = paramArrayOfInt[(i3 + n)];
          int i4 = arrayOfInt[(i2 - 2)];
          int i5 = arrayOfInt[(i2 - 1)];
          int i6 = arrayOfInt[i2];
          int i7 = arrayOfInt[(i2 + 1)];
          i1 += arrayOfInt[(i2 + 2)] + (i4 + i5 + i6 + i7);
          n += 1;
        }
        a(paramArrayOfByte, m, j, i1 / 25, paramInt3, parama);
        k += 1;
        break label36;
        i += 1;
        break;
        return;
      }
    }
  }
  
  private static int[][] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int[][] arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, new int[] { paramInt2, paramInt1 });
    int i2 = 0;
    int i3;
    int i;
    if (i2 < paramInt2)
    {
      i3 = i2 << 3;
      i = paramInt4 - 8;
      if (i3 <= i) {
        break label435;
      }
      i3 = i;
    }
    label58:
    label114:
    label124:
    label423:
    label429:
    label432:
    label435:
    for (;;)
    {
      int i4 = 0;
      int j;
      if (i4 < paramInt1)
      {
        i = i4 << 3;
        j = paramInt3 - 8;
        if (i <= j) {
          break label432;
        }
        i = j;
      }
      for (;;)
      {
        int i1 = 0;
        int k = 255;
        j = 0;
        int m = 0;
        int n = i3 * paramInt3 + i;
        i = i1;
        int i5;
        if (m < 8)
        {
          i1 = 0;
          if (i1 < 8)
          {
            i5 = paramArrayOfByte[(n + i1)] & 0xFF;
            if (i5 >= k) {
              break label429;
            }
            k = i5;
          }
        }
        for (;;)
        {
          if (i5 > j) {
            j = i5;
          }
          for (;;)
          {
            i1 += 1;
            i += i5;
            break label124;
            if (j - k > 24)
            {
              i1 = n + paramInt3;
              n = m + 1;
              m = i1;
              for (;;)
              {
                i6 = m;
                i5 = n;
                i1 = i;
                if (n >= 8) {
                  break;
                }
                i1 = 0;
                while (i1 < 8)
                {
                  i += (paramArrayOfByte[(m + i1)] & 0xFF);
                  i1 += 1;
                }
                n += 1;
                m += paramInt3;
              }
            }
            i1 = i;
            i5 = m;
            int i6 = n;
            n = i6 + paramInt3;
            i = i1;
            m = i5 + 1;
            break label114;
            i >>= 6;
            if (j - k <= 24)
            {
              i = k / 2;
              if ((i2 <= 0) || (i4 <= 0)) {
                break label423;
              }
              j = (arrayOfInt[(i2 - 1)][i4] + arrayOfInt[i2][(i4 - 1)] * 2 + arrayOfInt[(i2 - 1)][(i4 - 1)]) / 4;
              if (k >= j) {
                break label423;
              }
              i = j;
            }
            for (;;)
            {
              arrayOfInt[i2][i4] = i;
              i4 += 1;
              break label58;
              i2 += 1;
              break;
              return arrayOfInt;
            }
          }
        }
      }
    }
  }
  
  public a b()
  {
    if (this.a != null) {
      return this.a;
    }
    Object localObject = a();
    int m = ((com.c.b.g)localObject).c();
    int n = ((com.c.b.g)localObject).d();
    a locala;
    if ((m >= 40) && (n >= 40))
    {
      localObject = ((com.c.b.g)localObject).a();
      int j = m >> 3;
      int i = j;
      if ((m & 0x7) != 0) {
        i = j + 1;
      }
      int k = n >> 3;
      j = k;
      if ((n & 0x7) != 0) {
        j = k + 1;
      }
      int[][] arrayOfInt = a((byte[])localObject, i, j, m, n);
      locala = new a(m, n);
      a((byte[])localObject, i, j, m, n, arrayOfInt, locala);
    }
    for (this.a = locala;; this.a = super.b()) {
      return this.a;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */