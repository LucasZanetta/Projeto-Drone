/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Controller;
import control.DataController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        
        iconLoading.setVisible(false);
        
        txtField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanelBody = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        iconExit = new javax.swing.JLabel();
        iconLogo = new javax.swing.JLabel();
        txtFirstTitle = new javax.swing.JLabel();
        txtSecondTitle = new javax.swing.JLabel();
        jPanelFooter = new javax.swing.JPanel();
        txtField = new javax.swing.JTextField();
        iconLoading = new javax.swing.JLabel();
        txtCity = new javax.swing.JLabel();
        txtModel = new javax.swing.JLabel();
        txtFirstCategory = new javax.swing.JLabel();
        txtSecondCategory = new javax.swing.JLabel();
        txtBranch = new javax.swing.JLabel();
        btnBranch = new javax.swing.JButton();
        btnCategory = new javax.swing.JButton();
        btnModel = new javax.swing.JButton();
        btnCity = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelBody.setBackground(new java.awt.Color(247, 241, 228));

        jPanelHeader.setBackground(new java.awt.Color(81, 129, 103));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(1000, 200));

        iconExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit.png"))); // NOI18N
        iconExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconExitMouseClicked(evt);
            }
        });

        iconLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Drone.png"))); // NOI18N

        txtFirstTitle.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtFirstTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtFirstTitle.setText("Aeronaves não tripuladas cadastradas para");

        txtSecondTitle.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSecondTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtSecondTitle.setText("Sobrevoar o território Brasileiro");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconLogo)
                .addGap(409, 409, 409)
                .addComponent(iconExit)
                .addGap(20, 20, 20))
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(txtFirstTitle))
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(txtSecondTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(iconExit))
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconLogo)))
                .addGap(9, 9, 9)
                .addComponent(txtFirstTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSecondTitle)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanelFooter.setBackground(new java.awt.Color(83, 63, 59));
        jPanelFooter.setPreferredSize(new java.awt.Dimension(1000, 105));

        txtField.setEditable(false);
        txtField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtField.setText("Bem-Vindo!");

        iconLoading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Loading.gif"))); // NOI18N

        javax.swing.GroupLayout jPanelFooterLayout = new javax.swing.GroupLayout(jPanelFooter);
        jPanelFooter.setLayout(jPanelFooterLayout);
        jPanelFooterLayout.setHorizontalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFooterLayout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(iconLoading)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanelFooterLayout.setVerticalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconLoading)
                    .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        txtCity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCity.setText("Cidade que contém mais drones cadastrados");

        txtModel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtModel.setText("Modelo mais vendido no Brasil");

        txtFirstCategory.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFirstCategory.setText("Categoria de peso mais utilizada");

        txtSecondCategory.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtSecondCategory.setText("(Leve: 0 a 7     Médio: 8 a 13     Pesado: 14+)");

        txtBranch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBranch.setText("Ramo de atividade mais comum");

        btnBranch.setBackground(new java.awt.Color(129, 30, 4));
        btnBranch.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnBranch.setForeground(new java.awt.Color(255, 255, 255));
        btnBranch.setText("SELECIONAR");
        btnBranch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBranchActionPerformed(evt);
            }
        });

        btnCategory.setBackground(new java.awt.Color(129, 30, 4));
        btnCategory.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCategory.setForeground(new java.awt.Color(255, 255, 255));
        btnCategory.setText("SELECIONAR");
        btnCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });

        btnModel.setBackground(new java.awt.Color(129, 30, 4));
        btnModel.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnModel.setForeground(new java.awt.Color(255, 255, 255));
        btnModel.setText("SELECIONAR");
        btnModel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelActionPerformed(evt);
            }
        });

        btnCity.setBackground(new java.awt.Color(129, 30, 4));
        btnCity.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCity.setForeground(new java.awt.Color(255, 255, 255));
        btnCity.setText("SELECIONAR");
        btnCity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityActionPerformed(evt);
            }
        });

        btnInsert.setBackground(new java.awt.Color(33, 33, 33));
        btnInsert.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Insert.png"))); // NOI18N
        btnInsert.setText("INSERIR");
        btnInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsert.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnInsert.setIconTextGap(12);
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
            .addComponent(jPanelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addComponent(txtModel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addComponent(txtCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCity, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addComponent(txtSecondCategory)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addComponent(txtFirstCategory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addComponent(txtBranch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(120, 120, 120))
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCity)
                    .addComponent(btnCity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModel)
                    .addComponent(btnModel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstCategory)
                    .addComponent(btnCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSecondCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBranch)
                    .addComponent(btnBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iconExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_iconExitMouseClicked

    private void btnCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityActionPerformed
        // TODO add your handling code here:
        DataController dataController = new DataController();
        
        try {
            txtField.setText(dataController.selectChoice(1));
        } catch (SQLException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCityActionPerformed

    private void btnModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelActionPerformed
        // TODO add your handling code here:
        DataController dataController = new DataController();
        
        try {
            txtField.setText(dataController.selectChoice(2));
        } catch (SQLException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModelActionPerformed

    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryActionPerformed
        // TODO add your handling code here:
        DataController dataController = new DataController();
        
        try {
            txtField.setText(dataController.selectChoice(3));
        } catch (SQLException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCategoryActionPerformed

    private void btnBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBranchActionPerformed
        // TODO add your handling code here:
        DataController dataController = new DataController();
        
        try {
            txtField.setText(dataController.selectChoice(4));
        } catch (SQLException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBranchActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        new Thread() {
            
            @Override
            public void run() {
                
                Controller controller = new Controller();
                
                DataController dataController = new DataController();
                
                try {
                    if (dataController.check() == 1) {
                        
                        txtField.setText("Inserção já realizada!");
                        
                    } else {
                        iconLoading.setVisible(true);
                        
                        txtField.setText("Inserindo no Banco de Dados!");
                        
                        controller.access();
                        
                        txtField.setText("Pronto. Inserção Concluída!");
                        
                        iconLoading.setVisible(false);
                        
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }.start();
    }//GEN-LAST:event_btnInsertActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBranch;
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnCity;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnModel;
    private javax.swing.JLabel iconExit;
    private javax.swing.JLabel iconLoading;
    private javax.swing.JLabel iconLogo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JLabel txtBranch;
    private javax.swing.JLabel txtCity;
    private javax.swing.JTextField txtField;
    private javax.swing.JLabel txtFirstCategory;
    private javax.swing.JLabel txtFirstTitle;
    private javax.swing.JLabel txtModel;
    private javax.swing.JLabel txtSecondCategory;
    private javax.swing.JLabel txtSecondTitle;
    // End of variables declaration//GEN-END:variables
}