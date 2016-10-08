package com.tencent.mm.sdk.modelbiz;

import android.os.Bundle;
import com.tencent.mm.sdk.modelbase.BaseReq;
import java.util.Iterator;
import java.util.List;
import org.json.JSONStringer;

public class AddCardToWXCardPackage$Req
  extends BaseReq
{
  public List<AddCardToWXCardPackage.WXCardItem> cardArrary;
  
  public boolean checkArgs()
  {
    if ((this.cardArrary == null) || (this.cardArrary.size() == 0) || (this.cardArrary.size() > 40)) {
      return false;
    }
    Iterator localIterator = this.cardArrary.iterator();
    while (localIterator.hasNext())
    {
      AddCardToWXCardPackage.WXCardItem localWXCardItem = (AddCardToWXCardPackage.WXCardItem)localIterator.next();
      if ((localWXCardItem == null) || (localWXCardItem.cardId == null) || (localWXCardItem.cardId.length() > 1024) || ((localWXCardItem.cardExtMsg != null) && (localWXCardItem.cardExtMsg.length() > 1024))) {
        return false;
      }
    }
    return true;
  }
  
  public int getType()
  {
    return 9;
  }
  
  public void toBundle(Bundle paramBundle)
  {
    super.toBundle(paramBundle);
    JSONStringer localJSONStringer = new JSONStringer();
    try
    {
      localJSONStringer.object();
      localJSONStringer.key("card_list");
      localJSONStringer.array();
      Iterator localIterator = this.cardArrary.iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          Object localObject = (AddCardToWXCardPackage.WXCardItem)localIterator.next();
          localJSONStringer.object();
          localJSONStringer.key("card_id");
          localJSONStringer.value(((AddCardToWXCardPackage.WXCardItem)localObject).cardId);
          localJSONStringer.key("card_ext");
          if (((AddCardToWXCardPackage.WXCardItem)localObject).cardExtMsg == null)
          {
            localObject = "";
            localJSONStringer.value(localObject);
            localJSONStringer.endObject();
            continue;
            paramBundle.putString("_wxapi_add_card_to_wx_card_list", localJSONStringer.toString());
          }
        }
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    for (;;)
    {
      return;
      String str = localException.cardExtMsg;
      break;
      localJSONStringer.endArray();
      localJSONStringer.endObject();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\mm\sdk\modelbiz\AddCardToWXCardPackage$Req.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */