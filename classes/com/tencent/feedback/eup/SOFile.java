package com.tencent.feedback.eup;

public class SOFile
{
  public final String arch;
  public final String fileName;
  public final String sha1;
  
  public SOFile(String paramString1, String paramString2, String paramString3)
  {
    if ((paramString1 == null) || (paramString2 == null) || (paramString3 == null)) {
      throw new RuntimeException("SOFile args should not be null!");
    }
    this.fileName = paramString1;
    this.arch = paramString2;
    this.sha1 = paramString3;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\eup\SOFile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */