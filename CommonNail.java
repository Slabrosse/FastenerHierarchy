import java.io.Serializable;

// child class of Nail
public class CommonNail extends Nail implements Serializable {

    private static final long serialVersionUID = -7286481949114195239L;

    // size, length, gauge, finish, price/unit, unit size
    public CommonNail(NailDesigns.CommonNailSizes nSize, NailDesigns.CommonNailLengths len,
                      NailDesigns.CommonNailGauges nGauge, Enum<Finishes.CommonNailFinish> finish,
                       double unitPrice, int numberPerUnit) throws IllegalFastener{
        // invoke parent constructor
        super(nSize, len, nGauge, finish, unitPrice, numberPerUnit);
        }

    public String toString() { return "Common Nail " +  super.toString(); }
}

