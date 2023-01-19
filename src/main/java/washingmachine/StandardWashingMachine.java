package washingmachine;

//nazwa klasy implementującej powinna dookreślać interfejs a nie jeszcze bardziej go uogólniać
//w przypadku kiedy jedyna implementacja to domyuśla stosuje się nazewnictwo w stylu "JakaśKlasaDeafult
public class StandardWashingMachine implements WashingMachine {
    @Override
    public void loadLaundry() {
        //todo implementacja
    }

    @Override
    public void start() {
        //todo implementacja
    }

    @Override
    public void removeLaundry() {
        //todo implementacja
    }

    @Override
    public void exampleDefaultMethod() {
        //a tu możemy nadpisać domyślna implementację metody - funkcje 'default' nie są obowiązkowe do nadpisywania
    }
}
