package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.AbstractOutputStream;
import com.squareup.okhttp.internal.Util;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.ProtocolException;

final class RetryableOutputStream
  extends AbstractOutputStream
{
  private final ByteArrayOutputStream content;
  private final int limit;
  
  public RetryableOutputStream()
  {
    this.limit = -1;
    this.content = new ByteArrayOutputStream();
  }
  
  public RetryableOutputStream(int paramInt)
  {
    this.limit = paramInt;
    this.content = new ByteArrayOutputStream(paramInt);
  }
  
  public void close()
  {
    try
    {
      boolean bool = this.closed;
      if (bool) {}
      do
      {
        return;
        this.closed = true;
      } while (this.content.size() >= this.limit);
      throw new ProtocolException("content-length promised " + this.limit + " bytes, but received " + this.content.size());
    }
    finally {}
  }
  
  public int contentLength()
  {
    try
    {
      close();
      int i = this.content.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      checkNotClosed();
      Util.checkOffsetAndCount(paramArrayOfByte.length, paramInt1, paramInt2);
      if ((this.limit != -1) && (this.content.size() > this.limit - paramInt2)) {
        throw new ProtocolException("exceeded content-length limit of " + this.limit + " bytes");
      }
    }
    finally {}
    this.content.write(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void writeToSocket(OutputStream paramOutputStream)
  {
    this.content.writeTo(paramOutputStream);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\RetryableOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */