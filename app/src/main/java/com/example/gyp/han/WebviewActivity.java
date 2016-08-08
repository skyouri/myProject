package com.example.gyp.han;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebviewActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webView = (WebView)findViewById(R.id.webView);
        webView.loadUrl("http://아이피주소:8080/test4/main.jsp"); //본인 아이피 입력
        //웹뷰 출력후 회원가입 버튼이 안눌림...아이디 : park 비번 : 1234 넣고 로그인 한후 모든 웹기능 사용 가능 함
        //웹뷰 화면




    }
}
