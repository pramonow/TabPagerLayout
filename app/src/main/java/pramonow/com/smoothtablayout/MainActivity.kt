package pramonow.com.smoothtablayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var layout = findViewById<CombinedTabAndViewPagerLayout>(R.id.tab_pager)
        layout.setActivity(this)

    }
}
