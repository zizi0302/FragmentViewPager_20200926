package kr.co.fragmentviewpager_20200926

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.fragmentviewpager_20200926.adapters.MainViewPagerAdapter

class MainActivity : BaseActivity() {

    lateinit var mAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setEvents() {

    }

    override fun setValues() {
        mAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mAdapter

        myTabLayout.setupWithViewPager(mainViewPager)
    }
}