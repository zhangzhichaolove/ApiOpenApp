package open.aip.peakchao.com.apiopenapp.base;

import android.widget.TextView;

import butterknife.BindView;
import open.aip.peakchao.com.apiopenapp.R;

/**
 * Created by Chao  2018/8/21 on 14:06
 * description
 */

public class JsonActivity extends BaseActivity {
    @BindView(R.id.tv_json)
    TextView json;

    @Override
    public int getLayout() {
        return R.layout.activity_json;
    }

    @Override
    public void init() {
        if (getIntent().hasExtra("title")) {
            setTitle(getIntent().getStringExtra("title"));
        }
        if (getIntent().hasExtra("url")) {
            getIntent().getStringExtra("url");
        }

    }
}
