package template_method.template;

import template_method.strategy.enums.DiseaseTypeEnum;
import template_method.strategy.enums.MedicineType;

/**
 * 颈椎病看骨科医生
 */
public class SeeOrthopedicSurgeonTemplateStrategy extends AbstractSeeDoctorTemplateStrategy {
    @Override
    protected DiseaseTypeEnum getDiseaseType() {
        return DiseaseTypeEnum.CERVICAL_PONDYLOPATHY;
    }

    @Override
    protected void register() {
        System.out.println("挂骨科的号");
    }

    @Override
    protected void diagnosis() {
        System.out.println("去骨科医生门诊");
    }

    @Override
    protected MedicineType buyMedicine() {
        return MedicineType.BLOOD_CIRCULATION_DRUGS;
    }
}
