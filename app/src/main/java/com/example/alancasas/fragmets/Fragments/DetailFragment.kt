package com.example.alancasas.fragmets.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.example.alancasas.fragmets.R

class DetailFragment() : Fragment() {

    lateinit var rootView:View

    var detailTextView: TextView? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        if (inflater != null) {
            rootView = inflater?.inflate(R.layout.fragment_detail, container, false)

            detailTextView = rootView.findViewById(R.id.text_view_detail)
        }

        return rootView
    }

    fun renderText (text: String){
        detailTextView?.text = text
    }

}
