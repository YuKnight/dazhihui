package com.tencent.beacon.event;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

final class n$a
  implements FileFilter
{
  n$a(n paramn) {}
  
  public final boolean accept(File paramFile)
  {
    return Pattern.matches("cpu[0-9]", paramFile.getName());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\n$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */