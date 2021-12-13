package org.TestEjb.DB;

import javax.persistence.EntityManager;

import com.mycompany.bd.manager.Coneccion;
import com.mycompany.bd.model.Persona;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Coneccion con = new Coneccion();
    	
    			
        EntityManager temp = con.getEntityManager();
        
      if (temp != null) {
    	 Persona tempPersona =  temp.find(Persona.class, 2);
    	 
    	 System.out.println(tempPersona);
      }
    }
}
