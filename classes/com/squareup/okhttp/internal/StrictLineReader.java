package com.squareup.okhttp.internal;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class StrictLineReader
  implements Closeable
{
  private static final byte CR = 13;
  private static final byte LF = 10;
  private byte[] buf;
  private final Charset charset;
  private int end;
  private final InputStream in;
  private int pos;
  
  public StrictLineReader(InputStream paramInputStream, int paramInt, Charset paramCharset)
  {
    if ((paramInputStream == null) || (paramCharset == null)) {
      throw new NullPointerException();
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException("capacity <= 0");
    }
    if (!paramCharset.equals(Util.US_ASCII)) {
      throw new IllegalArgumentException("Unsupported encoding");
    }
    this.in = paramInputStream;
    this.charset = paramCharset;
    this.buf = new byte[paramInt];
  }
  
  public StrictLineReader(InputStream paramInputStream, Charset paramCharset)
  {
    this(paramInputStream, 8192, paramCharset);
  }
  
  private void fillBuf()
  {
    int i = this.in.read(this.buf, 0, this.buf.length);
    if (i == -1) {
      throw new EOFException();
    }
    this.pos = 0;
    this.end = i;
  }
  
  public void close()
  {
    synchronized (this.in)
    {
      if (this.buf != null)
      {
        this.buf = null;
        this.in.close();
      }
      return;
    }
  }
  
  public int readInt()
  {
    String str = readLine();
    try
    {
      int i = Integer.parseInt(str);
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new IOException("expected an int but was \"" + str + "\"");
    }
  }
  
  public String readLine()
  {
    synchronized (this.in)
    {
      if (this.buf == null) {
        throw new IOException("LineReader is closed");
      }
    }
    if (this.pos >= this.end) {
      fillBuf();
    }
    int i = this.pos;
    Object localObject2;
    if (i == this.end) {
      localObject2 = new StrictLineReader.1(this, this.end - this.pos + 80);
    }
    label270:
    for (;;)
    {
      ((ByteArrayOutputStream)localObject2).write(this.buf, this.pos, this.end - this.pos);
      this.end = -1;
      fillBuf();
      i = this.pos;
      for (;;)
      {
        if (i == this.end) {
          break label270;
        }
        if (this.buf[i] == 10)
        {
          if (i != this.pos) {
            ((ByteArrayOutputStream)localObject2).write(this.buf, this.pos, i - this.pos);
          }
          this.pos = (i + 1);
          localObject2 = ((ByteArrayOutputStream)localObject2).toString();
          return (String)localObject2;
          if (this.buf[i] == 10)
          {
            if ((i != this.pos) && (this.buf[(i - 1)] == 13)) {}
            for (int j = i - 1;; j = i)
            {
              localObject2 = new String(this.buf, this.pos, j - this.pos, this.charset.name());
              this.pos = (i + 1);
              return (String)localObject2;
            }
          }
          i += 1;
          break;
        }
        i += 1;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\StrictLineReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */