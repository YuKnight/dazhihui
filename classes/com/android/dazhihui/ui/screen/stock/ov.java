package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.view.View;
import com.android.dazhihui.ui.widget.cp;

class ov
  implements cp
{
  ov(ProfitExpectedScreen paramProfitExpectedScreen) {}
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0)
    {
      this.a.finish();
      return true;
    }
    if (((Integer)paramView.getTag()).intValue() == 3)
    {
      paramView = new Intent(this.a, SearchStockScreen.class);
      this.a.startActivity(paramView);
    }
    for (;;)
    {
      return false;
      if (((Integer)paramView.getTag()).intValue() == 2) {
        ProfitExpectedScreen.c(this.a);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */