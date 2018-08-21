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


    @OnClick({R.id.btn_01, R.id.btn_02, R.id.btn_03, R.id.btn_04, R.id.btn_05, R.id.btn_06, R.id.btn_07, R.id.btn_08, R.id.btn_09, R.id.btn_10
            , R.id.btn_11, R.id.btn_12, R.id.btn_13, R.id.btn_14, R.id.btn_15})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_01:
                GotoManager.gotoJsonPage(this, "新闻接口", "journalismApi");
                break;
            case R.id.btn_02:
                GotoManager.gotoJsonPage(this, "热门段子", "satinApi", "type=1", "page=1");
                break;
            case R.id.btn_03:
                GotoManager.gotoJsonPage(this, "热门段子【神评版本】", "satinGodApi", "type=1", "page=1");
                break;
            case R.id.btn_04:
                GotoManager.gotoJsonPage(this, "【神评版本】评论列表", "satinCommentApi", "id=27610708", "page=1");
                break;
            case R.id.btn_05:
                GotoManager.gotoJsonPage(this, "小说推荐", "novelApi");
                break;
            case R.id.btn_06:
                GotoManager.gotoJsonPage(this, "小说搜索", "novelSearchApi", "name=盗墓笔记");
                break;
            case R.id.btn_07:
                GotoManager.gotoJsonPage(this, "小说详情", "novelInfoApi", "name=盗墓笔记");
                break;
            case R.id.btn_08:
                GotoManager.gotoJsonPage(this, "天气获取", "weatherApi", "city=成都");
                break;
            case R.id.btn_09:
                GotoManager.gotoJsonPage(this, "美图获取", "meituApi", "page=1");
                break;
            case R.id.btn_10:
                GotoManager.gotoJsonPage(this, "个性网名", "femaleNameApi", "page=1");
                break;
            case R.id.btn_11:
                GotoManager.gotoJsonPage(this, "创建应用", "createUserKey", "appId=com.chat.peakchao", "passwd=123456");
                break;
            case R.id.btn_12:
                GotoManager.gotoJsonPage(this, "增加统计信息", "addStatistics", "appKey=00d91e8e0cca2b76f515926a36db68f5", "type=点击统计", "typeId=1", "count=2");
                break;
            case R.id.btn_13:
                GotoManager.gotoJsonPage(this, "查询统计信息", "findStatistics", "appKey=00d91e8e0cca2b76f515926a36db68f5");
                break;
            case R.id.btn_14:
                GotoManager.gotoJsonPage(this, "用户注册", "createUser", "key=00d91e8e0cca2b76f515926a36db68f5", "phone=13594347817", "passwd=123456");
                break;
            case R.id.btn_15:
                GotoManager.gotoJsonPage(this, "用户登陆", "login", "key=00d91e8e0cca2b76f515926a36db68f5", "phone=13594347817", "passwd=123456");
                break;
        }
    }

}
