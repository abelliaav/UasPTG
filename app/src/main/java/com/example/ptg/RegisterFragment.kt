package com.example.ptg

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class RegisterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_register, container, false)

        val registerButton = view.findViewById<Button>(R.id.btn_register)
        registerButton.setOnClickListener {
            onRegisterButtonClick()
        }

        return view
    }

    private fun onRegisterButtonClick() {
        // Buat transaksi fragment
        val transaction = fragmentManager?.beginTransaction()

        // Ganti ke fragment Login
        transaction?.replace(R.id.fragment_container, LoginFragment())
        transaction?.addToBackStack(null)
        transaction?.commit()
    }
}

