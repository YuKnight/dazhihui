package com.android.dazhihui.ui.delegate.screen.margin;

import com.android.dazhihui.ui.widget.mh;
import java.util.Comparator;

class ag
  implements Comparator<mh>
{
  ag(aa paramaa) {}
  
  public int a(mh parammh1, mh parammh2)
  {
    if ((parammh1.a == null) || (parammh1.a.length < aa.R(this.a))) {
      return -1;
    }
    if ((parammh2.a == null) || (parammh2.a.length < aa.R(this.a))) {
      return 1;
    }
    return (int)(Double.valueOf(parammh2.a[aa.R(this.a)]).doubleValue() - Double.valueOf(parammh1.a[aa.R(this.a)]).doubleValue());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */