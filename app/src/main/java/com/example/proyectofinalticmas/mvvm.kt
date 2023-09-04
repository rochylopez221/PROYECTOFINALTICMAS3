package com.example.proyectofinalticmas
import androidx.lifecycle.ViewModel

class Mvvm : ViewModel() {
    fun compareValues(value1: String, value2: String): Boolean {
        return value1 == value2
    }
}