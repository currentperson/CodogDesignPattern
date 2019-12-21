package prototype;

import lombok.Data;

@Data
public class Paper implements Cloneable {
    private String title;
    private String introduction;
    private Content content;
    private String conclusion;

    @Override
    public Paper clone() {
        Paper clonePaper = new Paper();
        clonePaper.setTitle(this.title);
        clonePaper.setIntroduction(this.introduction);
        clonePaper.setContent(this.content);
        clonePaper.setConclusion(this.conclusion);
        return clonePaper;
    }
}
