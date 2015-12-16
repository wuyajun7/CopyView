package microguest.copyview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


public class MainActivity extends Activity {

    private CopyView copyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        copyView = (CopyView) findViewById(R.id.web_view);
        copyView.setTextSize(4);
        copyView.setTextColor("#FF8500");

        copyView.setText("可以长按拷贝的view" + copyView.NEW_LINE + "换行了");
    }

}
