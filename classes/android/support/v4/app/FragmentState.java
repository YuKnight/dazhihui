package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

final class FragmentState
  implements Parcelable
{
  public static final Parcelable.Creator<FragmentState> CREATOR = new ap();
  final String a;
  final int b;
  final boolean c;
  final int d;
  final int e;
  final String f;
  final boolean g;
  final boolean h;
  final Bundle i;
  Bundle j;
  Fragment k;
  
  public FragmentState(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readInt();
    if (paramParcel.readInt() != 0)
    {
      bool1 = true;
      this.c = bool1;
      this.d = paramParcel.readInt();
      this.e = paramParcel.readInt();
      this.f = paramParcel.readString();
      if (paramParcel.readInt() == 0) {
        break label110;
      }
      bool1 = true;
      label69:
      this.g = bool1;
      if (paramParcel.readInt() == 0) {
        break label115;
      }
    }
    label110:
    label115:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.h = bool1;
      this.i = paramParcel.readBundle();
      this.j = paramParcel.readBundle();
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label69;
    }
  }
  
  public FragmentState(Fragment paramFragment)
  {
    this.a = paramFragment.getClass().getName();
    this.b = paramFragment.mIndex;
    this.c = paramFragment.mFromLayout;
    this.d = paramFragment.mFragmentId;
    this.e = paramFragment.mContainerId;
    this.f = paramFragment.mTag;
    this.g = paramFragment.mRetainInstance;
    this.h = paramFragment.mDetached;
    this.i = paramFragment.mArguments;
  }
  
  public Fragment a(ac paramac, Fragment paramFragment)
  {
    if (this.k != null) {
      return this.k;
    }
    Context localContext = paramac.i();
    if (this.i != null) {
      this.i.setClassLoader(localContext.getClassLoader());
    }
    this.k = Fragment.instantiate(localContext, this.a, this.i);
    if (this.j != null)
    {
      this.j.setClassLoader(localContext.getClassLoader());
      this.k.mSavedFragmentState = this.j;
    }
    this.k.setIndex(this.b, paramFragment);
    this.k.mFromLayout = this.c;
    this.k.mRestored = true;
    this.k.mFragmentId = this.d;
    this.k.mContainerId = this.e;
    this.k.mTag = this.f;
    this.k.mRetainInstance = this.g;
    this.k.mDetached = this.h;
    this.k.mFragmentManager = paramac.d;
    if (af.a) {
      Log.v("FragmentManager", "Instantiated fragment " + this.k);
    }
    return this.k;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = 1;
    paramParcel.writeString(this.a);
    paramParcel.writeInt(this.b);
    if (this.c)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.d);
      paramParcel.writeInt(this.e);
      paramParcel.writeString(this.f);
      if (!this.g) {
        break label106;
      }
      paramInt = 1;
      label65:
      paramParcel.writeInt(paramInt);
      if (!this.h) {
        break label111;
      }
    }
    label106:
    label111:
    for (paramInt = m;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeBundle(this.i);
      paramParcel.writeBundle(this.j);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label65;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\FragmentState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */