package android.support.v4.view.a;

import android.view.accessibility.AccessibilityRecord;

class ar
{
  public static Object a()
  {
    return AccessibilityRecord.obtain();
  }
  
  public static void a(Object paramObject, int paramInt)
  {
    ((AccessibilityRecord)paramObject).setFromIndex(paramInt);
  }
  
  public static void a(Object paramObject, boolean paramBoolean)
  {
    ((AccessibilityRecord)paramObject).setScrollable(paramBoolean);
  }
  
  public static void b(Object paramObject, int paramInt)
  {
    ((AccessibilityRecord)paramObject).setItemCount(paramInt);
  }
  
  public static void c(Object paramObject, int paramInt)
  {
    ((AccessibilityRecord)paramObject).setScrollX(paramInt);
  }
  
  public static void d(Object paramObject, int paramInt)
  {
    ((AccessibilityRecord)paramObject).setScrollY(paramInt);
  }
  
  public static void e(Object paramObject, int paramInt)
  {
    ((AccessibilityRecord)paramObject).setToIndex(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\a\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */