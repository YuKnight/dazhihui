package android.support.v4.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class ay
  implements ViewTreeObserver.OnPreDrawListener
{
  ay(View paramView1, Transition paramTransition1, ArrayList paramArrayList1, Transition paramTransition2, ArrayList paramArrayList2, Transition paramTransition3, ArrayList paramArrayList3, Map paramMap, ArrayList paramArrayList4, Transition paramTransition4, View paramView2) {}
  
  public boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    if (this.b != null) {
      au.a(this.b, this.c);
    }
    if (this.d != null) {
      au.a(this.d, this.e);
    }
    if (this.f != null) {
      au.a(this.f, this.g);
    }
    Iterator localIterator = this.h.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ((View)localEntry.getValue()).setTransitionName((String)localEntry.getKey());
    }
    int n = this.i.size();
    int m = 0;
    while (m < n)
    {
      this.j.excludeTarget((View)this.i.get(m), false);
      m += 1;
    }
    this.j.excludeTarget(this.k, false);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */