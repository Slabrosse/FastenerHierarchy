import java.io.Serializable;

public class IllegalFastener extends Exception implements Serializable {

    private static final long serialVersionUID = -56925277053055140L;

    public IllegalFastener() {super("Illegal parameter supplied");}

} // end Illegal Fastener

// implement Serializable