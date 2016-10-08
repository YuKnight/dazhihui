package org.apache.http.entity.mime;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

class HttpStrictMultipart
  extends AbstractMultipartForm
{
  private final List<FormBodyPart> parts;
  
  public HttpStrictMultipart(String paramString1, Charset paramCharset, String paramString2, List<FormBodyPart> paramList)
  {
    super(paramString1, paramCharset, paramString2);
    this.parts = paramList;
  }
  
  protected void formatMultipartHeader(FormBodyPart paramFormBodyPart, OutputStream paramOutputStream)
  {
    paramFormBodyPart = paramFormBodyPart.getHeader().iterator();
    while (paramFormBodyPart.hasNext()) {
      writeField((MinimalField)paramFormBodyPart.next(), paramOutputStream);
    }
  }
  
  public List<FormBodyPart> getBodyParts()
  {
    return this.parts;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\entity\mime\HttpStrictMultipart.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */