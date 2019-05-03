package com.labo.ev2_00030717

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.FrameLayout
import android.widget.LinearLayout
import com.labo.ev2_00030717.fragment.boton_fragment
import com.labo.ev2_00030717.fragment.panel_Fragment
import com.labo.ev2_00030717.fragment.panel_Fragment.Companion.newInstance
import kotlinx.android.synthetic.main.fragment_panel_.*


class MainActivity : AppCompatActivity(), boton_fragment.SearchNewListener{




    private lateinit var mainBotonesFragment: boton_fragment
    private lateinit var mainPanelFragment: panel_Fragment
    private var listapaneles: ArrayList<String> = ArrayList()
    private var contador= 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.llenarListpaneles()
        iniciarFragmento()
    }

    private fun iniciarFragmento(){
        mainBotonesFragment= boton_fragment.newInstance()
        changeFragment(R.id.botonesFragment, mainBotonesFragment)
        mainPanelFragment= newInstance(listapaneles[0])
        changeFragment(R.id.panel_fragment, mainPanelFragment)
    }

    private fun changeFragment(id: Int, frag: Fragment) {
        supportFragmentManager.beginTransaction().replace(id, frag).commit()
    }

    override fun clickSiguiente() {
        if(listapaneles.size>contador+1) {
            mainPanelFragment = newInstance(listapaneles[contador + 1])
            contador++
            changeFragment(R.id.panel_fragment, mainPanelFragment)
        }else{
            mainPanelFragment = newInstance(listapaneles[0])
            contador=0
            changeFragment(R.id.panel_fragment, mainPanelFragment)
        }
    }

    override fun clickAtras() {
        if(contador-1>=0) {
            mainPanelFragment = newInstance(listapaneles[contador - 1])
            contador--
            changeFragment(R.id.panel_fragment,mainPanelFragment)

        }else{
            mainPanelFragment = newInstance(listapaneles[listapaneles.size-1])
            contador=listapaneles.size-1
            changeFragment(R.id.panel_fragment, mainPanelFragment)
        }
    }

    private fun llenarListpaneles( ) {
        listapaneles.add("panel_fragment.setBackgroundColor(Color.BLUE)")
        listapaneles.add(" panel_fragment.setBackgroundColor(Color.GREEN)")
        listapaneles.add(" panel_fragment.setBackgroundColor(Color.RED)")
    }




}



