package EntradaSalida;

import javax.swing.*;
import com.toedter.calendar.*; 
import ObjetosU.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EntradaSalidaPersUniv 
{
    private JComboBox<String> jcbcar;
    private JComboBox<String> jcbfac;
    private JDateChooser jdcing;
    private JDateChooser jdcnac;
    private JTextField jtfdir;
    private JTextField jtfdoc;
    private JTextField jtfnom;
    
    public EntradaSalidaPersUniv(JTextField jtfdoc, JComboBox<String>jcbcar, JComboBox<String> jcbfac, JDateChooser jdcing, 
                            JDateChooser jdcnac, JTextField jtfdir, JTextField jtfnom)
    {
        this.jtfdoc = jtfdoc;
        this.jcbcar = jcbcar;
        this.jcbfac = jcbfac;
        this.jdcing = jdcing; 
        this.jdcnac = jdcnac; 
        this.jtfdir = jtfdir;
        this.jtfdoc = jtfdoc;
        this.jtfnom = jtfnom; 
    }
    
    public void ingresarPersUniv(PersUniv p)
    {   
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dateNac = jdcnac.getDate();
        Date dateIngre = jdcing.getDate();
        p.setDoc(jtfdoc.getText());
        p.setNbre(jtfnom.getText()); 
        p.setDir(jtfdir.getText()); 
        p.setFac(jcbfac.getSelectedItem().toString()); 
        p.setCar(jcbcar.getSelectedItem().toString());
        if(dateNac != null)
            p.setfNac(sdf.format(dateNac));
        if(dateIngre!= null)
            p.setfIng(sdf.format(dateIngre));
    }
    
    public void mostrarPersUniv(PersUniv p) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");     
        Date fechaNac = sdf.parse(p.getfNac());      
        Date fechaIngre = sdf.parse(p.getfIng());
        jtfdoc.setText(p.getDoc());
        jtfnom.setText(p.getNbre());
        jtfdir.setText(p.getDir());
        jdcnac.setDate(fechaNac);
        jdcing.setDate(fechaIngre);
       
        for(int i = 0; i < jcbfac.getItemCount(); i++)
        {
            if(jcbfac.getItemAt(i).equalsIgnoreCase(p.getFac())){
                jcbfac.setSelectedIndex(i);
            }
        }
        
        for(int i = 0; i < jcbcar.getItemCount(); i++)
        {
            if(jcbcar.getItemAt(i).equalsIgnoreCase(p.getCar())){
                jcbcar.setSelectedIndex(i);
            }
        }
    }
}
