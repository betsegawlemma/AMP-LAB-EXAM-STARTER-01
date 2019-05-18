package et.edu.aait.roomdbexample.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import et.edu.aait.listdetailfragmentappliction.data.Content

@Database(entities = arrayOf(Content::class), version = 1)
abstract class MyDatabase: RoomDatabase() {
    // function that return Dao class
    companion object {

        @Volatile
        private var INSTANCE: MyDatabase? = null

        fun getDatabase(context: Context): MyDatabase {

            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MyDatabase::class.java, "my_database"
                ).build()

                INSTANCE = instance
                return instance
            }

        }
    }
}

