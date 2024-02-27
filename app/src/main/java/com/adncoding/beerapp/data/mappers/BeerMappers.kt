package com.adncoding.beerapp.data.mappers

import com.adncoding.beerapp.data.local.BeerEntity
import com.adncoding.beerapp.data.remote.BeerDto
import com.adncoding.beerapp.domain.Beer

/**
 * Created by AidenChang 2024/02/27
 */

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}