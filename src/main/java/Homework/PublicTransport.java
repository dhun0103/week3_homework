package Homework;

public abstract class PublicTransport {
    public int num;
    public int maxPassenger;
    public int nowPassenger;
    public int nowFuel;
    public String status;

    public PublicTransport() {
    }


    //승객 탑승
    public abstract void pickup(int passenger);

    //승객 탑승
    public abstract void pickup(int passenger, String destination, int distance);

    //주유하기
    public abstract void changeFuel(int addfuel);

    //상태 변경
    public abstract void statusChange();

    //상태 확인 + 주유량 확인
    public abstract void nowStatus();
}
