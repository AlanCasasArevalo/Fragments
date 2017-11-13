package com.example.alancasas.fragmets.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.alancasas.fragmets.Fragments.DetailFragment
import com.example.alancasas.fragmets.R

class DetailActivity : AppCompatActivity() {

    private var text : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        if (intent.extras != null){
            text = intent.getStringExtra("extra")
        }

        val detailFragment: DetailFragment = supportFragmentManager.findFragmentById(R.id.detail_fragment) as DetailFragment
        detailFragment.renderText(text)

    }
}
