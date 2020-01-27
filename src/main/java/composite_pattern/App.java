package composite_pattern;

public class App {

    public static void main(String[] args) {
        Province province = new Province("湖北省");
        City wuhan = new City("武汉市");
        wuhan.addMall(new Mall("华南海鲜市场"));
        wuhan.addSchool(new School("武汉一中"));
        province.addCity(wuhan);
        City huanggang = new City("黄冈市");
        huanggang.addMall(new Mall("家乐福"));
        huanggang.addSchool(new School("黄冈一中"));
        province.addCity(huanggang);
        province.killVirus();
    }
}
