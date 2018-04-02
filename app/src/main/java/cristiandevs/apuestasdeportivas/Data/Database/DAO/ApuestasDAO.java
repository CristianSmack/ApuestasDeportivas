package cristiandevs.apuestasdeportivas.Data.Database.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import cristiandevs.apuestasdeportivas.Model.Apuesta;

/**
 * Created by Cristian on 02/04/2018.
 */

@Dao
public interface ApuestasDAO {
    @Query("SELECT * FROM apuestaInsertada")
    List<Apuesta> getApuestas();

    @Query("SELECT * FROM apuestaInsertada WHERE id = :id")
    Apuesta getApuesta(long id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertApuesta(Apuesta apuesta);

    @Query("DELETE FROM apuestaInsertada")
    void deleteAll();

    @Query("delete from sqlite_sequence where name='apuestaInsertada'")
    void resetAutoIncrement();

    @Update
    void updateApuesta(Apuesta apuesta);
}
