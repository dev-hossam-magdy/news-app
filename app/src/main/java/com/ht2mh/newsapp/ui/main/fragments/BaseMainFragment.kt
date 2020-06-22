package com.ht2mh.newsapp.ui.main.fragments

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

abstract class BaseMainFragment:Fragment() {

    abstract protected val TAG :String
    




    protected fun navigateToDestination(destinationId:Int){
        
        Log.e(TAG,"navigateToDestination")
        findNavController().navigate(destinationId)
    }
}