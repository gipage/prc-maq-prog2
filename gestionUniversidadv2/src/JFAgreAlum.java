
import EntradaSalida.EntradaSalidaAlumno;
import EntradaSalida.EntradaSalidaPersUniv;
import ObjetosU.Alumno;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JFAgreAlum extends javax.swing.JFrame {
    ImagenFondoAlumno img = new ImagenFondoAlumno();
    /**
     * Creates new form JFrameAgregarAlumno
     */
    public JFAgreAlum() {
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Nuevo alumno");
        this.setContentPane(img);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfnom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfdoc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfdir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jdcnac = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jcbfac = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jcbcar = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jdcing = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jtfreg = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add use.png"))); // NOI18N
        jLabel9.setText("AGREGAR ALUMNO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Documento:");

        jtfdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfdocActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Direcci??n:");

        jtfdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfdirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de nacimiento:");

        jdcnac.setDateFormatString("dd-MM-yyyy");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Facultad:");

        jcbfac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFMyN", "FQByF", "FICA", "FCEJS", "FCH", "FaPsi", "FCS", "FTU" }));
        jcbfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbfacActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Carrera:");

        jcbcar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingenier??a Electr??nica con Orientaci??n en Sistemas Digitales", "Ingenier??a en Computaci??n", "Ingenier??a en Inform??tica", "Ingenier??a en Minas", "Licenciatura en Ciencias de la Computaci??n", "Licenciatura en Ciencias Geol??gicas", "Licenciatura en Ciencias Matem??ticas", "Licenciatura en F??sica  (Titulo Intermedio: Auxiliar en F??sica Aplicada)", "Licenciatura en Matem??tica Aplicada", "Profesorado en Ciencias de la Computaci??n", "Profesorado en F??sica", "Profesorado en Matem??tica", "Profesorado en Tecnolog??a Electr??nica", "Tecnicatura Universitaria en Electr??nica", "Tecnicatura Universitaria en Energ??as Renovables", "Tecnicatura Universitaria en Geoinform??tica", "Tecnicatura Universitaria en Obras Viales", "Tecnicatura Universitaria en Miner??a", "Tecnicatura Universitaria en Redes de Computadoras", "Tecnicatura Universitaria en Telecomunicaciones", "Tecnicatura Universitaria en Web", "Tecnicatura Universitaria en Fotograf??a", "Ingenier??a en Alimentos", "Farmacia", "Licenciatura en Biolog??a Molecular", "Licenciatura en Bioqu??mica", "Licenciatura en Biotecnolog??a", "Licenciatura en Ciencia y Tecnolog??a de los Alimentos", "Licenciatura en Ciencias Biol??gicas", "Licenciatura en Qu??mica", "Profesorado Universitario en Biolog??a", "Profesorado en Qu??mica", "Tecnicatura Universitaria en Esterilizaci??n", "Tecnicatura Universitaria en Laboratorios Biol??gicos", "Analista Qu??mico", "Tecnicatura Universitaria en Higiene y Seguridad en el Trabajo", "Ingenier??a Agron??mica", "Ingenier??a Electromec??nica", "Ingenier??a Electr??nica", "Ingenier??a en Alimentos", "Ingenier??a Industrial", "Ingenier??a Mecatr??nica", "Ingenier??a Qu??mica", "Bromatolog??a", "Tecnicatura Universitaria en Automatizaci??n Industrial Orientaci??n Inform??tica", "Tecnicatura Universitaria en Dise??o Mec??nico Orientaci??n Inform??tica", "Tecnicatura Universitaria en Producci??n Ap??cola", "Tecnicatura Universitaria en Mantenimiento Industrial", "Abogac??a", "Contador P??blico Nacional", "Licenciatura en Administraci??n", "Licenciatura en Trabajo Social", "Procurador", "Tecnicatura Universitaria en Acompa??amiento Terap??utico", "Tecnicatura Universitaria en Asistencia Jur??dica", "Tecnicatura Universitaria en Gesti??n Financiera", "Martillero y Corredor P??blico", "Licenciatura en Ciencias de la Educaci??n", "Licenciatura en Comunicaci??n Social", "Licenciatura en Educaci??n Inicial", "Licenciatura en Periodismo", "Licenciatura en Producci??n de Radio y Televisi??n", "Profesorado en Ciencias de la Educaci??n", "Profesorado en Educaci??n Especial", "Licenciatura en Educaci??n Especial", "Profesorado en Educaci??n Inicial", "Profesorado Universitario en Letras", "Profesorado Universitario en M??sica Popular Latinoamericana", "Tecnicatura Universitaria en Producci??n Musical", "Licenciatura en Psicolog??a", "Profesorado en Psicolog??a", "Licenciatura en Psicomotricidad", "Licenciatura en Enfermer??a", "Licenciatura en Fonoaudiolog??a", "Licenciatura en Kinesiolog??a y Fisiatr??a", "Licenciatura en Nutrici??n", "Licenciatura en Hoteler??a", "Licenciatura en Turismo", "Gu??a Universitario de Turismo", "Tecnicatura Universitaria en Gesti??n Hotelera", "Tecnicatura Universitaria en Gesti??n Tur??stica", "Tecnicatura Universitaria en Parques", "Jardines y Floricultura", "Tecnicatura Universitaria en Producci??n de Plantas Arom??ticas" }));
        jcbcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbcarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Fecha de ingreso:");

        jdcing.setDateFormatString("dd-MM-yyyy");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Registro:");

        jtfreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfregActionPerformed(evt);
            }
        });

        jButtonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acep.png"))); // NOI18N
        jButtonAceptar.setBorder(null);
        jButtonAceptar.setBorderPainted(false);
        jButtonAceptar.setContentAreaFilled(false);
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jtfnom, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfdir, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtfdoc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jcbcar, 0, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdcing, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(jtfreg)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jdcnac, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jcbfac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jButtonAceptar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(151, 151, 151))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfdoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jdcnac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbfac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbcar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jdcing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButtonAceptar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfdocActionPerformed
        
    }//GEN-LAST:event_jtfdocActionPerformed

    private void jtfdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfdirActionPerformed

    }//GEN-LAST:event_jtfdirActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        EntradaSalidaAlumno input = new EntradaSalidaAlumno(jtfdoc, jcbcar, jcbfac, jdcing, jdcnac, jtfdir, jtfnom, jtfreg); 
        Alumno alumno = new Alumno(); 
        input.ingresarAlumno(alumno);
        if(alumno.campoVacio())
            JOptionPane.showMessageDialog(null, "Error: debe ingresar todos los campos");
        else if (JFMenuPrin.enLista(alumno.getDoc()))
            JOptionPane.showMessageDialog(null, "Error: la persona con dni " + alumno.getDoc() + " ya se encuentra en el sistema");
        else
        {
            JFMenuPrin.agregarFilaATabla(new Object[]{"Alumno", alumno.getDoc(), alumno.getNbre(), alumno.getDir()});                                         
            JFMenuPrin.agregarPersonaALista(alumno);
            dispose();
        }    
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jcbfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbfacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbfacActionPerformed

    private void jcbcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbcarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbcarActionPerformed

    private void jtfregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfregActionPerformed

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
            java.util.logging.Logger.getLogger(JFAgreAlum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAgreAlum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAgreAlum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAgreAlum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAgreAlum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JComboBox<String> jcbcar;
    private javax.swing.JComboBox<String> jcbfac;
    private com.toedter.calendar.JDateChooser jdcing;
    private com.toedter.calendar.JDateChooser jdcnac;
    private javax.swing.JTextField jtfdir;
    private javax.swing.JTextField jtfdoc;
    private javax.swing.JTextField jtfnom;
    private javax.swing.JTextField jtfreg;
    // End of variables declaration//GEN-END:variables
    class ImagenFondoAlumno extends JPanel{
        //atributos
        private Image imagen;
        //metodos
            public void paint(Graphics g){
                imagen=new ImageIcon(getClass().getResource("fondo_final (1).jpg")).getImage();
                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
                setOpaque(false);
                super.paint(g);
            }
    }






}
