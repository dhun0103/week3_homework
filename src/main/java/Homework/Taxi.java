package Homework;

public class Taxi extends PublicTransport {
    public int basefare = 3000;
    public int allfare;
    public int payment;

    public Taxi() {
        this.maxPassenger = 4;
        this.nowPassenger = 0;
        this.nowFuel = 100;
        this.status = "일반";

        this.num = (int) (Math.random() * 10 + 1);

        System.out.println(num);
        System.out.println("주유량 = " + nowFuel);
        System.out.println("상태 = " + status);
    }

    @Override
    public void pickup(int passenger) {
    }

    @Override
    public void statusChange() {
    }


    //승객 탑승 (1km당 추가요금 1000원)
    @Override
    public void pickup(int passenger, String destination, int distance) {
        int possible = maxPassenger - nowPassenger;

        if (nowFuel < 10) {
            System.out.println("운행 불가!!!");
            return;
        }

        if (passenger > possible) {
            System.out.println("최대 승객 수 초과");
        } else {
            nowPassenger += passenger;
            status = "운행중";
            System.out.println("탑승 승객 수 = " + passenger);
            System.out.println("잔여 승객 수 = " + (maxPassenger - nowPassenger));
            System.out.println("기본 요금 확인 = " + basefare);
            System.out.println("목적지 = " + destination);
            System.out.println("목적지까지의 거리 = " + distance + "km");
            System.out.println("지불할 요금 = " + (basefare + (distance - 1) * 1000));
            payment = basefare + ((distance - 1) * 1000);
            System.out.println("상태 = " + status);
        }
    }

    //주유하기
    @Override
    public void changeFuel(int addfuel) {
        nowFuel += addfuel;
    }

    //상태 확인 + 주유량 확인
    @Override
    public void nowStatus() {
        System.out.println("주유량 = " + nowFuel);
        System.out.println("상태 = " + status);
        System.out.println("누적 요금 = " + allfare);
        if (nowFuel < 10) System.out.println("주유 필요!!!");
    }

    //요금 결제하기
    public void payfor() {
        allfare += payment;
        nowPassenger = 0;
        if (nowFuel < 10) status = "운행불가";
    }
}

