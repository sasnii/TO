package FactoryMethod;

public class FactoryMethod {
    public static void main(String[] args) {
        SandwichFactory shapeFactory = new SandwichFactory();
        Sandwich kanapka1 = shapeFactory.getSandwich("SALAMI");
        kanapka1.make();
        Sandwich kanapka2 = shapeFactory.getSandwich("HAM");
        kanapka2.make();
        Sandwich kanapka3 = shapeFactory.getSandwich("EQQ");
        kanapka3.make();
    }
}

interface Sandwich {
    void make();
}

class Ham implements Sandwich {
    public void make() {
        System.out.println("Tworzenie kanapki z salami");
    }
}

class Eqq implements Sandwich {
    public void make() {
        System.out.println("Tworzenie kanapki z szynka");
    }
}


class Salami implements Sandwich {
    public void make() {
        System.out.println("Tworzenie kanapki z jajkiem");
    }
}


class SandwichFactory {
    public Sandwich getSandwich(String sandwichType){
        if(sandwichType == null){
            return null;
        }
        if(sandwichType.equalsIgnoreCase("SALAMI")){
            return new Salami();

        } else if(sandwichType.equalsIgnoreCase("HAM")){
            return new Ham();

        } else if(sandwichType.equalsIgnoreCase("EQQ")){
            return new Eqq();
        }

        return null;
    }
}