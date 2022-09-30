package Homework;

public class Bus extends PublicTransport {
    public Bus() {
        this.maxPassenger = 30;
        this.nowPassenger = 0;
        this.nowFuel = 100;
        this.status = "운행중";

        this.num = (int) (Math.random() * 10 + 1);

        System.out.println(this.num);
    }

    @Override
    public void pickup(int passenger, String destination, int distance) {

    }

    //승객 탑승
    @Override
    public void pickup(int passenger) {
        int possible = maxPassenger - nowPassenger;

        if (passenger > possible) {
            System.out.println("최대 승객 수 초과");
        } else {
            nowPassenger += passenger;
            System.out.println("탑승 승객 수 = " + passenger);
            System.out.println("잔여 승객 수 = " + (maxPassenger - nowPassenger));
            System.out.println("요금 확인 = " + (passenger * 1000));
        }
    }

    //주유하기
    @Override
    public void changeFuel(int addfuel) {
        nowFuel += addfuel;
    }

    //상태 변경
    @Override
    public void statusChange() {
        if (status.equals("운행중")) {
            status = "차고지행";
            nowPassenger = 0;
        } else status = "운행중";
    }

    //상태 확인 + 주유량 확인
    @Override
    public void nowStatus() {
        System.out.println("주유량 = " + nowFuel);
        System.out.println("상태 = " + status);
        if (nowFuel < 10) System.out.println("주유 필요!!!");
    }
}
