package open.aip.peakchao.com.apiopenapp.base;

import android.app.ProgressDialog;
import android.content.Context;

import java.io.IOException;

import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by Chao  2018/8/21 on 16:28
 * description
 */

public abstract class BaseSubscriber<T> implements Observer<T> {
    protected Context context;
    protected Disposable disposable;
    protected CompositeDisposable disposables;
    private ProgressDialog progressBar;

    public BaseSubscriber(Context context, CompositeDisposable disposables) {
        this.context = context;
        this.disposables = disposables;
        progressBar = new ProgressDialog(context);
    }


    @Override
    public void onSubscribe(Disposable d) {
        if (d != null && disposables != null) {
            disposable = d;
            disposables.add(d);
        }
        progressBar.show();
        progressBar.setCancelable(false);
        progressBar.setCanceledOnTouchOutside(false);
    }

    @Override
    public void onNext(T o) {
        try {
            _success(o);
        } catch (IOException e) {
            e.printStackTrace();
            _error(e, "网络异常!");
        }
    }

    @Override
    public void onError(Throwable e) {
        _error(e, "网络异常!");
        progressBar.dismiss();
    }

    @Override
    public void onComplete() {
        progressBar.dismiss();
    }

    public abstract void _success(T data) throws IOException;

    public abstract void _error(Throwable e, String msg);
}
