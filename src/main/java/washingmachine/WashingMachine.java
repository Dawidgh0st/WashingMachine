package washingmachine; //klasy nie powinny siedziec bezpośrednio w katalogu "java" poziom niżej powinien być przynajmniej jeden katalog w którym będzie trzymana struktura projektu

public interface WashingMachine { //interfejs zazwyczaj jest wyrażany w liczbie pojedynczej

    //metody interfejsu zawsze są public - nie ma sensu pisać - poniżej przykłady kiedy możemy skorzystać z deklarowania modyfikatora dostępu
    //to samo tyyczy sie slowka abstract
    //poprawiłbym i skrócił nazwe metody. Dążyłbym do tego żeby w kodzie było jasne co robimy - washingMachine.load() albo washingMachine.loadLaundry()
    //i co nam daje zwrócenie stringa? metoda mówi załaduj i nie deklaruje jawnie że coś dostaniemy po załadowaniu :)
    void loadLaundry();
    //ta sama uwaga co do nazwy i typu zwracanego co wyżej
    void start();
    //jw tyle że samo empty() może być mylące
    void removeLaundry();

    default void exampleDefaultMethod(){
        System.out.println("to jest domyślna metoda interfejsu - posiada implementacje");
        examplePrivateMethod(); //wywołanie metody prywatne
    }

    private void examplePrivateMethod(){
        System.out.println("to jest metoda prywatna, do której dostęp ma tylko interfejs");
    }

}
