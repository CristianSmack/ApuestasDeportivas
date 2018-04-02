package cristiandevs.apuestasdeportivas.Model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Cristian on 02/04/2018.
 */


@Entity(tableName = "apuestaInsertada")
public class Apuesta{

    @PrimaryKey(autoGenerate = true)
    long id;
    String nombre;
    float cuota;
    float dineroApostado;
    boolean ganada;

    public Apuesta(long id, String nombre, float cuota, float dineroApostado, boolean ganada) {
        this.id = id;
        this.nombre = nombre;
        this.cuota = cuota;
        this.dineroApostado = dineroApostado;
        this.ganada = ganada;
    }

    @Ignore
    public Apuesta(String nombre, float cuota, float dineroApostado, boolean ganada) {
        this.nombre = nombre;
        this.cuota = cuota;
        this.dineroApostado = dineroApostado;
        this.ganada = ganada;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public float getDineroApostado() {
        return dineroApostado;
    }

    public void setDineroApostado(float dineroApostado) {
        this.dineroApostado = dineroApostado;
    }

    public boolean isGanada() {
        return ganada;
    }

    public void setGanada(boolean ganada) {
        this.ganada = ganada;
    }
}
