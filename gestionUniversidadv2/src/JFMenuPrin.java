import javax.swing.table.DefaultTableModel; 
import EstructuraS.*;
import ObjetosU.*; 
import java.awt.Graphics;
import java.awt.Image;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//Nota: El proyecto no contiene diseño grafico (aún) solamente la funcionalidad
//Torres Esteban Matias - Paoletti Geuna Gino
public class JFMenuPrin extends javax.swing.JFrame {
    private static String alumnoClv = "Alumno"; 
    private static String alumnoPostGradoClv = "Posgrado"; 
    private static String docenteClv = "Docente";
    private static ListaPersonas lista; 
    ImagenFondo img = new ImagenFondo();
    
    public JFMenuPrin() {
        lista = new ListaPersonas(); 
        this.setTitle("SISTEMA DE GESTION UNSL");
        this.setResizable(false);
        this.setContentPane(img);
        this.setLocationRelativeTo(null);
        initComponents(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButtonAgregarAlumno = new javax.swing.JButton();
        jButtonAgregarDocente = new javax.swing.JButton();
        jButtonAgregarAlumnoPostGrado = new javax.swing.JButton();
        jButtonVerSeleccion = new javax.swing.JButton();
        jButtonBorrarSeleccion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        logounsl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableDatos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableDatos.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoria", "Documento", "Nombre", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableDatos.setGridColor(new java.awt.Color(204, 204, 204));
        jTableDatos.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(jTableDatos);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jButtonAgregarAlumno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAgregarAlumno.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir2.png"))); // NOI18N
        jButtonAgregarAlumno.setText("Agregar Alumno");
        jButtonAgregarAlumno.setBorder(null);
        jButtonAgregarAlumno.setBorderPainted(false);
        jButtonAgregarAlumno.setContentAreaFilled(false);
        jButtonAgregarAlumno.setPreferredSize(new java.awt.Dimension(119, 82));
        jButtonAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarAlumnoActionPerformed(evt);
            }
        });

        jButtonAgregarDocente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAgregarDocente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadir2.png"))); // NOI18N
        jButtonAgregarDocente.setText("Agregar Docente");
        jButtonAgregarDocente.setBorder(null);
        jButtonAgregarDocente.setBorderPainted(false);
        jButtonAgregarDocente.setContentAreaFilled(false);
        jButtonAgregarDocente.setPreferredSize(new java.awt.Dimension(117, 82));
        jButtonAgregarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarDocenteActionPerformed(evt);
            }
        });

        jButtonAgregarAlumnoPostGrado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAgregarAlumnoPostGrado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregarAlumnoPostGrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadir2.png"))); // NOI18N
        jButtonAgregarAlumnoPostGrado.setText("Agregar Posgrado");
        jButtonAgregarAlumnoPostGrado.setBorder(null);
        jButtonAgregarAlumnoPostGrado.setBorderPainted(false);
        jButtonAgregarAlumnoPostGrado.setContentAreaFilled(false);
        jButtonAgregarAlumnoPostGrado.setPreferredSize(new java.awt.Dimension(117, 82));
        jButtonAgregarAlumnoPostGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarAlumnoPostGradoActionPerformed(evt);
            }
        });

        jButtonVerSeleccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonVerSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerSeleccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ver2.png"))); // NOI18N
        jButtonVerSeleccion.setText("Ver selección");
        jButtonVerSeleccion.setBorder(null);
        jButtonVerSeleccion.setBorderPainted(false);
        jButtonVerSeleccion.setContentAreaFilled(false);
        jButtonVerSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerSeleccionActionPerformed(evt);
            }
        });

        jButtonBorrarSeleccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBorrarSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBorrarSeleccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminar2.png"))); // NOI18N
        jButtonBorrarSeleccion.setText("Borrar Seleccion");
        jButtonBorrarSeleccion.setBorder(null);
        jButtonBorrarSeleccion.setBorderPainted(false);
        jButtonBorrarSeleccion.setContentAreaFilled(false);
        jButtonBorrarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarSeleccionActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/creadores2.png"))); // NOI18N
        jButton1.setText("Creadores");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        logounsl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo unsl.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SISTEMA DE GESTIÓN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("UNSL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(logounsl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logounsl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonBorrarSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAgregarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAgregarAlumnoPostGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAgregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVerSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jButtonAgregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAgregarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAgregarAlumnoPostGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVerSeleccion)
                .addGap(18, 18, 18)
                .addComponent(jButtonBorrarSeleccion)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarAlumnoActionPerformed
        JFAgreAlum JFAgregarAlumno = new JFAgreAlum(); 
        JFAgregarAlumno.setVisible(true);
        JFAgregarAlumno.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonAgregarAlumnoActionPerformed

    private void jButtonVerSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerSeleccionActionPerformed
        int filaSeleccionada = jTableDatos.getSelectedRow(); 
        if(filaSeleccionada == -1)
            JOptionPane.showMessageDialog(null, "No hay datos seleccionados");
        else
        {
            DefaultTableModel modelo = (DefaultTableModel) jTableDatos.getModel(); 
            String categoria = modelo.getValueAt(filaSeleccionada, 0).toString(); 
            String doc = modelo.getValueAt(filaSeleccionada, 1).toString(); 
            if(categoria == alumnoClv)
            {
                JFEditAlum JFEditarAlumno = new JFEditAlum();
                JFEditarAlumno.setVisible(true);
                JFEditarAlumno.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                lista.posicionarPorDocumento(doc);
                JFEditarAlumno.setDocBusqueda(doc);
                try {
                    JFEditarAlumno.mostrarDatos((Alumno)lista.copy());
                } catch (ParseException ex) {
                    Logger.getLogger(JFMenuPrin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (categoria == docenteClv)
            {
                JFrameEditarDocente JFEditarDocente = new JFrameEditarDocente();
                JFEditarDocente.setVisible(true);
                JFEditarDocente.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                lista.posicionarPorDocumento(doc);
                JFEditarDocente.setDocBusqueda(doc);
                try {
                    JFEditarDocente.mostrarDatos((Docente)lista.copy());
                } catch (ParseException ex) {
                    Logger.getLogger(JFMenuPrin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else if (categoria == alumnoPostGradoClv)
            {
                JFEditPosgrado jfepg = new JFEditPosgrado();
                jfepg.setVisible(true);
                jfepg.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                lista.posicionarPorDocumento(doc);
                jfepg.setDocBusqueda(doc);
                try {
                    jfepg.mostrarDatosPostGrado((AlumnoPostGrado)lista.copy());
                } catch (ParseException ex) {
                    Logger.getLogger(JFMenuPrin.class.getName()).log(Level.SEVERE, null, ex);
                }
             }    
        }
    }//GEN-LAST:event_jButtonVerSeleccionActionPerformed

    private void jButtonAgregarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarDocenteActionPerformed

        JFAgreDocente JFAgregarDocente = new JFAgreDocente();
        JFAgregarDocente.setVisible(true);
        JFAgregarDocente.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonAgregarDocenteActionPerformed

    private void jButtonAgregarAlumnoPostGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarAlumnoPostGradoActionPerformed
        JFAgrePosgrado JFAgregarAlumnoPG = new JFAgrePosgrado();
        JFAgregarAlumnoPG.setVisible(true);
        JFAgregarAlumnoPG.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonAgregarAlumnoPostGradoActionPerformed

    private void jButtonBorrarSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarSeleccionActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableDatos.getModel();
        // Obtener fila seleccionada:
        int filaSeleccionada = jTableDatos.getSelectedRow();

        // Chequear que alguna fila este seleccionada:
        if(filaSeleccionada == -1)
        {
            // si no hay seleccion imprimir mensaje de advertencia:
            JOptionPane.showMessageDialog(null, "No hay datos seleccionados");
        }else
        {
            // obtengo de la fila el documento
            String dni = model.getValueAt(filaSeleccionada, 1).toString();
            lista.posicionarPorDocumento(dni); //posiciono el cursor en el elemento con ese documento
            lista.supress(); //lo suprimo de la lista
            if(jTableDatos.getSelectedRowCount() == 1)
            model.removeRow(jTableDatos.getSelectedRow());} // por ultimo lo suprimo de la tabla
    }//GEN-LAST:event_jButtonBorrarSeleccionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFCreadores JFC = new JFCreadores();
        JFC.setVisible(true);
        JFC.setLocationRelativeTo(null);
        JFC.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static boolean enLista(String dni)
    {
        return lista.inStruc(dni); 
    }
    
    // Metodo que agrega un nuevo dato a la tabla principal: 
    public static void agregarFilaATabla(Object[] datoFila)
    {
        DefaultTableModel modelo = (DefaultTableModel) jTableDatos.getModel();
        modelo.addRow(datoFila);
    }
    
    // Metodo que edita un dato de la tabla principal: 
    public static void editarFilaTabla(String doc, String nuevoDoc, String nom, String dir)
    {
        DefaultTableModel modelo;
        for(int i = 0; i < jTableDatos.getRowCount(); i++)
        {
            modelo = (DefaultTableModel) jTableDatos.getModel();
            if(modelo.getValueAt(i, 1).equals(doc))
            {
                modelo.setValueAt(nuevoDoc, i, 1);
                modelo.setValueAt(nom, i, 2); 
                modelo.setValueAt(dir, i, 3); 
                return; 
            }
        }
    }
        
    public static void agregarPersonaALista(Persona p)
    {
        lista.insert(p); 
        lista.muestroEstruc();
    }
        
    // Metodo que edita los campos de una persona:
    public static void modificarPersona(String doc, Persona p)
    {   
        lista.modificarPersona(doc, p);  
        lista.muestroEstruc();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenuPrin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregarAlumno;
    private javax.swing.JButton jButtonAgregarAlumnoPostGrado;
    private javax.swing.JButton jButtonAgregarDocente;
    private javax.swing.JButton jButtonBorrarSeleccion;
    private javax.swing.JButton jButtonVerSeleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTableDatos;
    private javax.swing.JLabel logounsl;
    // End of variables declaration//GEN-END:variables
    
    class ImagenFondo extends JPanel{
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
