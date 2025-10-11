package dev.iflores.appue.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface FavoriteCountryDao {

    //Insert FovoriteCOuntryEntity
    @Insert
    suspend fun insertFavoriteCountry(country: FavoriteCountryEntity)

    //Delete FavoriteCountryEntity
    @Delete
    suspend fun deleteFavoriteCountry(country: FavoriteCountryEntity)

    //Get FavoriteCountryEntity
    @Query("SELECT * FROM favorite_countries")
    suspend fun getAll(): Flow<List<FavoriteCountryEntity>>




}