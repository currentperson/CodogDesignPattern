package builder.domain;

import builder.enums.ConstellationEnum;
import builder.enums.CupEnum;

import java.time.LocalDateTime;

public final class GirlFriendBuilder {
    private LocalDateTime birthDay;
    private String name;
    private ConstellationEnum constellation;
    private String hometown;
    private Integer height;
    private Integer weight;
    private CupEnum cup;

    private GirlFriendBuilder() {
    }

    public static GirlFriendBuilder aGirlFriend() {
        return new GirlFriendBuilder();
    }

    public GirlFriendBuilder withBirthDay(LocalDateTime birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    public GirlFriendBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public GirlFriendBuilder withConstellation(ConstellationEnum constellation) {
        this.constellation = constellation;
        return this;
    }

    public GirlFriendBuilder withHometown(String hometown) {
        this.hometown = hometown;
        return this;
    }

    public GirlFriendBuilder withHeight(Integer height) {
        this.height = height;
        return this;
    }

    public GirlFriendBuilder withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public GirlFriendBuilder withCup(CupEnum cup) {
        this.cup = cup;
        return this;
    }

    public GirlFriend build() {
        GirlFriend girlFriend = new GirlFriend();
        girlFriend.setBirthDay(birthDay);
        girlFriend.setName(name);
        girlFriend.setConstellation(constellation);
        girlFriend.setHometown(hometown);
        girlFriend.setHeight(height);
        girlFriend.setWeight(weight);
        girlFriend.setCup(cup);
        return girlFriend;
    }
}
