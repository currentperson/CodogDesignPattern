package template_method.strategy.enums;

import lombok.Getter;

/**
 * 药物类型列表
 */
@Getter
public enum  MedicineType {
    //消炎药
    ANTICATARRHALS,
    //活血化瘀药
    BLOOD_CIRCULATION_DRUGS,
    //蚂蚁大力丸
    ANT_POWERFUL_PILL,
    //没有药
    NULL
}
