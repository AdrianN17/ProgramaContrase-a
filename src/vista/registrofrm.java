package vista;

import controlador.inicio;
import java.security.NoSuchAlgorithmException;
import modelo.login;
import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.Image;
import java.awt.Toolkit;
public class registrofrm extends javax.swing.JFrame {
    inicio ini= new inicio();
    public registrofrm() {
        initComponents();
        setTitle("OrangeBox");
        setDefaultCloseOperation(registrofrm.DISPOSE_ON_CLOSE);
        RestrictedTextField restricted1 = new RestrictedTextField(txt2,"1234567890");
        restricted1.setLimit(4);	  
        
        RestrictedTextField restricted2 = new RestrictedTextField(txt1);
        restricted2.setLimit(30);
        
        RestrictedTextField restricted3 = new RestrictedTextField(c1);
        restricted3.setLimit(30);
        
        RestrictedTextField restricted4 = new RestrictedTextField(c2);
        restricted4.setLimit(30);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        c1 = new javax.swing.JPasswordField();
        c2 = new javax.swing.JPasswordField();
        registro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Contraseña:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Segunda contraseña:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Validar Contraseña");

        c1.setBackground(new java.awt.Color(0, 204, 204));

        c2.setBackground(new java.awt.Color(0, 204, 204));

        registro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registro.setForeground(new java.awt.Color(255, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Registro");

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt1.setBackground(new java.awt.Color(0, 204, 204));

        txt2.setBackground(new java.awt.Color(0, 204, 204));
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2KeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Usuario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(registro, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(registro, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    char[] pass1 = c1.getPassword();
        String final_pass1 = "";
        for (char x : pass1) {
            final_pass1 += x;
        }
        
    char[] pass2 = c2.getPassword();
        String final_pass2 = "";
        for (char x : pass2) {
            final_pass2 += x;
        }  
    
    if((final_pass1.equals("")) || (final_pass2.equals("")) || (txt1.getText().equals("")) || (txt2.getText().equals("")))
    {
        registro.setText("Llenar datos"); 
    }
    else if ((txt2.getText().length()!=4))
    {
        registro.setText("Se necesita 4 caracteres en la segunda contraseña");
    }
    else
    {
        if(!ini.validarusuario(txt1.getText()))
        {
            val(final_pass1,final_pass2 );
        }
        else
        {
            registro.setText("Usuario ya registrado");
        }
    }
    
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyTyped
        
    }//GEN-LAST:event_txt2KeyTyped

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        
    }//GEN-LAST:event_txt2ActionPerformed

    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registrofrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrofrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrofrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrofrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrofrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField c1;
    private javax.swing.JPasswordField c2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel registro;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("imagen/icono.png"));
        return retValue;
    }
    
    public void val(String final_pass1, String final_pass2 )
    {
        if(!final_pass1.equals(final_pass2))
        {
            registro.setText("Las contraseñas no coinciden");
        }
        else
        {
            if(txt2.getText().length()==4)
            {
                login lo=new login();

                lo.setId(txt1.getText());
                try
                {
                    lo.setPass(ini.hashPassword(final_pass1));
                }
                catch(NoSuchAlgorithmException e)
                {

                }
                lo.setPass2(txt2.getText());

                int val=ini.registro(lo);

                if(val>0)
                {
                    registro.setText("Hecho");
                }
            }
            else
            {
                registro.setText("Debe ser de solo 4 caracteres");
            }
        }
    }
}
