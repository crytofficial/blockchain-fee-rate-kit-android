package io.horizontalsystems.feeratekit.storage

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import io.horizontalsystems.feeratekit.FeeRate

@Database(
    version = 1,
    exportSchema = false,
    entities = [FeeRate::class]
)

abstract class KitDatabase : RoomDatabase() {
    abstract val feeRate: FeeRateDao
}