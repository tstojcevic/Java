/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.controller;

import hotel.model.Operater;
import hotel.util.HotelException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Korisnik
 */
public class ObradaOperater extends Obrada<Operater>{

    @Override
    public List<Operater> read() {
       return session.createQuery("from Operater", Operater.class).list();
        
    }
    
    public void unosAdminOperatera() {
        Operater o = new Operater();
        o.setIme("Toni");
        o.setPrezime("Stojčević");
        o.setEmail("toni.stojcevic@mail.com");
        o.setLozinka(BCrypt.hashpw("hotel", BCrypt.gensalt()).toCharArray());
        
        entitet = o;
        
        try {
            create();
        } catch (HotelException ex) {
            Logger.getLogger(ObradaOperater.class.getName()).log(Level.SEVERE, null, ex);
        }
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
