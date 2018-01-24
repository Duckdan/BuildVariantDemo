package study.com.buildvariantsdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button bt;
    private TextView tvDescripiton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.bt);
        tvDescripiton = (TextView) findViewById(R.id.tv_description);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = "";
                content = BuildConfig.BUILD_TYPE + "===" + BuildConfig.DEBUG + "===" + BuildConfig.FLAVOR;
                tvDescripiton.setText(content);
                ToastUtils.show(MainActivity.this, content);
            }
        });
    }
}
