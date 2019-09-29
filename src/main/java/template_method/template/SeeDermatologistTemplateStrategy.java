package template_method.template;

import template_method.strategy.enums.DiseaseTypeEnum;
import template_method.strategy.enums.MedicineType;
import template_method.strategy.vo.SeeTheDoctorStrategyResponse;

/**
 * 去皮肤科看脱发
 */
public class SeeDermatologistTemplateStrategy extends AbstractSeeDoctorTemplateStrategy {
    @Override
    protected DiseaseTypeEnum getDiseaseType() {
        return DiseaseTypeEnum.HAIR_LOSS;
    }

    @Override
    protected void register() {
        System.out.println("挂皮肤科的号");
    }

    @Override
    protected void diagnosis() {
        System.out.println("皮肤科医生门诊");
    }

    @Override
    protected MedicineType buyMedicine() {
        System.out.println("初步诊断是肾虚, 买一些蚂蚁大力丸");
        return MedicineType.ANT_POWERFUL_PILL;
    }
}
