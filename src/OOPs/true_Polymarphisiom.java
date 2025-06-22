package OOPs;
class plane {
    public void takeOff() {
        System.out.println("plane takeOff.....");
    }

    public void land() {
        System.out.println("Plane landing.....");
    }

    public void fly() {
        System.out.println("plane flying");
    }
}
    class PassengerPlane extends plane {
        public void takeOff() {
            System.out.println("PassengerPlane takeOff.....");
        }

        public void land() {
            System.out.println("PassengerPlane landing.....");
        }

        public void fly() {
            System.out.println("PassengerPlane flying");
        }
    }
class FighterPlane extends plane {
    public void takeOff() {
        System.out.println("FighterPlane takeOff.....");
    }

    public void land() {
        System.out.println("FighterPlane landing.....");
    }

    public void fly() {
        System.out.println("FighterPlane flying");
    }
}
        class CargoPlane extends plane {
            public void takeOff() {
                System.out.println("CargoPlane takeOff.....");
            }

            public void land() {
                System.out.println("CargoPlane landing.....");
            }

            public void fly() {
                System.out.println("CargoPlane flying");
            }
        }

        class Airport{
    public void allowplane(plane p){
        p.takeOff();
        p.fly();
        p.land();
                System.out.println();
            }
        }


public class true_Polymarphisiom {
    public static void main(String[] args) {
//    plane p = null;
//    p = new PassengerPlane();
//    p.takeOff();
//    p.fly();
//    p.land();
//        System.out.println();
//
//        p = new CargoPlane();
//
//        p.takeOff();
//        p.fly();
//        p.land();
//
//        System.out.println();
//        p = new FighterPlane();
//        p.takeOff();
//        p.fly();
//        p.land();

        PassengerPlane p = new PassengerPlane();
        CargoPlane c= new CargoPlane();
        FighterPlane f = new FighterPlane();

        Airport a = new Airport();
        a.allowplane(p);
        a.allowplane(c);
        a.allowplane(f);

    }
}
