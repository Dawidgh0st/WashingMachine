package washingmachine;

import java.util.Scanner;

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

    public void chooseTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose material: \n1: wool\n2: poliester\n3: silk\n4: flax"); // pobieram od użytkownika materiał, jednak już zauważyłem błąd, jeśli użytkownik poda stringa a nie liczbę, to wywala exception. Może tu jakiś try catch?
        int material = scanner.nextInt();
        System.out.println("Choose temperarture: 30/40/60");
        int temperature = scanner.nextInt();

        switch (temperature) {
            case 30:
                System.out.println("30 degrees.");
                break;
            case 40:
                if(material == 1) {
                    System.out.println("40 degrees. Attention! The wool will shrink");
                } else {
                    System.out.println("40 degrees.");
                }
                break;
            case 60:
                if (material == 1) {
                    System.out.println("60 degrees. Attention! The wool will shrink");
                } else if (material == 2) {
                    System.out.println("60 degrees.Attention! Will be destroyed!");
                } else {
                    System.out.println("60 degrees.");
                }
                break;
            default:
                System.out.println("Select correct temperature"); //tu wiem, że mam źle, jak użytkownik poda 2x błednie temp to program się kończy. jeśli raz błędnie, a drugi raz dobrze to nie wraca do switcha
                System.out.println("Choose temperarture: 30/40/60");
                int temp = scanner.nextInt();
        }
    }
}
