/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.controller;

import hotel.model.Gost;
import hotel.util.HotelException;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class ObradaGost extends Obrada<Gost>{

    @Override
    public List<Gost> read() {
        return session.createQuery("from Gost", Gost.class).list();
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
