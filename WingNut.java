import java.io.Serializable;

// child class of InnerThreaded
public class WingNut extends InnerThreaded implements Serializable
{
    private static final long serialVersionUID = 6478363005688894958L;

    // 5 parameter cosntructor
    public WingNut(Threads threadS, Enum<Materials.ThreadedMaterials> material,
                         Enum<Finishes.WingNutFinish> finish,  double unitPrice, int numberPerUnit) throws IllegalFastener{
        // invokes parent class
        super(threadS, material, finish, unitPrice, numberPerUnit);
    }

    public String toString() { return "Wing Nut "  + super.toString(); }
} // end InnerThreaded


