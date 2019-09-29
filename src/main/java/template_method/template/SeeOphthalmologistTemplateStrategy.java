package template_method.template;

import template_method.strategy.enums.DiseaseTypeEnum;
import template_method.strategy.enums.MedicineType;

/**
 * 看眼科医生策略
 */
public class SeeOphthalmologistTemplateStrategy extends AbstractSeeDoctorTemplateStrategy {
    @Override
    protected DiseaseTypeEnum getDiseaseType() {
        return DiseaseTypeEnum.GLAUCOMA;
    }

    @Override
    protected void register() {
        System.out.println("挂眼科的号");
    }

    @Override
    protected void diagnosis() {
        System.out.println("去眼科医生门诊");
    }

    @Override
    protected MedicineType buyMedicine() {
        return MedicineType.ANTICATARRHALS;
    }
}
