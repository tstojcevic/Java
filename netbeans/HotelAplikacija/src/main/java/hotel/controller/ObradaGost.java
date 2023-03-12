/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.controller;

import hotel.model.Gost;
import hotel.util.Alati;
import hotel.util.HotelException;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class ObradaGost extends Obrada<Gost> {

    @Override
    public List<Gost> read() {
        return session.createQuery("from Gost order by ime", Gost.class).list();
    }

    @Override
    protected void kontrolaUnos() throws HotelException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaOIB();
        kontrolaEmail();
        kontrolaKontaktTelefon();

    }

    @Override
    protected void kontrolaPromjena() throws HotelException {
        kontrolaImeNull();
        kontrolaImeBroj();
        kontrolaImeMinimalnaDuzina();
        kontrolaImeMaksimalnaDuzina();
        kontrolaImeSadrziBroj();

        kontrolaPrezimeNull();
        kontrolaPrezimeBroj();
        kontrolaPrezimeMinimalnaDuzina();
        kontrolaPrezimeMaksimalnaDuzina();
        kontrolaPrezimeSadrziBroj();

        kontrolaOIBNull();

        kontrolaEmailNull();
        kontrolaEmailMinimalnaDuzina();

        kontrolaKontaktTelefonNull();
        kontrolaKontaktTelefonZnak();
    }

    @Override
    protected void kontrolaBrisanje() throws HotelException {

    }

    private void kontrolaIme() throws HotelException {
        kontrolaImeNull();
        kontrolaImeBroj();
        kontrolaImeMinimalnaDuzina();
        kontrolaImeMaksimalnaDuzina();
        kontrolaImeSadrziBroj();
    }

    private void kontrolaImeNull() throws HotelException {

        if (entitet.getIme() == null) {
            throw new HotelException("Ime mora biti upisano");
        }
    }

    private void kontrolaImeBroj() throws HotelException {
        boolean broj = false;
        try {
            Double.parseDouble(entitet.getIme());
            broj = true;
        } catch (Exception e) {
        }
        if (broj) {
            throw new HotelException("Ime gosta ne smije biti broj");
        }
    }

    private void kontrolaImeMinimalnaDuzina() throws HotelException {
        if (entitet.getIme().trim().length() < 3) {
            throw new HotelException("Ime gosta može imati minimalno 3 znaka");
        }
    }

    private void kontrolaImeMaksimalnaDuzina() throws HotelException {
        if (entitet.getIme().trim().length() > 20) {
            throw new HotelException("Ime gosta može imati maksimalno 20 znakova");
        }
    }

    private void kontrolaImeSadrziBroj() throws HotelException {

        char[] b = entitet.getIme().toCharArray();

        for (char ch : b) {
            if (Character.isDigit(ch)) {
                throw new HotelException("Ime sadrži broj");
            }

        }
    }

    private void kontrolaPrezime() throws HotelException {
        kontrolaPrezimeNull();
        kontrolaPrezimeBroj();
        kontrolaPrezimeMinimalnaDuzina();
        kontrolaPrezimeMaksimalnaDuzina();
        kontrolaPrezimeSadrziBroj();
    }

    private void kontrolaPrezimeNull() throws HotelException {
        if (entitet.getPrezime() == null) {
            throw new HotelException("Prezime mora biti upisano");
        }
    }

    private void kontrolaPrezimeBroj() throws HotelException {
        boolean broj = false;
        try {
            Double.parseDouble(entitet.getPrezime());
            broj = true;
        } catch (Exception e) {
        }
        if (broj) {
            throw new HotelException("Prezime gosta ne smije biti broj");
        }
    }

    private void kontrolaPrezimeMinimalnaDuzina() throws HotelException {
        if (entitet.getPrezime().trim().length() < 3) {
            throw new HotelException("Prezime gosta može imati minimalno 3 znaka");
        }
    }

    private void kontrolaPrezimeMaksimalnaDuzina() throws HotelException {
        if (entitet.getPrezime().trim().length() > 20) {
            throw new HotelException("Prezime gosta može imati maksimalno 30 znakova");
        }
    }

    private void kontrolaPrezimeSadrziBroj() throws HotelException {
        char[] b = entitet.getIme().toCharArray();
        for (char ch : b) {
            if (Character.isDigit(ch)) {
                throw new HotelException("Prezime sadrži broj");
            }
        }
    }

    private void kontrolaOIB() throws HotelException {
        kontrolaOIBNull();
    }

    private void kontrolaOIBNull() throws HotelException {
        if (entitet.getOIB() == null) {
            throw new HotelException("OIB mora biti unesen");
        } else if (!Alati.kontrolaOIB(entitet.getOIB())) {
            throw new HotelException("OIB nije u dobrom formatu");
        }
    }

    private void kontrolaEmail() throws HotelException {
        kontrolaEmailNull();
        kontrolaEmailMinimalnaDuzina();
    }

    private void kontrolaEmailNull() throws HotelException {
        if (entitet.getEmail() == null) {
            throw new HotelException("Email mora biti unesen");
        }
    }
    
    private void kontrolaEmailMinimalnaDuzina() throws HotelException{
        if (entitet.getEmail().trim().length() < 3) {
            throw new HotelException("Email gosta može imati minimalno 3 znaka");
        }
    }

    private void kontrolaKontaktTelefon() throws HotelException {
        kontrolaKontaktTelefonNull();
        kontrolaKontaktTelefonZnak();
    }

    private void kontrolaKontaktTelefonNull() throws HotelException {
        if (entitet.getKontakTelefon() == null) {
            throw new HotelException("Kontakt telefon mora biti unesen");
        }
    }
    
    private void kontrolaKontaktTelefonZnak() throws HotelException{
        char[] z = entitet.getKontakTelefon().toCharArray();

        for (char ch : z) {
            if (Character.isAlphabetic(ch)) {
                throw new HotelException("Unijeli ste znak umjesto broja");
            }

        }
    }

}
