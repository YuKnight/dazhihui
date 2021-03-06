package com.squareup.okhttp.internal.http;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

final class HttpDate
{
  private static final DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS = new DateFormat[BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS.length];
  private static final String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
  private static final ThreadLocal<DateFormat> STANDARD_DATE_FORMAT = new HttpDate.1();
  
  static
  {
    BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = new String[] { "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z" };
  }
  
  public static String format(Date paramDate)
  {
    return ((DateFormat)STANDARD_DATE_FORMAT.get()).format(paramDate);
  }
  
  public static Date parse(String paramString)
  {
    try
    {
      Date localDate = ((DateFormat)STANDARD_DATE_FORMAT.get()).parse(paramString);
      return localDate;
    }
    catch (ParseException localParseException1) {}
    int i;
    for (;;)
    {
      Object localObject;
      synchronized (BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS)
      {
        int j = BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS.length;
        i = 0;
        if (i >= j) {
          return null;
        }
        DateFormat localDateFormat = BROWSER_COMPATIBLE_DATE_FORMATS[i];
        localObject = localDateFormat;
        if (localDateFormat == null)
        {
          localObject = new SimpleDateFormat(BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[i], Locale.US);
          BROWSER_COMPATIBLE_DATE_FORMATS[i] = localObject;
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\HttpDate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */