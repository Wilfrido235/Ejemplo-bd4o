package ejemplodb4o;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JMalagon
 */
public class Controlador extends Conexion {

    public Controlador() {

    }

    public boolean insertarPersona(int id, String nombre, String apellidos) {
        Persona persona = new Persona(nombre, apellidos, id);
        return this.Insertar(persona);
    }

    public boolean actualizarPersona(int id, String nombre, String apellidos) {
        Persona personaNueva = new Persona(nombre, apellidos, id);        
        return this.Actualizar(personaNueva);
    }

    public DefaultTableModel personas() {
        String titulos[] = {"Id", "Nombre", "Apellidos"};
        DefaultTableModel dtm = new DefaultTableModel(null, titulos);
        Persona persona = null;
        Persona[] p = this.Consultar(persona);
        if (p != null) {
            for (Persona per : p) {
                Object[] cli = new Object[3];
                cli[0] = per.getID();
                cli[1] = per.getNOMBRE();
                cli[2] = per.getAPELLIDOS();
                dtm.addRow(cli);
            }
        }
        return dtm;
    }

    public boolean eliminarPersona(int id) {
        if (id > 0) {
            Persona persona = new Persona(null, null, id);
            return this.Eliminar(persona);
        } else {
            return false;
        }
    }
}
