import java.io.Serializable;

// child class of Fastenener
public abstract class Bolt extends Fastener implements Serializable {
    private static final long serialVersionUID = -7601595982017834757L;

    private Threads threadSize;
    private double length;

    // 6 parameter constructor
    public Bolt(double len, Threads threadS, Enum<Materials.ThreadedMaterials> material,
                         Enum<?> finish, double unitPrice, int numberPerUnit) throws IllegalFastener{
        // passes information to Fastener
        super(material, finish,  unitPrice, numberPerUnit);

        // check that materials and finishes match conditions
        if (material == Materials.ThreadedMaterials.Brass && finish != Finishes.BoltFinish.Plain || material ==
                Materials.ThreadedMaterials.Stainless_Steel && finish != Finishes.BoltFinish.Plain || len < 0.5 ||
                len >= 0.5 && len <= 6 && len % 0.25 != 0 || len >= 6 && len <= 11 && len % 0.5 != 0 ||
                len >= 11 && len <= 20 && len % 1 != 0 || len > 20)
            throw new IllegalFastener();
        else{
            this.threadSize = threadS;
            this.length = len;
        }
    } // end constructor

    public String toString() {
        return  + length + " long, " + threadSize + " thread, " + super.toString(); }
} // end Bolt