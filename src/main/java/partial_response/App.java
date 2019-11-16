package partial_response;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println(RestClient.queryBoyDetail());
        System.out.println(RestService.queryMyBoyInfoByFields(new String[] {"name","rich","height"}));
    }
}
