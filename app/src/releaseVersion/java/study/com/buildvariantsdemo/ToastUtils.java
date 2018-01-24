package study.com.buildvariantsdemo;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/1/5.
 */

public class ToastUtils {
    public static void show(Context context, String msg) {
        Toast.makeText(context, "我是正式版::" + msg, Toast.LENGTH_SHORT).show();
    }
}
