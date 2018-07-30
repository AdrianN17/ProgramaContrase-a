package panel;
import controlador.inicio;
import java.security.NoSuchAlgorithmException;
import modelo.login;
import Atxy2k.CustomTextField.RestrictedTextField;
public class p5 extends javax.swing.JPanel {
    
    private String usuariop5;

    public p5(String usuariop5) {
        this.usuariop5 = usuariop5;
        initComponents();
        RestrictedTextField restricted1 = new RestrictedTextField(txt1);
        restricted1.setLimit(30);
        
        RestrictedTextField restricted2 = new RestrictedTextField(c1);
        restricted2.setLimit(30);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        v2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        c1 = new javax.swing.JPasswordField();
        v1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 51));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Cuenta");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("Contraseña");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("Segunda Contraseña");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 102));
        jLabel5.setText("Datos Almacenados :");

        v2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        v2.setForeground(new java.awt.Color(255, 0, 51));

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt1.setEditable(false);
        txt1.setBackground(new java.awt.Color(0, 204, 204));
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        txt3.setEditable(false);
        txt3.setBackground(new java.awt.Color(0, 204, 204));
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3KeyTyped(evt);
            }
        });

        c1.setEditable(false);
        c1.setBackground(new java.awt.Color(0, 204, 204));

        v1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        v1.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(txt1)
                            .addComponent(txt3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(v2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(v1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(v1, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(v2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
 
    }//GEN-LAST:event_txt1ActionPerformed
        int i=0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        char[] pass1 = c1.getPassword();
        String final_pass1 = "";

        for (char x : pass1) {
            final_pass1 += x;
        }
        
        if(i%2==0)
        {
            c1.setEditable(true);
            txt3.setEditable(true);
            i=i+1;
            
        }
        else
        {
            if(final_pass1.length()<1) 
                
                v1.setText("Llenar datos");
            else
            {
                if(txt3.getText().length()==4)
                {
                    if(editardato(final_pass1)>1)
                    {
                        i=i+1;
                    }
                }
                else
                {
                    v1.setText("Debe ser de 4 numeros");
                    txt3.setText("");
                }
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        
    }//GEN-LAST:event_txt3ActionPerformed

    private void txt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyTyped
        
        char caracter = evt.getKeyChar();
        if ( ((caracter < '0') || (caracter > '9')) && (caracter != '\b') )   {
            evt.consume(); 
        }
        
    }//GEN-LAST:event_txt3KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField c1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JTextField txt1;
    public javax.swing.JTextField txt3;
    public javax.swing.JLabel v1;
    public javax.swing.JLabel v2;
    // End of variables declaration//GEN-END:variables

    public String getUsuariop5() {
        return usuariop5;
    }

    public void setUsuariop5(String usuariop5) {
        this.usuariop5 = usuariop5;
    }
    
    public int editardato(String final_pass1)
    {
        int a=0;
        inicio ini=new inicio();
        login lo=new login();

        

        lo.setId(getUsuariop5());
        
        try
        {
            lo.setPass(ini.hashPassword(final_pass1));
        }
        catch(NoSuchAlgorithmException e)
        {

        }
            
        lo.setPass2(txt3.getText());

        a=ini.cambiarlogin(lo);

        if(a>0)
        {
            v1.setText("Actualizado");
        }


        c1.setEditable(false);
        txt3.setEditable(false);
        return a;
    }
}
