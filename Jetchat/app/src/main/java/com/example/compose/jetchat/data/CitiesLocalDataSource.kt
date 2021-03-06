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

package com.example.compose.jetchat.data

private const val DEFAULT_IMAGE_WIDTH = "250"

/**
 * Annotated with Singleton as the class created a lot of objects.
 */
class CitiesLocalDataSource {

    val cities = listOf(
        City(
            name = "Madrid",
            country = "Spain",
            latitude = "40.416775",
            longitude = "-3.703790"
        ),

        City(
            name = "Naples",
            country = "Italy",
            latitude = "40.853294",
            longitude = "14.305573"
        ),

        City(
            name = "Dallas",
            country = "US",
            latitude = "32.779167",
            longitude = "-96.808891"
        ),

        City(
            name = "Cordoba",
            country = "Argentina",
            latitude = "-31.416668",
            longitude = "-64.183334"
        ),

        City(
            name = "Maldivas",
            country = "South Asia",
            latitude = "1.924992",
            longitude = "73.399658"
        ),

        City(
            name = "Aspen",
            country = "Colorado",
            latitude = "39.191097",
            longitude = "-106.817535"
        ),

        City(
            name = "Bali",
            country = "Indonesia",
            latitude = "-8.3405",
            longitude = "115.0920"
        ),

        City(
            name = "Khumbu Valley",
            country = "Nepal",
            latitude = "27.9320",
            longitude = "86.8050"
        ),

        City(
            name = "Rome",
            country = "Italy",
            latitude = "41.902782",
            longitude = "12.496366"
        ),

        City(
            name = "Granada",
            country = "Spain",
            latitude = "37.18817",
            longitude = "-3.60667"
        ),

        City(
            name = "Washington DC",
            country = "USA",
            latitude = "38.9072",
            longitude = "-77.0369"
        ),

        City(
            name = "Barcelona",
            country = "Spain",
            latitude = "41.390205",
            longitude = "2.154007"
        ),

        City(
            name = "Crete",
            country = "Greece",
            latitude = "35.2401",
            longitude = "24.8093"
        )

    )
}
