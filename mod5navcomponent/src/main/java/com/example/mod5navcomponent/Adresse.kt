package com.example.mod5navcomponent

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Adresse(val nomDeLaRue : String, val numeroRue : Int)
    : Parcelable
