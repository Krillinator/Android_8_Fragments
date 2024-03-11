package com.krillinator.lektion_8_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HelloWorldFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    // TODO - 10:12 - Fortsätter vi! :)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_hello_world, container, false)

        // Components / Widgets
        val fabHelloWorld: FloatingActionButton = view.findViewById(R.id.fab_close)

        fabHelloWorld.setOnClickListener {
            parentFragmentManager.beginTransaction().remove(this).commit()
        }

        return view
    }



}