package com.labo.ev2_00030717.fragment

import android.content.Context
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import com.labo.ev2_00030717.R


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [panel_Fragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [panel_Fragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */



class panel_Fragment: Fragment() {

    lateinit var  nuevo_col: String

    companion object {
        private lateinit var FrameLayout: Any

        fun newInstance(nuevo_col: String): panel_Fragment {
            val newFragment = panel_Fragment
            newFragment.FrameLayout= FrameLayout
            return newFragment
        }
    }

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_panel_, container, false)

        bindData(view)

        return view
    }

    fun bindData(view: View){



    }

}
