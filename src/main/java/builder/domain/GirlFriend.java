package builder.domain;

import builder.annotation.BadSmell;
import builder.enums.ConstellationEnum;
import builder.enums.CupEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 女朋友类
 */
@Getter
@Setter
@Builder
public class GirlFriend {

    /**
     * 出生日期
     */
    private LocalDateTime birthDay;

    /**
     * 姓名
     */
    private String name;

    /**
     * 星座
     */
    private ConstellationEnum constellation;

    /**
     * 家乡
     */
    private String hometown;

    /**
     * 身高
     */
    private Integer height;

    /**
     * 体重
     */
    private Integer weight;

    /**
     * 凶兆
     */
    private CupEnum cup;

    public GirlFriend() {
    }

    /**
     * 刚认识, 只知道姓名
     * @param name
     */
    @BadSmell
    public GirlFriend(String name) {
        this.name = name;
    }

    /**
     * 老司机构造函数
     * @param name
     * @param cup
     */
    @BadSmell
    public GirlFriend(String name, CupEnum cup) {
        this.name = name;
        this.cup = cup;
    }

    /**
     * 朋友介绍, 只说了是个 18 岁的姑娘
     * @param birthDay
     */
    @BadSmell
    public GirlFriend(LocalDateTime birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * 开始约会聊天, 开始查户口
     * START: 你家哪的呀
     *
     * G: 内蒙古
     * I: 大草原, 骑马上学, 考试考射箭
     * G: 福建
     * I: 卖茶的
     * G: 北京
     * I: 你们那雾霾走路上看不到人吧
     * G: 四川
     * I: 你们那辣呀
     * G: 合肥
     * I: ... 合肥有啥
     * @param birthDay
     * @param name
     * @param constellation
     * @param hometown
     * @param height
     * @param weight
     */
    @BadSmell
    public GirlFriend(LocalDateTime birthDay, String name, ConstellationEnum constellation, String hometown, Integer height, Integer weight) {
        this.birthDay = birthDay;
        this.name = name;
        this.constellation = constellation;
        this.hometown = hometown;
        this.height = height;
        this.weight = weight;
    }

    /**
     * 开始深入聊天 ...
     * 不然呢, 你以为最后一个入参怎么知道的
     * 什么? 什么摸, 摸什么的
     * @param birthDay
     * @param name
     * @param constellation
     * @param hometown
     * @param height
     * @param weight
     * @param cup
     */
    @BadSmell
    public GirlFriend(LocalDateTime birthDay, String name, ConstellationEnum constellation, String hometown, Integer height, Integer weight, CupEnum cup) {
        this.birthDay = birthDay;
        this.name = name;
        this.constellation = constellation;
        this.hometown = hometown;
        this.height = height;
        this.weight = weight;
        this.cup = cup;
    }

}
