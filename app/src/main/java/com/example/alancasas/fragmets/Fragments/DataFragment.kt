package com.example.alancasas.fragmets.Fragments


import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

import com.example.alancasas.fragmets.R
class DataFragment : Fragment() {

    private var editText :EditText? = null
    private var sendButton : Button? = null
    private var sendTextCallback: DataListener? = null

    lateinit var rootView:View

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        if (inflater != null) {
            rootView = inflater?.inflate(R.layout.fragment_data, container, false)

            editText = rootView.findViewById(R.id.edit_text_data)
            sendButton = rootView.findViewById(R.id.button_send)

            sendButton?.setOnClickListener {
                sendText(editText?.text.toString())
            }

        }
        return rootView
    }

    fun sendText(text:String) {
        sendTextCallback?.sendDataListener(text)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        commonAttach(context)

    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        commonAttach(activity)
    }


    fun commonAttach (listener: Any?){
        if(listener is DataListener){
            sendTextCallback = listener
        }
    }

    override fun onDetach() {
        super.onDetach()
        sendTextCallback = null
    }

    public interface DataListener{
        fun sendDataListener(text: String)
    }

}



























