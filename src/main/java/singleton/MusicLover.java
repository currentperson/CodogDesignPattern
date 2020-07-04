package singleton;

import lombok.Data;

import prototype.BeanUtil;

//音乐爱好者
@Data
public class MusicLover {
    private String name;
    private MemoryCard memoryCard;

    public MemoryCard getMemoryCardCopy() {
        return BeanUtil.deepClone(memoryCard, MemoryCard.class);
    }
}
