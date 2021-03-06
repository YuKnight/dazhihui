package com.squareup.okhttp.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public final class DiskLruCache$Editor
{
  private boolean committed;
  private final DiskLruCache.Entry entry;
  private boolean hasErrors;
  private final boolean[] written;
  
  private DiskLruCache$Editor(DiskLruCache paramDiskLruCache, DiskLruCache.Entry paramEntry)
  {
    this.entry = paramEntry;
    if (DiskLruCache.Entry.access$0(paramEntry)) {}
    for (paramDiskLruCache = null;; paramDiskLruCache = new boolean[DiskLruCache.access$7(paramDiskLruCache)])
    {
      this.written = paramDiskLruCache;
      return;
    }
  }
  
  public void abort()
  {
    DiskLruCache.access$10(this.this$0, this, false);
  }
  
  public void abortUnlessCommitted()
  {
    if (!this.committed) {}
    try
    {
      abort();
      return;
    }
    catch (IOException localIOException) {}
  }
  
  public void commit()
  {
    if (this.hasErrors)
    {
      DiskLruCache.access$10(this.this$0, this, false);
      this.this$0.remove(DiskLruCache.Entry.access$2(this.entry));
    }
    for (;;)
    {
      this.committed = true;
      return;
      DiskLruCache.access$10(this.this$0, this, true);
    }
  }
  
  public String getString(int paramInt)
  {
    InputStream localInputStream = newInputStream(paramInt);
    if (localInputStream != null) {
      return DiskLruCache.access$6(localInputStream);
    }
    return null;
  }
  
  public InputStream newInputStream(int paramInt)
  {
    synchronized (this.this$0)
    {
      if (DiskLruCache.Entry.access$1(this.entry) != this) {
        throw new IllegalStateException();
      }
    }
    if (!DiskLruCache.Entry.access$0(this.entry)) {
      return null;
    }
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(this.entry.getCleanFile(paramInt));
      return localFileInputStream;
    }
    catch (FileNotFoundException localFileNotFoundException) {}
    return null;
  }
  
  public OutputStream newOutputStream(int paramInt)
  {
    synchronized (this.this$0)
    {
      if (DiskLruCache.Entry.access$1(this.entry) != this) {
        throw new IllegalStateException();
      }
    }
    if (!DiskLruCache.Entry.access$0(this.entry)) {
      this.written[paramInt] = true;
    }
    File localFile = this.entry.getDirtyFile(paramInt);
    try
    {
      Object localObject2 = new FileOutputStream(localFile);
      localObject2 = new DiskLruCache.Editor.FaultHidingOutputStream(this, (OutputStream)localObject2, null);
      return (OutputStream)localObject2;
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      for (;;)
      {
        DiskLruCache.access$8(this.this$0).mkdirs();
        try
        {
          FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
        }
        catch (FileNotFoundException localFileNotFoundException2)
        {
          OutputStream localOutputStream = DiskLruCache.access$9();
          return localOutputStream;
        }
      }
    }
  }
  
  public void set(int paramInt, String paramString)
  {
    try
    {
      OutputStreamWriter localOutputStreamWriter = new OutputStreamWriter(newOutputStream(paramInt), Util.UTF_8);
      Util.closeQuietly(localOutputStreamWriter);
    }
    finally
    {
      try
      {
        localOutputStreamWriter.write(paramString);
        Util.closeQuietly(localOutputStreamWriter);
        return;
      }
      finally {}
      paramString = finally;
      localOutputStreamWriter = null;
    }
    throw paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\DiskLruCache$Editor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */