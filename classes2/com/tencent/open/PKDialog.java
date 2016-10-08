package com.tencent.open;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.connect.auth.QQToken;
import com.tencent.open.a.f;
import com.tencent.open.c.a.a;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

public class PKDialog
  extends b
  implements a.a
{
  private static final int MSG_CANCEL = 2;
  private static final int MSG_COMPLETE = 1;
  private static final int MSG_ON_LOAD = 4;
  private static final int MSG_SHOW_PROCESS = 5;
  private static final int MSG_SHOW_TIPS = 3;
  private static final String TAG = "openSDK_LOG.PKDialog";
  private static final int WEBVIEW_HEIGHT = 185;
  static Toast sToast = null;
  private IUiListener listener;
  private com.tencent.open.c.a mFlMain;
  private Handler mHandler;
  private PKDialog.OnTimeListener mListener;
  private String mUrl;
  private WeakReference<Context> mWeakContext;
  private com.tencent.open.c.b mWebView;
  private int mWebviewHeight;
  
  public PKDialog(Context paramContext, String paramString1, String paramString2, IUiListener paramIUiListener, QQToken paramQQToken)
  {
    super(paramContext, 16973840);
    this.mWeakContext = new WeakReference(paramContext);
    this.mUrl = paramString2;
    this.mListener = new PKDialog.OnTimeListener(paramContext, paramString1, paramString2, paramQQToken.getAppId(), paramIUiListener);
    this.mHandler = new PKDialog.THandler(this, this.mListener, paramContext.getMainLooper());
    this.listener = paramIUiListener;
    this.mWebviewHeight = Math.round(185.0F * paramContext.getResources().getDisplayMetrics().density);
    f.e("openSDK_LOG.PKDialog", "density=" + paramContext.getResources().getDisplayMetrics().density + "; webviewHeight=" + this.mWebviewHeight);
  }
  
  private void createViews()
  {
    this.mFlMain = new com.tencent.open.c.a((Context)this.mWeakContext.get());
    this.mFlMain.setBackgroundColor(1711276032);
    this.mFlMain.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    this.mWebView = new com.tencent.open.c.b((Context)this.mWeakContext.get());
    this.mWebView.setBackgroundColor(0);
    this.mWebView.setBackgroundDrawable(null);
    if (Build.VERSION.SDK_INT >= 11) {}
    try
    {
      View.class.getMethod("setLayerType", new Class[] { Integer.TYPE, Paint.class }).invoke(this.mWebView, new Object[] { Integer.valueOf(1), new Paint() });
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, this.mWebviewHeight);
      localLayoutParams.addRule(13, -1);
      this.mWebView.setLayoutParams(localLayoutParams);
      this.mFlMain.addView(this.mWebView);
      this.mFlMain.a(this);
      setContentView(this.mFlMain);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  @SuppressLint({"SetJavaScriptEnabled"})
  private void initViews()
  {
    this.mWebView.setVerticalScrollBarEnabled(false);
    this.mWebView.setHorizontalScrollBarEnabled(false);
    this.mWebView.setWebViewClient(new PKDialog.FbWebViewClient(this, null));
    this.mWebView.setWebChromeClient(this.mChromeClient);
    this.mWebView.clearFormData();
    WebSettings localWebSettings = this.mWebView.getSettings();
    if (localWebSettings == null) {
      return;
    }
    localWebSettings.setSavePassword(false);
    localWebSettings.setSaveFormData(false);
    localWebSettings.setCacheMode(-1);
    localWebSettings.setNeedInitialFocus(false);
    localWebSettings.setBuiltInZoomControls(true);
    localWebSettings.setSupportZoom(true);
    localWebSettings.setRenderPriority(WebSettings.RenderPriority.HIGH);
    localWebSettings.setJavaScriptEnabled(true);
    if ((this.mWeakContext != null) && (this.mWeakContext.get() != null))
    {
      localWebSettings.setDatabaseEnabled(true);
      localWebSettings.setDatabasePath(((Context)this.mWeakContext.get()).getApplicationContext().getDir("databases", 0).getPath());
    }
    localWebSettings.setDomStorageEnabled(true);
    this.jsBridge.a(new PKDialog.JsListener(this, null), "sdk_js_if");
    this.mWebView.clearView();
    this.mWebView.loadUrl(this.mUrl);
    this.mWebView.getSettings().setSavePassword(false);
  }
  
  private void loadUrlWithBrowser(String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(paramString1, paramString2));
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.addFlags(1073741824);
    localIntent.addFlags(268435456);
    localIntent.setData(Uri.parse(paramString3));
    if ((this.mWeakContext != null) && (this.mWeakContext.get() != null)) {
      ((Context)this.mWeakContext.get()).startActivity(localIntent);
    }
  }
  
  private static void showProcessDialog(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null)) {}
    for (;;)
    {
      return;
      try
      {
        paramContext = Util.parseJson(paramString);
        int i = paramContext.getInt("action");
        paramContext.getString("msg");
        if (i == 1) {}
      }
      catch (JSONException paramContext)
      {
        paramContext.printStackTrace();
      }
    }
  }
  
  private static void showTips(Context paramContext, String paramString)
  {
    try
    {
      paramString = Util.parseJson(paramString);
      int i = paramString.getInt("type");
      paramString = paramString.getString("msg");
      if (i == 0)
      {
        if (sToast == null) {
          sToast = Toast.makeText(paramContext, paramString, 0);
        }
        for (;;)
        {
          sToast.show();
          return;
          sToast.setView(sToast.getView());
          sToast.setText(paramString);
          sToast.setDuration(0);
        }
      }
      if (i != 1) {
        return;
      }
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
      return;
    }
    if (sToast == null) {
      sToast = Toast.makeText(paramContext, paramString, 1);
    }
    for (;;)
    {
      sToast.show();
      return;
      sToast.setView(sToast.getView());
      sToast.setText(paramString);
      sToast.setDuration(1);
    }
  }
  
  public void callJs(String paramString1, String paramString2)
  {
    paramString1 = "javascript:" + paramString1 + "(" + paramString2 + ")";
    this.mWebView.loadUrl(paramString1);
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
  }
  
  protected void onConsoleMessage(String paramString)
  {
    f.b("openSDK_LOG.PKDialog", "--onConsoleMessage--");
    try
    {
      this.jsBridge.a(this.mWebView, paramString);
      return;
    }
    catch (Exception paramString) {}
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    getWindow().setSoftInputMode(16);
    getWindow().setSoftInputMode(1);
    createViews();
    initViews();
  }
  
  public void onKeyboardHidden()
  {
    this.mWebView.getLayoutParams().height = this.mWebviewHeight;
    f.e("openSDK_LOG.PKDialog", "onKeyboardHidden keyboard hide");
  }
  
  public void onKeyboardShown(int paramInt)
  {
    if ((this.mWeakContext != null) && (this.mWeakContext.get() != null)) {
      if ((paramInt >= this.mWebviewHeight) || (2 != ((Context)this.mWeakContext.get()).getResources().getConfiguration().orientation)) {
        break label68;
      }
    }
    label68:
    for (this.mWebView.getLayoutParams().height = paramInt;; this.mWebView.getLayoutParams().height = this.mWebviewHeight)
    {
      f.e("openSDK_LOG.PKDialog", "onKeyboardShown keyboard show");
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\PKDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */