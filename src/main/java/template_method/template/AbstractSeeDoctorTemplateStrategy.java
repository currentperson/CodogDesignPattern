package template_method.template;

import template_method.strategy.Constant;
import template_method.strategy.enums.DiseaseTypeEnum;
import template_method.strategy.enums.MedicineType;

/**
 * 定义模板方法
 */
public abstract class AbstractSeeDoctorTemplateStrategy implements TemplateStrategy {

    /**
     * 获取疾病类型
     * @return
     */
    protected abstract DiseaseTypeEnum getDiseaseType();

    /**
     * 挂号
     */
    protected abstract void register();

    /**
     * 等待叫号
     */
    protected void waitDoctor() {
        System.out.println("拿了号在叫号大厅等待");
    }

    /**
     * 诊断
     */
    protected abstract void diagnosis();

    /**
     * 关于年龄的判断
     */
    protected void evaluateAge(Integer age) {
        if(age < Constant.BEST_AGE) {
            System.out.println("还年轻, 不用来复查了");
        } else {
            System.out.println("吃完药还得来复查");
        }
    }

    /**
     * 买药
     * @return
     */
    protected abstract MedicineType buyMedicine();
}
