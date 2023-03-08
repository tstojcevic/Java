/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.controller;

import hotel.model.Djelatnik;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class ObradaDjelatnik extends Obrada<Djelatnik>{

    @Override
    public List<Djelatnik> read() {
    return session.createQuery("from Djelatnik", Djelatnik.class).list();
    }
    
    
    
}
