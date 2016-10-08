package org.apache.http.entity.mime;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.content.AbstractContentBody;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.util.Args;

public class FormBodyPart
{
  private final ContentBody body;
  private final Header header;
  private final String name;
  
  public FormBodyPart(String paramString, ContentBody paramContentBody)
  {
    Args.notNull(paramString, "Name");
    Args.notNull(paramContentBody, "Body");
    this.name = paramString;
    this.body = paramContentBody;
    this.header = new Header();
    generateContentDisp(paramContentBody);
    generateContentType(paramContentBody);
    generateTransferEncoding(paramContentBody);
  }
  
  public void addField(String paramString1, String paramString2)
  {
    Args.notNull(paramString1, "Field name");
    this.header.addField(new MinimalField(paramString1, paramString2));
  }
  
  protected void generateContentDisp(ContentBody paramContentBody)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("form-data; name=\"");
    localStringBuilder.append(getName());
    localStringBuilder.append("\"");
    if (paramContentBody.getFilename() != null)
    {
      localStringBuilder.append("; filename=\"");
      localStringBuilder.append(paramContentBody.getFilename());
      localStringBuilder.append("\"");
    }
    addField("Content-Disposition", localStringBuilder.toString());
  }
  
  protected void generateContentType(ContentBody paramContentBody)
  {
    if ((paramContentBody instanceof AbstractContentBody)) {}
    for (Object localObject = ((AbstractContentBody)paramContentBody).getContentType(); localObject != null; localObject = null)
    {
      addField("Content-Type", ((ContentType)localObject).toString());
      return;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramContentBody.getMimeType());
    if (paramContentBody.getCharset() != null)
    {
      ((StringBuilder)localObject).append("; charset=");
      ((StringBuilder)localObject).append(paramContentBody.getCharset());
    }
    addField("Content-Type", ((StringBuilder)localObject).toString());
  }
  
  protected void generateTransferEncoding(ContentBody paramContentBody)
  {
    addField("Content-Transfer-Encoding", paramContentBody.getTransferEncoding());
  }
  
  public ContentBody getBody()
  {
    return this.body;
  }
  
  public Header getHeader()
  {
    return this.header;
  }
  
  public String getName()
  {
    return this.name;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\entity\mime\FormBodyPart.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */