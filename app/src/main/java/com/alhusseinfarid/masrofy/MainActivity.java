package com.alhusseinfarid.masrofy;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
  private static final String APP_URL = "https://script.google.com/macros/s/AKfycbzcyz9NQUSwOVXkFPmkgQuzP5cxm6Sx5GAY8-jEvCkXFBV0cZo8RcMdPwMY_WVenJ9XHw/exec";
  private WebView webView;

  @SuppressLint("SetJavaScriptEnabled")
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setNavigationBarColor(Color.WHITE);
    getWindow().setStatusBarColor(Color.rgb(23,25,35));
    webView = new WebView(this);
    setContentView(webView);
    WebSettings s = webView.getSettings();
    s.setJavaScriptEnabled(true);
    s.setDomStorageEnabled(true);
    s.setLoadWithOverviewMode(false);
    s.setUseWideViewPort(false);
    webView.setWebViewClient(new WebViewClient());
    webView.loadUrl(APP_URL);
  }

  @Override public void onBackPressed() {
    if (webView.canGoBack()) webView.goBack(); else super.onBackPressed();
  }
}