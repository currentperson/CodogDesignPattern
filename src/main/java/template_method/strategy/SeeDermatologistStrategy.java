package template_method.strategy;

import strategy.Strategy;
import template_method.strategy.enums.MedicineType;
import template_method.strategy.request.SeeTheDoctorStrategyRequest;
import template_method.strategy.vo.SeeTheDoctorStrategyResponse;

/**
 * 去皮肤科看脱发
 */
public class SeeDermatologistStrategy implements Strategy<SeeTheDoctorStrategyRequest, SeeTheDoctorStrategyResponse> {

    @Override
    public SeeTheDoctorStrategyResponse executeStrategy(SeeTheDoctorStrategyRequest request) {
        System.out.println("挂皮肤科的号");
        System.out.println("拿了号在叫号大厅等待");
        System.out.println("皮肤科医生门诊");
        if(request.getAge() < Constant.BEST_AGE) {
            System.out.println("还年轻, 不用来复查了");
        } else {
            System.out.println("吃完药还得来复查");
        }
        System.out.println("初步诊断是肾虚, 买一些蚂蚁大力丸");
        return new SeeTheDoctorStrategyResponse(MedicineType.ANT_POWERFUL_PILL);
    }
}
