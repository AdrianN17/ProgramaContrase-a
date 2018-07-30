package panel;

import Atxy2k.CustomTextField.RestrictedTextField;
import controlador.inicio;
import modelo.tele;

public class p8 extends javax.swing.JPanel {
    String usuariop8;

    public p8(String usuariop8) {
        this.usuariop8 = usuariop8;
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
        txt2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt3 = new javax.swing.JTextArea();
        v1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 51));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Ingresar telefono");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Contacto");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("Telefono");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("Detalles");

        txt1.setBackground(new java.awt.Color(0, 204, 204));

        txt2.setBackground(new java.awt.Color(0, 204, 204));

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt3.setBackground(new java.awt.Color(0, 204, 204));
        txt3.setColumns(20);
        txt3.setRows(5);
        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txt3);

        v1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        v1.setForeground(new java.awt.Color(204, 0, 51));
        v1.setText("    ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jButton1))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(v1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(txt1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(v1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tele te=new tele();
        inicio ini=new inicio();
        
        if((txt1.getText().equals("")) && (txt2.getText().equals("")) && (txt3.getText().equals("")))
        {
            v1.setText("Ingrese datos");
        }
        else
        {
            te.setUsuario(usuariop8);
            te.setContacto(txt1.getText());
            te.setTelefono(txt2.getText());
            te.setDetalle(txt3.getText());

            int a=ini.ingresartele(te);
            if(a>0)
            {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                v1.setText("Datos agregados");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyTyped
        if (txt3.getText().length()== 100)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt3KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextArea txt3;
    private javax.swing.JLabel v1;
    // End of variables declaration//GEN-END:variables
}
