package prototype;

public class App {

    public static void main(String[] args) {
        Paper firstPaper = new Paper();
        firstPaper.setTitle(Client.queryTitle());
        firstPaper.setIntroduction("青蛙是用腿叫的");
        firstPaper.setContent(new Content("青蛙本来叫的好好的, " +
                "切了腿就不叫了, 所以青蛙是用腿叫的",
                "a.jpg"));
        firstPaper.setConclusion("气功对于治愈癌症确实有效果");

        System.out.println("第一篇论文是 " + firstPaper);

        Paper secondPaper = firstPaper.clone();
        secondPaper.getContent().setPicture("b.jpg");
        System.out.println("第一篇论文是 " + firstPaper);
        System.out.println("第二篇论文是 " + secondPaper);
    }
    //将图片转个 90 度变成新的论文
        /*Paper secondPaper = new Paper();
        secondPaper.setTitle(Client.queryTitle());
        secondPaper.setIntroduction("青蛙是用腿叫的");
        secondPaper.setContent(new Content("青蛙本来叫的好好的, " +
                "切了腿就不叫了, 所以青蛙是用腿叫的",
                "b.jpg"));
        secondPaper.setConclusion("气功对于治愈癌症确实有效果");

        System.out.println("第二篇论文是 " + secondPaper);*/
}
