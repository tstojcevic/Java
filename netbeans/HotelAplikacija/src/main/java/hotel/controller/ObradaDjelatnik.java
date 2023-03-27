/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.controller;

import hotel.model.Djelatnik;
import hotel.util.HotelException;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class ObradaDjelatnik extends Obrada<Djelatnik> {

    @Override
    public List<Djelatnik> read() {
        return session.createQuery("from Djelatnik order by ime, prezime", Djelatnik.class).list();
    }

    public List<Djelatnik> read(String uvjet) {
        uvjet = uvjet.trim();
        uvjet = "%" + uvjet + "%";
        return session.createQuery(" from Djelatnik "
                + " where concat(ime,' ',prezime,' ',brojUgovora,' ',OIB,' ',radnoMjesto) "
                + " like :uvjet "
                + " order by ime, prezime ",
                Djelatnik.class).setParameter("uvjet", uvjet)
                .setMaxResults(10)
                .list();
    }

    public List<Djelatnik> read(String uvjet,
            boolean traziOdPocetkaImena) {
        uvjet = uvjet.trim();
        if (traziOdPocetkaImena) {
            uvjet = uvjet + "%";
        } else {
            uvjet = "%" + uvjet + "%";
        }

        return session.createQuery("from Djelatnik "
                + " where concat(ime,' ',prezime,' ',ime) "
                + " like :uvjet "
                + " order by prezime, ime ",
                Djelatnik.class)
                .setParameter("uvjet", uvjet)
                .setMaxResults(12)
                .list();
    }

    @Override
    protected void kontrolaUnos() throws HotelException {
//        kontrolaIme();
//        kontrolaPrezime();
//        kontrolaBrojUgovora();
//        kontrolaOIB();
//        kontrolaRadnoMjesto();
    }

    @Override
    protected void kontrolaPromjena() throws HotelException {

    }

    @Override
    protected void kontrolaBrisanje() throws HotelException {

    }

}
