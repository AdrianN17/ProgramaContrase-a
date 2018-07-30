package vista;
import Atxy2k.CustomTextField.RestrictedTextField;
import controlador.inicio;
import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import modelo.datos;
import modelo.login;
import modelo.tele;
import panel.*;
public class panelprincipal extends javax.swing.JFrame {
    inicio ini=new inicio();
    private login loginfrm;
    public panelprincipal() {
        initComponents();
        setTitle("OrangeBox"); 
        
    }
    

    Container d=getContentPane();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem12.setText("jMenuItem12");

        jMenuItem13.setText("jMenuItem13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu2.setText("Cuenta");

        jMenuItem4.setText("Configuracion");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem6.setText("Vaciar datos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem9.setText("Dar de baja");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Datos");

        jMenuItem3.setText("Visualizar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem8.setText("Añadir");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem5.setText("Modificar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu7.setText("Archivos");

        jMenuItem7.setText("Exportar datos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        jMenuItem10.setText("Importar datos");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenuItem18.setText("Exportar telefonos");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem18);

        jMenuItem19.setText("Importar telefonos");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem19);

        jMenuBar1.add(jMenu7);

        jMenu5.setText("Ayuda");

        jMenuItem11.setText("Acerca");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Telefonos");

        jMenuItem16.setText("Visualizar");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem16);

        jMenuItem15.setText("Agregar");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15);

        jMenuItem14.setText("Modificar");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14);

        jMenuBar1.add(jMenu6);

        jMenu8.setText("Salir");
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem2);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed
        
    }//GEN-LAST:event_jMenu8ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        datos daa=new datos();
        
        daa.setUsuario(loginfrm.getId());
        
        ArrayList lista=ini.getdatos(daa);
        
        p1 visualizar=new p1(lista);
        
        visualizar.combo1.removeAllItems();
        for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
            datos next = (datos)iterator.next();
            visualizar.combo1.addItem("N°"+next.getCount()); 
        } 
        
        d.removeAll();
        visualizar.setBounds(0,0,400,300);
        visualizar.setVisible(true);     
        d.add(visualizar);
        validate();
        repaint();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        datos daa=new datos();
        
        daa.setUsuario(loginfrm.getId());
        
        ArrayList lista=ini.getdatos(daa);
        
        p3 editar=new p3(lista,loginfrm.getId());
        editar.combo2.removeAllItems();
        
        for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
            datos next = (datos)iterator.next();
            editar.combo2.addItem("N°"+next.getCount()); 
        } 
        
        d.removeAll();
        editar.setBounds(0,0,400,300);
        editar.setVisible(true);
        d.add(editar);
        validate();
        repaint();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        p2 añadir=new p2(loginfrm.getId());
        d.removeAll();
        añadir.setBounds(0,0,400,300);
        añadir.setVisible(true);
        d.add(añadir);
        validate();
        repaint();
        añadir.setUsuariop2(loginfrm.getId());
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        p4 exportar=new p4(loginfrm.getId());
        d.removeAll();
        exportar.setBounds(0,0,400,300);
        exportar.setVisible(true);
        d.add(exportar);
        validate();
        repaint();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
 
        p5 configurar=new p5(loginfrm.getId());
        
        login datos=ini.getusuariomain(getLoginfrm());
        int can=ini.cantidaddatos(getLoginfrm());
        
        configurar.txt1.setText(datos.getId());
        configurar.c1.setText("");
        configurar.txt3.setText(datos.getPass2());
        
        configurar.v2.setText(""+can);
        
        d.removeAll();
        configurar.setBounds(0,0,400,300);
        configurar.setVisible(true);
        d.add(configurar);
        validate();
        repaint();
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("imagen/icono.png"));
        return retValue;
    }
    
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
            
            
            Object[] options1 = { "Borrar datos","Borrar telefonos","Borrar todo","Denegar"};

            JPanel panel = new JPanel();
            panel.add(new JLabel("Eliminar dato"));

            int result = JOptionPane.showOptionDialog(null, panel, "Eliminar ",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, options1, null);

            if(result==0)
            {
                login lo=new login();
                lo.setId(loginfrm.getId());
                ini.borrartodo(lo);
                
                JOptionPane.showMessageDialog(null, "Datos borrados");
            }
            else if(result==1)
            {
                login lo=new login();
                lo.setId(loginfrm.getId());
                ini.borrarteletotal(lo);
                JOptionPane.showMessageDialog(null, "Telefonos borrados");
            }
            else if(result==2)
            {
                login lo=new login();
                lo.setId(loginfrm.getId());
                ini.borrartodo(lo);
                lo.setId(loginfrm.getId());
                ini.borrarteletotal(lo);
                JOptionPane.showMessageDialog(null, "Hecho");
            }
            
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
            Object[] options1 = { "Aceptar", "Denegar"};

            JPanel panel = new JPanel();
            panel.add(new JLabel("Eliminar cuenta"));

            int result = JOptionPane.showOptionDialog(null, panel, "Eliminar ",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, options1, null);

            if(result==0)
            {
                String pass2=JOptionPane.showInputDialog("Ingrese su segunda contraseña para continuar");
                login lo=new login();
                lo.setId(loginfrm.getId());
                login loginfinal=ini.getusuariomain(lo);
                
                if(loginfinal.getPass2().equals(pass2))
                {
                    lo.setId(loginfrm.getId());
                    ini.borrartodo(lo);
                    lo.setId(loginfrm.getId());
                    ini.borrarteletotal(lo);
                    lo.setId(loginfrm.getId());
                    ini.eliminarcuenta(lo);
                    JOptionPane.showMessageDialog(null, "Hecho");
                    System.exit(0);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Contraseña equivocada");
                }
            }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        p6 importar=new p6(loginfrm.getId());
        d.removeAll();
        importar.setBounds(0,0,400,300);
        importar.setVisible(true);
        d.add(importar);
        validate();
        repaint();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        p7 acerca=new p7();
        d.removeAll();
        acerca.setBounds(0,0,400,300);
        acerca.setVisible(true);
        d.add(acerca);
        validate();
        repaint();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        tele te=new tele();
        te.setUsuario(loginfrm.getId());
        ArrayList lista=ini.gettelefono(te);
        p10 visualizart=new p10(lista);
        visualizart.combo1.removeAllItems();
        for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
            tele next = (tele)iterator.next();
            visualizart.combo1.addItem("N°"+next.getCount()); 
        } 
        
        d.removeAll();
        visualizart.setBounds(0,0,400,300);
        visualizart.setVisible(true);     
        d.add(visualizart);
        validate();
        repaint();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        p8 agregart=new p8(loginfrm.getId());
        d.removeAll();
        agregart.setBounds(0,0,400,300);
        agregart.setVisible(true);     
        d.add(agregart);
        validate();
        repaint();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        tele te=new tele();
        te.setUsuario(loginfrm.getId());
        ArrayList lista=ini.gettelefono(te);
        p9 editart=new p9(loginfrm.getId(), lista);
        editart.combo1.removeAllItems();
        for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
            tele next = (tele)iterator.next();
            editart.combo1.addItem("N°"+next.getCount()); 
        } 
        d.removeAll();
        editart.setBounds(0,0,400,300);
        editart.setVisible(true);     
        d.add(editart);
        validate();
        repaint();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        p12 exportart=new p12(loginfrm.getId());
        d.removeAll();
        exportart.setBounds(0,0,400,300);
        exportart.setVisible(true);     
        d.add(exportart);
        validate();
        repaint();
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        p11 importart=new p11(loginfrm.getId());
        d.removeAll();
        importart.setBounds(0,0,400,300);
        importart.setVisible(true);     
        d.add(importart);
        validate();
        repaint();
    }//GEN-LAST:event_jMenuItem19ActionPerformed

 
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(panelprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panelprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panelprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panelprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panelprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables


    public login getLoginfrm() {
        return loginfrm;
    }

    public void setLoginfrm(login loginfrm) {
        this.loginfrm = loginfrm;
    }
  
}
