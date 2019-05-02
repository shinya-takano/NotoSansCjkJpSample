package sample.jp.cjk.sans.noto.my.notosanscjkjpsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickMoveViewPager(view: View) {
        this.startActivity(ViewPagerActivity.createIntent(this))
    }
}
