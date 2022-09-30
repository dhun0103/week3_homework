package Homework;

public class Test {
    public static void main(String[] args) {
//        버스
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        System.out.println();

        bus1.pickup(2);
        bus1.changeFuel(-50);
        System.out.println("주유량 = " + bus1.nowFuel);
        bus1.statusChange();
        bus1.changeFuel(10);
        bus1.nowStatus();
        bus1.pickup(45);
        bus1.pickup(5);
        bus1.changeFuel(-55);
        bus1.nowStatus();

        System.out.println("---------------------------------------");
//        택시
        Taxi Taxi1 = new Taxi();
        Taxi Taxi2 = new Taxi();
        System.out.println();

        Taxi1.pickup(2, "서울역", 2);
        Taxi1.changeFuel(-80);
        Taxi1.payfor();
        Taxi1.nowStatus();
        Taxi1.pickup(5, "대화역", 9);
        Taxi1.pickup(3, "구로디지털단지역", 12);
        Taxi1.changeFuel(-20);
        Taxi1.payfor();
        Taxi1.nowStatus();
    }
}

