package panel;

import Atxy2k.CustomTextField.RestrictedTextField;
import controlador.inicio;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.tele;

public class p9 extends javax.swing.JPanel {
    String usuariop9;
    ArrayList lista;
    tele te1;
    inicio ini=new inicio();
    public p9(String usuariop9, ArrayList lista) {
        this.usuariop9 = usuariop9;
        this.lista = lista;
        initComponents();
        
        RestrictedTextField restricted1 = new RestrictedTextField(txt1);
        restricted1.setLimit(50);
        
        RestrictedTextField restricted2 = new RestrictedTextField(txt2);
        restricted2.setLimit(20);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt3 = new javax.swing.JTextArea();
        txt2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        v1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 51));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Editar telefono");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Contacto");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("Telefono");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("Detalle");

        txt1.setEditable(false);
        txt1.setBackground(new java.awt.Color(0, 204, 204));

        txt3.setEditable(false);
        txt3.setBackground(new java.awt.Color(0, 204, 204));
        txt3.setColumns(20);
        txt3.setRows(5);
        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txt3);

        txt2.setEditable(false);
        txt2.setBackground(new java.awt.Color(0, 204, 204));

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

        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        v1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        v1.setForeground(new java.awt.Color(204, 0, 51));
        v1.setText("     ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 102));
        jLabel6.setText("Lista");

        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });

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
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGap(54, 54, 54)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addComponent(v1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5))
                        .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(v1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        try
        {
            te1=(tele)lista.get(combo1.getSelectedIndex());
            txt1.setText(te1.getContacto());
            txt2.setText(te1.getTelefono());
            txt3.setText(te1.getDetalle());
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_combo1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txt1.setEditable(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txt2.setEditable(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txt3.setEditable(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        tele te=new tele();
        te.setUsuario(usuariop9);
        te.setId(te1.getId());
        te.setContacto(txt1.getText());
        te.setTelefono(txt2.getText());
        te.setDetalle(txt3.getText());
        int a=ini.editartele(te);
        if(a>0)
        {
            v1.setText("Dato editado");
            txt1.setEditable(false);
            txt2.setEditable(false);
            txt3.setEditable(false);
            recargar();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        tele te=new tele();
        te.setUsuario(usuariop9);
        te.setId(te1.getId());
        int a=ini.eliminartele(te);
        if(a>0)
        {
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            v1.setText("Dato eliminado");
            txt1.setEditable(false);
            txt2.setEditable(false);
            txt3.setEditable(false);
            recargar();
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyTyped
        if (txt3.getText().length()== 100)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt3KeyTyped
    private void recargar()
    {
        tele tel=new tele();
        combo1.removeAllItems();
        tel.setUsuario(usuariop9);
        lista=ini.gettelefono(tel);
        
        for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
            tele next = (tele)iterator.next();
            combo1.addItem("N°"+next.getCount()); 
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> combo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextArea txt3;
    private javax.swing.JLabel v1;
    // End of variables declaration//GEN-END:variables
}
