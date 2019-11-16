package partial_response;

import partial_response.common.FieldJsonMapper;

public class RestService {

    public static Boy queryMyBoyInfo() {
        return RestClient.queryBoyDetail();
    }

    public static String queryMyBoyInfoByFields(String[] fields) throws Exception {
        Boy boy = RestClient.queryBoyDetail();
        return FieldJsonMapper.toJson(boy, fields, Boy.class);
    }
}
