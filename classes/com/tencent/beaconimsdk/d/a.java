package com.tencent.beaconimsdk.d;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  private ByteBuffer a;
  private String b = "GBK";
  
  public a() {}
  
  public a(byte[] paramArrayOfByte)
  {
    this.a = ByteBuffer.wrap(paramArrayOfByte);
  }
  
  public a(byte[] paramArrayOfByte, byte paramByte)
  {
    this.a = ByteBuffer.wrap(paramArrayOfByte);
    this.a.position(4);
  }
  
  private double a(double paramDouble, int paramInt, boolean paramBoolean)
  {
    if (a(paramInt))
    {
      locala = new a.a();
      a(locala, this.a);
      switch (locala.a)
      {
      default: 
        throw new RuntimeException("type mismatch.");
      case 12: 
        paramDouble = 0.0D;
      }
    }
    while (!paramBoolean)
    {
      a.a locala;
      return paramDouble;
      return this.a.getFloat();
      return this.a.getDouble();
    }
    throw new RuntimeException("require field not exist.");
  }
  
  private float a(float paramFloat, int paramInt, boolean paramBoolean)
  {
    if (a(paramInt))
    {
      locala = new a.a();
      a(locala, this.a);
      switch (locala.a)
      {
      default: 
        throw new RuntimeException("type mismatch.");
      case 12: 
        paramFloat = 0.0F;
      }
    }
    while (!paramBoolean)
    {
      a.a locala;
      return paramFloat;
      return this.a.getFloat();
    }
    throw new RuntimeException("require field not exist.");
  }
  
  private static int a(a.a parama, ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.get();
    parama.a = ((byte)(i & 0xF));
    parama.b = ((i & 0xF0) >> 4);
    if (parama.b == 15)
    {
      parama.b = (paramByteBuffer.get() & 0xFF);
      return 2;
    }
    return 1;
  }
  
  private c a(c paramc, int paramInt, boolean paramBoolean)
  {
    a.a locala = null;
    if (a(paramInt))
    {
      try
      {
        paramc = (c)paramc.getClass().newInstance();
        locala = new a.a();
        a(locala, this.a);
        if (locala.a != 10) {
          throw new RuntimeException("type mismatch.");
        }
      }
      catch (Exception paramc)
      {
        throw new RuntimeException(paramc.getMessage());
      }
      paramc.a(this);
      a();
    }
    do
    {
      return paramc;
      paramc = locala;
    } while (!paramBoolean);
    throw new RuntimeException("require field not exist.");
  }
  
  private <K, V> Map<K, V> a(Map<K, V> paramMap1, Map<K, V> paramMap2, int paramInt, boolean paramBoolean)
  {
    if ((paramMap2 == null) || (paramMap2.isEmpty())) {
      paramMap2 = new HashMap();
    }
    do
    {
      return paramMap2;
      paramMap2 = (Map.Entry)paramMap2.entrySet().iterator().next();
      Object localObject1 = paramMap2.getKey();
      Object localObject2 = paramMap2.getValue();
      if (a(paramInt))
      {
        paramMap2 = new a.a();
        a(paramMap2, this.a);
        switch (paramMap2.a)
        {
        default: 
          throw new RuntimeException("type mismatch.");
        }
        int i = a(0, 0, true);
        if (i < 0) {
          throw new RuntimeException("size invalid: " + i);
        }
        paramInt = 0;
        for (;;)
        {
          paramMap2 = paramMap1;
          if (paramInt >= i) {
            break;
          }
          paramMap1.put(a(localObject1, 0, true), a(localObject2, 1, true));
          paramInt += 1;
        }
      }
      paramMap2 = paramMap1;
    } while (!paramBoolean);
    throw new RuntimeException("require field not exist.");
  }
  
  private void a()
  {
    a.a locala = new a.a();
    do
    {
      a(locala, this.a);
      a(locala.a);
    } while (locala.a != 11);
  }
  
  private void a(byte paramByte)
  {
    byte b2 = 0;
    byte b1 = 0;
    a.a locala;
    switch (paramByte)
    {
    default: 
      throw new RuntimeException("invalid type.");
    case 0: 
      this.a.position(this.a.position() + 1);
    case 11: 
    case 12: 
      return;
    case 1: 
      this.a.position(this.a.position() + 2);
      return;
    case 2: 
      this.a.position(this.a.position() + 4);
      return;
    case 3: 
      this.a.position(this.a.position() + 8);
      return;
    case 4: 
      this.a.position(this.a.position() + 4);
      return;
    case 5: 
      this.a.position(this.a.position() + 8);
      return;
    case 6: 
      b1 = this.a.get();
      paramByte = b1;
      if (b1 < 0) {
        paramByte = b1 + 256;
      }
      this.a.position(paramByte + this.a.position());
      return;
    case 7: 
      paramByte = this.a.getInt();
      this.a.position(paramByte + this.a.position());
      return;
    case 8: 
      b2 = a(0, 0, true);
      paramByte = b1;
      while (paramByte < b2 << 1)
      {
        locala = new a.a();
        a(locala, this.a);
        a(locala.a);
        paramByte += 1;
      }
    case 9: 
      b1 = a(0, 0, true);
      paramByte = b2;
      while (paramByte < b1)
      {
        locala = new a.a();
        a(locala, this.a);
        a(locala.a);
        paramByte += 1;
      }
    case 13: 
      locala = new a.a();
      a(locala, this.a);
      if (locala.a != 0) {
        throw new RuntimeException("skipField with invalid type, type value: " + paramByte + ", " + locala.a);
      }
      paramByte = a(0, 0, true);
      this.a.position(paramByte + this.a.position());
      return;
    }
    a();
  }
  
  private boolean a(int paramInt)
  {
    try
    {
      a.a locala = new a.a();
      for (;;)
      {
        int i = a(locala, this.a.duplicate());
        if (locala.a == 11) {
          return false;
        }
        if (paramInt <= locala.b)
        {
          if (paramInt != locala.b) {
            break;
          }
          return true;
        }
        this.a.position(i + this.a.position());
        a(locala.a);
      }
      return false;
    }
    catch (BufferUnderflowException localBufferUnderflowException)
    {
      return false;
    }
    catch (RuntimeException localRuntimeException) {}
  }
  
  private <T> T[] b(T paramT, int paramInt, boolean paramBoolean)
  {
    if (a(paramInt))
    {
      localObject = new a.a();
      a((a.a)localObject, this.a);
      switch (((a.a)localObject).a)
      {
      default: 
        throw new RuntimeException("type mismatch.");
      }
      int i = a(0, 0, true);
      if (i < 0) {
        throw new RuntimeException("size invalid: " + i);
      }
      Object[] arrayOfObject = (Object[])Array.newInstance(paramT.getClass(), i);
      paramInt = 0;
      for (;;)
      {
        localObject = arrayOfObject;
        if (paramInt >= i) {
          break;
        }
        arrayOfObject[paramInt] = a(paramT, 0, true);
        paramInt += 1;
      }
    }
    if (paramBoolean) {
      throw new RuntimeException("require field not exist.");
    }
    Object localObject = null;
    return (T[])localObject;
  }
  
  private boolean[] c(int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    if (a(paramInt))
    {
      localObject = new a.a();
      a((a.a)localObject, this.a);
      switch (((a.a)localObject).a)
      {
      default: 
        throw new RuntimeException("type mismatch.");
      }
      i = a(0, 0, true);
      if (i < 0) {
        throw new RuntimeException("size invalid: " + i);
      }
      localObject = new boolean[i];
      paramInt = 0;
      if (paramInt < i)
      {
        if (a((byte)0, 0, true) != 0) {}
        for (paramBoolean = true;; paramBoolean = false)
        {
          localObject[paramInt] = paramBoolean;
          paramInt += 1;
          break;
        }
      }
    }
    while (!paramBoolean)
    {
      int i;
      return (boolean[])localObject;
    }
    throw new RuntimeException("require field not exist.");
  }
  
  private short[] d(int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    if (a(paramInt))
    {
      localObject = new a.a();
      a((a.a)localObject, this.a);
      switch (((a.a)localObject).a)
      {
      default: 
        throw new RuntimeException("type mismatch.");
      }
      int i = a(0, 0, true);
      if (i < 0) {
        throw new RuntimeException("size invalid: " + i);
      }
      short[] arrayOfShort = new short[i];
      paramInt = 0;
      for (;;)
      {
        localObject = arrayOfShort;
        if (paramInt >= i) {
          break;
        }
        arrayOfShort[paramInt] = a(arrayOfShort[0], 0, true);
        paramInt += 1;
      }
    }
    if (paramBoolean) {
      throw new RuntimeException("require field not exist.");
    }
    return (short[])localObject;
  }
  
  private int[] e(int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    if (a(paramInt))
    {
      localObject = new a.a();
      a((a.a)localObject, this.a);
      switch (((a.a)localObject).a)
      {
      default: 
        throw new RuntimeException("type mismatch.");
      }
      int i = a(0, 0, true);
      if (i < 0) {
        throw new RuntimeException("size invalid: " + i);
      }
      int[] arrayOfInt = new int[i];
      paramInt = 0;
      for (;;)
      {
        localObject = arrayOfInt;
        if (paramInt >= i) {
          break;
        }
        arrayOfInt[paramInt] = a(arrayOfInt[0], 0, true);
        paramInt += 1;
      }
    }
    if (paramBoolean) {
      throw new RuntimeException("require field not exist.");
    }
    return (int[])localObject;
  }
  
  private long[] f(int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    if (a(paramInt))
    {
      localObject = new a.a();
      a((a.a)localObject, this.a);
      switch (((a.a)localObject).a)
      {
      default: 
        throw new RuntimeException("type mismatch.");
      }
      int i = a(0, 0, true);
      if (i < 0) {
        throw new RuntimeException("size invalid: " + i);
      }
      long[] arrayOfLong = new long[i];
      paramInt = 0;
      for (;;)
      {
        localObject = arrayOfLong;
        if (paramInt >= i) {
          break;
        }
        arrayOfLong[paramInt] = a(arrayOfLong[0], 0, true);
        paramInt += 1;
      }
    }
    if (paramBoolean) {
      throw new RuntimeException("require field not exist.");
    }
    return (long[])localObject;
  }
  
  private float[] g(int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    if (a(paramInt))
    {
      localObject = new a.a();
      a((a.a)localObject, this.a);
      switch (((a.a)localObject).a)
      {
      default: 
        throw new RuntimeException("type mismatch.");
      }
      int i = a(0, 0, true);
      if (i < 0) {
        throw new RuntimeException("size invalid: " + i);
      }
      float[] arrayOfFloat = new float[i];
      paramInt = 0;
      for (;;)
      {
        localObject = arrayOfFloat;
        if (paramInt >= i) {
          break;
        }
        arrayOfFloat[paramInt] = a(arrayOfFloat[0], 0, true);
        paramInt += 1;
      }
    }
    if (paramBoolean) {
      throw new RuntimeException("require field not exist.");
    }
    return (float[])localObject;
  }
  
  private double[] h(int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    if (a(paramInt))
    {
      localObject = new a.a();
      a((a.a)localObject, this.a);
      switch (((a.a)localObject).a)
      {
      default: 
        throw new RuntimeException("type mismatch.");
      }
      int i = a(0, 0, true);
      if (i < 0) {
        throw new RuntimeException("size invalid: " + i);
      }
      double[] arrayOfDouble = new double[i];
      paramInt = 0;
      for (;;)
      {
        localObject = arrayOfDouble;
        if (paramInt >= i) {
          break;
        }
        arrayOfDouble[paramInt] = a(arrayOfDouble[0], 0, true);
        paramInt += 1;
      }
    }
    if (paramBoolean) {
      throw new RuntimeException("require field not exist.");
    }
    return (double[])localObject;
  }
  
  public final byte a(byte paramByte, int paramInt, boolean paramBoolean)
  {
    if (a(paramInt))
    {
      locala = new a.a();
      a(locala, this.a);
      switch (locala.a)
      {
      default: 
        throw new RuntimeException("type mismatch.");
      case 12: 
        paramByte = 0;
      }
    }
    while (!paramBoolean)
    {
      a.a locala;
      return paramByte;
      return this.a.get();
    }
    throw new RuntimeException("require field not exist.");
  }
  
  public final int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (a(paramInt2))
    {
      locala = new a.a();
      a(locala, this.a);
      switch (locala.a)
      {
      default: 
        throw new RuntimeException("type mismatch.");
      case 12: 
        paramInt1 = 0;
      }
    }
    while (!paramBoolean)
    {
      a.a locala;
      return paramInt1;
      return this.a.get();
      return this.a.getShort();
      return this.a.getInt();
    }
    throw new RuntimeException("require field not exist.");
  }
  
  public final int a(String paramString)
  {
    this.b = paramString;
    return 0;
  }
  
  public final long a(long paramLong, int paramInt, boolean paramBoolean)
  {
    if (a(paramInt))
    {
      locala = new a.a();
      a(locala, this.a);
      switch (locala.a)
      {
      default: 
        throw new RuntimeException("type mismatch.");
      case 12: 
        paramLong = 0L;
      }
    }
    while (!paramBoolean)
    {
      a.a locala;
      return paramLong;
      return this.a.get();
      return this.a.getShort();
      return this.a.getInt();
      return this.a.getLong();
    }
    throw new RuntimeException("require field not exist.");
  }
  
  public final <T> Object a(T paramT, int paramInt, boolean paramBoolean)
  {
    int i = 0;
    boolean bool = false;
    if ((paramT instanceof Byte)) {
      return Byte.valueOf(a((byte)0, paramInt, paramBoolean));
    }
    if ((paramT instanceof Boolean))
    {
      if (a((byte)0, paramInt, paramBoolean) != 0) {
        bool = true;
      }
      return Boolean.valueOf(bool);
    }
    if ((paramT instanceof Short)) {
      return Short.valueOf(a((short)0, paramInt, paramBoolean));
    }
    if ((paramT instanceof Integer)) {
      return Integer.valueOf(a(0, paramInt, paramBoolean));
    }
    if ((paramT instanceof Long)) {
      return Long.valueOf(a(0L, paramInt, paramBoolean));
    }
    if ((paramT instanceof Float)) {
      return Float.valueOf(a(0.0F, paramInt, paramBoolean));
    }
    if ((paramT instanceof Double)) {
      return Double.valueOf(a(0.0D, paramInt, paramBoolean));
    }
    if ((paramT instanceof String)) {
      return a(paramInt, paramBoolean);
    }
    if ((paramT instanceof Map))
    {
      paramT = (Map)paramT;
      return (HashMap)a(new HashMap(), paramT, paramInt, paramBoolean);
    }
    if ((paramT instanceof List))
    {
      paramT = (List)paramT;
      if ((paramT == null) || (paramT.isEmpty())) {
        return new ArrayList();
      }
      paramT = b(paramT.get(0), paramInt, paramBoolean);
      if (paramT == null) {
        return null;
      }
      ArrayList localArrayList = new ArrayList();
      paramInt = i;
      while (paramInt < paramT.length)
      {
        localArrayList.add(paramT[paramInt]);
        paramInt += 1;
      }
      return localArrayList;
    }
    if ((paramT instanceof c)) {
      return a((c)paramT, paramInt, paramBoolean);
    }
    if (paramT.getClass().isArray())
    {
      if (((paramT instanceof byte[])) || ((paramT instanceof Byte[]))) {
        return b(paramInt, paramBoolean);
      }
      if ((paramT instanceof boolean[])) {
        return c(paramInt, paramBoolean);
      }
      if ((paramT instanceof short[])) {
        return d(paramInt, paramBoolean);
      }
      if ((paramT instanceof int[])) {
        return e(paramInt, paramBoolean);
      }
      if ((paramT instanceof long[])) {
        return f(paramInt, paramBoolean);
      }
      if ((paramT instanceof float[])) {
        return g(paramInt, paramBoolean);
      }
      if ((paramT instanceof double[])) {
        return h(paramInt, paramBoolean);
      }
      paramT = (Object[])paramT;
      if ((paramT == null) || (paramT.length == 0)) {
        throw new RuntimeException("unable to get type of key and value.");
      }
      return b(paramT[0], paramInt, paramBoolean);
    }
    throw new RuntimeException("read object error: unsupport type.");
  }
  
  public final String a(int paramInt, boolean paramBoolean)
  {
    Object localObject1 = null;
    if (a(paramInt))
    {
      localObject1 = new a.a();
      a((a.a)localObject1, this.a);
      switch (((a.a)localObject1).a)
      {
      default: 
        throw new RuntimeException("type mismatch.");
      case 6: 
        i = this.a.get();
        paramInt = i;
        if (i < 0) {
          paramInt = i + 256;
        }
        localObject2 = new byte[paramInt];
        this.a.get((byte[])localObject2);
      }
    }
    while (!paramBoolean)
    {
      Object localObject2;
      try
      {
        int i;
        localObject1 = new String((byte[])localObject2, this.b);
        return (String)localObject1;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        return new String((byte[])localObject2);
      }
      paramInt = this.a.getInt();
      if ((paramInt > 104857600) || (paramInt < 0) || (paramInt > this.a.capacity())) {
        throw new RuntimeException("String too long: " + paramInt);
      }
      byte[] arrayOfByte = new byte[paramInt];
      this.a.get(arrayOfByte);
      try
      {
        localObject2 = new String(arrayOfByte, this.b);
        return (String)localObject2;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException2)
      {
        return new String(arrayOfByte);
      }
    }
    throw new RuntimeException("require field not exist.");
  }
  
  public final <K, V> HashMap<K, V> a(Map<K, V> paramMap)
  {
    return (HashMap)a(new HashMap(), paramMap, 0, false);
  }
  
  public final short a(short paramShort, int paramInt, boolean paramBoolean)
  {
    if (a(paramInt))
    {
      locala = new a.a();
      a(locala, this.a);
      switch (locala.a)
      {
      default: 
        throw new RuntimeException("type mismatch.");
      case 12: 
        paramShort = 0;
      }
    }
    while (!paramBoolean)
    {
      a.a locala;
      return paramShort;
      return (short)this.a.get();
      return this.a.getShort();
    }
    throw new RuntimeException("require field not exist.");
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    this.a = ByteBuffer.wrap(paramArrayOfByte);
  }
  
  public final byte[] b(int paramInt, boolean paramBoolean)
  {
    Object localObject1 = null;
    if (a(paramInt))
    {
      localObject1 = new a.a();
      a((a.a)localObject1, this.a);
      switch (((a.a)localObject1).a)
      {
      default: 
        throw new RuntimeException("type mismatch.");
      case 13: 
        localObject2 = new a.a();
        a((a.a)localObject2, this.a);
        if (((a.a)localObject2).a != 0) {
          throw new RuntimeException("type mismatch, tag: " + paramInt + ", type: " + ((a.a)localObject1).a + ", " + ((a.a)localObject2).a);
        }
        i = a(0, 0, true);
        if ((i < 0) || (i > this.a.capacity())) {
          throw new RuntimeException("invalid size, tag: " + paramInt + ", type: " + ((a.a)localObject1).a + ", " + ((a.a)localObject2).a + ", size: " + i);
        }
        localObject1 = new byte[i];
        this.a.get((byte[])localObject1);
      }
    }
    while (!paramBoolean)
    {
      return (byte[])localObject1;
      int i = a(0, 0, true);
      if ((i < 0) || (i > this.a.capacity())) {
        throw new RuntimeException("size invalid: " + i);
      }
      Object localObject2 = new byte[i];
      paramInt = 0;
      for (;;)
      {
        localObject1 = localObject2;
        if (paramInt >= i) {
          break;
        }
        localObject2[paramInt] = a(localObject2[0], 0, true);
        paramInt += 1;
      }
    }
    throw new RuntimeException("require field not exist.");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */