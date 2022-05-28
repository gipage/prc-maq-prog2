import EntradaSalida.*;
import ObjetosU.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrameEditarDocente extends javax.swing.JFrame {
    
    private String docBusqueda;
    private EntradaSalidaDocente entradaSalida;
    
    public void setDocBusqueda(String s)
    {   docBusqueda = s; }
    
    public JFrameEditarDocente() {
        this.setTitle("Modificar docente");
        this.setResizable(false);
        initComponents();
        this.setLocationRelativeTo(null);
        entradaSalida = new EntradaSalidaDocente(jtfdoc, jcbcar, jcbfac, jdcing, jdcnac, jtfdir, jtfnom, jcbcargo, jtmaterias);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jdcing = new com.toedter.calendar.JDateChooser();
        jcbfac = new javax.swing.JComboBox<>();
        jButtonIngresar = new javax.swing.JButton();
        jcbcar = new javax.swing.JComboBox<>();
        jcbcargo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtmaterias = new javax.swing.JTable();
        jtfnom = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonAñadir = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jtfdoc = new javax.swing.JTextField();
        jButtonBorrar = new javax.swing.JButton();
        jtfdir = new javax.swing.JTextField();
        jTextFieldMateria = new javax.swing.JTextField();
        jdcnac = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addprofefinal.png"))); // NOI18N
        jLabel10.setText("EDITAR DOCENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jcbfac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFMyN", "FQByF", "FICA", "FCEJS", "FCH", "FaPsi", "FCS", "FTU", "IPAU" }));

        jButtonIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jButtonIngresar.setBorder(null);
        jButtonIngresar.setBorderPainted(false);
        jButtonIngresar.setContentAreaFilled(false);
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        jcbcar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniería Electrónica con Orientación en Sistemas Digitales", "Ingeniería en Computación", "Ingeniería en Informática", "Ingeniería en Minas", "Licenciatura en Ciencias de la Computación", "Licenciatura en Ciencias Geológicas", "Licenciatura en Ciencias Matemáticas", "Licenciatura en Física  (Titulo Intermedio: Auxiliar en Física Aplicada)", "Licenciatura en Matemática Aplicada", "Profesorado en Ciencias de la Computación", "Profesorado en Física", "Profesorado en Matemática", "Profesorado en Tecnología Electrónica", "Tecnicatura Universitaria en Electrónica", "Tecnicatura Universitaria en Energías Renovables", "Tecnicatura Universitaria en Geoinformática", "Tecnicatura Universitaria en Obras Viales", "Tecnicatura Universitaria en Minería", "Tecnicatura Universitaria en Redes de Computadoras", "Tecnicatura Universitaria en Telecomunicaciones", "Tecnicatura Universitaria en Web", "Tecnicatura Universitaria en Fotografía", "Ingeniería en Alimentos", "Farmacia", "Licenciatura en Biología Molecular", "Licenciatura en Bioquímica", "Licenciatura en Biotecnología", "Licenciatura en Ciencia y Tecnología de los Alimentos", "Licenciatura en Ciencias Biológicas", "Licenciatura en Química", "Profesorado Universitario en Biología", "Profesorado en Química", "Tecnicatura Universitaria en Esterilización", "Tecnicatura Universitaria en Laboratorios Biológicos", "Analista Químico", "Tecnicatura Universitaria en Higiene y Seguridad en el Trabajo", "Ingeniería Agronómica", "Ingeniería Electromecánica", "Ingeniería Electrónica", "Ingeniería en Alimentos", "Ingeniería Industrial", "Ingeniería Mecatrónica", "Ingeniería Química", "Bromatología", "Tecnicatura Universitaria en Automatización Industrial Orientación Informática", "Tecnicatura Universitaria en Diseño Mecánico Orientación Informática", "Tecnicatura Universitaria en Producción Apícola", "Tecnicatura Universitaria en Mantenimiento Industrial", "Abogacía", "Contador Público Nacional", "Licenciatura en Administración", "Licenciatura en Trabajo Social", "Procurador", "Tecnicatura Universitaria en Acompañamiento Terapéutico", "Tecnicatura Universitaria en Asistencia Jurídica", "Tecnicatura Universitaria en Gestión Financiera", "Martillero y Corredor Público", "Licenciatura en Ciencias de la Educación", "Licenciatura en Comunicación Social", "Licenciatura en Educación Inicial", "Licenciatura en Periodismo", "Licenciatura en Producción de Radio y Televisión", "Profesorado en Ciencias de la Educación", "Profesorado en Educación Especial", "Licenciatura en Educación Especial", "Profesorado en Educación Inicial", "Profesorado Universitario en Letras", "Profesorado Universitario en Música Popular Latinoamericana", "Tecnicatura Universitaria en Producción Musical", "Licenciatura en Psicología", "Profesorado en Psicología", "Licenciatura en Psicomotricidad", "Licenciatura en Enfermería", "Licenciatura en Fonoaudiología", "Licenciatura en Kinesiología y Fisiatría", "Licenciatura en Nutrición", "Licenciatura en Hotelería", "Licenciatura en Turismo", "Guía Universitario de Turismo", "Tecnicatura Universitaria en Gestión Hotelera", "Tecnicatura Universitaria en Gestión Turística", "Tecnicatura Universitaria en Parques", "Jardines y Floricultura", "Tecnicatura Universitaria en Producción de Plantas Aromáticas" }));
        jcbcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbcarActionPerformed(evt);
            }
        });

        jcbcargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prof. Titular", "Prof. Adjunto", "Prof. Asociado", "Jefe de trabajos practicos", "Auxiliar" }));
        jcbcargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbcargoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Documento:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Direccion:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de nacimiento:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Facultad:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Carrera:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Fecha de ingreso:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Materia:");

        jtmaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Materias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtmaterias);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Cargo:");

        jButtonAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acep.png"))); // NOI18N
        jButtonAñadir.setBorder(null);
        jButtonAñadir.setBorderPainted(false);
        jButtonAñadir.setContentAreaFilled(false);
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
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

        jButtonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/elimi.png"))); // NOI18N
        jButtonBorrar.setBorder(null);
        jButtonBorrar.setBorderPainted(false);
        jButtonBorrar.setContentAreaFilled(false);
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jTextFieldMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbfac, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbcar, 0, 1, Short.MAX_VALUE)
                                    .addComponent(jdcing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbcargo, javax.swing.GroupLayout.Alignment.TRAILING, 0, 312, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfdoc, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtfdir)
                                    .addComponent(jtfnom)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcnac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonGuardar)
                            .addComponent(jButtonAñadir))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBorrar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonIngresar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtfnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfdoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcnac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbfac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbcar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAñadir)
                    .addComponent(jButtonBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jdcing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIngresar)
                    .addComponent(jButtonGuardar)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public void mostrarDatos(Docente docente) throws ParseException
    {
        entradaSalida.mostrarDocente(docente); 
    }
    
    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtmaterias.getModel();
        String mat = jTextFieldMateria.getText();
        if(!mat.isEmpty())
        {
            model.addRow(new Object[] {mat});
            jTextFieldMateria.setText("");
        }

    }//GEN-LAST:event_jButtonAñadirActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtmaterias.getModel();
        if(jtmaterias.getSelectedRowCount() == 1)
        model.removeRow(jtmaterias.getSelectedRow());
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jTextFieldMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMateriaActionPerformed
        
    }//GEN-LAST:event_jTextFieldMateriaActionPerformed

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jcbcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbcarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbcarActionPerformed

    private void jcbcargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbcargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbcargoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        Docente docente = new Docente(); 
        entradaSalida.ingresarDocente(docente);
        String nuevoDoc = docente.getDoc();
        if(docente.campoVacio())
            JOptionPane.showMessageDialog(null, "Error: debe ingresar todos los campos");
        else if ((!docBusqueda.equals(nuevoDoc) && JFMenuPrin.enLista(nuevoDoc)))
            JOptionPane.showMessageDialog(null, "Error: la persona con dni " + docente.getDoc() + " ya se encuentra en el sistema");
        else
        {
            JFMenuPrin.editarFilaTabla(docBusqueda, docente.getDoc(), docente.getNbre(), docente.getDir());
            JFMenuPrin.modificarPersona(docBusqueda, docente);
            docBusqueda = docente.getDoc(); 
            JOptionPane.showMessageDialog(null, "Cambios Guardados");
        }     
    }//GEN-LAST:event_jButtonGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameEditarDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameEditarDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameEditarDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameEditarDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameEditarDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonIngresar;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldMateria;
    private javax.swing.JComboBox<String> jcbcar;
    private javax.swing.JComboBox<String> jcbcargo;
    private javax.swing.JComboBox<String> jcbfac;
    private com.toedter.calendar.JDateChooser jdcing;
    private com.toedter.calendar.JDateChooser jdcnac;
    private javax.swing.JTextField jtfdir;
    private javax.swing.JTextField jtfdoc;
    private javax.swing.JTextField jtfnom;
    private javax.swing.JTable jtmaterias;
    // End of variables declaration//GEN-END:variables
}
