package vista;

import Atxy2k.CustomTextField.RestrictedTextField;
import controlador.inicio;
import java.awt.Image;
import java.awt.Toolkit;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.stream.IntStream;
import modelo.login;

public class loginfrm extends javax.swing.JFrame {
    int[] numerosAleatorios;
    public loginfrm() {
        initComponents();
        setTitle("OrangeBox");
        
        RestrictedTextField restricted1 = new RestrictedTextField(txt1);
        restricted1.setLimit(30);
        
        RestrictedTextField restricted2 = new RestrictedTextField(c1);
        restricted2.setLimit(30);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        c1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        validacion = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        b0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.lightGray);
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));

        c1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Ingreso");
        jLabel1.setFocusTraversalPolicyProvider(true);

        txt1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Usuario :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Contraseña :");

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("2da Contraseña :");

        txt3.setEditable(false);
        txt3.setBackground(new java.awt.Color(0, 204, 204));
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });

        validacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        validacion.setForeground(new java.awt.Color(0, 102, 102));
        validacion.setText(" ");

        b1.setText("jButton3");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("jButton3");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setText("jButton4");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setText("jButton5");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setText("jButton6");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setText("jButton7");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setText("jButton8");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setText("jButton9");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setText("jButton10");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        b0.setText("jButton12");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(36, 36, 36)
                        .addComponent(jButton2)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt1)
                                    .addComponent(c1)
                                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(validacion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4)
                    .addComponent(b5)
                    .addComponent(b6))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7)
                    .addComponent(b8)
                    .addComponent(b9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrar)
                    .addComponent(b0))
                .addGap(18, 18, 18)
                .addComponent(validacion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        numerosAleatorios = IntStream.rangeClosed(0, 9).toArray();
        Random r = new Random();
        for (int i = numerosAleatorios.length; i > 0; i--) {
            int posicion = r.nextInt(i);
            int tmp = numerosAleatorios[i-1];
            numerosAleatorios[i - 1] = numerosAleatorios[posicion];
            numerosAleatorios[posicion] = tmp;
        }
        
        b1.setText(numerosAleatorios[1]+"");
        b2.setText(numerosAleatorios[2]+"");
        b3.setText(numerosAleatorios[3]+"");
        b4.setText(numerosAleatorios[4]+"");
        b5.setText(numerosAleatorios[5]+"");
        b6.setText(numerosAleatorios[6]+"");
        b7.setText(numerosAleatorios[7]+"");
        b8.setText(numerosAleatorios[8]+"");
        b9.setText(numerosAleatorios[9]+"");
        b0.setText(numerosAleatorios[0]+"");
        
    }//GEN-LAST:event_formWindowOpened

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        if(txt3.getText().length()!=0){
            txt3.setText(txt3.getText().substring(0, txt3.getText().length()-1));
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(txt3.getText().length()<=4)
        {
            txt3.setText(txt3.getText()+numerosAleatorios[1]);
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        registrofrm rf=new registrofrm();
        rf.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login lo=new login();
        inicio ini=new inicio();
        char[] pass = c1.getPassword();
        String final_pass = "";
        for (char x : pass) {
            final_pass += x;
        }

        try
        {
            lo.setPass(ini.hashPassword(final_pass));
        }
        catch(NoSuchAlgorithmException e)
        {

        }

        lo.setId(txt1.getText());
        lo.setPass2(txt3.getText());

        login log=ini.ingreso(lo);

        if (log!=null)
        {

            panelprincipal p=new panelprincipal();
            p.setLoginfrm(log);
            p.setVisible(true);
            dispose();
        }
        else
        {
            validacion.setText("Cuenta Erronea");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(txt3.getText().length()<4)
        {
            txt3.setText(txt3.getText()+numerosAleatorios[2]);
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(txt3.getText().length()<4)
        {
            txt3.setText(txt3.getText()+numerosAleatorios[3]);
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if(txt3.getText().length()<4)
        {
            txt3.setText(txt3.getText()+numerosAleatorios[4]);
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if(txt3.getText().length()<4)
        {
            txt3.setText(txt3.getText()+numerosAleatorios[5]);
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if(txt3.getText().length()<4)
        {
            txt3.setText(txt3.getText()+numerosAleatorios[6]);
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if(txt3.getText().length()<4)
        {
            txt3.setText(txt3.getText()+numerosAleatorios[7]);
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if(txt3.getText().length()<4)
        {
            txt3.setText(txt3.getText()+numerosAleatorios[8]);
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if(txt3.getText().length()<4)
        {
            txt3.setText(txt3.getText()+numerosAleatorios[9]);
        }
    }//GEN-LAST:event_b9ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        if(txt3.getText().length()<4)
        {
            txt3.setText(txt3.getText()+numerosAleatorios[0]);
        }
    }//GEN-LAST:event_b0ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginfrm().setVisible(true);
            }
        });
    }
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("imagen/icono.png"));
        return retValue;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton borrar;
    private javax.swing.JPasswordField c1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt3;
    private javax.swing.JLabel validacion;
    // End of variables declaration//GEN-END:variables
}
