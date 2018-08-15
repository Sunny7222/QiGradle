package skw.com.firsrlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/8/15.
 */

public class QiUtils {
    public static void showToast(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT);
    }
}
