package sample_factory;

import sample_factory.bad.BadProtagonistFactory;
import sample_factory.better.Constant;
import sample_factory.better.NameEnum;

public class App {

    public static void main(String[] args) {
        System.out.println(BadProtagonistFactory.createProtagonist("一拳超人"));
        System.out.println(SampleFacoryUtil.createProdction(NameEnum.JIN_JI_DE_JU_REN, Constant.NAME_2_PROTAGONIST_MAP));
    }
}
