package partial_response;

import lombok.Data;

@Data
public class Boy {

    private String name;

    private Integer height;

    private Integer weight;

    private CharacterTypeEnum characterType;

    private Boolean hasCar;

    private Boolean hasHouse;

    private Boolean rich;
}
