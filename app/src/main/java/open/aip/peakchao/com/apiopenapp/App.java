package open.aip.peakchao.com.apiopenapp;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

/**
 * Created by Chao  2018/8/21 on 15:03
 * description
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }

}
