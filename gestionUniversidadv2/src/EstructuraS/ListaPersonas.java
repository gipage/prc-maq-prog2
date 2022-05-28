package EstructuraS;
import ObjetosU.*;

public class ListaPersonas 
{
    //lista estatica de 20 elementos
    static int VACIA = -1;
    static int LLENA = 10;
    private Persona[] elementos;
    private int ult=VACIA;
    private int cursor=VACIA;

    public ListaPersonas() 
    {
        elementos = new Persona[LLENA];
        ult = VACIA; cursor=VACIA;
    }

    public ListaPersonas(ListaPersonas l) 
    {
        elementos = new Persona[LLENA];
        ult=VACIA; cursor=VACIA; 
        l.reset(); 
        reset();
        while(!l.oos())
        {
            insert(l.copy());
            forward(); 
            l.forward();
        } 
    }
    
    public void reset()
    {
        if(!isempty())
            cursor = 0;
    }
    
    public void forward()
    {
        if(cursor == ult)
            cursor = VACIA;
        else
           cursor++; 
    }
    
    public void insert(Persona x) 
    {

        if(isempty())
        {
            ult++;
            cursor++;
        }
        else if(oos())
        {
            ult++;
            cursor = ult; 
        }
        else
        {
            ult++;
            shiftD(); 
        }
        if(x instanceof AlumnoPostGrado)
        { 
            elementos[cursor] = new AlumnoPostGrado((AlumnoPostGrado)x);
            System.out.println("Inserte apg");
            System.out.println(((AlumnoPostGrado)elementos[cursor]).getcarPos());
        }  
        else if(x instanceof Docente)
            elementos[cursor] = new Docente((Docente)x);
        else if (x instanceof Alumno)
            elementos[cursor] = new Alumno((Alumno)x);
        else
            elementos[cursor] = null;
        
    }
    
     public void supress()
    {
        if(cursor == ult)
        {
            cursor = VACIA;
            ult--; 
        }
        else
        {
            shiftI();
            ult--; 
        }   
    }
    
    public int getcur()
    {return cursor; }
    
    public Persona copy() 
    {   
        Persona aux; 
        if(elementos[cursor] instanceof Docente)
            aux = new Docente((Docente)elementos[cursor]);
        else if(elementos[cursor] instanceof AlumnoPostGrado)
            aux = new AlumnoPostGrado((AlumnoPostGrado)elementos[cursor]);
        else if (elementos[cursor] instanceof Alumno)
            aux = new Alumno((Alumno)elementos[cursor]);
        else
            aux = null;
        return aux;
    }
    
    public Boolean isempty() 
    {   return ult==VACIA; }

    public Boolean isfull()
    {   return ult==(LLENA -1); }

    public Boolean oos() 
    {   return cursor==VACIA; }


    private void shiftD()
    {
        for(int i = ult; i > cursor; i--)
            elementos[i] = elementos[i - 1];
    }
    
    private void shiftI()
    {
        for(int i = cursor; i < ult; i++)
            elementos[i] = elementos[i + 1]; 
    }
    
     public void muestroEstruc()
     {
        int aux=cursor;
        System.out.println("El contenido de la lista es:");
        reset();
        while (!oos())
        {
            System.out.print(copy().toString() + "\n-----------------\n");
            forward();
        }   
        System.out.println();
        cursor=aux; 
     }
     
     public Boolean inStruc(String dni)
     {    int aux = cursor;
          Boolean encontrado = false; 
          reset();
          while (!oos())
          {
            if(dni.compareTo(copy().getDoc()) == 0)
                encontrado = true; 
            
            forward();
          }   
          cursor = aux; 
          return encontrado; 
     }
     
     public int cardinalidad()
     {   return ult+1;  }
     
    // Posiciona el cursor a la persona con documento doc.
    // Si no lo encuentra asigna VACIA a cursor.
    public void posicionarPorDocumento(String doc)
    {
        for(int i = 0; i < ult + 1; i++)
        {
            System.out.println(elementos[i].getDoc()); 
            if(elementos[i].getDoc().equals(doc))
            {   
                cursor = i; 
                return; 
            }     
        }
        cursor = VACIA; 
    }
    
    // Modifica a la persona cuyo dni es doc con los atributos de p:
    public void modificarPersona(String doc, Persona p)
    {
       posicionarPorDocumento(doc);
       if(!oos())
       {
           supress();
           insert(p); 
       }
    }
}
