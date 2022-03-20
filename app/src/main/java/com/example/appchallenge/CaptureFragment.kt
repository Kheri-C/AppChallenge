package com.example.appchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import com.example.appchallenge.databinding.FragmentCaptureBinding

class CaptureFragment : Fragment() {
    lateinit var binding: FragmentCaptureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCaptureBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.add.setOnClickListener {
            //val usuario = arguments?.getParcelable<>("nombre")
            //val tarea = Tarea()
            val action = CaptureFragmentDirections.actionCaptureFragmentToListaFragment()
            findNavController().navigate(action)
        }

    }

}