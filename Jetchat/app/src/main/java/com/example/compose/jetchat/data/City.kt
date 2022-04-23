package com.example.compose.jetchat.data

import androidx.compose.runtime.Immutable

@Immutable
data class City(
    val name: String,
    val country: String,
    val latitude: String,
    val longitude: String
) {
    val nameToDisplay = "$name, $country"
}