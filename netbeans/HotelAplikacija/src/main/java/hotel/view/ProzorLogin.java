/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.view;

import hotel.controller.ObradaOperater;
import hotel.model.Operater;
import hotel.util.Aplikacija;
import java.awt.event.KeyEvent;

/**
 *
 * @author Korisnik
 */
public class ProzorLogin extends javax.swing.JFrame {
    
    private ObradaOperater obrada;

    /**
     * Creates new form ProzorLogin
     */
    public ProzorLogin() {
        initComponents();
        obrada = new ObradaOperater();
        setTitle(Aplikacija.NAZIV_APP + " Login");
    }
    
    private void autoriziraj(){
        lblPoruka.setText("");
        if(txtEmail.getText().isEmpty()){
            lblPoruka.setText("Obavezno email");
            return;
        }
        
        if(pswLozinka.getPassword().length==0){
            lblPoruka.setText("Obavezno lozinka");
            return;
        }
        
        Operater o = obrada.autoriziraj(txtEmail.getText(), pswLozinka.getPassword());
        
        if(o==null){
            lblPoruka.setText("Neispravna kombinacija email i lozinka");
            return;
        }
        
        new ProzorIzbornik().setVisible(true);
        dispose();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pswLozinka = new javax.swing.JPasswordField();
        btnAutoriziraj = new javax.swing.JButton();
        lblPoruka = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Email");

        txtEmail.setText("toni.stojcevic@mail.com");
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        jLabel2.setText("Lozinka");

        pswLozinka.setText("stojcevic");
        pswLozinka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswLozinkaKeyPressed(evt);
            }
        });

        btnAutoriziraj.setText("Autoriziraj");
        btnAutoriziraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorizirajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtEmail)
                    .addComponent(jLabel2)
                    .addComponent(btnAutoriziraj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pswLozinka)
                    .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(pswLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnAutoriziraj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAutorizirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorizirajActionPerformed
       autoriziraj();
    }//GEN-LAST:event_btnAutorizirajActionPerformed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        lblPoruka.setText("");
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(txtEmail.getText().isEmpty()){
                lblPoruka.setText("Obavezno email");
                return;
            }
            
            if(pswLozinka.getPassword().length==0){
                pswLozinka.requestFocus();
                lblPoruka.setText("Obavezno lozinka");
                return;
            }
            autoriziraj();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void pswLozinkaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswLozinkaKeyPressed
        lblPoruka.setText("");
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(pswLozinka.getPassword().length==0){
                lblPoruka.setText("Obavezno lozinka");
                return;
            }
            if(txtEmail.getText().isEmpty()){
                lblPoruka.setText("Obavezno email");
                txtEmail.requestFocus();
                return;
        }
            autoriziraj();
        }
    }//GEN-LAST:event_pswLozinkaKeyPressed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutoriziraj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JPasswordField pswLozinka;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
