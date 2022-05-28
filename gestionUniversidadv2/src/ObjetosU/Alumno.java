package ObjetosU;

public class Alumno extends PersUniv
{
    private String Registro;
    
    public Alumno()
    { 
        super();
        Registro = "";
    }
    
    public Alumno(String nom, String doc, String dir, String fecNac, 
            String fac, String car, String fecIng, String reg)
    {
        super(nom, doc, dir, fecNac, fac, car, fecIng);
        Registro = reg; 
    }
    
    public Alumno(Alumno p)
    {
        super(p);
        Registro = p.getReg();
    }
    
    public String getReg()
    {   return Registro; }
    
    public void setReg(String s)
    {   Registro = s; }
    
    @Override
    public boolean campoVacio()
    {
        System.out.println(toString());
        if(super.campoVacio())
            System.out.println("vacio"); 
        return (super.campoVacio() || Registro.isEmpty()); 
    }
    
  @Override
    public String toString()
    {
        String s1 = super.toString(); 
        String s2 = "\nRegistro: " + Registro; 
        return s1 + s2;
    }
}
