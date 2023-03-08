/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.controller;

import hotel.model.RadnoMjesto;
import hotel.util.HotelException;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class ObradaRadnoMjesto extends Obrada<RadnoMjesto>{

    @Override
    public List<RadnoMjesto> read() {
        return session.createQuery("from RadnoMjesto", RadnoMjesto.class).list();
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
