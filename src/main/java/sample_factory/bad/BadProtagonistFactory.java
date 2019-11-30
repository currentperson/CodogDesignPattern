package sample_factory.bad;

import sample_factory.demo.Protagonist;

import java.util.Objects;

public class BadProtagonistFactory {

    public static Protagonist createProtagonist(String comicType) {
        if (Objects.equals(comicType, "火影忍者")) {
            return new Protagonist("鸣人", "九尾 + 嘴遁");
        }
        if (Objects.equals(comicType, "进击的巨人")) {
            return new Protagonist("艾伦", "巨人之力 + 三笠");
        }
        if (Objects.equals(comicType, "一拳超人")) {
            return new Protagonist("琦玉", "认真一拳 + 被 King 召唤术");
        }
        return Protagonist.NULL;
    }
}
