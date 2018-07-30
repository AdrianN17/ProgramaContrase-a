package panel;

import Atxy2k.CustomTextField.RestrictedTextField;
import controlador.inicio;
import java.awt.Toolkit;
import java.awt.Desktop;
import java.net.URI;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import modelo.datos;
import java.util.ArrayList;
import java.util.Iterator;
public class p1 extends javax.swing.JPanel {
    private ArrayList lista;
    datos da=new datos();
    inicio ini=new inicio();

    public p1(ArrayList lista) {
        this.lista = lista;
        initComponents();
        
        RestrictedTextField restricted1 = new RestrictedTextField(txt1);
        restricted1.setLimit(100);
        
        RestrictedTextField restricted2 = new RestrictedTextField(txt2);
        restricted2.setLimit(30);
        
        RestrictedTextField restricted3 = new RestrictedTextField(c1);
        restricted3.setLimit(30);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JTextField();
        v1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        c1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 51));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153)));
        setPreferredSize(new java.awt.Dimension(400, 300));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        txt1.setEditable(false);
        txt1.setBackground(new java.awt.Color(0, 204, 204));

        v1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        v1.setForeground(new java.awt.Color(204, 0, 0));

        txt2.setEditable(false);
        txt2.setBackground(new java.awt.Color(0, 204, 204));
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        c1.setEditable(false);
        c1.setBackground(new java.awt.Color(0, 204, 204));

        jButton1.setText("Abrir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Copiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Copiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("URL :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("ID :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("Password :");

        combo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo1ItemStateChanged(evt);
            }
        });
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Visualizar datos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 102));
        jLabel5.setText("Lista");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c1)
                            .addComponent(txt1)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(v1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(v1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        try{
            datos da1=(datos)lista.get(combo1.getSelectedIndex());
            txt1.setText(da1.getUrl());
            txt2.setText(da1.getNick());
            c1.setText(da1.getContraseña());
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_combo1ActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        
    }//GEN-LAST:event_formComponentAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            Desktop.getDesktop().browse(new URI(txt1.getText()));
            v1.setText("Enlace abierto");
        }
        catch(Exception e)
        {
            v1.setText("Error al abrir enlace");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        
    }//GEN-LAST:event_txt2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        char con[]=c1.getPassword();
        String pass=new String(con);
        
        StringSelection stringSelection = new StringSelection (pass);
        Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
        clpbrd.setContents (stringSelection, null);
        v1.setText("Se ha copiado la contraseña");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void combo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo1ItemStateChanged
        
    }//GEN-LAST:event_combo1ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StringSelection stringSelection = new StringSelection (txt2.getText());
        Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
        clpbrd.setContents (stringSelection, null);
        v1.setText("Se ha copiado el ID");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField c1;
    public javax.swing.JComboBox<String> combo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JTextField txt1;
    public javax.swing.JTextField txt2;
    private javax.swing.JLabel v1;
    // End of variables declaration//GEN-END:variables

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

}
