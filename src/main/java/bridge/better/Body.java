package bridge.better;

public interface Body {

    default String action() {
        return "访问了";
    }

    default String visitGirl(Girl girl){
        return queryName() + action() + girl.queryName();
    }

    String queryName();
}
