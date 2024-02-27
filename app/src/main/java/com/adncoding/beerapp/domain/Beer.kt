package com.adncoding.beerapp.domain

/**
 * Created by AidenChang 2024/02/27
 */
data class Beer(
    val id: Int,
    val name: String,
    val tagline: String,
    val description: String,
    val firstBrewed: String,
    val imageUrl: String?
)
