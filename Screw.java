import java.io.Serializable;

public abstract class Screw extends Fastener implements Serializable{
    private static final long serialVersionUID = -8145200343371933543L;

    private Threads threadSize;
    private double length;
    private ScrewDesigns.ScrewHeads head;
    private ScrewDesigns.ScrewDrive drive;

    // length, thread,  material, finish, head, drive, point, price/unit, unit size
    public Screw(double len, Threads threadS, Enum<Materials.ThreadedMaterials> material, Enum<?> finish,
                 ScrewDesigns.ScrewHeads sHead, ScrewDesigns.ScrewDrive sDrive,
                 double unitPrice, int numberPerUnit) throws IllegalFastener{
        super(material, finish, unitPrice, numberPerUnit);
        if (material == Materials.ThreadedMaterials.Brass && finish != Finishes.ScrewFinish.Plain || material ==
                Materials.ThreadedMaterials.Stainless_Steel && finish != Finishes.ScrewFinish.Plain || len < 0.5 ||
                len >= 0.5 && len <= 6 && len % 0.25 != 0 || len >= 6 && len <= 11 && len % 0.5 != 0 ||
                len >= 11 && len <= 20 && len % 1 != 0 || len > 20)
            throw new IllegalFastener();
        else{
            this.threadSize = threadS;
            this.length = len;
            this.head = sHead;
            this.drive = sDrive;
        }
    }
    public String toString() {
        return length + " long, " + threadSize + " thread, " + head + " head, " + drive + "drive, " + super.toString();
    }
}
