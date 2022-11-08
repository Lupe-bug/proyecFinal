//Proyecto realizado por Guadalupe Diana Rubí Barahona Casia 0905-20-3153 para el curso Programación II

package Visual;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.sql.*;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

   // int numero_main = 1; //1 = login y 2 = registro
    
    int xMouse, yMouse;

    public login() {
        initComponents();

        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel2, "src/Imagenes/Iconos/Zara 190x80.png");

        conn = Data.Conexion.conexion();
        System.out.println("Ha ingresado a la ventana Login");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Zara blanco.png")).getImage());
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        btnSalir = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btnEntrar = new javax.swing.JPanel();
        lblEntrar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnregis = new javax.swing.JPanel();
        rgistrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zara Magazine");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(1.0f, 1.0f, 1.0f,0.0f));
        header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                headerMouseMoved(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                headerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                headerMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                headerMouseReleased(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));

        lblSalir.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("X");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblSalir.setPreferredSize(new java.awt.Dimension(40, 40));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSalirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 760, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/Zara 190x80.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 190, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo 1 340x510.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 500));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel6.setText("INICIO DE SESIÓN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel4.setText("USUARIO: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        txtUser.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(153, 153, 153));
        txtUser.setText("Ingrese su nombre de usuario");
        txtUser.setBorder(null);
        txtUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtUser.setPreferredSize(new java.awt.Dimension(250, 22));
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserMousePressed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 320, -1));

        jSeparator1.setBackground(new java.awt.Color(1, 4, 100));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 320, 5));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel5.setText("CONTRASEÑA: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        txtPass.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        txtPass.setText("Ingrese su contrasena");
        txtPass.setBorder(null);
        txtPass.setPreferredSize(new java.awt.Dimension(250, 28));
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMousePressed(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 320, -1));

        jSeparator2.setBackground(new java.awt.Color(1, 4, 100));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 320, 5));

        btnEntrar.setBackground(new java.awt.Color(1, 4, 100));

        lblEntrar.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblEntrar.setForeground(new java.awt.Color(255, 255, 255));
        lblEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEntrar.setText("Entrar");
        lblEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEntrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEntrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblEntrarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnEntrarLayout = new javax.swing.GroupLayout(btnEntrar);
        btnEntrar.setLayout(btnEntrarLayout);
        btnEntrarLayout.setHorizontalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEntrarLayout.createSequentialGroup()
                .addComponent(lblEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnEntrarLayout.setVerticalGroup(
            btnEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEntrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 130, 30));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(150, 150, 150));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Hecho por Guadalupe Diana Rubí Barahona Casia 0905-20-3153");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 540, 20));

        btnregis.setBackground(new java.awt.Color(1, 4, 100));

        rgistrar.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        rgistrar.setForeground(new java.awt.Color(255, 255, 255));
        rgistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rgistrar.setText("Registrarse");
        rgistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rgistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rgistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rgistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rgistrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rgistrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rgistrarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnregisLayout = new javax.swing.GroupLayout(btnregis);
        btnregis.setLayout(btnregisLayout);
        btnregisLayout.setHorizontalGroup(
            btnregisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rgistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnregisLayout.setVerticalGroup(
            btnregisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnregisLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rgistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnregis, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 130, 30));

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

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        btnSalir.setBackground(Color.red);
        lblSalir.setForeground(Color.white);
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        btnSalir.setBackground(Color.white);
        lblSalir.setForeground(Color.black);
    }//GEN-LAST:event_lblSalirMouseExited
    private void headerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseReleased
    }//GEN-LAST:event_headerMouseReleased

    private void headerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseMoved
    }//GEN-LAST:event_headerMouseMoved

    private void headerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseEntered
    }//GEN-LAST:event_headerMouseEntered

    private void headerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseExited
    }//GEN-LAST:event_headerMouseExited

    private void lblEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseEntered
        btnEntrar.setBackground(new Color(100, 100, 150));
    }//GEN-LAST:event_lblEntrarMouseEntered

    private void lblEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseExited
        btnEntrar.setBackground(new Color(1, 4, 64));
    }//GEN-LAST:event_lblEntrarMouseExited

    private void txtUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMousePressed
        if (txtUser.getText().equals("Ingrese su nombre de usuario")) {
            txtUser.setText("");
            txtUser.setForeground(Color.black);
        }
        if (String.valueOf(txtPass.getPassword()).isEmpty()) {
            txtPass.setText("Ingrese su contrasena");
            txtPass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUserMousePressed

    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed
        if (String.valueOf(txtPass.getPassword()).equals("Ingrese su contrasena")) {
            txtPass.setText("");
            txtPass.setForeground(Color.black);
        }
        if (txtUser.getText().isEmpty()) {
            txtUser.setText("Ingrese su nombre de usuario");
            txtUser.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPassMousePressed

    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked
    }//GEN-LAST:event_txtUserMouseClicked

    private void lblEntrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMousePressed
        btnEntrar.setBackground(new Color(121, 135, 162));
    }//GEN-LAST:event_lblEntrarMousePressed

    private void lblEntrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseReleased
        btnEntrar.setBackground(new Color(100, 100, 150));
    }//GEN-LAST:event_lblEntrarMouseReleased

    private void lblSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMousePressed
        btnSalir.setBackground(new Color(89, 2, 2));
        lblSalir.setForeground(Color.white);
    }//GEN-LAST:event_lblSalirMousePressed

    private void lblEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseClicked
        String sql = "SELECT * from Usuarios WHERE usuario LIKE ? AND contrasena LIKE ?; ";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtUser.getText());
            pst.setString(2, new String(txtPass.getPassword()));
            rs = pst.executeQuery();
            if (rs.next()) {
                Menu menu = new Menu();
                menu.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrecta.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hubo un error. " + e);
        }
    }//GEN-LAST:event_lblEntrarMouseClicked

    private void rgistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rgistrarMouseClicked
        new Registro().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rgistrarMouseClicked

    private void rgistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rgistrarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_rgistrarMouseEntered

    private void rgistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rgistrarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_rgistrarMouseExited

    private void rgistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rgistrarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgistrarMousePressed

    private void rgistrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rgistrarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_rgistrarMouseReleased

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEntrar;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JPanel btnregis;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel rgistrar;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
