# TabLayout and View Pager Combined [![](https://jitpack.io/v/pramonow/android-tabpagerlayout.svg)](https://jitpack.io/#pramonow/android-tabpagerlayout)

Tab Layout implemented together with View pager, removing the boilerplates needed to create such TabLayout.


	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Dependency

	dependencies {
	        implementation 'com.github.pramonow:android-tabpagerlayout:-SNAPSHOT'
	}
  

# How to use

In your xml layout file put in this block

    <com.pramonow.tabpagermodule.TabPagerLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/tab_pager"/>

For the Android Activity

        var layout = findViewById<TabPagerLayout>(R.id.tab_pager)
        layout.setActivity(this)
        layout.addTabFragment("Tab 1", SampleFragment())
        layout.addTabFragment("Tab 2", SampleFragment())
        layout.addTabFragment("Tab 3", SampleFragment())

Several utility methods to be used:

    fun setTabBackgroundColour(color:Drawable)
    fun setSelectedTabColour(color:Int)
    fun setTabTextColor(color:ColorStateList)
