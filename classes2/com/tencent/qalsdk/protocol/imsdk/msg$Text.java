package com.tencent.qalsdk.protocol.imsdk;

import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

public final class msg$Text
  extends MessageMicro<Text>
{
  public static final int ATTR_6_BUF_FIELD_NUMBER = 3;
  public static final int ATTR_7_BUF_FIELD_NUMBER = 4;
  public static final int BUF_FIELD_NUMBER = 11;
  public static final int LINK_FIELD_NUMBER = 2;
  public static final int STR_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField attr_6_buf = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField attr_7_buf = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBBytesField buf = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBStringField link = PBField.initString("");
  public final PBBytesField str = PBField.initBytes(ByteStringMicro.EMPTY);
  
  static
  {
    ByteStringMicro localByteStringMicro1 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro2 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro3 = ByteStringMicro.EMPTY;
    ByteStringMicro localByteStringMicro4 = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 34, 90 }, new String[] { "str", "link", "attr_6_buf", "attr_7_buf", "buf" }, new Object[] { localByteStringMicro1, "", localByteStringMicro2, localByteStringMicro3, localByteStringMicro4 }, Text.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\protocol\imsdk\msg$Text.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */