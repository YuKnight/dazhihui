package com.tencent.feedback.proguard;

import android.content.Context;
import com.tencent.feedback.upload.AbstractUploadDatas;

public final class v
  extends AbstractUploadDatas
{
  private B d = null;
  
  public v(Context paramContext, int paramInt1, int paramInt2, B paramB)
  {
    super(paramContext, 1111, 200);
    this.d = paramB;
  }
  
  public final C a()
  {
    try
    {
      Context localContext = this.c;
      int i = this.a;
      if (this.d == null) {}
      for (byte[] arrayOfByte = null;; arrayOfByte = this.d.a()) {
        return a(localContext, i, arrayOfByte);
      }
      return null;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public final void done(boolean paramBoolean) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\proguard\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */