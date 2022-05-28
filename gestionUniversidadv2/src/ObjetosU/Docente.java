package ObjetosU;
import java.util.Scanner;
import java.util.ArrayList;

public class Docente extends PersUniv
{
    private String Cargo;
    private int var;
    ArrayList<String> Materias; 
    
    public Docente()
    {
        super(); 
        Cargo = "";
        Materias = new ArrayList<String>();
    }
    
    public Docente(String nom, String doc, String dir, String fechaNac, 
            String fac, String car, String fechaIn, String carg, ArrayList<String> mats)
    {
        super(nom, doc, dir, fechaNac, fac, car, fechaIn);
        Cargo = carg; 
        Materias = new ArrayList<String>(); 
        for(String mat : mats)
            Materias.add(mat);
    }
    
    public Docente(Docente p)
    {
        super(p);
        Cargo = p.getCargo();
        Materias = new ArrayList<String>(); 
        for(String mat : p.getMat())
            Materias.add(mat);
    }
    
    public String getCargo()
    {   return Cargo; }
    
    public ArrayList<String> getMat()
    {   return Materias; }
    
    public void setCargo(String s)
    {   Cargo = s; } 
    
    public void addMat(String s)
    {   Materias.add(s); }

    public void delMat(String s)
    {   Materias.remove(s); }
    
    public void setMaterias(ArrayList<String> mat)
    {
        Materias.clear();
        for(String m: mat)
            Materias.add(m); 
    }
    
    private String MatsStr()
    {
        String s = "Materias:\n";
        for(String mat : Materias)
        { s += mat + "\n"; }
        return s;
    }
    
    public void showMats()
    {   System.out.println(MatsStr()); }
    
    @Override
    public boolean campoVacio()
    {
        return (super.campoVacio() || Cargo.isEmpty() || Materias.size() == 0);
    }
    
    @Override
    public String toString()
    {
        String s1 = super.toString(); 
        String s2 = "\nCargo: " + Cargo;
        String s3 = "\n" + MatsStr(); 
        return s1+ s2 + s3; 
    }
}

