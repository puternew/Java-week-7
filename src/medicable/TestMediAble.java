
package medicable;


public class TestMediAble {
    public static void main(String[] args) {
        Medicine m = new Medicine();
        System.out.println(m.properties);
        Medicine m2 = new Paracetamol();
        System.out.println(m2.properties);
        
//        MedicAble med;
//        Medicine m1 = new Medicine(1,"ABC",new String[]{"A","B","C"},
//                "Exam Prevention","Do not take over 2 times per day");
//        System.out.println(m1.medicProperties());
//        System.out.println("---------------------------");
//        
//        Medicine p1 = new Paracetamol(500,2,"Ty",new String[]{"A","B","C"},
//                "Headache Prevention","Do not take over 2 times per day");
//        System.out.println(p1.medicProperties());
//        
//        p1 = m1;
//        System.out.println(p1.medicProperties());
    }
    
}
