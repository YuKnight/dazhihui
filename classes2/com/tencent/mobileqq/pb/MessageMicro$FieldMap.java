package com.tencent.mobileqq.pb;

import java.lang.reflect.Field;
import java.util.Arrays;

public final class MessageMicro$FieldMap
{
  private Object[] defaultValues;
  private Field[] fields;
  private int[] tags;
  
  MessageMicro$FieldMap(int[] paramArrayOfInt, String[] paramArrayOfString, Object[] paramArrayOfObject, Class<?> paramClass)
  {
    this.tags = paramArrayOfInt;
    this.defaultValues = paramArrayOfObject;
    this.fields = new Field[paramArrayOfInt.length];
    int i = 0;
    for (;;)
    {
      if (i < paramArrayOfInt.length) {
        try
        {
          this.fields[i] = paramClass.getField(paramArrayOfString[i]);
          i += 1;
        }
        catch (Exception paramArrayOfObject)
        {
          for (;;)
          {
            paramArrayOfObject.printStackTrace();
          }
        }
      }
    }
  }
  
  void clear(MessageMicro<?> paramMessageMicro)
  {
    int i = 0;
    while (i < this.tags.length)
    {
      ((PBField)this.fields[i].get(paramMessageMicro)).clear(this.defaultValues[i]);
      i += 1;
    }
  }
  
  <U extends MessageMicro<U>> void copyFields(U paramU1, U paramU2)
  {
    int i = 0;
    while (i < this.tags.length)
    {
      Field localField = this.fields[i];
      ((PBField)localField.get(paramU1)).copyFrom((PBField)localField.get(paramU2));
      i += 1;
    }
  }
  
  Field get(int paramInt)
  {
    paramInt = Arrays.binarySearch(this.tags, paramInt);
    if (paramInt < 0) {
      return null;
    }
    return this.fields[paramInt];
  }
  
  int getSerializedSize(MessageMicro<?> paramMessageMicro)
  {
    int i = 0;
    int j = 0;
    while (i < this.tags.length)
    {
      int k = WireFormatMicro.getTagFieldNumber(this.tags[i]);
      j += ((PBField)this.fields[i].get(paramMessageMicro)).computeSize(k);
      i += 1;
    }
    return j;
  }
  
  public boolean readFieldFrom(CodedInputStreamMicro paramCodedInputStreamMicro, int paramInt, MessageMicro<?> paramMessageMicro)
  {
    paramInt = Arrays.binarySearch(this.tags, paramInt);
    if (paramInt < 0) {
      return false;
    }
    ((PBField)this.fields[paramInt].get(paramMessageMicro)).readFrom(paramCodedInputStreamMicro);
    return true;
  }
  
  void writeTo(CodedOutputStreamMicro paramCodedOutputStreamMicro, MessageMicro<?> paramMessageMicro)
  {
    int i = 0;
    while (i < this.tags.length)
    {
      int j = WireFormatMicro.getTagFieldNumber(this.tags[i]);
      ((PBField)this.fields[i].get(paramMessageMicro)).writeTo(paramCodedOutputStreamMicro, j);
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\mobileqq\pb\MessageMicro$FieldMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */