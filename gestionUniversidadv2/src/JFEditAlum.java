import EntradaSalida.EntradaSalidaAlumno;
import EntradaSalida.EntradaSalidaPersUniv;
import ObjetosU.*; 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class JFEditAlum extends javax.swing.JFrame {
    private String docBusqueda;
    private EntradaSalidaAlumno entradaSalida;
    
    public JFEditAlum() 
    {
        this.setLocationRelativeTo(null);
        this.setTitle("Modificar alumno");
        this.setResizable(false);
        initComponents();
        entradaSalida = new EntradaSalidaAlumno(jtfdoc, jcbcar, jcbfac, jdcing, jdcnac, jtfdir, jtfnom, jtfreg);
    }
    
    public void setDocBusqueda(String s)
    {   docBusqueda = s; }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfnom = new javax.swing.JTextField();
        jtfdoc = new javax.swing.JTextField();
        jtfdir = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jdcnac = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jcbfac = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jcbcar = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jdcing = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jtfreg = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add use.png"))); // NOI18N
        jLabel8.setText(" EDITAR ALUMNO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Documento:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Dirección:");

        jtfdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfdocActionPerformed(evt);
            }
        });

        jtfdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfdirActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Fecha de nacimiento:");

        jdcnac.setDateFormatString("dd-MM-yyyy");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Facultad:");

        jcbfac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFMyN", "FQByF", "FICA", "FCEJS", "FCH", "FaPsi", "FCS", "FTU" }));
        jcbfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbfacActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Carrera:");

        jcbcar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniería Electrónica con Orientación en Sistemas Digitales", "Ingeniería en Computación", "Ingeniería en Informática", "Ingeniería en Minas", "Licenciatura en Ciencias de la Computación", "Licenciatura en Ciencias Geológicas", "Licenciatura en Ciencias Matemáticas", "Licenciatura en Física  (Titulo Intermedio: Auxiliar en Física Aplicada)", "Licenciatura en Matemática Aplicada", "Profesorado en Ciencias de la Computación", "Profesorado en Física", "Profesorado en Matemática", "Profesorado en Tecnología Electrónica", "Tecnicatura Universitaria en Electrónica", "Tecnicatura Universitaria en Energías Renovables", "Tecnicatura Universitaria en Geoinformática", "Tecnicatura Universitaria en Obras Viales", "Tecnicatura Universitaria en Minería", "Tecnicatura Universitaria en Redes de Computadoras", "Tecnicatura Universitaria en Telecomunicaciones", "Tecnicatura Universitaria en Web", "Tecnicatura Universitaria en Fotografía", "Ingeniería en Alimentos", "Farmacia", "Licenciatura en Biología Molecular", "Licenciatura en Bioquímica", "Licenciatura en Biotecnología", "Licenciatura en Ciencia y Tecnología de los Alimentos", "Licenciatura en Ciencias Biológicas", "Licenciatura en Química", "Profesorado Universitario en Biología", "Profesorado en Química", "Tecnicatura Universitaria en Esterilización", "Tecnicatura Universitaria en Laboratorios Biológicos", "Analista Químico", "Tecnicatura Universitaria en Higiene y Seguridad en el Trabajo", "Ingeniería Agronómica", "Ingeniería Electromecánica", "Ingeniería Electrónica", "Ingeniería en Alimentos", "Ingeniería Industrial", "Ingeniería Mecatrónica", "Ingeniería Química", "Bromatología", "Tecnicatura Universitaria en Automatización Industrial Orientación Informática", "Tecnicatura Universitaria en Diseño Mecánico Orientación Informática", "Tecnicatura Universitaria en Producción Apícola", "Tecnicatura Universitaria en Mantenimiento Industrial", "Abogacía", "Contador Público Nacional", "Licenciatura en Administración", "Licenciatura en Trabajo Social", "Procurador", "Tecnicatura Universitaria en Acompañamiento Terapéutico", "Tecnicatura Universitaria en Asistencia Jurídica", "Tecnicatura Universitaria en Gestión Financiera", "Martillero y Corredor Público", "Licenciatura en Ciencias de la Educación", "Licenciatura en Comunicación Social", "Licenciatura en Educación Inicial", "Licenciatura en Periodismo", "Licenciatura en Producción de Radio y Televisión", "Profesorado en Ciencias de la Educación", "Profesorado en Educación Especial", "Licenciatura en Educación Especial", "Profesorado en Educación Inicial", "Profesorado Universitario en Letras", "Profesorado Universitario en Música Popular Latinoamericana", "Tecnicatura Universitaria en Producción Musical", "Licenciatura en Psicología", "Profesorado en Psicología", "Licenciatura en Psicomotricidad", "Licenciatura en Enfermería", "Licenciatura en Fonoaudiología", "Licenciatura en Kinesiología y Fisiatría", "Licenciatura en Nutrición", "Licenciatura en Hotelería", "Licenciatura en Turismo", "Guía Universitario de Turismo", "Tecnicatura Universitaria en Gestión Hotelera", "Tecnicatura Universitaria en Gestión Turística", "Tecnicatura Universitaria en Parques", "Jardines y Floricultura", "Tecnicatura Universitaria en Producción de Plantas Aromáticas" }));
        jcbcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbcarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Fecha de ingreso:");

        jdcing.setDateFormatString("dd-MM-yyyy");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Registro:");

        jtfreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfregActionPerformed(evt);
            }
        });

        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        jButtonGuardar.setBorder(null);
        jButtonGuardar.setBorderPainted(false);
        jButtonGuardar.setContentAreaFilled(false);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jButtonSalir.setBorder(null);
        jButtonSalir.setBorderPainted(false);
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jButtonGuardar)
                        .addGap(72, 72, 72)
                        .addComponent(jButtonSalir))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbfac, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtfdir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addComponent(jtfnom)
                                .addComponent(jtfdoc))
                            .addComponent(jdcnac, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbcar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcing, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfreg, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfdoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcnac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbfac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbcar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonSalir))
                .addContainerGap(58, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfdocActionPerformed
        
    }//GEN-LAST:event_jtfdocActionPerformed

    private void jtfdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfdirActionPerformed
        
    }//GEN-LAST:event_jtfdirActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // Cerrar ventana:
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        Alumno alumno = new Alumno(); 
        entradaSalida.ingresarAlumno(alumno);
        String nuevoDoc = alumno.getDoc();
        if(alumno.campoVacio())
            JOptionPane.showMessageDialog(null, "Error: debe ingresar todos los campos");
        else if ((!docBusqueda.equals(nuevoDoc) && JFMenuPrin.enLista(nuevoDoc)))
            JOptionPane.showMessageDialog(null, "Error: la persona con dni " + alumno.getDoc() + " ya se encuentra en el sistema");
        else
        {
            JFMenuPrin.editarFilaTabla(docBusqueda, alumno.getDoc(), alumno.getNbre(), alumno.getDir());
            JFMenuPrin.modificarPersona(docBusqueda, alumno);
            docBusqueda = alumno.getDoc(); 
            JOptionPane.showMessageDialog(null, "Cambios Guardados");
        }                                       
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jcbcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbcarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbcarActionPerformed

    private void jtfregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfregActionPerformed

    private void jcbfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbfacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbfacActionPerformed

    // Muestra datos en cajas de texto y calendarios: 
    public void mostrarDatos(Alumno alumno) throws ParseException
    {  
        entradaSalida.mostrarAlumno(alumno);
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
            java.util.logging.Logger.getLogger(JFEditAlum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEditAlum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEditAlum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEditAlum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEditAlum().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcbcar;
    private javax.swing.JComboBox<String> jcbfac;
    private com.toedter.calendar.JDateChooser jdcing;
    private com.toedter.calendar.JDateChooser jdcnac;
    public javax.swing.JTextField jtfdir;
    public javax.swing.JTextField jtfdoc;
    public javax.swing.JTextField jtfnom;
    private javax.swing.JTextField jtfreg;
    // End of variables declaration//GEN-END:variables
}
