package builder.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 白羊座 3.21-4.19 Aries
 * 金牛座 4.20-5.20 Taurus
 * 双子座 5.21-6.21 Gemini
 * 巨蟹座 6.22-7.22 Cancer
 * 狮子座 7.23-8.22 Leo
 * 处女座 8.23-9.22 Virgo
 * 天秤座 9.23-10.23 Libra
 * 天蝎座 10.24-11.21 Scorpio
 * 人马座 11.22-12.20 Sagittarius
 * 山羊座 12.21-1.20 Capricorn
 * 水瓶座 1.21-2.19 Aquarius
 * 双鱼座 2.20-3.20 Pisces
 */

@AllArgsConstructor
@Getter
public enum ConstellationEnum {
    ARIES("ARIES","白羊座","Aries","3.21-4.19"),
    TAURUS("TAURUS","金牛座","Taurus","4.20-5.20"),
    GEMINI("GEMINI","双子座","Gemini","5.21-6.21"),
    CANCER("CANCER","巨蟹座","Cancer","6.22-7.22"),
    LEO("LEO","狮子座","Leo","7.23-8.22"),
    VIRGO("VIRGO","处女座","Virgo","8.23-9.22"),
    LIBRA("LIBRA","天秤座","Libra","9.23-10.23"),
    SCORPIO("SCORPIO","天蝎座","Scorpio","10.24-11.21"),
    SAGITTARIUS("SAGITTARIUS","人马座","Sagittarius","11.22-12.20"),
    CAPRICORN("CAPRICORN","山羊座","Capricorn","12.21-1.20"),
    AQUARIUS("AQUARIUS","水瓶座","Aquarius","1.21-2.19"),
    PISCES("PISCES","双鱼座","Pisces","2.20-3.20");
    private String code;

    private String chineseName;

    private String englishName;

    private String desc;
}
