package singleton;

/**
 * @author : wangwenhan
 * @since : 2020/7/4
 */
public class App {
    public static void main(String[] args) {
        /*MusicLover musicLover = new MusicLover();
        musicLover.setName("张朝阳");
        musicLover.setMemoryCard(new MemoryCard());
        SimpleCoder simpleCoder = new SimpleCoder();
        simpleCoder.setMemoryCard(musicLover.getMemoryCardCopy());
        //销毁内存卡
        simpleCoder.setMemoryCard(null);
        System.out.println("老实人: " + simpleCoder.toString());
        System.out.println("音乐爱好者: " + musicLover.toString());*/
        MusicLover musicLover = new MusicLover();
        musicLover.setName("张朝阳");
        musicLover.setMemoryCard(MemoryCard.INSTANCE);
        SimpleCoder simpleCoder = new SimpleCoder();
        simpleCoder.setMemoryCard(musicLover.getMemoryCardCopy());
        //销毁内存卡
        simpleCoder.getMemoryCard().setNull();
        System.out.println("老实人: " + simpleCoder.toString());
        System.out.println("音乐爱好者: " + musicLover.toString());
    }
}
