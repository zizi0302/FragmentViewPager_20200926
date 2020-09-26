package kr.co.fragmentviewpager_20200926

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setEvents()
    abstract fun setValues()

}