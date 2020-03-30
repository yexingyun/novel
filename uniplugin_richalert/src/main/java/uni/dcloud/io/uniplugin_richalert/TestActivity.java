package uni.dcloud.io.uniplugin_richalert;

import androidx.appcompat.app.AppCompatActivity;
import iwangzha.com.novel.manager.NovelManager;
import iwangzha.com.novel.manager.NovelSdk;
import iwangzha.com.novel.manager.NovelTxcCallback;

import android.app.Activity;
import android.os.Bundle;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        NovelSdk.setDebug(true);
        NovelSdk.init(this.getApplication(), "zqxxmxs_vdsejj", "8p1hc9oRJ8OI51M6");
        NovelManager.init(this, "456789", new NovelTxcCallback());

    }
}
