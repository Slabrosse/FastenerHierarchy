import java.io.Serializable;

// child class of Bolt
public class CarriageBolt extends Bolt implements Serializable {
    private static final long serialVersionUID = -6791248229559755280L;

    public CarriageBolt(double len, Threads threadS, Enum<Materials.ThreadedMaterials> material,
                 Enum<?> finish, double unitPrice, int numberPerUnit) throws IllegalFastener{
        // invoke parent constructor
        super(len, threadS, material, finish, unitPrice, numberPerUnit);
    }

    public String toString() { return "Carriage Bolt " + super.toString(); }
} // end Carrirage Bolt