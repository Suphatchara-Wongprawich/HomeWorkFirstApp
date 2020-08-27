package com.example.firstapplicationexample

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.firstapplicationexample.database.DatabaseDAO
import com.example.firstapplicationexample.databinding.FragmentContactBinding

class ContactViewModel(
    val database: DatabaseDAO,
    private val binding: FragmentContactBinding,
    application: Application
) : AndroidViewModel(application) {
}