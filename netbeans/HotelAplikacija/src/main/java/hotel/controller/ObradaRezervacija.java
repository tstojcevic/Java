/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.controller;

import hotel.model.Rezervacija;
import hotel.model.Smjestaj;
import hotel.util.HotelException;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class ObradaRezervacija extends Obrada<Rezervacija> {

    @Override
    public List<Rezervacija> read() {
        return session.createQuery("from Rezervacija", Rezervacija.class).list();
    }

    public List<Rezervacija> read(Smjestaj s) {
        return session.createQuery("from Rezervacija "
                + " where Smjestaj=:Smjestaj "
                + " order by brojRezervacije desc ",
                Rezervacija.class)
                .setParameter("Smjestaj", s)
                .list();

    }

    @Override
    protected void kontrolaUnos() throws HotelException {

    }

    @Override
    protected void kontrolaPromjena() throws HotelException {

    }

    @Override
    protected void kontrolaBrisanje() throws HotelException {

    }

}
