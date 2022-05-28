package EntradaSalida;

import ObjetosU.Alumno;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class EntradaSalidaAlumno extends EntradaSalidaPersUniv
{
    private JTextField jtfreg;
    
    public EntradaSalidaAlumno(JTextField jtfdoc, JComboBox<String> jcbcar, JComboBox<String> jcbfac, JDateChooser jdcing, 
                                JDateChooser jdcnac, JTextField jtfdir, JTextField jtfnom, JTextField jtfreg) {
        super(jtfdoc, jcbcar, jcbfac, jdcing, jdcnac, jtfdir, jtfnom);
        this.jtfreg = jtfreg; 
    }
    
    public void ingresarAlumno(Alumno al)
    {
        ingresarPersUniv(al);
        al.setReg(jtfreg.getText());
    }
    
    public void mostrarAlumno(Alumno al) throws ParseException
    {
        mostrarPersUniv(al);
        jtfreg.setText(al.getReg());
    }
}
