package panel;

import Atxy2k.CustomTextField.RestrictedTextField;
import controlador.inicio;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.datos;

public class p3 extends javax.swing.JPanel {
    private ArrayList lista;
    private String usuariop3;
    
    inicio ini= new inicio();
    datos da1=null;

    public p3(ArrayList lista, String usuariop3) {
        this.lista = lista;
        this.usuariop3 = usuariop3;
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        combo2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        v3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        c1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jButton1.setText("Desbloquear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Desbloquear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Desbloquear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Editar datos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 102));
        jLabel5.setText("Lista");

        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2ActionPerformed(evt);
            }
        });

        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("URL :");

        txt2.setEditable(false);
        txt2.setBackground(new java.awt.Color(0, 204, 204));

        v3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        v3.setForeground(new java.awt.Color(204, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("PASSWORD :");

        txt1.setEditable(false);
        txt1.setBackground(new java.awt.Color(0, 204, 204));

        c1.setEditable(false);
        c1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("ID :");

        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(24, 24, 24)
                        .addComponent(jButton5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(v3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt1)
                        .addComponent(txt2)
                        .addComponent(c1)
                        .addComponent(combo2, 0, 154, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(v3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2ActionPerformed
       try
        {
            da1=(datos)lista.get(combo2.getSelectedIndex());
            txt1.setText(da1.getUrl());
            txt2.setText(da1.getNick());
            c1.setText(da1.getContraseña());
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_combo2ActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        
    }//GEN-LAST:event_formComponentAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txt1.setEditable(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txt2.setEditable(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       c1.setEditable(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        char[] pass1 = c1.getPassword();
        String final_pass1 = "";
        
        for (char x : pass1) {
            final_pass1 += x;
        }
        datos da=new datos();
        da.setUrl(txt1.getText());
        da.setNick(txt2.getText());
        da.setContraseña(final_pass1);
        da.setUsuario(getUsuariop3());
        da.setId(da1.getId());
        
        int val=ini.editardatos(da);
        
        if(val>0)
        {
            v3.setText("Editado");
            recargar();
        }
        
        txt1.setEditable(false);
        txt2.setEditable(false);
        c1.setEditable(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        datos da=new datos();
        da.setNick(txt2.getText());
        da.setUsuario(getUsuariop3());
        da.setId(da1.getId());
        
        int val=ini.eliminardato(da);
        if(val>0)
        {
            v3.setText("Eliminado");
            txt1.setText("");
            txt2.setText("");
            c1.setText("");
            recargar();
            txt1.setEditable(false);
            txt2.setEditable(false);
            c1.setEditable(false);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField c1;
    public javax.swing.JComboBox<String> combo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JLabel v3;
    // End of variables declaration//GEN-END:variables

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

    public String getUsuariop3() {
        return usuariop3;
    }

    public void setUsuariop3(String usuariop3) {
        this.usuariop3 = usuariop3;
    }
    
    private void recargar()
    {
        datos da1=new datos();
        combo2.removeAllItems();
        da1.setUsuario(usuariop3);
        lista=ini.getdatos(da1);
        
        for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
            datos next = (datos)iterator.next();
            combo2.addItem("N°"+next.getCount()); 
        } 
    }

   
}
