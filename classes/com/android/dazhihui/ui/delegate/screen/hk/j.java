package com.android.dazhihui.ui.delegate.screen.hk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class j
  extends BaseAdapter
{
  public j(DropDownTextView paramDropDownTextView) {}
  
  public int getCount()
  {
    if ((DropDownTextView.d(this.a) == null) || (DropDownTextView.d(this.a).size() < 1)) {
      return 0;
    }
    return DropDownTextView.d(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    if ((DropDownTextView.d(this.a) == null) || (DropDownTextView.d(this.a).size() < 1)) {
      return null;
    }
    return DropDownTextView.d(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = LayoutInflater.from(DropDownTextView.f(this.a)).inflate(2130903099, null);
      paramViewGroup = new l(this);
      paramViewGroup.a = ((TextView)paramView.findViewById(2131558565));
      paramViewGroup.b = ((ImageView)paramView.findViewById(2131558564));
      paramView.setTag(paramViewGroup);
      paramViewGroup.a.setText((CharSequence)DropDownTextView.d(this.a).get(paramInt));
      if (!this.a.a) {
        break label129;
      }
      paramViewGroup.b.setVisibility(0);
    }
    for (;;)
    {
      paramViewGroup.b.setOnClickListener(new k(this, paramInt));
      return paramView;
      paramViewGroup = (l)paramView.getTag();
      break;
      label129:
      paramViewGroup.b.setVisibility(8);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */