package com.example.alancasas.fragmets.Activities

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.example.alancasas.fragmets.Fragments.DataFragment
import com.example.alancasas.fragmets.Fragments.DetailFragment
import com.example.alancasas.fragmets.R

class MainActivity : FragmentActivity(), DataFragment.DataListener {

    var isMultiPanel : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setMultiPanel()
    }

    override fun sendDataListener(text: String) {
        if (isMultiPanel) {
            val detailFragment: DetailFragment = supportFragmentManager.findFragmentById(R.id.detail_fragment) as DetailFragment
            detailFragment.renderText(text)
        }else{
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra("extra", text)
            startActivity(intent)
        }

    }

    fun setMultiPanel(){
        isMultiPanel = supportFragmentManager.findFragmentById(R.id.detail_fragment) != null
    }

}
