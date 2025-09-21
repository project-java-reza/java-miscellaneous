package enigma.camp.data;

public interface Car extends HashBrand, IsMaintenance {

    void drive();
    int getTier();
    default boolean isBig() {
        return false;
    };
}
