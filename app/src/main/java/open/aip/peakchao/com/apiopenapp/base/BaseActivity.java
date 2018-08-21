package open.aip.peakchao.com.apiopenapp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Chao  2018/8/21 on 13:51
 * description
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getLayout() != 0) {
            setContentView(getLayout());
        }
    }

    public abstract int getLayout();
}
