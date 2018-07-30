package panel;
import controlador.inicio;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.login;
import modelo.tele;
public class p12 extends javax.swing.JPanel {
    inicio ini=new inicio();
    String usuariop12;
    tele te=new tele();
    public p12(String usuariop12) {
        this.usuariop12 = usuariop12;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ch1 = new javax.swing.JCheckBox();
        v1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 51));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Exportar telefonos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Exportar a txt");

        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ch1.setBackground(new java.awt.Color(255, 153, 51));
        ch1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ch1.setForeground(new java.awt.Color(255, 0, 0));
        ch1.setText("Eliminar telefonos");

        v1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        v1.setForeground(new java.awt.Color(255, 0, 0));
        v1.setText("    ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(v1)
                            .addComponent(ch1))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(43, 43, 43)
                .addComponent(ch1)
                .addGap(37, 37, 37)
                .addComponent(v1)
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(ch1.isSelected())
        {
            devolverdato();
            login lo=new login();
            lo.setId(usuariop12);
            ini.borrarteletotal(lo);
        }
        else
        {
            devolverdato();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void devolverdato()
    {   
        te.setUsuario(usuariop12);
        ArrayList lista=ini.gettelefono(te);
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(usuariop12+"_Telefono.txt");
            pw = new PrintWriter(fichero);
            for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
                tele next = (tele)iterator.next();
                pw.println(next.getContacto()+"---"+next.getTelefono()+"---"+next.getDetalle());
            }  
            v1.setText("Archivo creado");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ch1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel v1;
    // End of variables declaration//GEN-END:variables
}
