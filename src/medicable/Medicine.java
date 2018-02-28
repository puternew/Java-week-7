
package medicable;


public class Medicine implements MedicAble{
    private int medicId;
    private String name;
    private String[] ingredients;
    //--------------------------------------------
    public String properties="Medicine properties";
    private String warning;

    public Medicine() {
    }

    public Medicine(int medicId, String name, String[] ingredients, String properties, String warning) {
        this.medicId = medicId;
        this.name = name;
        this.ingredients = ingredients;
        this.properties = properties;
        this.warning = warning;
    }
    

    public int getMedicId() {
        return medicId;
    }

    public void setMedicId(int medicId) {
        this.medicId = medicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getImgredients() {
        return ingredients;
    }

    public void setImgredients(String[] imgredients) {
        this.ingredients = imgredients;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }
    
    

    @Override
    public String toString() {
        String med= "Medicine{" + "medicId=" + medicId + ", name=" + name + "\n";
                for (String ingredients : ingredients) {
            med+=ingredients+"\n";
        }
                return med;
    }
    
    @Override
       public String medicProperties(){
           return properties;
       }
    @Override
       public String[] medicIngredients(){
           return ingredients;
       }
    @Override
       public String medicWarning(){
           return warning;
       }
    
}
