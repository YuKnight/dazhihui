package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class cg
{
  public static void a(View paramView, int paramInt)
  {
    paramView.setImportantForAccessibility(paramInt);
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.postInvalidate(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }
  
  public static void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postOnAnimationDelayed(paramRunnable, paramLong);
  }
  
  public static boolean a(View paramView)
  {
    return paramView.hasTransientState();
  }
  
  public static void b(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }
  
  public static int c(View paramView)
  {
    return paramView.getImportantForAccessibility();
  }
  
  public static ViewParent d(View paramView)
  {
    return paramView.getParentForAccessibility();
  }
  
  public static int e(View paramView)
  {
    return paramView.getMinimumWidth();
  }
  
  public static int f(View paramView)
  {
    return paramView.getMinimumHeight();
  }
  
  public static boolean g(View paramView)
  {
    return paramView.getFitsSystemWindows();
  }
  
  public static boolean h(View paramView)
  {
    return paramView.hasOverlappingRendering();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */