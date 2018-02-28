
package medicable;


public class Paracetamol extends Medicine{
    //para is a medcine
    private int size;
    //Shadow properties in
    String properties= "ParaProperties";

    public Paracetamol() {
    }

    public Paracetamol(int size) {
        this.size = size;
    }

    public Paracetamol(int size, int medicId, String name, String[] ingredients, String properties, String warning) {
        super(medicId, name, ingredients, properties, warning);
        this.size = size;
    }

     public String getProperties() {
        return properties;
    } 

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString()+"Paracetamol{" + "size=" + size + '}';
    }

    @Override
    public String medicProperties() {
        return "PARA~"+super.medicProperties(); //To change body of generated methods, choose Tools | Templates.
    }
  
}
