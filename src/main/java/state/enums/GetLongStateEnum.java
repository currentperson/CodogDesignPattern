package state.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GetLongStateEnum {
    NOT_KNOWN_EACH_OTHER("NOT_KNOWN_EACH_OTHER", "不认识"),
    NEED_ADD_WE_CHAT("NEED_ADD_WE_CHAT", "加了微信"),
    WAIT_DATE("WAIT_DATE","等约会"),
    FEEL_SORRY("FEEL_SORRY", "心生怜悯"),
    MAKE_LOVE("MAKE_LOVE", "学习英语");

    private String code;

    private String desc;

}
