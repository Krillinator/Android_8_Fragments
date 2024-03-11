package com.krillinator.lektion_8_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.commit
import com.krillinator.lektion_8_fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setup ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Components / Widgets
        val fcvHelloWorldFabs = binding.fcvHelloWorldFabs
        val btnCreateFragment = binding.btnCreateFragment

        // Listener
        btnCreateFragment.setOnClickListener {
            createHelloWorldFragment(fcvHelloWorldFabs)
        }

    }

    // Methods
    fun createHelloWorldFragment(fcvHelloWorldFabs: FragmentContainerView) {

        println(supportFragmentManager.findFragmentByTag("hello_world_fragment"))

        supportFragmentManager.commit {

            setReorderingAllowed(true)
            add(fcvHelloWorldFabs.id, HelloWorldFragment(), "hello_world_fragment")

        }
    }



}