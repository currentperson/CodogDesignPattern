package proxy;

/**
 * @author : wangwenhan
 * @since : 2020/7/18
 */
public class RealOwner implements Owner {

    @Override
    public String writePaper(String condition) {
        return condition + "参赛文章: <C10orf67 在结直肠癌发生发展中的功能与机制研究>";
    }
}

