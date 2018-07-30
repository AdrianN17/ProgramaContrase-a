package panel;
import controlador.inicio;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.datos;
import modelo.login;

public class p4 extends javax.swing.JPanel {
    private String usuariop4;
    inicio ini=new inicio();
    datos daa=new datos();
    public p4(String usuariop4) {
        this.usuariop4 = usuariop4;
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ch1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        vv = new javax.swing.JLabel();
        ch2 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 153, 51));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Exportar datos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Exportar a txt");

        ch1.setBackground(new java.awt.Color(255, 153, 0));
        ch1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ch1.setForeground(new java.awt.Color(255, 0, 0));
        ch1.setText("Eliminar datos");
        ch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch1ActionPerformed(evt);
            }
        });

        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        vv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vv.setForeground(new java.awt.Color(255, 0, 0));
        vv.setText(" ");

        ch2.setBackground(new java.awt.Color(255, 153, 0));
        ch2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ch2.setForeground(new java.awt.Color(255, 0, 0));
        ch2.setText("Datos encriptados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(vv, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ch2)
                            .addComponent(ch1))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addComponent(ch1)
                .addGap(6, 6, 6)
                .addComponent(ch2)
                .addGap(18, 18, 18)
                .addComponent(vv, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(ch2.isSelected())
        {
            devolverdatoencriptado();
        }
        else
        {
            devolverdato();
        }
        
        if(ch1.isSelected())
        {
            login lo=new login();
            lo.setId(usuariop4);
            ini.borrartodo(lo);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch1ActionPerformed
        
    }//GEN-LAST:event_ch1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ch1;
    private javax.swing.JCheckBox ch2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel vv;
    // End of variables declaration//GEN-END:variables

    public String getUsuariop4() {
        return usuariop4;
    }

    public void setUsuariop4(String usuariop4) {
        this.usuariop4 = usuariop4;
    }
    
    public void devolverdato()
    {
                
        daa.setUsuario(usuariop4);
        ArrayList lista=ini.getdatos(daa);
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(usuariop4+"_data.txt");
            pw = new PrintWriter(fichero);
            for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
                datos next = (datos)iterator.next();
                pw.println(next.getNick()+"---"+next.getContraseña()+"---"+next.getUrl());
            }  
            vv.setText("Archivo creado");
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
           try 
           {
           if (null != fichero)
              fichero.close();
           } 
           catch (Exception e2) 
           {
              e2.printStackTrace();
           }
        }
    }
    
    public void devolverdatoencriptado()
    {
                
        daa.setUsuario(usuariop4);
        ArrayList lista=ini.getdatos(daa);
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(usuariop4+"_data_encriptado.txt");
            pw = new PrintWriter(fichero);
            for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
                datos next = (datos)iterator.next();
                pw.println(next.getNick()+"---"+ini.encrypt(next.getContraseña())+"---"+next.getUrl());
            }  
            vv.setText("Archivo creado");
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
           try 
           {
           if (null != fichero)
              fichero.close();
           } 
           catch (Exception e2) 
           {
              e2.printStackTrace();
           }
        }
    }
}
