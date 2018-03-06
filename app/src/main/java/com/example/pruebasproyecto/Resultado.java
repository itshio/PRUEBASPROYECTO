package com.example.pruebasproyecto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by DIDACT on 05/03/2018.
 */

public class Resultado implements Parcelable{

    String equipo_local;
    String equipo_visitante;
    int fecha;
    int resultado_local;
    int resultado_visitante;
    int meleganada_local;
    int meleperdida_local;
    int meleganada_visitante;
    int meleperdida_visitante;
    int touchganada_local;
    int touchperdida_local;
    int touchganada_visitante;
    int touchperdida_visitante;
    int golpes_local;
    int golpes_visitante;
    int amarilla_local;
    int amarilla_visitante;
    int roja_local;
    int roja_visitante;
    int agrupamientoganado_local;
    int agrupamientoganado_visitante;
    int agrupamientoperdido_local;
    int agrupamientoperdido_visitante;
    int avant_local;
    int avant_visitante;
    int recuperaciones_local;
    int recuperaciones_visitante;
    int placajes_local;
    int placajes_visitante;
    int contraruck_local;
    int contraruck_visitante;
    int drop_local;
    int drop_visitante;
    int ensayoscastigo_local;
    int ensayocastigo_visitante;
    int juegoalpiepositivo_local;
    int juegoalpiepositivo_visitante;
    int juegoalpienegativo_visitante;
    int juegoalpienegativo_local;
    int crono_real;
    int crono_jugado;

    public static final Parcelable.Creator<Resultado> CREATOR = new Parcelable.Creator<Resultado>(){
        public Resultado createFromParcel(Parcel in) {
            return new Resultado(in);
        }
        public Resultado[] newArray(int size){
            return new Resultado[size];
        }
    };



    public Resultado() {
    }

    public Resultado(Parcel parcel){

        ReadFromParcel(parcel);
    }

    public Resultado(String equipo_local, String equipo_visitante, int fecha, int resultado_local, int resultado_visitante, int meleganada_local, int meleperdida_local, int meleganada_visitante, int meleperdida_visitante, int touchganada_local, int touchperdida_local, int touchganada_visitante, int touchperdida_visitante, int golpes_local, int golpes_visitante, int amarilla_local, int amarilla_visitante, int roja_local, int roja_visitante, int agrupamientoganado_local, int agrupamientoganado_visitante, int agrupamientoperdido_local, int agrupamientoperdido_visitante, int avant_local, int avant_visitante, int recuperaciones_local, int recuperaciones_visitante, int placajes_local, int placajes_visitante, int contraruck_local, int contraruck_visitante, int drop_local, int drop_visitante, int ensayoscastigo_local, int ensayocastigo_visitante, int juegoalpiepositivo_local, int juegoalpiepositivo_visitante, int juegoalpienegativo_visitante, int juegoalpienegativo_local, int crono_real, int crono_jugado) {
        this.equipo_local = equipo_local;
        this.equipo_visitante = equipo_visitante;
        this.fecha = fecha;
        this.resultado_local = resultado_local;
        this.resultado_visitante = resultado_visitante;
        this.meleganada_local = meleganada_local;
        this.meleperdida_local = meleperdida_local;
        this.meleganada_visitante = meleganada_visitante;
        this.meleperdida_visitante = meleperdida_visitante;
        this.touchganada_local = touchganada_local;
        this.touchperdida_local = touchperdida_local;
        this.touchganada_visitante = touchganada_visitante;
        this.touchperdida_visitante = touchperdida_visitante;
        this.golpes_local = golpes_local;
        this.golpes_visitante = golpes_visitante;
        this.amarilla_local = amarilla_local;
        this.amarilla_visitante = amarilla_visitante;
        this.roja_local = roja_local;
        this.roja_visitante = roja_visitante;
        this.agrupamientoganado_local = agrupamientoganado_local;
        this.agrupamientoganado_visitante = agrupamientoganado_visitante;
        this.agrupamientoperdido_local = agrupamientoperdido_local;
        this.agrupamientoperdido_visitante = agrupamientoperdido_visitante;
        this.avant_local = avant_local;
        this.avant_visitante = avant_visitante;
        this.recuperaciones_local = recuperaciones_local;
        this.recuperaciones_visitante = recuperaciones_visitante;
        this.placajes_local = placajes_local;
        this.placajes_visitante = placajes_visitante;
        this.contraruck_local = contraruck_local;
        this.contraruck_visitante = contraruck_visitante;
        this.drop_local = drop_local;
        this.drop_visitante = drop_visitante;
        this.ensayoscastigo_local = ensayoscastigo_local;
        this.ensayocastigo_visitante = ensayocastigo_visitante;
        this.juegoalpiepositivo_local = juegoalpiepositivo_local;
        this.juegoalpiepositivo_visitante = juegoalpiepositivo_visitante;
        this.juegoalpienegativo_visitante = juegoalpienegativo_visitante;
        this.juegoalpienegativo_local = juegoalpienegativo_local;
        this.crono_real = crono_real;
        this.crono_jugado = crono_jugado;
    }

    public String getEquipo_local() {
        return equipo_local;
    }

    public void setEquipo_local(String equipo_local) {
        this.equipo_local = equipo_local;
    }

    public String getEquipo_visitante() {
        return equipo_visitante;
    }

    public void setEquipo_visitante(String equipo_visitante) {
        this.equipo_visitante = equipo_visitante;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getResultado_local() {
        return resultado_local;
    }

    public void setResultado_local(int resultado_local) {
        this.resultado_local = resultado_local;
    }

    public int getResultado_visitante() {
        return resultado_visitante;
    }

    public void setResultado_visitante(int resultado_visitante) {
        this.resultado_visitante = resultado_visitante;
    }

    public int getMeleganada_local() {
        return meleganada_local;
    }

    public void setMeleganada_local(int meleganada_local) {
        this.meleganada_local = meleganada_local;
    }

    public int getMeleperdida_local() {
        return meleperdida_local;
    }

    public void setMeleperdida_local(int meleperdida_local) {
        this.meleperdida_local = meleperdida_local;
    }

    public int getMeleganada_visitante() {
        return meleganada_visitante;
    }

    public void setMeleganada_visitante(int meleganada_visitante) {
        this.meleganada_visitante = meleganada_visitante;
    }

    public int getMeleperdida_visitante() {
        return meleperdida_visitante;
    }

    public void setMeleperdida_visitante(int meleperdida_visitante) {
        this.meleperdida_visitante = meleperdida_visitante;
    }

    public int getTouchganada_local() {
        return touchganada_local;
    }

    public void setTouchganada_local(int touchganada_local) {
        this.touchganada_local = touchganada_local;
    }

    public int getTouchperdida_local() {
        return touchperdida_local;
    }

    public void setTouchperdida_local(int touchperdida_local) {
        this.touchperdida_local = touchperdida_local;
    }

    public int getTouchganada_visitante() {
        return touchganada_visitante;
    }

    public void setTouchganada_visitante(int touchganada_visitante) {
        this.touchganada_visitante = touchganada_visitante;
    }

    public int getTouchperdida_visitante() {
        return touchperdida_visitante;
    }

    public void setTouchperdida_visitante(int touchperdida_visitante) {
        this.touchperdida_visitante = touchperdida_visitante;
    }

    public int getGolpes_local() {
        return golpes_local;
    }

    public void setGolpes_local(int golpes_local) {
        this.golpes_local = golpes_local;
    }

    public int getGolpes_visitante() {
        return golpes_visitante;
    }

    public void setGolpes_visitante(int golpes_visitante) {
        this.golpes_visitante = golpes_visitante;
    }

    public int getAmarilla_local() {
        return amarilla_local;
    }

    public void setAmarilla_local(int amarilla_local) {
        this.amarilla_local = amarilla_local;
    }

    public int getAmarilla_visitante() {
        return amarilla_visitante;
    }

    public void setAmarilla_visitante(int amarilla_visitante) {
        this.amarilla_visitante = amarilla_visitante;
    }

    public int getRoja_local() {
        return roja_local;
    }

    public void setRoja_local(int roja_local) {
        this.roja_local = roja_local;
    }

    public int getRoja_visitante() {
        return roja_visitante;
    }

    public void setRoja_visitante(int roja_visitante) {
        this.roja_visitante = roja_visitante;
    }

    public int getAgrupamientoganado_local() {
        return agrupamientoganado_local;
    }

    public void setAgrupamientoganado_local(int agrupamientoganado_local) {
        this.agrupamientoganado_local = agrupamientoganado_local;
    }

    public int getAgrupamientoganado_visitante() {
        return agrupamientoganado_visitante;
    }

    public void setAgrupamientoganado_visitante(int agrupamientoganado_visitante) {
        this.agrupamientoganado_visitante = agrupamientoganado_visitante;
    }

    public int getAgrupamientoperdido_local() {
        return agrupamientoperdido_local;
    }

    public void setAgrupamientoperdido_local(int agrupamientoperdido_local) {
        this.agrupamientoperdido_local = agrupamientoperdido_local;
    }

    public int getAgrupamientoperdido_visitante() {
        return agrupamientoperdido_visitante;
    }

    public void setAgrupamientoperdido_visitante(int agrupamientoperdido_visitante) {
        this.agrupamientoperdido_visitante = agrupamientoperdido_visitante;
    }

    public int getAvant_local() {
        return avant_local;
    }

    public void setAvant_local(int avant_local) {
        this.avant_local = avant_local;
    }

    public int getAvant_visitante() {
        return avant_visitante;
    }

    public void setAvant_visitante(int avant_visitante) {
        this.avant_visitante = avant_visitante;
    }

    public int getRecuperaciones_local() {
        return recuperaciones_local;
    }

    public void setRecuperaciones_local(int recuperaciones_local) {
        this.recuperaciones_local = recuperaciones_local;
    }

    public int getRecuperaciones_visitante() {
        return recuperaciones_visitante;
    }

    public void setRecuperaciones_visitante(int recuperaciones_visitante) {
        this.recuperaciones_visitante = recuperaciones_visitante;
    }

    public int getPlacajes_local() {
        return placajes_local;
    }

    public void setPlacajes_local(int placajes_local) {
        this.placajes_local = placajes_local;
    }

    public int getPlacajes_visitante() {
        return placajes_visitante;
    }

    public void setPlacajes_visitante(int placajes_visitante) {
        this.placajes_visitante = placajes_visitante;
    }

    public int getContraruck_local() {
        return contraruck_local;
    }

    public void setContraruck_local(int contraruck_local) {
        this.contraruck_local = contraruck_local;
    }

    public int getContraruck_visitante() {
        return contraruck_visitante;
    }

    public void setContraruck_visitante(int contraruck_visitante) {
        this.contraruck_visitante = contraruck_visitante;
    }

    public int getDrop_local() {
        return drop_local;
    }

    public void setDrop_local(int drop_local) {
        this.drop_local = drop_local;
    }

    public int getDrop_visitante() {
        return drop_visitante;
    }

    public void setDrop_visitante(int drop_visitante) {
        this.drop_visitante = drop_visitante;
    }

    public int getEnsayoscastigo_local() {
        return ensayoscastigo_local;
    }

    public void setEnsayoscastigo_local(int ensayoscastigo_local) {
        this.ensayoscastigo_local = ensayoscastigo_local;
    }

    public int getEnsayocastigo_visitante() {
        return ensayocastigo_visitante;
    }

    public void setEnsayocastigo_visitante(int ensayocastigo_visitante) {
        this.ensayocastigo_visitante = ensayocastigo_visitante;
    }

    public int getJuegoalpiepositivo_local() {
        return juegoalpiepositivo_local;
    }

    public void setJuegoalpiepositivo_local(int juegoalpiepositivo_local) {
        this.juegoalpiepositivo_local = juegoalpiepositivo_local;
    }

    public int getJuegoalpiepositivo_visitante() {
        return juegoalpiepositivo_visitante;
    }

    public void setJuegoalpiepositivo_visitante(int juegoalpiepositivo_visitante) {
        this.juegoalpiepositivo_visitante = juegoalpiepositivo_visitante;
    }

    public int getJuegoalpienegativo_visitante() {
        return juegoalpienegativo_visitante;
    }

    public void setJuegoalpienegativo_visitante(int juegoalpienegativo_visitante) {
        this.juegoalpienegativo_visitante = juegoalpienegativo_visitante;
    }

    public int getJuegoalpienegativo_local() {
        return juegoalpienegativo_local;
    }

    public void setJuegoalpienegativo_local(int juegoalpienegativo_local) {
        this.juegoalpienegativo_local = juegoalpienegativo_local;
    }

    public int getCrono_real() {
        return crono_real;
    }

    public void setCrono_real(int crono_real) {
        this.crono_real = crono_real;
    }

    public int getCrono_jugado() {
        return crono_jugado;
    }

    public void setCrono_jugado(int crono_jugado) {
        this.crono_jugado = crono_jugado;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(this.equipo_local);
        dest.writeString(this.equipo_visitante);
        dest.writeInt(this.fecha);
        dest.writeInt(this.resultado_local);
        dest.writeInt(this.resultado_visitante);
        dest.writeInt(this.meleganada_local);
        dest.writeInt(this.meleperdida_local);
        dest.writeInt(this.meleganada_visitante);
        dest.writeInt(this.meleperdida_visitante);
        dest.writeInt(this.touchganada_local);
        dest.writeInt(this.touchperdida_local);
        dest.writeInt(this.touchperdida_visitante);
        dest.writeInt(this.golpes_local);
        dest.writeInt(this.golpes_visitante);
        dest.writeInt(this.amarilla_local);
        dest.writeInt(this.amarilla_visitante);
        dest.writeInt(this.roja_local);
        dest.writeInt(this.roja_visitante);
        dest.writeInt(this.agrupamientoganado_local);
        dest.writeInt(this.agrupamientoganado_visitante);
        dest.writeInt(this.agrupamientoperdido_local);
        dest.writeInt(this.agrupamientoperdido_visitante);
        dest.writeInt(this.avant_local);
        dest.writeInt(this.avant_visitante);
        dest.writeInt(this.recuperaciones_local);
        dest.writeInt(this.recuperaciones_visitante);
        dest.writeInt(this.placajes_local);
        dest.writeInt(this.placajes_visitante);
        dest.writeInt(this.contraruck_local);
        dest.writeInt(this.contraruck_visitante);
        dest.writeInt(this.drop_local);
        dest.writeInt(this.drop_visitante);
        dest.writeInt(this.ensayoscastigo_local);
        dest.writeInt(this.ensayocastigo_visitante);
        dest.writeInt(this.juegoalpiepositivo_local);
        dest.writeInt(this.juegoalpiepositivo_visitante);
        dest.writeInt(this.juegoalpienegativo_local);
        dest.writeInt(this.juegoalpienegativo_visitante);
        dest.writeInt(this.crono_real);
        dest.writeInt(this.crono_jugado);

    }

    public void ReadFromParcel (Parcel parcel) {

        this.equipo_local=parcel.readString();
        this.equipo_visitante=parcel.readString();
        this.resultado_local=parcel.readInt();
        this.resultado_visitante=parcel.readInt();
        this.meleganada_local=parcel.readInt();
        this.meleperdida_local=parcel.readInt();
        this.meleganada_visitante=parcel.readInt();
        this.meleperdida_visitante=parcel.readInt();
        this.touchganada_local=parcel.readInt();
        this.touchperdida_local=parcel.readInt();
        this.touchganada_visitante=parcel.readInt();
        this.touchperdida_visitante=parcel.readInt();
        this.golpes_local=parcel.readInt();
        this.golpes_visitante=parcel.readInt();
        this.amarilla_local=parcel.readInt();
        this.amarilla_visitante=parcel.readInt();
        this.roja_local=parcel.readInt();
        this.roja_visitante=parcel.readInt();
        this.agrupamientoganado_local=parcel.readInt();
        this.agrupamientoganado_visitante=parcel.readInt();
        this.agrupamientoperdido_local=parcel.readInt();
        this.agrupamientoperdido_visitante=parcel.readInt();
        this.avant_local=parcel.readInt();
        this.avant_visitante=parcel.readInt();
        this.recuperaciones_local=parcel.readInt();
        this.recuperaciones_visitante=parcel.readInt();
        this.placajes_local=parcel.readInt();
        this.placajes_visitante=parcel.readInt();
        this.contraruck_local=parcel.readInt();
        this.contraruck_visitante=parcel.readInt();
        this.drop_local=parcel.readInt();
        this.drop_visitante=parcel.readInt();
        this.ensayoscastigo_local=parcel.readInt();
        this.ensayocastigo_visitante=parcel.readInt();
        this.juegoalpiepositivo_local=parcel.readInt();
        this.juegoalpiepositivo_visitante=parcel.readInt();
        this.juegoalpienegativo_local=parcel.readInt();
        this.juegoalpienegativo_visitante=parcel.readInt();
        this.crono_real=parcel.readInt();
        this.crono_jugado=parcel.readInt();



    }
}
