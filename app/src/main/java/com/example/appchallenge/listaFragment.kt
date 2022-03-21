package com.example.appchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.appchallenge.data.Tarea
import com.example.appchallenge.databinding.FragmentInicioBinding
import com.example.appchallenge.databinding.FragmentListaBinding

class listaFragment : Fragment() {
    lateinit var binding: FragmentListaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListaBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val tarea = arguments?.getParcelable<Tarea>("tarea")
        /* Prueba para revisar que lleguen bien los datos
        val nombre = tarea?.Nombre
        Toast.makeText(requireActivity(),"$nombre", Toast.LENGTH_SHORT).show()
         */
    }

}