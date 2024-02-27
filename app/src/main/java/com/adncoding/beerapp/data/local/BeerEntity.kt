package com.adncoding.beerapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by AidenChang 2024/02/27
 */
@Entity
data class BeerEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    val tagline: String,
    val description: String,
    val firstBrewed: String,
    val imageUrl: String?
)
