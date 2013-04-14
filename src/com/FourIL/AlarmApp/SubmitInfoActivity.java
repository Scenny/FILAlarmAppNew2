package com.FourIL.AlarmApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SubmitInfoActivity extends Activity {
	
	private WebView webView; 
	
	 	@Override  
	    protected void onCreate(Bundle savedInstanceState) {  
	        // TODO Auto-generated method stub  
	        super.onCreate(savedInstanceState);  
	        // 取消标题  
	        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);  
	        // 进行全屏  
	  
	        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  
	                WindowManager.LayoutParams.FLAG_FULLSCREEN);  
	        setContentView(R.layout.submit_info);  
	        // 实例化WebView  
	        webView = (WebView) this.findViewById(R.id.wv_oauth);
	        
	        webView.setWebViewClient(new WebViewClient(){     
	        	public boolean shouldOverrideUrlLoading(WebView view, String url) {     
	        	view.loadUrl(url);     
	        	return true;     
	        	}     
	        }); 
	        
	        /** 
	         * 调用loadUrl()方法进行加载内容 
	         */  
	        webView.loadUrl(ServerInfo.SERVER_ADDR + ServerInfo.NEW_ADDR);  
	        /** 
	         * 设置WebView的属性，此时可以去执行JavaScript脚本 
	         */  
	        //webView.getSettings().setJavaScriptEnabled(true); 
	        
	    } 
	 	  
	 	  
}  
