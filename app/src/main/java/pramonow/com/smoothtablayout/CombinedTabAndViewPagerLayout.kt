package pramonow.com.smoothtablayout

import android.app.Activity
import android.content.Context
import android.support.design.widget.TabLayout
import android.support.v4.app.FragmentActivity
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout

class CombinedTabAndViewPagerLayout:LinearLayout{

    lateinit var screenSlidePagerAdapter:ScreenSlidePagerAdapter
    lateinit var layoutActivity : FragmentActivity
    lateinit var viewPager:ViewPager
    lateinit var tabLayout: TabLayout

    constructor(context: Context, attr: AttributeSet) : super(context,attr) {
        init(context, attr)
    }

    fun setActivity(activity: FragmentActivity)
    {
        this.layoutActivity = activity
        screenSlidePagerAdapter = ScreenSlidePagerAdapter(layoutActivity.supportFragmentManager)
        viewPager.adapter = screenSlidePagerAdapter

        screenSlidePagerAdapter.fragmentList.add(SampleFragment())
        screenSlidePagerAdapter.fragmentList.add(SampleFragment())
        screenSlidePagerAdapter.fragmentList.add(SampleFragment())
        screenSlidePagerAdapter.notifyDataSetChanged()

    }

    //fun add fragment
    //do add tab and add fragment into list

    private fun init(context: Context, attr: AttributeSet)
    {
        View.inflate(context, R.layout.view_tab_pager,this)

        //INIT EVERY VIEW
        viewPager = findViewById(R.id.view_pager)
        tabLayout = findViewById(R.id.tab_layout)

        tabLayout.addTab(tabLayout.newTab().setText("Pengurus"))
        tabLayout.addTab(tabLayout.newTab().setText("Aktivis"))
        tabLayout.addTab(tabLayout.newTab().setText("Volunteer"))



        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL)
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.setCurrentItem(tab.position)
                //position = tab.position

            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })


        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
    }
}