package com.example.tabview3.ui.myTab

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tabview3.R

class myTabFragment : Fragment() {

    private lateinit var myTabViewModel: MyTabViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        myTabViewModel = ViewModelProvider(this).get(myTabViewModel::class.java)
        return inflater.inflate(R.layout.fragment_my_tab, container, false)
    }

}