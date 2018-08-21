package open.aip.peakchao.com.apiopenapp.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Chao  2018/8/21 on 13:51
 * description
 */

public abstract class BaseActivity extends AppCompatActivity {
    private Unbinder bind;
    protected CompositeDisposable disposables = new CompositeDisposable();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        if (getLayout() != 0) {
            setContentView(getLayout());
        }
        bind = ButterKnife.bind(this);
        init();
    }

    public abstract int getLayout();

    public void init() {

    }


    @Override
    protected void onDestroy() {
        bind.unbind();
        disposables.clear();
        super.onDestroy();
    }
}
