package com.example.myapplication

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myapplication.ui.viewmodelvilla.HomeViewModelVilla
import com.example.myapplication.ui.viewmodelvilla.InsertViewModelVilla

object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer {
            HomeViewModelVilla(aplikasiVilla().container.villaRepository)
        }

        initializer {
            InsertViewModelVilla(aplikasiVilla().container.villaRepository)
        }
    }
}


fun CreationExtras.aplikasiVilla(): VillaApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as VillaApplication)
