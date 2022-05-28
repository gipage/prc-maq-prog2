package ObjetosU;

public class Persona 
{
    private String Nbre; 
    private String NroDoc; 
    private String Direccion;
    private String fechaNac; 
    
    public Persona()
    {
        fechaNac = "";
        Nbre = ""; 
        NroDoc = "";
        Direccion = "";
    }
    
    public Persona(String nom, String doc, String dir, String fecha)
    {
        fechaNac = fecha; 
        Nbre = nom;
        NroDoc = doc; 
        Direccion = dir; 
        fechaNac = fecha;
    }
    
    public Persona(Persona p)
    { this(p.getNbre(), p.getDoc(), p.getDir(), p.getfNac()); }
    
    public String getNbre()
    { return Nbre; }
    
    public String getDoc()
    { return NroDoc; }
    
    public String getDir()
    { return Direccion; }
    
    public String getfNac()
    { return fechaNac; }
    
    public void setNbre(String s)
    { Nbre = s; }
    
    public void setDoc(String s)
    { NroDoc = s; }
    
    public void setDir(String s)
    { Direccion = s; }
    
    public void setfNac (String s)
    { 
        fechaNac = s;
    }
    
    public boolean campoVacio()
    {
        return (Nbre.isEmpty() || NroDoc.isEmpty() || Direccion.isEmpty() || fechaNac.isEmpty());
    }
    
    @Override
    public String toString()
    {
        String res = 
               "Nombre: "       + Nbre      + 
               "\nDocumento: " + NroDoc    + 
               "\nDireccion: " + Direccion + 
               "\nFecha Nacimiento: " + fechaNac;
        return res;
    }  
}