package com.example.alancasas.fragmets.Activities

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.example.alancasas.fragmets.Fragments.DataFragment
import com.example.alancasas.fragmets.Fragments.DetailFragment
import com.example.alancasas.fragmets.R

class MainActivity : FragmentActivity(), DataFragment.DataListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun sendDataListener(text: String) {
        val detailFragment: DetailFragment = supportFragmentManager.findFragmentById(R.id.detail_fragment) as DetailFragment
        detailFragment.renderText(text)
    }

}
