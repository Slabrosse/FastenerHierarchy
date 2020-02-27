import java.io.Serializable;

// child class of Fastener
public abstract class InnerThreaded extends Fastener implements Serializable {

    private static final long serialVersionUID = -2251949160862398412L;

    private Threads threadSize;

    // 5 parameter constructor
    public InnerThreaded(Threads threadS, Enum<Materials.ThreadedMaterials> material,
                         Enum<?> finish,  double unitPrice, int numberPerUnit) throws IllegalFastener{
        // invokes parent class
        super(material, finish, unitPrice, numberPerUnit);
        // checks validity of material and finishing combinations
        if (material == Materials.ThreadedMaterials.Brass && finish != Finishes.WingNutFinish.Plain || material ==
        Materials.ThreadedMaterials.Stainless_Steel && finish != Finishes.WingNutFinish.Plain)
            throw new IllegalFastener();
        else
            this.threadSize = threadS;
    } // end constructor

    public String toString() {
        return threadSize + " thread, " + super.toString(); }
} // end InnerThreaded
