/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.util;

import com.github.javafaker.Faker;
import hotel.model.Djelatnik;
import hotel.model.Gost;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Korisnik
 */
public class PocetniInsert {
    
    private static final int BROJ_GOSTIJU = 50;
    private static final int BROJ_DJELATNIKA = 20;
    
    private Faker faker;
    private List<Gost> gosti;
    private List<Djelatnik> djelatnici;
    
    private Session session;

    public PocetniInsert() {
        
        faker = new Faker();
        gosti = new ArrayList<>();
        djelatnici = new ArrayList<>();
        
        
        session = HibernateUtil.getSession();
        session.beginTransaction();
        
        kreirajGoste();
        kreirajDjelatnike();
        
        session.getTransaction().commit();
    }

    private void kreirajGoste() {
        
        Gost g;
        for (int i = 0; i < BROJ_GOSTIJU; i++){
            g =new Gost();
            g.setIme(faker.name().firstName());
            g.setPrezime(faker.name().lastName());
            g.setOIB(Alati.dovuciOib());
            g.setEmail(faker.internet().emailAddress());
            g.setKontakTelefon(faker.phoneNumber().cellPhone());
            
            session.persist(g);
            gosti.add(g);
        }
        
    }

    private void kreirajDjelatnike() {
        
        Djelatnik d;
        for (int i = 0; i < BROJ_DJELATNIKA; i++){
            d=new Djelatnik();
            d.setIme(faker.name().firstName());
            d.setPrezime(faker.name().lastName());
            d.setBrojUgovora(faker.number().toString());
            d.setOIB(Alati.dovuciOib());
            
            session.persist(d);
            djelatnici.add(d);
        }
    }
    
    
      
}