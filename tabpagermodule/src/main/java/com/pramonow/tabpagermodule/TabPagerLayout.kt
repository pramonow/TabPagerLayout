package com.pramonow.tabpagermodule

import android.app.Activity
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout

class TabPagerLayout:LinearLayout{

    lateinit private var screenSlidePagerAdapter:ScreenSlidePagerAdapter
    lateinit private var layoutActivity : FragmentActivity
    lateinit private var viewPager:ViewPager
    lateinit private var tabLayout: TabLayout

    constructor(context: Context, attr: AttributeSet) : super(context,attr) {
        init(context, attr)
    }

    fun setActivity(activity: FragmentActivity)
    {
        this.layoutActivity = activity
        screenSlidePagerAdapter = ScreenSlidePagerAdapter(layoutActivity.supportFragmentManager)
        viewPager.adapter = screenSlidePagerAdapter

    }

    fun addTabFragment(title:String, fragment:Fragment)
    {
        tabLayout.addTab(tabLayout.newTab().setText(title))
        screenSlidePagerAdapter.fragmentList.add(fragment)
        screenSlidePagerAdapter.notifyDataSetChanged()
    }

    fun setTabBackgroundColour(color:Drawable)
    {
        tabLayout.background = color
    }

    fun setSelectedTabColour(color:Int)
    {
        tabLayout.setSelectedTabIndicatorColor(color)
    }

    fun setTabTextColor(color:ColorStateList)
    {
        tabLayout.tabTextColors = color
    }

    private fun init(context: Context, attr: AttributeSet)
    {
        View.inflate(context, R.layout.view_tab_pager,this)

        viewPager = findViewById(R.id.view_pager)
        tabLayout = findViewById(R.id.tab_layout)

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL)
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.setCurrentItem(tab.position)

            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })


        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
    }
}