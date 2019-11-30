package sample_factory.better;

import lombok.Getter;

@Getter
public enum NameEnum {

    HUO_YING_REN_ZHE("火影忍者"),
    JIN_JI_DE_JU_REN("进击的巨人"),
    YI_QUAN_CHAO_REN("一拳超人"),
    ;
    private String name;

    NameEnum(String name) {
        this.name = name;
    }
}
