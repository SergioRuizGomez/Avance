
package DAO;

import java.util.ArrayList;
import java.util.Arrays;

public interface Operaciones {

    public boolean agregar(Object obj);

    public boolean modificar(Object obj);

    public boolean eliminar(Object obj);

    public  ArrayList <Object[]> consultar();

}
