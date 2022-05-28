package ObjetosU;

public class AlumnoPostGrado extends Alumno
{
    private String CarreraPostG; 
    
    public AlumnoPostGrado()
    {
        super();
        CarreraPostG = ""; 
    }
    
    public AlumnoPostGrado(String nom, String doc, String dir, String fecNac, 
            String fac, String car, String fecIng, String reg, String carPost)
    {   
        super(nom, doc, dir, fecNac, fac, car, fecIng, reg); 
        CarreraPostG = carPost;  
    }
    
    public AlumnoPostGrado(AlumnoPostGrado p)
    {
        super(p); 
        CarreraPostG = p.getcarPos();
    }
    
    public String getcarPos()
    {   return CarreraPostG; }
    
    public void setcarPos(String s)
    {   CarreraPostG = s; }
    
    @Override
    public boolean campoVacio()
    {
        return (super.campoVacio() || CarreraPostG.isEmpty()); 
    }
    
    @Override
    public String toString()
    {
        String s1 = super.toString(); 
        String s2 = "\nCarrera Post Grado: " + CarreraPostG; 
        return s1 + s2;
    }
}
