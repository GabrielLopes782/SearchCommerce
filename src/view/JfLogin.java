/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextField;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.loginVO;
import services.loginServices;

/**
 *
 * @author Thiago Quevedo
 */
public class JfLogin extends javax.swing.JFrame {

    private static JfRegistraUsuario jfRL = new JfRegistraUsuario();

    private static loginServices logS = services.ServicesFactory.getLoginServices();

    /**
     * Creates new form JfLogin
     */
    public JfLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jbLimpar = new javax.swing.JButton();
        jtfUsuario = new javax.swing.JTextField();
        jlSenha = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jlLogin = new javax.swing.JLabel();
        jcbVisualizar = new javax.swing.JCheckBox();
        jpfSenha = new javax.swing.JPasswordField();
        jbEntrar = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();
        jlAvisoUsuarioUser = new javax.swing.JLabel();
        jlAvisoUsuarioSenha = new javax.swing.JLabel();
        jtfVisualizaSenha = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(500, 500));

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jlSenha.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jlSenha.setText("Senha:");
        jlSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSenhaMouseClicked(evt);
            }
        });

        jlUsuario.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jlUsuario.setText("Usuário:");
        jlUsuario.setToolTipText("");
        jlUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlUsuarioMouseClicked(evt);
            }
        });

        jlLogin.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        jlLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLogin.setText("Login");

        jcbVisualizar.setText("Visualizar");
        jcbVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbVisualizarActionPerformed(evt);
            }
        });

        jpfSenha.setEchoChar('\u25cf');
        jpfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpfSenhaKeyTyped(evt);
            }
        });

        jbEntrar.setText("Entrar");
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jlAvisoUsuarioUser.setForeground(new java.awt.Color(255, 0, 0));
        jlAvisoUsuarioUser.setText("*Insira um nome de usuário");

        jlAvisoUsuarioSenha.setForeground(new java.awt.Color(255, 0, 0));
        jlAvisoUsuarioSenha.setText("*Insira uma senha");

        jtfVisualizaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfVisualizaSenhaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jlLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfVisualizaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbVisualizar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jbEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbCadastrar))
                        .addComponent(jpfSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jlSenha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlAvisoUsuarioSenha)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jlUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlAvisoUsuarioUser))
                        .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlLogin)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlUsuario)
                    .addComponent(jlAvisoUsuarioUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSenha)
                    .addComponent(jlAvisoUsuarioSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbVisualizar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEntrar)
                    .addComponent(jbLimpar)
                    .addComponent(jbCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfVisualizaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSenhaMouseClicked
        // TODO add your handling code here:
        jpfSenha.requestFocus();
    }//GEN-LAST:event_jlSenhaMouseClicked

    private void jlUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlUsuarioMouseClicked
        // TODO add your handling code here:
        jtfUsuario.requestFocus();
    }//GEN-LAST:event_jlUsuarioMouseClicked

    private void jcbVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbVisualizarActionPerformed
        // TODO add your handling code here:
        if(jcbVisualizar.isSelected()){
            jtfVisualizaSenha.setText(jpfSenha.getText());
            jtfVisualizaSenha.setBounds(jpfSenha.getX(), jpfSenha.getY() ,jpfSenha.getWidth(), jpfSenha.getHeight()) ;
            jpfSenha.setVisible(false);
            jtfVisualizaSenha.setVisible(true);
        } else {
            jpfSenha.setText(jtfVisualizaSenha.getText());
            jpfSenha.setVisible(true);
            jtfVisualizaSenha.setVisible(false);
        }
        System.out.println("Trocou");
    }//GEN-LAST:event_jcbVisualizarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        jtfUsuario.setText("");
        jpfSenha.setText("");
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
        try {
            JfMain jfM = new JfMain();
            try {
                loginVO lVO = new loginVO(jtfUsuario.getText(), jpfSenha.getText());
                if (jbEntrar.getText().equals("Entrar")) {
                    try {
                        if (logS.verificaLogin(lVO)) {
                            this.setVisible(false);
                            jfM.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Usuário ou senha inválidos!\n"
                                    + "Deseja se cadastrar?");
                        }
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                
                if (jbEntrar.getText().equals("Cadastrar")) {
                    try {
                        logS.cadastraLogin(lVO);
                        jfRL.setVisible(true);
                        jfRL.setLocation(this.getX(), this.getY());
                        this.setVisible(false);

                        System.out.println("Cadastrado com sucesso");
                    } catch (SQLException ex) {
                        Logger.getLogger(JfLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(JfLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JfLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbEntrarActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        // TODO add your handling code here:
        if (!jlAvisoUsuarioUser.isVisible()) {
            alteraParaCadastro();
        } else {
            alteraParaLogin();
        }


    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jpfSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfSenhaKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jpfSenhaKeyTyped

    private void jtfVisualizaSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfVisualizaSenhaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfVisualizaSenhaKeyTyped

    private void alteraParaCadastro() {
        jlLogin.setText("Cadastro");
        jbCadastrar.setText("Cancelar");
        jbEntrar.setText("Cadastrar");
        jbLimpar.setEnabled(false);
        jlAvisoUsuarioUser.setVisible(true);
        jlAvisoUsuarioSenha.setVisible(true);

        jtfUsuario.setText("");
        jpfSenha.setText("");
    }

    private void alteraParaLogin() {
        jlLogin.setText("Login");
        jbCadastrar.setText("Cadastrar");
        jbEntrar.setText("Entrar");
        jbLimpar.setEnabled(true);
        jlAvisoUsuarioUser.setVisible(false);
        jlAvisoUsuarioSenha.setVisible(false);
        jtfUsuario.setText("");
        jpfSenha.setText("");
    }

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
            java.util.logging.Logger.getLogger(JfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                JfLogin login = new JfLogin();
                login.setVisible(true);
                login.setBounds((screenSize.width / 2 - 500 / 2), (screenSize.height / 2 - 500 / 2), 500, 500);
                jlAvisoUsuarioUser.setVisible(false);
                jlAvisoUsuarioSenha.setVisible(false);
                jtfVisualizaSenha.setVisible(false);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JCheckBox jcbVisualizar;
    private static javax.swing.JLabel jlAvisoUsuarioSenha;
    private static javax.swing.JLabel jlAvisoUsuarioUser;
    private static javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfUsuario;
    private static javax.swing.JTextField jtfVisualizaSenha;
    // End of variables declaration//GEN-END:variables
}
