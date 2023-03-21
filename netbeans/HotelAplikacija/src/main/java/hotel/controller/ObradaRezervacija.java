/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.controller;

import hotel.model.Rezervacija;
import hotel.util.HotelException;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class ObradaRezervacija extends Obrada<Rezervacija>{

    @Override
    public List<Rezervacija> read() {
        return session.createQuery("from Rezervacija order by brojRezervacije", Rezervacija.class).list();
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
