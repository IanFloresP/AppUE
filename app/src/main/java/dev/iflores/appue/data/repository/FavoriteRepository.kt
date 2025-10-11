package dev.iflores.appue.data.repository

import dev.iflores.appue.data.local.FavoriteCountryDao
import dev.iflores.appue.data.local.FavoriteCountryEntity
import kotlinx.coroutines.flow.Flow

class FavoriteRepository    (private val dao: FavoriteCountryDao){
    suspend fun insert(country: FavoriteCountryEntity)
    = dao.insertFavoriteCountry(country)

    suspend fun delete(country: FavoriteCountryEntity)
    = dao.deleteFavoriteCountry(country)

    fun getAll(): Flow<List<FavoriteCountryEntity>>
    = dao.getAll()

}