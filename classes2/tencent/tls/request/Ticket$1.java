package tencent.tls.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class Ticket$1
  implements Parcelable.Creator<Ticket>
{
  public Ticket createFromParcel(Parcel paramParcel)
  {
    return new Ticket(paramParcel, null);
  }
  
  public Ticket[] newArray(int paramInt)
  {
    return new Ticket[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\Ticket$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */