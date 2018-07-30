package panel;
import Atxy2k.CustomTextField.RestrictedTextField;
import controlador.inicio;
import modelo.datos;
import vista.panelprincipal;
public class p2 extends javax.swing.JPanel {
    private String usuariop2;
    public p2(String usuariop2) {
        this.usuariop2 = usuariop2;
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        v2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        c1 = new javax.swing.JPasswordField();
        botonagregarv = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 51));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
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

        v2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        v2.setForeground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Agregar Datos");

        txt1.setBackground(new java.awt.Color(0, 204, 204));

        txt2.setBackground(new java.awt.Color(0, 204, 204));

        c1.setBackground(new java.awt.Color(0, 204, 204));

        botonagregarv.setText("Agregar");
        botonagregarv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregarvActionPerformed(evt);
            }
        });

        jButton3.setText("Ver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonagregarv)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addComponent(v2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(v2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonagregarv)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonagregarvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregarvActionPerformed
        datos da=new datos();
        inicio ini=new inicio();
        
        char[] pass1 = c1.getPassword();
        String final_pass1 = "";
        
        for (char x : pass1) {
            final_pass1 += x;
        }
        
        if((txt1.getText().equals("")) && (txt2.getText().equals(""))  && (final_pass1.equals("")))
        {
            v2.setText("Ingrese datos");
        }
        else
        {
        
            da.setUrl(txt1.getText());
            da.setNick(txt2.getText());
            da.setContraseña(final_pass1);


            da.setUsuario(getUsuariop2());

            int val=ini.agregardato(da);
            if (val>0)
            {
                txt1.setText("");
                txt2.setText("");
                c1.setText("");
                v2.setText("Agregado");
            }
        }
    }//GEN-LAST:event_botonagregarvActionPerformed
    int i=0;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            i=i+1;
            if(i%2==0)
            {    
                c1.setEchoChar('*');
            }
            else
            {
                c1.setEchoChar((char)0);
            }        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        
    }//GEN-LAST:event_formComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonagregarv;
    public javax.swing.JPasswordField c1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JTextField txt1;
    public javax.swing.JTextField txt2;
    public javax.swing.JLabel v2;
    // End of variables declaration//GEN-END:variables

    public String getUsuariop2() {
        return usuariop2;
    }

    public void setUsuariop2(String usuariop2) {
        this.usuariop2 = usuariop2;
    }

    
}
