/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import programacion.conexionSQL;

/**
 *
 * @author hp
 */
public class Conteo extends javax.swing.JFrame {

    /**
     * Creates new form Conteo
     */
    public Conteo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    conexionSQL cc= new conexionSQL();
    Connection con = cc.conexion();
    void Cuentasys(String a){
        String cantidad="SELECT Cantidad FROM productos WHERE ID_producto LIKE '"+a+"'";
        String can=new String();
        int res;
        
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(cantidad);
            while (rs.next()) {
                can= rs.getString(1);
                c_sistema.setText(can);
                res=calculamenos(can,c_fisica.getText());
                JOptionPane.showMessageDialog(null, "Cantidad de producto faltante: \n"+res);
                
                
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Conteo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Producto inexistene");
            
        }
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        id_productotxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_sistema = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        c_fisica = new javax.swing.JTextField();
        Verificar = new javax.swing.JButton();
        salirconteo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 42, 122, 35));
        getContentPane().add(id_productotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 42, 231, 35));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("contados por sistema");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 95, 122, 34));

        c_sistema.setForeground(new java.awt.Color(255, 255, 255));
        c_sistema.setText("desconocido");
        getContentPane().add(c_sistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 141, 34));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("cuenta fisica");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 140, 104, 39));
        getContentPane().add(c_fisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 140, 235, 39));

        Verificar.setText("Verificar");
        Verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarActionPerformed(evt);
            }
        });
        getContentPane().add(Verificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 260, 221, 53));

        salirconteo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_e_Imagenes/Imagenes interfaz/Exit.png"))); // NOI18N
        salirconteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirconteoActionPerformed(evt);
            }
        });
        getContentPane().add(salirconteo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 45, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fm2.gif"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerificarActionPerformed
        Cuentasys(id_productotxt.getText());
        id_productotxt.setText(null);
        c_fisica.setText(null);
        c_sistema.setText(null);
        
    }//GEN-LAST:event_VerificarActionPerformed

    private void salirconteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirconteoActionPerformed
        inicio a=new inicio();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirconteoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conteo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Verificar;
    private javax.swing.JTextField c_fisica;
    private javax.swing.JLabel c_sistema;
    private javax.swing.JTextField id_productotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton salirconteo;
    // End of variables declaration//GEN-END:variables

    private int calculamenos(String a, String b) {
        int res=0;
        res= Integer.valueOf(a) - Integer.valueOf(b);
        return res;
      
    }
}
