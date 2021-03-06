package com.tencent.imcore;

public class BytesProfileMapParser
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public BytesProfileMapParser()
  {
    this(internalJNI.new_BytesProfileMapParser(), true);
  }
  
  protected BytesProfileMapParser(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(BytesProfileMapParser paramBytesProfileMapParser)
  {
    if (paramBytesProfileMapParser == null) {
      return 0L;
    }
    return paramBytesProfileMapParser.swigCPtr;
  }
  
  public void delete()
  {
    try
    {
      if (this.swigCPtr != 0L)
      {
        if (this.swigCMemOwn)
        {
          this.swigCMemOwn = false;
          internalJNI.delete_BytesProfileMapParser(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void fetchMapKeys(SWIGTYPE_p_std__mapT_std__string_imcore__FriendProfile_t paramSWIGTYPE_p_std__mapT_std__string_imcore__FriendProfile_t)
  {
    internalJNI.BytesProfileMapParser_fetchMapKeys(this.swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_imcore__FriendProfile_t.getCPtr(paramSWIGTYPE_p_std__mapT_std__string_imcore__FriendProfile_t));
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public SWIGTYPE_p_std__string getKey(int paramInt)
  {
    long l = internalJNI.BytesProfileMapParser_getKey(this.swigCPtr, this, paramInt);
    if (l == 0L) {
      return null;
    }
    return new SWIGTYPE_p_std__string(l, false);
  }
  
  public StrVec getKeys()
  {
    long l = internalJNI.BytesProfileMapParser_keys_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new StrVec(l, false);
  }
  
  public FriendProfile getValue(SWIGTYPE_p_std__mapT_std__string_imcore__FriendProfile_t paramSWIGTYPE_p_std__mapT_std__string_imcore__FriendProfile_t, int paramInt)
  {
    long l = internalJNI.BytesProfileMapParser_getValue(this.swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_imcore__FriendProfile_t.getCPtr(paramSWIGTYPE_p_std__mapT_std__string_imcore__FriendProfile_t), paramInt);
    if (l == 0L) {
      return null;
    }
    return new FriendProfile(l, false);
  }
  
  public void setKeys(StrVec paramStrVec)
  {
    internalJNI.BytesProfileMapParser_keys_set(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\BytesProfileMapParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */