/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.controller;

import hotel.model.Djelatnik;
import hotel.model.RadnoMjesto;
import hotel.util.HotelException;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class ObradaRadnoMjesto extends Obrada<RadnoMjesto> {

    @Override
    public List<RadnoMjesto> read() {
        return session.createQuery("from RadnoMjesto", RadnoMjesto.class).list();
    }

    @Override
    protected void kontrolaUnos() throws HotelException {
        kontrolaNaziv();
        kontrolaPlaca();
        kontrolaSmjenskiRad();
    }

    @Override
    protected void kontrolaPromjena() throws HotelException {

    }

    @Override
    protected void kontrolaBrisanje() throws HotelException {
        if (entitet.getDjelatnici() != null && !entitet.getDjelatnici().isEmpty()) {

            StringBuilder sb = new StringBuilder();
            sb.append("Radno mjesto ");
            sb.append(entitet.getNaziv());
            sb.append(" se ne može obrisati jer ima djelatnika:");
            sb.append("\n");
            int b = 0;
            for (Djelatnik d : entitet.getDjelatnici()) {
                sb.append(++b);
                sb.append(". ");
                sb.append(d.getIme());
                sb.append(" ");
                sb.append(d.getPrezime());
                sb.append("\n");
            }
            sb.append("--------");

            throw new HotelException(sb.toString());
        }
    }

    private void kontrolaNaziv() throws HotelException {
        kontrolaNazivNull();
        kontrolaNazivBroj();
        kontrolaNazivSadrziBroj();
    }

    private void kontrolaNazivNull() throws HotelException {

        if (entitet.getNaziv() == null) {
            throw new HotelException("Naziv mora biti upisan");
        }
    }

    private void kontrolaNazivBroj() throws HotelException {
        boolean broj = false;
        try {
            Double.parseDouble(entitet.getNaziv());
            broj = true;
        } catch (Exception e) {
        }
        if (broj) {
            throw new HotelException("Ime radnog mjesta ne smije biti broj");
        }
    }

    private void kontrolaNazivSadrziBroj() throws HotelException {
        char[] b = entitet.getNaziv().toCharArray();

        for (char ch : b) {
            if (Character.isDigit(ch)) {
                throw new HotelException("Naziv radnog mjesta sadrži broj");
            }

        }
    }

    private void kontrolaPlaca() throws HotelException {
        kontrolaPlacaNull();
    }

    private void kontrolaSmjenskiRad() throws HotelException {
        kontrolaSmjenskiRadNull();
    }

}
