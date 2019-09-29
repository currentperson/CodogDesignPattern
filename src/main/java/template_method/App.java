package template_method;

import template_method.template.SeeDoctorTemplate;
import template_method.template.SeeOrthopedicSurgeonTemplateStrategy;

public class App {

    public static void main(String[] args) {
        SeeDoctorTemplate.seeDoctor(new SeeOrthopedicSurgeonTemplateStrategy(),24);
    }
}
