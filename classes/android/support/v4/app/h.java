package android.support.v4.app;

import android.app.Activity;

class h
{
  public static void a(Activity paramActivity, String[] paramArrayOfString, int paramInt)
  {
    if ((paramActivity instanceof i)) {
      ((i)paramActivity).validateRequestPermissionsRequestCode(paramInt);
    }
    paramActivity.requestPermissions(paramArrayOfString, paramInt);
  }
  
  public static boolean a(Activity paramActivity, String paramString)
  {
    return paramActivity.shouldShowRequestPermissionRationale(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */