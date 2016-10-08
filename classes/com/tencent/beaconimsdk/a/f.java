package com.tencent.beaconimsdk.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.util.SparseArray;
import java.lang.ref.WeakReference;

@TargetApi(14)
public final class f
  implements Application.ActivityLifecycleCallbacks
{
  private static SparseArray<WeakReference<Activity>> a = new SparseArray();
  
  private static void a(Activity paramActivity)
  {
    if ((paramActivity != null) && (a != null))
    {
      int i = paramActivity.hashCode();
      if (a.get(i) == null)
      {
        paramActivity = new WeakReference(paramActivity);
        a.put(i, paramActivity);
      }
    }
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    a(paramActivity);
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    a.b = true;
    a(paramActivity);
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    a.b = true;
    a(paramActivity);
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    a.b = true;
    a(paramActivity);
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    a.b = true;
    a(paramActivity);
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    a.b = true;
    a(paramActivity);
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    a.b = true;
    a(paramActivity);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */