import java.io.Serializable;

public final class ScrewDesigns implements Serializable {

    private static final long serialVersionUID = -2069553675425408805L;

    public enum ScrewDrive {Six_Lobe, Philips, Slotted, Square};

    public enum ScrewHeads {Bugle, Flat, Oval, Pan, Round};

    public enum WoodScrewPoints {Double_Cut, Sharp, Type_17};

} // end ScrewDesigns