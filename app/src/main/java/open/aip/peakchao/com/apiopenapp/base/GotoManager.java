package open.aip.peakchao.com.apiopenapp.base;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Chao  2018/8/21 on 14:08
 * description
 */

public class GotoManager {


    /**
     * 跳转到Json示例页面
     *
     * @param context 上下问
     * @param title   页面标题
     */
    public static void gotoJsonPage(Context context, String title, String url, String... params) {
        Intent intent = new Intent(context, JsonActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("url", url);
        intent.putExtra("params", params);
        context.startActivity(intent);
    }

}
