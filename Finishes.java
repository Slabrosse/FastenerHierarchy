import java.io.Serializable;

public final class Finishes implements Serializable {

    private static final long serialVersionUID = 8312989028034141643L;

    public enum BoltFinish {Chrome, Hot_Dipped_Galvanized, Plain, Yellow_Zinc, Zinc};

    public enum WingNutFinish {Chrome, Hot_Dipped_Galvanized, Plain, Yellow_Zinc, Zinc};

    public enum CommonNailFinish {Bright, Hot_Dipped_Galvanized};

    public enum ScrewFinish {ACQ_1000_Hour, Black_Phosphate, Chrome, Hot_Dipped_Galvanized, Lubricated,
        Plain, Yellow_Zinc, Zinc};

}