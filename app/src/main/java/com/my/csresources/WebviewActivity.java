package com.my.csresources;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WebviewActivity extends AppCompatActivity {

    String temp,Url;
    WebView webView;
   ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        webView = findViewById(R.id.webView11);
        WebSettings ws = webView.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.getJavaScriptCanOpenWindowsAutomatically();


        Bundle b = new Bundle();

        Intent intent =getIntent();

        String url = intent.getStringExtra("url");

        webView.loadUrl(url);

//        setContentView(webView);





      /*  WebSettings webSettings = webView.getSettings();
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webSettings.setAppCachePath(getApplicationContext().getCacheDir().toString());
        webSettings.setAppCacheEnabled(true);
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);
        webSettings.getJavaScriptCanOpenWindowsAutomatically();
*/




/*        if(temp.equals("Google")){
            Url ="https://www.google.com";
        }
        else {
            Url = "https://www.youtube.com";
        }

        final Activity activity = this;
        webView.setWebChromeClient(new WebChromeClient(){
            public void onProgressChanged(WebView view,int progress){
                activity.setProgress(progress*100);
            }
        });
        webView.setWebViewClient(new WebViewClient(){
            public  void onReceivedError(WebView view,int errorCode,String desc,String failingUrl){
                Toast.makeText(activity, "oh no "+desc,Toast.LENGTH_SHORT).show();
                pb.setVisibility(View.GONE);
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                pb.setVisibility(View.GONE);
            }

            @Override
            public void onPageFinished(WebView view,String url){
                super.onPageFinished(view, url);
                pb.setVisibility(View.GONE);
            }
        });

try{
    webView.loadUrl(Url);
}
catch (Exception e){
    e.printStackTrace();
    pb.setVisibility(View.GONE);
}*/



    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode == KeyEvent.KEYCODE_BACK) && this.webView.canGoBack()){
    this.webView.goBack();
        }
        return super.onKeyDown(keyCode, event);
    }
}




