package entretenimento.studio.com.entretenimento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class cineSystemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cine_system);

        WebView webView = (WebView)findViewById(R.id.cineSystemWebViwID);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.cinesystem.com.br/londrina/programacao/");
        //webView.loadData("<html><body><h1>TITULO DO SITE</h1>" +                "<p> Este e meu site pessoal</p></body></html>","text/html","UTF-8");



    }
}
