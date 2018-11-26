package com.gthub.williamg.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableBoolean
import com.gthub.williamg.myapplication.databinding.ActivityMainBinding
import com.gthub.williamg.myapplication.javamigrate.RetrofitFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val hideButtons = ObservableBoolean()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.hideButtons = hideButtons
        binding.userInteraction = object: MainActivityUserInteraction{
            override fun gotoJavaExample() {
                showJavaExampleFragment()
            }

            override fun gotoKotlinExample() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }
    }

    private fun showJavaExampleFragment() {
        hideButtons.set(true)
        supportFragmentManager
                .beginTransaction()
                .add(R.id.activity_content, RetrofitFragment.newInstance())
                .addToBackStack(null)
                .commit()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        hideButtons.set(false)
    }

    interface MainActivityUserInteraction {
        fun gotoJavaExample()
        fun gotoKotlinExample()
    }
}
