/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import hotel.controller.ObradaGost;
import hotel.controller.ObradaRezervacija;
import hotel.controller.ObradaSmjestaj;
import hotel.model.Djelatnik;
import hotel.model.Gost;
import hotel.model.Rezervacija;
import hotel.model.Smjestaj;
import hotel.util.Aplikacija;
import hotel.util.HotelException;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Korisnik
 */
public class ProzorRezervacija extends javax.swing.JFrame implements HotelViewSucelje {

    private ObradaRezervacija obrada;

    /**
     * Creates new form ProzorRezervacija
     */
    public ProzorRezervacija() {
        initComponents();
        obrada = new ObradaRezervacija();

        setTitle(Aplikacija.NAZIV_APP + ": "
                + Aplikacija.OPERATER.getImePrezime()
                + ": Rezervacije");
        definirajDatumPrijave();
        definirajDatumOdjave();
        ucitajFilterGosti();
        ucitajGoste();
        ucitaj();
    }

    private void definirajDatumPrijave() {
        DatePickerSettings dps
                = new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesCommonEra("dd. MM. YYYY.");
        dps.setTranslationClear("Očisti");
        dps.setTranslationToday("Danas");
        dpDatumOdjave.setSettings(dps);
    }

    private void definirajDatumOdjave() {
        DatePickerSettings dps
                = new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesCommonEra("dd. MM. YYYY.");
        dps.setTranslationClear("Očisti");
        dps.setTranslationToday("Danas");
        dpDatumOdjave.setSettings(dps);
    }

    private void ucitajGoste() {
        DefaultComboBoxModel<Gost> m = new DefaultComboBoxModel<>();
        Gost g = new Gost();
        g.setSifra(0);
        g.setIme("Nije");
        g.setPrezime(" odabrano");
        m.addElement(g);
        m.addAll(new ObradaGost().read());
        cmbGost.setModel(m);
        cmbGost.repaint();
    }

    private void ucitajFilterGosti() {
        DefaultComboBoxModel<Gost> m = new DefaultComboBoxModel<>();
        m.addAll(new ObradaGost().read());
        cmbFilterGosti.setModel(m);
        cmbFilterGosti.repaint();
        cmbFilterGosti.setSelectedIndex(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbFilterGosti = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtBrojRezervacije = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBrojGostiju = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBrojSmjestajnihJedinica = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbGost = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        dpDatumPrijave = new com.github.lgooddatepicker.components.DatePicker();
        jLabel6 = new javax.swing.JLabel();
        dpDatumOdjave = new com.github.lgooddatepicker.components.DatePicker();
        btnDodaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cmbFilterGosti.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFilterGostiItemStateChanged(evt);
            }
        });

        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel1.setText("Broj rezervacije");

        jLabel2.setText("Broj gostiju");

        jLabel3.setText("Broj smještajnih jedinica");

        jLabel4.setText("Gost");

        jLabel5.setText("Datum prijave");

        jLabel6.setText("Datum odjave");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbFilterGosti, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(txtBrojRezervacije)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBrojGostiju)
                        .addComponent(jLabel3)
                        .addComponent(txtBrojSmjestajnihJedinica)
                        .addComponent(jLabel4)
                        .addComponent(cmbGost, 0, 146, Short.MAX_VALUE))
                    .addComponent(jLabel5)
                    .addComponent(dpDatumPrijave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpDatumOdjave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDodaj))
                .addContainerGap(476, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBrojRezervacije, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBrojGostiju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBrojSmjestajnihJedinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addComponent(cmbGost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dpDatumPrijave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dpDatumOdjave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnDodaj)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbFilterGosti, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFilterGostiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFilterGostiItemStateChanged
        ucitaj();
    }//GEN-LAST:event_cmbFilterGostiItemStateChanged

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        if (lstPodaci.getSelectedValue() == null) {
            return;
        }

        obrada.setEntitet(lstPodaci.getSelectedValue());

        napuniView();
    }//GEN-LAST:event_lstPodaciValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Rezervacija());
        napuniModel();
        try {
            obrada.create();
            ucitaj();
        } catch (HotelException ex) {
            JOptionPane.showMessageDialog(getParent(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    @Override
    public void ucitaj() {
        DefaultListModel<Rezervacija> m = new DefaultListModel<>();
        m.addAll(obrada.read((Gost) cmbFilterGosti.getSelectedItem()));
        lstPodaci.setModel(m);
        lstPodaci.repaint();
    }

    @Override
    public void napuniView() {
        var e = obrada.getEntitet();
        txtBrojRezervacije.setText(e.getBrojRezervacije());
        try {
            txtBrojGostiju.setText(String.valueOf(e.getBrojGostiju()));
        } catch (Exception ex) {
            txtBrojGostiju.setText("");
        }
        try {
            txtBrojSmjestajnihJedinica.setText(String.valueOf(e.getBrojSmjestajnihJedinica()));
        } catch (Exception ex) {
            txtBrojSmjestajnihJedinica.setText("");
        }
        cmbGost.setSelectedItem(e.getGost());

    }

    @Override
    public void napuniModel() {
        var e = obrada.getEntitet();
        e.setBrojRezervacije(txtBrojRezervacije.getText());
        try {
            e.setBrojGostiju(Integer.parseInt(txtBrojGostiju.getText()));
        } catch (Exception ex) {
            e.setBrojGostiju(0);
        }
        try {
            e.setBrojSmjestajnihJedinica(Integer.parseInt(txtBrojSmjestajnihJedinica.getText()));
        } catch (Exception ex) {
            e.setBrojSmjestajnihJedinica(0);
        }
        e.setGost((Gost) cmbGost.getSelectedItem());

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JComboBox<Gost> cmbFilterGosti;
    private javax.swing.JComboBox<Gost> cmbGost;
    private com.github.lgooddatepicker.components.DatePicker dpDatumOdjave;
    private com.github.lgooddatepicker.components.DatePicker dpDatumPrijave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Rezervacija> lstPodaci;
    private javax.swing.JTextField txtBrojGostiju;
    private javax.swing.JTextField txtBrojRezervacije;
    private javax.swing.JTextField txtBrojSmjestajnihJedinica;
    // End of variables declaration//GEN-END:variables
}
