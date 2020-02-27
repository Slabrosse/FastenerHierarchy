import java.io.Serializable;

// child class of Screw
public class WoodScrew extends Screw implements Serializable {

    private static final long serialVersionUID = -5599933764783813891L;

    private Enum<ScrewDesigns.WoodScrewPoints> points;

    // 9 parameter constructor
    public WoodScrew(double len, Threads threadS, Enum<Materials.ThreadedMaterials> material, Enum<?> finish,
                     ScrewDesigns.ScrewHeads sHead, ScrewDesigns.ScrewDrive sDrive,
                     Enum<ScrewDesigns.WoodScrewPoints> point, double unitPrice, int numberPerUnit) throws IllegalFastener{
        // invokes parent class
        super(len, threadS, material, finish, sHead, sDrive, unitPrice, numberPerUnit);
        if (point == null)
            throw new IllegalFastener();
        else
            this.points = point;
    }

    public String toString() { return "Wood Screw " + points + " point, " + super.toString(); }
} // end WoodScrew
