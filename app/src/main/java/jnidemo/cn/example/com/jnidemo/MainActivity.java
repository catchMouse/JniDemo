package jnidemo.cn.example.com.jnidemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView)findViewById(R.id.text);
    }

    static {
        System.loadLibrary("hello_jni");
    }

    public void getTextFromJNI(View v) {
        text.setText(getString());
    }

    public native String getString();
}
