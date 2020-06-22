package com.ht2mh.newsapp.ui.main.fragments

import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.postDelayed
import androidx.navigation.fragment.findNavController
import com.ht2mh.newsapp.R


class SplashFragment : BaseMainFragment() {

    override val TAG: String
        get() = "SplashFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e(TAG,"onActivityCreated")
        val handler = Handler()
        handler.postDelayed({
            Log.e(TAG,"onActivityCreated: postDelayed:")
            navigateToDestination(R.id.action_splashFragment_to_newsListFragment)
        },3000)

        Log.e(TAG,"onActivityCreated: postDelayed:........")

    }

}