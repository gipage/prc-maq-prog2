package EntradaSalida;

import ObjetosU.Docente;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class EntradaSalidaDocente  extends EntradaSalidaPersUniv
{
    JComboBox jcbcargo; 
    JTable jtmaterias;
    
    public EntradaSalidaDocente(JTextField jtfdoc, JComboBox<String> jcbcar, JComboBox<String> jcbfac, JDateChooser jdcing, 
            JDateChooser jdcnac, JTextField jtfdir, JTextField jtfnom, JComboBox jcbcargo, JTable jtmaterias) {
        super(jtfdoc, jcbcar, jcbfac, jdcing, jdcnac, jtfdir, jtfnom);
        this.jcbcargo = jcbcargo;
        this.jtmaterias = jtmaterias; 
    }
    
    public void ingresarDocente(Docente docente)
    {
        ingresarPersUniv(docente);
        docente.setCargo(jcbcargo.getSelectedItem().toString());
        DefaultTableModel modelo;
        for(int i = 0; i < jtmaterias.getRowCount(); i++)
        {
            modelo = (DefaultTableModel) jtmaterias.getModel();
            docente.addMat((String)modelo.getValueAt(i, 0)); 
        }
    }
    
    public void mostrarDocente(Docente docente) throws ParseException
    {
        DefaultTableModel model = (DefaultTableModel) jtmaterias.getModel();
        mostrarPersUniv(docente);
        for(int i = 0; i < jcbcargo.getItemCount(); i++)
        {
            if(jcbcargo.getItemAt(i).equals(docente.getCargo()))
                jcbcargo.setSelectedIndex(i);
        }
        for(String mat : docente.getMat())
            model.addRow(new Object[] {mat});
        
    }
}
