package cristiandevs.apuestasdeportivas.Data.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import cristiandevs.apuestasdeportivas.Data.Database.DAO.ApuestasDAO;
import cristiandevs.apuestasdeportivas.Model.Apuesta;

/**
 * Created by Cristian on 02/04/2018.
 */

@Database(entities = {Apuesta.class}, version = 1)
public abstract class ApuestasDatabase extends RoomDatabase{

    //Patron Singleton
    protected static ApuestasDatabase apuestasDatabase;

    //Constructor vacio
    protected ApuestasDatabase(){};

    public static ApuestasDatabase getInstance(Context context){
        if(apuestasDatabase == null)
            apuestasDatabase = Room.databaseBuilder(context.getApplicationContext(),
                    ApuestasDatabase.class,"ApuestasDatabase").allowMainThreadQueries().fallbackToDestructiveMigration().build();

        return apuestasDatabase;
    }

    public abstract ApuestasDAO apuestasDAO();

}
