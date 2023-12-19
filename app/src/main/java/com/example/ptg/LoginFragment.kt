package com.example.ptg

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(com.example.ptg.R.layout.fragment_login, container, false)

        // Mendapatkan referensi ke tombol "Login" dari tampilan
        val loginButton = view.findViewById<Button>(R.id.btn_login)

        // Menambahkan OnClickListener ke tombol "Login"
        loginButton.setOnClickListener {
            onLoginButtonClick()
        }

        return view
    }

    private fun onLoginButtonClick() {
        val intent = Intent(activity, HomeActivity::class.java)
        startActivity(intent)
        activity?.finish() // Close the LoginFragment when navigating to HomeActivity
    }
}


