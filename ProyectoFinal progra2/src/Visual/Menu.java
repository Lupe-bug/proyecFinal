package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {

    int xMouse, yMouse;

    /**
     * Creates new form Menu_Principal
     */
    public Menu() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Zara blanco.png")).getImage());
        
        rsscalelabel.RSScaleLabel.setScaleLabel(lblbug, "src/Imagenes/recortado.gif");
        this.setLocationRelativeTo(null);
        Inicio a = new Inicio();
        CargarPanel(a);
    }

    public void CargarPanel(JPanel w) {
        w.setSize(800, 480);
        w.setLocation(0, 0);
        mostrador.removeAll();
        mostrador.add(w, BorderLayout.CENTER);
        mostrador.revalidate();
        mostrador.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        btnSalir = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        PanelBotones = new javax.swing.JPanel();
        btnInicio = new javax.swing.JPanel();
        lbl_Inicio = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JPanel();
        lblUsuarios = new javax.swing.JLabel();
        btnCatalogo = new javax.swing.JPanel();
        lbl_Catalogo = new javax.swing.JLabel();
        btnCRUD = new javax.swing.JPanel();
        lblCRUD = new javax.swing.JLabel();
        mostrador = new javax.swing.JPanel();
        lblbug = new javax.swing.JLabel();
        lblCreditos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zara Magazine");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(1.0f, 1.0f, 1.0f,0.0f));
        header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        header.setPreferredSize(new java.awt.Dimension(800, 50));
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
        lblSalir.setForeground(new java.awt.Color(0, 0, 0));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("X");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.setPreferredSize(new java.awt.Dimension(50, 50));
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
                .addGap(0, 750, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        PanelBotones.setBackground(new java.awt.Color(1, 4, 100));
        PanelBotones.setPreferredSize(new java.awt.Dimension(590, 50));

        btnInicio.setBackground(new java.awt.Color(1, 4, 100));
        btnInicio.setPreferredSize(new java.awt.Dimension(200, 40));

        lbl_Inicio.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lbl_Inicio.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/info_18dp.png"))); // NOI18N
        lbl_Inicio.setText("Inicio");
        lbl_Inicio.setToolTipText("");
        lbl_Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Inicio.setPreferredSize(new java.awt.Dimension(40, 40));
        lbl_Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_InicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_InicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_InicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_InicioMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl_InicioMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Inicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        btnUsuarios.setBackground(new java.awt.Color(1, 4, 100));
        btnUsuarios.setPreferredSize(new java.awt.Dimension(150, 40));

        lblUsuarios.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/groups_18dp.png"))); // NOI18N
        lblUsuarios.setText("Usuarios");
        lblUsuarios.setToolTipText("");
        lblUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUsuarios.setPreferredSize(new java.awt.Dimension(40, 40));
        lblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUsuariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblUsuariosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblUsuariosMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnUsuariosLayout = new javax.swing.GroupLayout(btnUsuarios);
        btnUsuarios.setLayout(btnUsuariosLayout);
        btnUsuariosLayout.setHorizontalGroup(
            btnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        );
        btnUsuariosLayout.setVerticalGroup(
            btnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnCatalogo.setBackground(new java.awt.Color(1, 4, 100));
        btnCatalogo.setPreferredSize(new java.awt.Dimension(200, 40));

        lbl_Catalogo.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lbl_Catalogo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Catalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/info_18dp.png"))); // NOI18N
        lbl_Catalogo.setText("Cat??logo");
        lbl_Catalogo.setToolTipText("");
        lbl_Catalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Catalogo.setPreferredSize(new java.awt.Dimension(40, 40));
        lbl_Catalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CatalogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_CatalogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_CatalogoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_CatalogoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl_CatalogoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnCatalogoLayout = new javax.swing.GroupLayout(btnCatalogo);
        btnCatalogo.setLayout(btnCatalogoLayout);
        btnCatalogoLayout.setHorizontalGroup(
            btnCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
            .addGroup(btnCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_Catalogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
        );
        btnCatalogoLayout.setVerticalGroup(
            btnCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbl_Catalogo, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        );

        btnCRUD.setBackground(new java.awt.Color(1, 4, 100));
        btnCRUD.setPreferredSize(new java.awt.Dimension(200, 40));

        lblCRUD.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblCRUD.setForeground(new java.awt.Color(255, 255, 255));
        lblCRUD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/content_18dp.png"))); // NOI18N
        lblCRUD.setText("CRUD");
        lblCRUD.setToolTipText("");
        lblCRUD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCRUD.setPreferredSize(new java.awt.Dimension(40, 40));
        lblCRUD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCRUDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCRUDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCRUDMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCRUDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCRUDMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnCRUDLayout = new javax.swing.GroupLayout(btnCRUD);
        btnCRUD.setLayout(btnCRUDLayout);
        btnCRUDLayout.setHorizontalGroup(
            btnCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCRUD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );
        btnCRUDLayout.setVerticalGroup(
            btnCRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCRUD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(btnCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btnCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnCRUD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(PanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, -1));

        mostrador.setBackground(new java.awt.Color(204, 0, 204));
        mostrador.setPreferredSize(new java.awt.Dimension(800, 480));

        javax.swing.GroupLayout mostradorLayout = new javax.swing.GroupLayout(mostrador);
        mostrador.setLayout(mostradorLayout);
        mostradorLayout.setHorizontalGroup(
            mostradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        mostradorLayout.setVerticalGroup(
            mostradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel1.add(mostrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 800, 470));

        lblbug.setBackground(new java.awt.Color(255, 255, 255));
        lblbug.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblbug, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 580, 30, 20));

        lblCreditos.setFont(new java.awt.Font("Roboto Light", 2, 12)); // NOI18N
        lblCreditos.setForeground(new java.awt.Color(150, 150, 150));
        lblCreditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreditos.setText("Hecho por Guadalupe Diana Rub?? Barahona Casia 0905-20-3153");
        jPanel1.add(lblCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 800, 20));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 800, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseMoved

    }//GEN-LAST:event_headerMouseMoved

    private void headerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseEntered

    }//GEN-LAST:event_headerMouseEntered

    private void headerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseExited

    }//GEN-LAST:event_headerMouseExited

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseReleased

    }//GEN-LAST:event_headerMouseReleased

    private void lblUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMouseEntered
//        btnUsuarios.setBackground(new Color(181, 144, 57));
    }//GEN-LAST:event_lblUsuariosMouseEntered

    private void lblUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMouseExited
 //       btnUsuarios.setBackground(new Color(1, 4, 64));
    }//GEN-LAST:event_lblUsuariosMouseExited

    private void lblCRUDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCRUDMouseEntered
  //      btnCRUD.setBackground(new Color(100, 100, 150));
    }//GEN-LAST:event_lblCRUDMouseEntered

    private void lblCRUDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCRUDMouseExited
   //     btnCRUD.setBackground(new Color(1, 4, 64));
    }//GEN-LAST:event_lblCRUDMouseExited

    private void lbl_InicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_InicioMouseEntered
//        btnInicio.setBackground(new Color(100, 100, 150));
    }//GEN-LAST:event_lbl_InicioMouseEntered

    private void lbl_InicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_InicioMouseExited
   //     btnInicio.setBackground(new Color(1, 4, 64));
    }//GEN-LAST:event_lbl_InicioMouseExited

    private void lblUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMousePressed
 //       btnUsuarios.setBackground(new Color(121, 135, 162));
    }//GEN-LAST:event_lblUsuariosMousePressed

    private void lblUsuariosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMouseReleased
    //    btnUsuarios.setBackground(new Color(100, 100, 150));
    }//GEN-LAST:event_lblUsuariosMouseReleased

    private void lblCRUDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCRUDMousePressed
   //     btnCRUD.setBackground(new Color(121, 135, 162));
    }//GEN-LAST:event_lblCRUDMousePressed

    private void lblCRUDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCRUDMouseReleased
 //       btnCRUD.setBackground(new Color(100, 100, 150));
    }//GEN-LAST:event_lblCRUDMouseReleased

    private void lbl_InicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_InicioMousePressed
 //       btnInicio.setBackground(new Color(121, 135, 162));
    }//GEN-LAST:event_lbl_InicioMousePressed

    private void lbl_InicioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_InicioMouseReleased
//        btnInicio.setBackground(new Color(100, 100, 150));
    }//GEN-LAST:event_lbl_InicioMouseReleased

    private void lblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMouseClicked
        Usuarios p = new Usuarios();
        CargarPanel(p);
    }//GEN-LAST:event_lblUsuariosMouseClicked

    private void lblCRUDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCRUDMouseClicked
        CRUD c = new CRUD();
        CargarPanel(c);
    }//GEN-LAST:event_lblCRUDMouseClicked

    private void lbl_InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_InicioMouseClicked
        Inicio a = new Inicio();
        CargarPanel(a);
    }//GEN-LAST:event_lbl_InicioMouseClicked

    private void lblSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMousePressed
        btnSalir.setBackground(new Color(89, 2, 2));
        lblSalir.setForeground(Color.white);
    }//GEN-LAST:event_lblSalirMousePressed

    private void lbl_CatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CatalogoMouseClicked
        Catalogo w = new Catalogo();
        CargarPanel(w);
    }//GEN-LAST:event_lbl_CatalogoMouseClicked

    private void lbl_CatalogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CatalogoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_CatalogoMouseEntered

    private void lbl_CatalogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CatalogoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_CatalogoMouseExited

    private void lbl_CatalogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CatalogoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_CatalogoMousePressed

    private void lbl_CatalogoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CatalogoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_CatalogoMouseReleased

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel btnCRUD;
    private javax.swing.JPanel btnCatalogo;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JPanel btnUsuarios;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCRUD;
    private javax.swing.JLabel lblCreditos;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JLabel lbl_Catalogo;
    private javax.swing.JLabel lbl_Inicio;
    private javax.swing.JLabel lblbug;
    private javax.swing.JPanel mostrador;
    // End of variables declaration//GEN-END:variables
}
