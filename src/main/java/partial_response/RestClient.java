package partial_response;

import java.util.Random;

public class RestClient {

    public static final Boolean[] BOOLEAN_ARRAY = {Boolean.TRUE, Boolean.FALSE};

    public static final String[] NAME_ARRAY = {"贾宝玉", "武松", "张角"};
    public static final Integer[] HEIGHT_ARRAY = {170, 175, 180};
    public static final Integer[] WEIGHT_ARRAY = {50, 60, 70};

    public static final Random RANDOM = new java.util.Random();

    public static Boy queryBoyDetail() {
        Boy boy = new Boy();
        boy.setName(queryRandomItem(NAME_ARRAY));
        boy.setHeight(queryRandomItem(HEIGHT_ARRAY));
        boy.setWeight(queryRandomItem(WEIGHT_ARRAY));
        boy.setCharacterType(queryRandomItem(CharacterTypeEnum.values()));
        boy.setHasCar(queryRandomItem(BOOLEAN_ARRAY));
        boy.setHasHouse(queryRandomItem(BOOLEAN_ARRAY));
        boy.setRich(queryRandomItem(BOOLEAN_ARRAY));
        return boy;
    }

    public static <T> T queryRandomItem(T[] itemArray) {
        return itemArray[RANDOM.nextInt(itemArray.length)];
    }
}
