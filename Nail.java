import java.io.Serializable;

// child class of Fastener
public abstract class Nail extends Fastener implements Serializable{
    private static final long serialVersionUID = 3028900317071914930L;

    private NailDesigns.CommonNailSizes size;
    private NailDesigns.CommonNailLengths length;
    private NailDesigns.CommonNailGauges gauge;
    private static Materials.NailMaterials material = Materials.NailMaterials.Steel;

    // 6 parameter constructor
    public Nail(NailDesigns.CommonNailSizes nSize, NailDesigns.CommonNailLengths len,
                NailDesigns.CommonNailGauges nGauge, Enum<Finishes.CommonNailFinish> finish,
                 double unitPrice, int numberPerUnit) throws IllegalFastener{
        // invokes parent class
        super(material, finish, unitPrice, numberPerUnit);
            this.size = nSize;
            this.length = len;
            this.gauge = nGauge;
    }
    public String toString() {
        return size + " size, " + length + " long, " + gauge + " gauge, " + super.toString();
    }
} // end Nail
