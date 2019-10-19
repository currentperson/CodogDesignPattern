package chain.better;

import chain.ChainProcessor;
import chain.demo.BigHeadSon;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(ChainProcessor.handleChainNodes(Arrays.asList(new NoseCheckFatherChainNode(),
                new EyeBrowCheckFatherChainNode(), new HeadCheckFatherChainNode()),
                null, new BigHeadSon(), new FatherNameChainNodeResponse("小头爸爸")));
    }
}
