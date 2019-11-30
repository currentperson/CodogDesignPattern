package sample_factory.better;

import sample_factory.demo.Protagonist;

import java.util.HashMap;
import java.util.Map;

public class Constant {

    public static final Map<NameEnum, Protagonist> NAME_2_PROTAGONIST_MAP = new HashMap<>();

    static {
        NAME_2_PROTAGONIST_MAP.put(NameEnum.HUO_YING_REN_ZHE, new Protagonist("鸣人", "九尾 + 嘴遁"));
        NAME_2_PROTAGONIST_MAP.put(NameEnum.JIN_JI_DE_JU_REN, new Protagonist("艾伦", "巨人之力 + 三笠"));
        NAME_2_PROTAGONIST_MAP.put(NameEnum.YI_QUAN_CHAO_REN, new Protagonist("琦玉", "认真一拳 + 被 King 召唤术"));
    }
}
