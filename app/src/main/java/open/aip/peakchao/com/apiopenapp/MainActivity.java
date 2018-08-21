package open.aip.peakchao.com.apiopenapp;

import android.view.View;

import butterknife.OnClick;
import open.aip.peakchao.com.apiopenapp.base.BaseActivity;
import open.aip.peakchao.com.apiopenapp.base.GotoManager;

public class MainActivity extends BaseActivity {

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }


    @OnClick({R.id.btn_01, R.id.btn_02})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_01:
                GotoManager.gotoJsonPage(this, "标题", "");
                break;
            case R.id.btn_02:
                GotoManager.gotoJsonPage(this, "标题", "");
                break;
        }
    }

}
