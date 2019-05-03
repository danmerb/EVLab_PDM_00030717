package com.labo.ev2_00030717.fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.labo.ev2_00030717.R
import kotlinx.android.synthetic.main.fragment_boton_.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [boton_Fragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [boton_Fragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */



class boton_fragment : Fragment() {


    var listenerTool: SearchNewListener? = null

    companion object {
        fun newInstance(): boton_fragment{
            val newFragment = boton_fragment()
            return newFragment
        }
    }

    interface SearchNewListener {
        fun clickSiguiente()
        fun clickAtras()

    }

    fun initButtonA(container: View) {
        container.btn_previous.setOnClickListener {
            listenerTool?.clickSiguiente()
        }
    }

    fun initButtonB(container: View) {
        container.btn_nex.setOnClickListener {
            listenerTool?.clickAtras()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_boton_, container, false)
        initButtonA(view)
        initButtonB(view)
        return view
    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is SearchNewListener) {
            listenerTool = context
        } else {
            throw RuntimeException("Se necesita una implementación de  la interfaz")

        }
    }

    override fun onDetach() {
        super.onDetach()
        listenerTool = null
    }

}

