package com.kt.std.cryptochart.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kt.std.cryptochart.R

/**
 * A simple [Fragment] subclass.
 * Use the [CurrenciesListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CurrenciesListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_currencies_list, container, false)
    }

}