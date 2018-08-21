package open.aip.peakchao.com.apiopenapp;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by Chao  2018/8/21 on 15:05
 * description
 */

public interface ApiService {

    String BASE_URL = "https://www.apiopen.top/";

    @FormUrlEncoded
    @POST("journalismApi")
    Observable<String> testApi();

    @FormUrlEncoded
    @POST("{url}")
    Observable<ResponseBody> baseApi(@Path("url") String url, @FieldMap Map<String, Object> params);

    @GET("journalismApi")
    Observable<ResponseBody> journalismApi();

}
