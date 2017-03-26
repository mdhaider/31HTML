package com.oneapplab.a31html;

import android.app.Activity;
import android.webkit.WebView;

/**
 * Created by haider on 26-03-2017.
 */

public class ChennaiIntent extends Activity {

    public void moveToNextScreen() {
        setContentView(R.layout.activity_main);
        WebView browser;
        browser = (WebView) findViewById(R.id.webview);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.loadUrl("http://apps.programmerguru.com/examples/chennai.html");
    }
}