package video;

import java.util.HashMap;
import javax.swing.JOptionPane;
import newq.menu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author casa
 */
public class video extends javax.swing.JFrame {
    
    private final HashMap<String, Double> profesiones = new HashMap<>();
    
    /**
     * Creates new form video
     */
    public video() {
        initComponents();
        setCB();
    }

    private void setCB() {
        String[] a = {"Masculino", "Femenino"};
        this.gender.addItem(a[0]);
        this.gender.addItem(a[1]);
        String[] b = {"Tecnico", "Tecnologo", "Profesional", "Especialista", "Magister"};
        this.job.addItem(b[0]);
        this.job.addItem(b[1]);
        this.job.addItem(b[2]);
        this.job.addItem(b[3]);
        this.job.addItem(b[4]);
    }

    public Double getProfession(String Cargo) {
        setProfession();
        return profesiones.get(Cargo);
    }

    public void setProfession() {
        String[] b = {"Tecnico", "Tecnologo", "Profesional", "Especialista", "Magister"};
        double[] c = {9000, 18000, 36000, 46000, 70000};
        for (int i = 0; i < 5; i++) {
            profesiones.put(b[i], c[i]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        dni = new javax.swing.JTextField();
        hours = new javax.swing.JTextField();
        valueH = new javax.swing.JLabel();
        salaryB = new javax.swing.JLabel();
        rF = new javax.swing.JLabel();
        BAlim = new javax.swing.JLabel();
        BTr = new javax.swing.JLabel();
        SalaryT = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        job = new javax.swing.JComboBox<>();
        eraser = new javax.swing.JLabel();
        optain = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Empresa ABC");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CC");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, 140, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Genero");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Profesion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, 140, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Valor Horas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 140, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Horas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 245, 140, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Salario Basico");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 140, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Retefuente");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 140, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("B. alimentacion");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 140, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("B. Transporte");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 140, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 140, 30));

        name.setBackground(new java.awt.Color(228, 123, 123));
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        name.setOpaque(false);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 200, 28));

        dni.setBackground(new java.awt.Color(228, 123, 123));
        dni.setForeground(new java.awt.Color(255, 255, 255));
        dni.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        dni.setOpaque(false);
        getContentPane().add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 105, 200, 28));

        hours.setBackground(new java.awt.Color(228, 123, 123));
        hours.setForeground(new java.awt.Color(255, 255, 255));
        hours.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        hours.setOpaque(false);
        getContentPane().add(hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 245, 200, 28));

        valueH.setForeground(new java.awt.Color(255, 255, 255));
        valueH.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        getContentPane().add(valueH, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 200, 28));

        salaryB.setForeground(new java.awt.Color(255, 255, 255));
        salaryB.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        getContentPane().add(salaryB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 200, 30));

        rF.setForeground(new java.awt.Color(255, 255, 255));
        rF.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        getContentPane().add(rF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 200, 30));

        BAlim.setForeground(new java.awt.Color(255, 255, 255));
        BAlim.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        getContentPane().add(BAlim, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 200, 30));

        BTr.setForeground(new java.awt.Color(255, 255, 255));
        BTr.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        getContentPane().add(BTr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 200, 30));

        SalaryT.setForeground(new java.awt.Color(255, 255, 255));
        SalaryT.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        getContentPane().add(SalaryT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 200, 30));

        gender.setBackground(new java.awt.Color(153, 153, 153));
        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        gender.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                genderMouseMoved(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 200, 30));

        job.setBackground(new java.awt.Color(153, 153, 153));
        job.setForeground(new java.awt.Color(255, 255, 255));
        job.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        getContentPane().add(job, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 175, 200, 30));

        eraser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eraser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Webp.net-resizeimage (2).png"))); // NOI18N
        eraser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eraserMouseClicked(evt);
            }
        });
        getContentPane().add(eraser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 50, 50));

        optain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Webp.net-resizeimage.png"))); // NOI18N
        optain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optainMouseClicked(evt);
            }
        });
        getContentPane().add(optain, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 130, 50));

        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Webp.net-resizeimage (1).png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 60, 50));

        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/sakurajima_mai.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void optainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optainMouseClicked
        try {
            String nameEmpleado, cc, gen, prof;
            double vh, h, ba = 0, bt = 0, rf, sb, st;
            
            nameEmpleado = this.name.getText();
            cc = this.dni.getText();
            gen = this.gender.getSelectedItem().toString();
            prof = this.job.getSelectedItem().toString();
            vh = getProfession(prof);
            h = Double.parseDouble(this.hours.getText());

            switch(gen) {
                case "Masculino":
                    ba = 100000;
                    bt = 110000;
                case "Femenino":
                    ba = 150000;
                    bt = 140000;
            }
            
            sb = vh * h;
            rf = sb * 0.12;
            st = (sb - rf) + ba + bt;
            
            this.BAlim.setText(String.valueOf(ba));
            this.BTr.setText(String.valueOf(bt));
            this.salaryB.setText(String.valueOf(sb));
            this.valueH.setText(String.valueOf(vh));
            this.rF.setText(String.valueOf(rf));
            this.SalaryT.setText(String.valueOf(st));
            
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_optainMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        menu menu = new menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void genderMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genderMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_genderMouseMoved

    private void eraserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraserMouseClicked
        this.BAlim.setText("");
        this.BTr.setText("");
        this.salaryB.setText("");
        this.valueH.setText("");
        this.rF.setText("");
        this.SalaryT.setText("");
        this.hours.setText("");
        this.name.setText("");
        this.dni.setText("");
        this.gender.setSelectedIndex(0);
        this.job.setSelectedIndex(0);
    }//GEN-LAST:event_eraserMouseClicked

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
            java.util.logging.Logger.getLogger(video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(video.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new video().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BAlim;
    private javax.swing.JLabel BTr;
    private javax.swing.JLabel SalaryT;
    private javax.swing.JLabel background;
    private javax.swing.JTextField dni;
    private javax.swing.JLabel eraser;
    private javax.swing.JLabel exit;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField hours;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> job;
    private javax.swing.JTextField name;
    private javax.swing.JLabel optain;
    private javax.swing.JLabel rF;
    private javax.swing.JLabel salaryB;
    private javax.swing.JLabel valueH;
    // End of variables declaration//GEN-END:variables
}
