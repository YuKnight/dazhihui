package com.c.a.a;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD})
public @interface a
{
  boolean a() default true;
  
  boolean b() default true;
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */