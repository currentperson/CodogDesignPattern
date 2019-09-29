package template_method.strategy;

import strategy.Strategy;
import template_method.strategy.enums.MedicineType;
import template_method.strategy.request.SeeTheDoctorStrategyRequest;
import template_method.strategy.vo.SeeTheDoctorStrategyResponse;

/**
 * 颈椎病看骨科医生
 */
public class SeeOrthopedicSurgeonStrategy implements Strategy<SeeTheDoctorStrategyRequest, SeeTheDoctorStrategyResponse>  {

    @Override
    public SeeTheDoctorStrategyResponse executeStrategy(SeeTheDoctorStrategyRequest request) {
        System.out.println("挂骨科的号");
        System.out.println("拿了号在叫号大厅等待");
        System.out.println("去骨科医生门诊");
        if(request.getAge() < Constant.BEST_AGE) {
            System.out.println("还年轻, 不用来复查了");
        } else {
            System.out.println("吃完药还得来复查");
        }
        System.out.println("买一些活血化瘀药");
        return new SeeTheDoctorStrategyResponse(MedicineType.BLOOD_CIRCULATION_DRUGS);
    }
}
