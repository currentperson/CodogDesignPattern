package composite_pattern.better;

public class App {

    public static void main(String[] args) {
        Place province = new Province("湖北省");
        Place wuhan = new City("武汉市");
        wuhan.add(new Mall("华南海鲜市场"));
        wuhan.add(new School("武汉一中"));
        province.add(wuhan);
        Place huanggang = new City("黄冈市");
        huanggang.add(new Mall("家乐福"));
        huanggang.add(new School("黄冈一中"));
        province.add(huanggang);
        province.killVirus();
    }
}
