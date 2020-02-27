import java.io.Serializable;

// parent class
public abstract class Fastener implements Serializable {

    private static final long serialVersionUID = 3259757453194432219L;

    private Enum<?> material;
    private Enum<?> finish;
    private double unitPrice ;
    private int numberPerUnit;

    // 4 parameter constructor of elements common to all types of fasteners
    public Fastener(Enum<?> mat, Enum<?> fin,  double unitP, int numPerUnit) throws IllegalFastener{
        // check conditions to make sure that material, finish, numberPerUnit and unitPrice are all valid
        if (mat == null || fin == null || numPerUnit < 1 || numPerUnit > 10000  || numPerUnit > 1 && numPerUnit % 5 != 0 || unitP < 0)
            throw new IllegalFastener();
        else{
            this.material = mat;
            this.finish = fin;
            this.unitPrice = unitP;
            this.numberPerUnit = numPerUnit;
        }
    } // end constructor

    public double getOrderCost(int orderSize){
        double orderCost = unitPrice * numberPerUnit;
        return orderCost;
    } // end getUnitPrice

    public String toString(){
        return material + ", with a " + finish + " finish. " + numberPerUnit + " in a unit, $" + unitPrice + " per unit.";
    } // toString
} // end Fastener
