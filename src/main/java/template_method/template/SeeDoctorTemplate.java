package template_method.template;

import template_method.strategy.enums.MedicineType;

/**
 * 看医生的模板
 */
public class SeeDoctorTemplate {

    private SeeDoctorTemplate() {
    }

    public static MedicineType seeDoctor(AbstractSeeDoctorTemplateStrategy seeDoctorTemplateStrategy, Integer age) {
        seeDoctorTemplateStrategy.register();
        seeDoctorTemplateStrategy.waitDoctor();
        seeDoctorTemplateStrategy.diagnosis();
        seeDoctorTemplateStrategy.evaluateAge(age);
        return seeDoctorTemplateStrategy.buyMedicine();
    }
}
