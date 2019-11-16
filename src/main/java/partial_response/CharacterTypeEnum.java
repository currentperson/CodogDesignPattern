package partial_response;

import lombok.Getter;

@Getter
public enum CharacterTypeEnum {

    MATURE_STEADY("成熟稳重"),
    HUMOROUS("风趣幽默");

    CharacterTypeEnum(String desc) {
        this.desc = desc;
    }

    private String desc;
}
