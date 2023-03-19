/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.view;

import hotel.controller.ObradaRadnoMjesto;
import hotel.model.Djelatnik;
import hotel.model.RadnoMjesto;
import hotel.util.Aplikacija;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.DefaultListModel;

/**
 *
 * @author Korisnik
 */
public class ProzorRadnoMjesto extends javax.swing.JFrame {
    
    private ObradaRadnoMjesto obrada;
    private DecimalFormat df;

    /**
     * Creates new form ProzorRadnoMjesto
     */
    public ProzorRadnoMjesto() {
        initComponents();
        obrada = new ObradaRadnoMjesto();
        DecimalFormatSymbols dfs = 
                new DecimalFormatSymbols(
                        new Locale("hr", "HR"));
        df = new DecimalFormat("###,##0.00",dfs);
        
        setTitle(Aplikacija.NAZIV_APP + ": " +
                Aplikacija.OPERATER.getImePrezime() + 
                ": Radna mjesta");
        ucitaj();
    }
    
    private void ucitaj(){
        DefaultListModel<RadnoMjesto> m = new DefaultListModel<>();
        m.addAll(obrada.read());
        lstPodaci.setModel(m);
        lstPodaci.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        chbSmjenskiRad = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstDjelatnici = new javax.swing.JList<>();
        btnDodaj = new javax.swing.JButton();
        btnPromijeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        lblUkupnoDjelatnikaNaRadnomMjestu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel1.setText("Naziv");

        jLabel2.setText("Plaća");

        txtPlaca.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        chbSmjenskiRad.setText("Smjenski rad");

        jLabel3.setText("Popis djelatnika na radnom mjestu");

        jScrollPane2.setViewportView(lstDjelatnici);

        btnDodaj.setText("Dodaj");
        btnDodaj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDodajKeyPressed(evt);
            }
        });

        btnPromijeni.setText("Promijeni");

        btnObrisi.setText("Obriši");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2))
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbSmjenskiRad)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPromijeni)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblUkupnoDjelatnikaNaRadnomMjestu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbSmjenskiRad)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromijeni))
                        .addGap(18, 18, 18)
                        .addComponent(btnObrisi))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUkupnoDjelatnikaNaRadnomMjestu, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDodajKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDodajKeyPressed

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
           if(evt.getValueIsAdjusting()){
            return;
        }
        if(lstPodaci.getSelectedValue()==null){
            return;
        }
        
        obrada.setEntitet(lstPodaci.getSelectedValue());
        
        napuniView();
    }//GEN-LAST:event_lstPodaciValueChanged



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromijeni;
    private javax.swing.JCheckBox chbSmjenskiRad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblUkupnoDjelatnikaNaRadnomMjestu;
    private javax.swing.JList<Djelatnik> lstDjelatnici;
    private javax.swing.JList<RadnoMjesto> lstPodaci;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables

    private void napuniView() {
        var rm = obrada.getEntitet();
        txtNaziv.setText(rm.getNaziv());
        try {
            txtPlaca.setText(df.format(rm.getPlaca()));
        } catch (Exception e) {
            txtPlaca.setText("");
        }
        
        chbSmjenskiRad.setSelected(rm.isSmjenskiRad());
        
        DefaultListModel<Djelatnik> m = new DefaultListModel<>();
        int ukupno=0;
        if(rm.getDjelatnici()!=null && !rm.getDjelatnici().isEmpty()){
            for(Djelatnik d : rm.getDjelatnici()){
                ukupno+=rm.getDjelatnici().size();
                m.addElement(d);
        }
        lstDjelatnici.setModel(m);
        lstDjelatnici.repaint();
        lblUkupnoDjelatnikaNaRadnomMjestu.setText("Ukupno djelatnika: " + ukupno);
        
        btnObrisi.setVisible(false);
        if(rm.getDjelatnici()==null || rm.getDjelatnici().isEmpty()){
            btnObrisi.setVisible(true);
        }
    }
    }
    
    private void napuniModel(){
        var rm = obrada.getEntitet();
        rm.setNaziv(txtNaziv.getText());
        try {
            rm.setPlaca(
                    BigDecimal.valueOf(
                    df.parse(
                            txtPlaca.getText())
                            .doubleValue()
                    )
            );
        } catch (Exception e) {
            rm.setPlaca(BigDecimal.ZERO);
        }
        
        rm.setSmjenskiRad(chbSmjenskiRad.isSelected());
        
    }
}

