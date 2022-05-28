package ObjetosU;

public class PersUniv extends Persona
{
    private String Facultad;
    private String Carrera;
    private String  fechaIngre;
    public PersUniv()
    {
        super();
        Facultad = "";
        Carrera = "";
        fechaIngre = "";
    }
    
    public PersUniv(String nom, String doc, String dir, String fechaNac, 
            String fac, String car, String fechaIn)
    {
        super(nom, doc, dir, fechaNac);
        Facultad = fac;
        Carrera = car; 
        fechaIngre = fechaIn;
    }
    
    public PersUniv(PersUniv p)
    {
        this(p.getNbre(), p.getDoc(), p.getDir(), p.getfNac(), p.getFac(), 
                p.getCar(), p.getfIng());
    }
    
    public String getFac()
    {   return Facultad; }
    
    public String getCar()
    {   return Carrera; }

    public String getfIng()
    {   return fechaIngre; }

    public void setFac(String s)
    {   Facultad = s; }
    
    public void setCar(String s)
    {   Carrera = s; }
    
    public void setfIng(String s)
    {   
        fechaIngre = s;
    }
    
    @Override
    public boolean campoVacio()
    {
        return (super.campoVacio() || fechaIngre.isEmpty() || Carrera.isEmpty() || Facultad.isEmpty()); 
    }
    
    @Override
    public String toString()
    {
        String s1 = super.toString(); 
        String s2 = "\nFacultad: " + Facultad +
                    "\nCarrera:"   + Carrera  + 
                    "\nFecha de ingreso: " + fechaIngre;
        return s1 + s2;
    }
}