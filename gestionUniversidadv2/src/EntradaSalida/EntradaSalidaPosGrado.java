/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntradaSalida;

import ObjetosU.*;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class EntradaSalidaPosGrado extends EntradaSalidaAlumno
{
    private JTextField jtfcarpg;
    
    public EntradaSalidaPosGrado(JTextField jtfdoc, JComboBox<String> jcbcar, JComboBox<String> jcbfac, 
            JDateChooser jdcing, JDateChooser jdcnac, JTextField jtfdir, JTextField jtfnom, JTextField jtfreg, JTextField jtfcarpg) {
        super(jtfdoc, jcbcar, jcbfac, jdcing, jdcnac, jtfdir, jtfnom, jtfreg);
        this.jtfcarpg = jtfcarpg; 
    }
    
    public void ingresarPosGrado(AlumnoPostGrado apg)
    {
        ingresarAlumno(apg);
        apg.setcarPos(jtfcarpg.getText());
    }
    
    public void mostrarPosGrado(AlumnoPostGrado apg) throws ParseException
    {
        mostrarAlumno(apg);
        jtfcarpg.setText(apg.getcarPos());
    }
}
