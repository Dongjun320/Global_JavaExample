package japan;

public class japan {

    int travelPeople;
    String airPort;

    japan() {}
    japan(int travelPeople) {this.travelPeople = travelPeople;}
    japan(String airport) {this.airPort = airport;}


    void entry(int count) {
        travelPeople += count;
        System.out.println("입국자 수 : " + count + " / " + "공항 명 : " + airPort);
        System.out.println("여행자 수 : " + travelPeople);
    }
    void departure(int count) {
        travelPeople -= count;
        System.out.println("출국자 수 : " + count + " / " +  "공항 명 : " + airPort);
        System.out.println("여행자 수 : " + travelPeople);
    }

}
