package com.adncoding.beerapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by AidenChang 2024/02/27
 */
@Database(
    entities = [BeerEntity::class],
    version = 1
)
abstract class BeerDatabase: RoomDatabase() {
    abstract val dao: BeerDao
}