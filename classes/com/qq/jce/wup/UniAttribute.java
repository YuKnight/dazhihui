package com.qq.jce.wup;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class UniAttribute
  extends OldUniAttribute
{
  JceInputStream _is = new JceInputStream();
  protected HashMap<String, byte[]> _newData = null;
  private HashMap<String, Object> cachedData = new HashMap();
  
  private Object decodeData(byte[] paramArrayOfByte, Object paramObject)
  {
    this._is.warp(paramArrayOfByte);
    this._is.setServerEncoding(this.encodeName);
    return this._is.read(paramObject, 0, true);
  }
  
  private void saveDataCache(String paramString, Object paramObject)
  {
    this.cachedData.put(paramString, paramObject);
  }
  
  public void clearCacheData()
  {
    this.cachedData.clear();
  }
  
  public boolean containsKey(String paramString)
  {
    if (this._newData != null) {
      return this._newData.containsKey(paramString);
    }
    return this._data.containsKey(paramString);
  }
  
  public void decode(byte[] paramArrayOfByte)
  {
    try
    {
      super.decode(paramArrayOfByte);
      return;
    }
    catch (Exception localException)
    {
      this._is.warp(paramArrayOfByte);
      this._is.setServerEncoding(this.encodeName);
      paramArrayOfByte = new HashMap(1);
      paramArrayOfByte.put("", new byte[0]);
      this._newData = this._is.readMap(paramArrayOfByte, 0, false);
    }
  }
  
  public void decodeVersion2(byte[] paramArrayOfByte)
  {
    super.decode(paramArrayOfByte);
  }
  
  public void decodeVersion3(byte[] paramArrayOfByte)
  {
    this._is.warp(paramArrayOfByte);
    this._is.setServerEncoding(this.encodeName);
    paramArrayOfByte = new HashMap(1);
    paramArrayOfByte.put("", new byte[0]);
    this._newData = this._is.readMap(paramArrayOfByte, 0, false);
  }
  
  public byte[] encode()
  {
    if (this._newData != null)
    {
      JceOutputStream localJceOutputStream = new JceOutputStream(0);
      localJceOutputStream.setServerEncoding(this.encodeName);
      localJceOutputStream.write(this._newData, 0);
      return JceUtil.getJceBufArray(localJceOutputStream.getByteBuffer());
    }
    return super.encode();
  }
  
  public <T> T get(String paramString)
  {
    if (this._newData != null) {
      throw new RuntimeException("data is encoded by new version, please use getByClass(String name, T proxy)");
    }
    return (T)super.get(paramString);
  }
  
  public <T> T get(String paramString, Object paramObject)
  {
    if (this._newData != null) {
      throw new RuntimeException("data is encoded by new version, please use get(String name, T proxy, Object defaultValue)");
    }
    return (T)super.get(paramString, paramObject);
  }
  
  public <T> T get(String paramString, T paramT, Object paramObject)
  {
    if (!this._newData.containsKey(paramString)) {
      return (T)paramObject;
    }
    return (T)getByClass(paramString, paramT);
  }
  
  public <T> T getByClass(String paramString, T paramT)
  {
    Object localObject = null;
    if (this._newData != null) {
      if (this._newData.containsKey(paramString)) {}
    }
    while (!this._data.containsKey(paramString)) {
      for (;;)
      {
        return (T)localObject;
        if (this.cachedData.containsKey(paramString)) {
          return (T)this.cachedData.get(paramString);
        }
        localObject = (byte[])this._newData.get(paramString);
        try
        {
          paramT = decodeData((byte[])localObject, paramT);
          localObject = paramT;
          if (paramT != null)
          {
            saveDataCache(paramString, paramT);
            return paramT;
          }
        }
        catch (Exception paramString)
        {
          throw new ObjectCreateException(paramString);
        }
      }
    }
    if (this.cachedData.containsKey(paramString)) {
      return (T)this.cachedData.get(paramString);
    }
    localObject = ((HashMap)this._data.get(paramString)).entrySet().iterator();
    if (((Iterator)localObject).hasNext())
    {
      localObject = (Map.Entry)((Iterator)localObject).next();
      String str = (String)((Map.Entry)localObject).getKey();
    }
    for (localObject = (byte[])((Map.Entry)localObject).getValue();; localObject = new byte[0]) {
      try
      {
        this._is.warp((byte[])localObject);
        this._is.setServerEncoding(this.encodeName);
        paramT = this._is.read(paramT, 0, true);
        saveDataCache(paramString, paramT);
        return paramT;
      }
      catch (Exception paramString)
      {
        throw new ObjectCreateException(paramString);
      }
    }
  }
  
  public <T> T getByClass(String paramString, T paramT1, T paramT2)
  {
    if (this._newData != null) {
      if (this._newData.containsKey(paramString)) {}
    }
    while (!this._data.containsKey(paramString)) {
      for (;;)
      {
        return paramT2;
        if (this.cachedData.containsKey(paramString)) {
          return (T)this.cachedData.get(paramString);
        }
        paramT2 = (byte[])this._newData.get(paramString);
        try
        {
          paramT1 = decodeData(paramT2, paramT1);
          paramT2 = paramT1;
          if (paramT1 != null)
          {
            saveDataCache(paramString, paramT1);
            return paramT1;
          }
        }
        catch (Exception paramString)
        {
          throw new ObjectCreateException(paramString);
        }
      }
    }
    if (this.cachedData.containsKey(paramString)) {
      return (T)this.cachedData.get(paramString);
    }
    paramT2 = ((HashMap)this._data.get(paramString)).entrySet().iterator();
    if (paramT2.hasNext())
    {
      paramT2 = (Map.Entry)paramT2.next();
      String str = (String)paramT2.getKey();
    }
    for (paramT2 = (byte[])paramT2.getValue();; paramT2 = new byte[0]) {
      try
      {
        this._is.warp(paramT2);
        this._is.setServerEncoding(this.encodeName);
        paramT1 = this._is.read(paramT1, 0, true);
        saveDataCache(paramString, paramT1);
        return paramT1;
      }
      catch (Exception paramString)
      {
        throw new ObjectCreateException(paramString);
      }
    }
  }
  
  public <T> T getJceStruct(String paramString)
  {
    if (this._newData != null) {
      throw new RuntimeException("data is encoded by new version, please use getJceStruct(String name,T proxy)");
    }
    return (T)super.getJceStruct(paramString);
  }
  
  public <T> T getJceStruct(String paramString, T paramT)
  {
    if (!this._newData.containsKey(paramString)) {
      paramT = null;
    }
    for (;;)
    {
      return paramT;
      if (this.cachedData.containsKey(paramString)) {
        return (T)this.cachedData.get(paramString);
      }
      Object localObject = (byte[])this._newData.get(paramString);
      try
      {
        localObject = decodeData((byte[])localObject, paramT);
        paramT = (T)localObject;
        if (localObject == null) {
          continue;
        }
        saveDataCache(paramString, localObject);
        return (T)localObject;
      }
      catch (Exception paramString)
      {
        throw new ObjectCreateException(paramString);
      }
    }
  }
  
  public Set<String> getKeySet()
  {
    if (this._newData != null) {
      return Collections.unmodifiableSet(this._newData.keySet());
    }
    return Collections.unmodifiableSet(this._data.keySet());
  }
  
  public boolean isEmpty()
  {
    if (this._newData != null) {
      return this._newData.isEmpty();
    }
    return this._data.isEmpty();
  }
  
  public <T> void put(String paramString, T paramT)
  {
    if (this._newData != null)
    {
      if (paramString == null) {
        throw new IllegalArgumentException("put key can not is null");
      }
      if (paramT == null) {
        throw new IllegalArgumentException("put value can not is null");
      }
      if ((paramT instanceof Set)) {
        throw new IllegalArgumentException("can not support Set");
      }
      JceOutputStream localJceOutputStream = new JceOutputStream();
      localJceOutputStream.setServerEncoding(this.encodeName);
      localJceOutputStream.write(paramT, 0);
      paramT = JceUtil.getJceBufArray(localJceOutputStream.getByteBuffer());
      this._newData.put(paramString, paramT);
      return;
    }
    super.put(paramString, paramT);
  }
  
  public <T> T remove(String paramString)
  {
    if (this._newData != null)
    {
      if (!this._newData.containsKey(paramString)) {
        return null;
      }
      this._newData.remove(paramString);
      return null;
    }
    return (T)super.remove(paramString);
  }
  
  public <T> T remove(String paramString, T paramT)
  {
    if (!this._newData.containsKey(paramString)) {
      return null;
    }
    if (paramT != null) {
      return (T)decodeData((byte[])this._newData.remove(paramString), paramT);
    }
    this._newData.remove(paramString);
    return null;
  }
  
  public int size()
  {
    if (this._newData != null) {
      return this._newData.size();
    }
    return this._data.size();
  }
  
  public void useVersion3()
  {
    this._newData = new HashMap();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\qq\jce\wup\UniAttribute.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */