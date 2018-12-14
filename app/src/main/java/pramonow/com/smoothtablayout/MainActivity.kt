package pramonow.com.smoothtablayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.pramonow.tabpagermodule.TabPagerLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var layout = findViewById<TabPagerLayout>(R.id.tab_pager)
        layout.setActivity(this)
        layout.addTabFragment("Tab 1", SampleFragment())
        layout.addTabFragment("Tab 2", SampleFragment())
        layout.addTabFragment("Tab 3", SampleFragment())

    }
}
