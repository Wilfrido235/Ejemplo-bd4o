
package ejemplodb4o;

public class Persona {
    private String NOMBRE, APELLIDOS;
    private int ID;

    public Persona(String NOMBRE, String APELLIDOS, int ID) {
        this.NOMBRE = NOMBRE;
        this.APELLIDOS = APELLIDOS;
        this.ID = ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public void setAPELLIDOS(String APELLIDOS) {
        this.APELLIDOS = APELLIDOS;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Persona{" + "NOMBRE=" + NOMBRE + ", APELLIDOS=" + APELLIDOS + ", ID=" + ID + '}';
    }
    
    
}
