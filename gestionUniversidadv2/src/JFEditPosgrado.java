import EntradaSalida.EntradaSalidaAlumno;
import EntradaSalida.EntradaSalidaPosGrado;
import ObjetosU.*; 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author gino
 */
public class JFEditPosgrado extends javax.swing.JFrame {
    private String docBusqueda;
    private EntradaSalidaPosGrado entradaSalida;
    
    public void setDocBusqueda(String s)
    {   docBusqueda = s; }
    
    public JFEditPosgrado() 
    {
        
        this.setTitle("Modificar alumno de post grado");
        this.setResizable(false);
        initComponents();  
        this.setLocationRelativeTo(null);
         entradaSalida = new EntradaSalidaPosGrado(jtfdoc, jcbcar, jcbfac, jdcing, jdcnac, jtfdir, jtfnom, jtfreg, jtfcarpg);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jcbfac = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jcbcar = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jtfnom = new javax.swing.JTextField();
        jtfdoc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfdir = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfreg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfcarpg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jdcnac = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jdcing = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add use.png"))); // NOI18N
        jLabel10.setText("EDITAR ALUMNO POS GRADO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Carrera:");

        jcbfac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFMyN", "FQByF", "FICA", "FCEJS", "FCH", "FaPsi", "FCS", "FTU" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Fecha de ingreso:");

        jcbcar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingenier??a Electr??nica con Orientaci??n en Sistemas Digitales", "Ingenier??a en Computaci??n", "Ingenier??a en Inform??tica", "Ingenier??a en Minas", "Licenciatura en Ciencias de la Computaci??n", "Licenciatura en Ciencias Geol??gicas", "Licenciatura en Ciencias Matem??ticas", "Licenciatura en F??sica  (Titulo Intermedio: Auxiliar en F??sica Aplicada)", "Licenciatura en Matem??tica Aplicada", "Profesorado en Ciencias de la Computaci??n", "Profesorado en F??sica", "Profesorado en Matem??tica", "Profesorado en Tecnolog??a Electr??nica", "Tecnicatura Universitaria en Electr??nica", "Tecnicatura Universitaria en Energ??as Renovables", "Tecnicatura Universitaria en Geoinform??tica", "Tecnicatura Universitaria en Obras Viales", "Tecnicatura Universitaria en Miner??a", "Tecnicatura Universitaria en Redes de Computadoras", "Tecnicatura Universitaria en Telecomunicaciones", "Tecnicatura Universitaria en Web", "Tecnicatura Universitaria en Fotograf??a", "Ingenier??a en Alimentos", "Farmacia", "Licenciatura en Biolog??a Molecular", "Licenciatura en Bioqu??mica", "Licenciatura en Biotecnolog??a", "Licenciatura en Ciencia y Tecnolog??a de los Alimentos", "Licenciatura en Ciencias Biol??gicas", "Licenciatura en Qu??mica", "Profesorado Universitario en Biolog??a", "Profesorado en Qu??mica", "Tecnicatura Universitaria en Esterilizaci??n", "Tecnicatura Universitaria en Laboratorios Biol??gicos", "Analista Qu??mico", "Tecnicatura Universitaria en Higiene y Seguridad en el Trabajo", "Ingenier??a Agron??mica", "Ingenier??a Electromec??nica", "Ingenier??a Electr??nica", "Ingenier??a en Alimentos", "Ingenier??a Industrial", "Ingenier??a Mecatr??nica", "Ingenier??a Qu??mica", "Bromatolog??a", "Tecnicatura Universitaria en Automatizaci??n Industrial Orientaci??n Inform??tica", "Tecnicatura Universitaria en Dise??o Mec??nico Orientaci??n Inform??tica", "Tecnicatura Universitaria en Producci??n Ap??cola", "Tecnicatura Universitaria en Mantenimiento Industrial", "Abogac??a", "Contador P??blico Nacional", "Licenciatura en Administraci??n", "Licenciatura en Trabajo Social", "Procurador", "Tecnicatura Universitaria en Acompa??amiento Terap??utico", "Tecnicatura Universitaria en Asistencia Jur??dica", "Tecnicatura Universitaria en Gesti??n Financiera", "Martillero y Corredor P??blico", "Licenciatura en Ciencias de la Educaci??n", "Licenciatura en Comunicaci??n Social", "Licenciatura en Educaci??n Inicial", "Licenciatura en Periodismo", "Licenciatura en Producci??n de Radio y Televisi??n", "Profesorado en Ciencias de la Educaci??n", "Profesorado en Educaci??n Especial", "Licenciatura en Educaci??n Especial", "Profesorado en Educaci??n Inicial", "Profesorado Universitario en Letras", "Profesorado Universitario en M??sica Popular Latinoamericana", "Tecnicatura Universitaria en Producci??n Musical", "Licenciatura en Psicolog??a", "Profesorado en Psicolog??a", "Licenciatura en Psicomotricidad", "Licenciatura en Enfermer??a", "Licenciatura en Fonoaudiolog??a", "Licenciatura en Kinesiolog??a y Fisiatr??a", "Licenciatura en Nutrici??n", "Licenciatura en Hoteler??a", "Licenciatura en Turismo", "Gu??a Universitario de Turismo", "Tecnicatura Universitaria en Gesti??n Hotelera", "Tecnicatura Universitaria en Gesti??n Tur??stica", "Tecnicatura Universitaria en Parques", "Jardines y Floricultura", "Tecnicatura Universitaria en Producci??n de Plantas Arom??ticas" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Registro:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Carrera de post grado:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jtfnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfnomActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Documento:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Direcci??n:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de Nacimiento:");

        jdcnac.setDateFormatString("dd-MM-yyyy");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Facultad:");

        jdcing.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfnom)
                    .addComponent(jtfdoc)
                    .addComponent(jtfdir)
                    .addComponent(jtfreg)
                    .addComponent(jdcnac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdcing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbfac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbcar, 0, 1, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel9))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfcarpg))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(35, 35, 35))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jdcnac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbfac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbcar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtfreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jtfcarpg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jdcing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AlumnoPostGrado apg = new AlumnoPostGrado(); 
        entradaSalida.ingresarPosGrado(apg);
        String nuevoDoc = apg.getDoc();
        if(apg.campoVacio())
            JOptionPane.showMessageDialog(null, "Error: debe ingresar todos los campos");
        else if ((!docBusqueda.equals(nuevoDoc) && JFMenuPrin.enLista(nuevoDoc)))
            JOptionPane.showMessageDialog(null, "Error: la persona con dni " + nuevoDoc + " ya se encuentra en el sistema");
        else
        {
            JFMenuPrin.editarFilaTabla(docBusqueda, apg.getDoc(), apg.getNbre(), apg.getDir());
            JFMenuPrin.modificarPersona(docBusqueda, apg);
            docBusqueda = nuevoDoc;
            JOptionPane.showMessageDialog(null, "Cambios Guardados");
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void mostrarDatosPostGrado(AlumnoPostGrado apg) throws ParseException
    {  
        entradaSalida.mostrarPosGrado(apg);
    }  
        
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
            java.util.logging.Logger.getLogger(JFEditPosgrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEditPosgrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEditPosgrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEditPosgrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEditPosgrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JComboBox<String> jcbcar;
    private javax.swing.JComboBox<String> jcbfac;
    private com.toedter.calendar.JDateChooser jdcing;
    private com.toedter.calendar.JDateChooser jdcnac;
    private javax.swing.JTextField jtfcarpg;
    private javax.swing.JTextField jtfdir;
    private javax.swing.JTextField jtfdoc;
    private javax.swing.JTextField jtfnom;
    private javax.swing.JTextField jtfreg;
    // End of variables declaration//GEN-END:variables
}
