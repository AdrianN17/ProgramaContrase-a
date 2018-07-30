package panel;

import controlador.inicio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.login;
import modelo.tele;

public class p11 extends javax.swing.JPanel {
    String usuariop11;
    String txt=null;
    String ruta=null;
    inicio ini=new inicio();
    public p11(String usuariop11) {
        this.usuariop11 = usuariop11;
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        v1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        v2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ch1 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 153, 51));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Cargar txt Telefono");

        jButton1.setText("Grabar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        v1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        v1.setForeground(new java.awt.Color(0, 102, 204));
        v1.setText(" ");

        jButton2.setText("Cargar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        v2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        v2.setForeground(new java.awt.Color(204, 0, 51));
        v2.setText(" ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Nota: deben estar separados con un -- entre cada dato");

        ch1.setBackground(new java.awt.Color(255, 153, 0));
        ch1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ch1.setForeground(new java.awt.Color(255, 0, 0));
        ch1.setText("Eliminar txt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(v2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(v1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1)))
                                    .addComponent(jButton2))
                                .addGap(18, 18, 18)
                                .addComponent(ch1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(v1)
                    .addComponent(ch1))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addComponent(v2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(ruta!=null)
        {
            if(ch1.isSelected())
            {
                cargartxt();
                borrartxt();
            }
            else
            {
                cargartxt();
            } 
        }
        else
        {
            v2.setText("Seleccione archivo");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setMultiSelectionEnabled(false);
        fc.setCurrentDirectory(new File("C:\\tmp"));
        fc.showDialog(fc, "Seleccione");
        try
        {
            ruta=fc.getSelectedFile().getAbsolutePath();
            txt=fc.getSelectedFile().getName();
            v1.setText(txt); 
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public void cargartxt()
    {
        FileReader leer=null;
	BufferedReader entrada=null;
        try
        {
            String dato;
            String[] cortes;
            txt=usuariop11+"_Telefono.txt";
            leer=new  FileReader(ruta);
            entrada=new BufferedReader(leer);
            while((dato = entrada.readLine())!=null) 
            {
                tele te=new tele();
                cortes=dato.split("---");
                te.setUsuario(usuariop11);
                te.setContacto(cortes[0]);
                te.setTelefono(cortes[1]);
                te.setDetalle(cortes[2]);
                ini.ingresartele(te);
            }
            v2.setText("Datos agregados");
        } 
        catch (Exception e) 
        {
            v2.setText("Error con el archivo");
        } 
        finally 
        {
           try 
           {
           if (null != leer)
              leer.close();
           } 
           catch (Exception e2) 
           {
              e2.printStackTrace();
           }
        }   	
    }
    
    public void borrartxt()
    {
        File fichero = new File(ruta);
        if (fichero.delete())
        {
            JOptionPane.showMessageDialog(null,"TXT borrado");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ch1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel v1;
    private javax.swing.JLabel v2;
    // End of variables declaration//GEN-END:variables
}
