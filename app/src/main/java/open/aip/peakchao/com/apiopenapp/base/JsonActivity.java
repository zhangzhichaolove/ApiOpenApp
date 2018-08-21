package open.aip.peakchao.com.apiopenapp.base;

import android.widget.TextView;

import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import open.aip.peakchao.com.apiopenapp.R;
import open.aip.peakchao.com.apiopenapp.util.JsonUtil;

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
            String[] arrayExtra = getIntent().getStringArrayExtra("params");
            Map<String, Object> params = new HashMap<>();
            if (arrayExtra != null && arrayExtra.length > 0) {
                for (int i = 0; i < arrayExtra.length; i++) {
                    String par = arrayExtra[i];
                    String key = par.split("=")[0];
                    String value = par.split("=")[1];
                    params.put(key, value);
                }
            }
            ServiceFactory.getInstance().getApiService().baseApi(getIntent().getStringExtra("url"), params).
                    observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .unsubscribeOn(Schedulers.io())
                    .subscribe(new BaseSubscriber<ResponseBody>(this, disposables) {
                        @Override
                        public void _success(ResponseBody data) throws IOException {
                            String result = data.string().trim();
                            json.setText(JsonUtil.formatJson(result));
                            LogUtils.json(result);
                        }

                        @Override
                        public void _error(Throwable e, String msg) {
                            ToastUtils.showShort(msg);
                        }
                    });
        }
    }
}
