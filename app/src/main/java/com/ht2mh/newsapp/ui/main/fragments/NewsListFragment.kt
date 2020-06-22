package com.ht2mh.newsapp.ui.main.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ht2mh.newsapp.R
import com.ht2mh.newsapp.databinding.FragmentNewsListBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class NewsListFragment : Fragment() {

    @Inject
    lateinit var str:String
    lateinit var binding:FragmentNewsListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_news_list,container,false)
        val view = binding.root

        binding.str = str
        return view
    }


}