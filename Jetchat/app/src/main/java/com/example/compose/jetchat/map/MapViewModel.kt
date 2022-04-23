/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.compose.jetchat.map

import androidx.lifecycle.ViewModel
import com.example.compose.jetchat.base.Result
import com.example.compose.jetchat.data.City
import com.example.compose.jetchat.data.DestinationsRepository
import com.example.compose.jetchat.data.cityNames

class MapViewModel(
    private val destinationsRepository: DestinationsRepository,
) : ViewModel() {

    // Replace to user input
    private val cityName = cityNames.random()

    val cityDetails: Result<City>
        get() {
            val destination = destinationsRepository.getDestination(cityName)
            return if (destination != null) {
                Result.Success(destination)
            } else {
                Result.Error(IllegalArgumentException("City doesn't exist"))
            }
        }
}
