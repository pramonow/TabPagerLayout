package pramonow.com.smoothtablayout

import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.ViewGroup

class ScreenSlidePagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    public var fragmentList = ArrayList<SampleFragment>()

    override fun getItem(position: Int): SampleFragment {

        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }
}