package trampoline;

import org.apache.commons.lang3.time.StopWatch;

/**
 * @author : wangwenhan
 * @since : 2020/6/12
 */
public class App {
    /**
     * 斐波那契数列，又称黄金分割数列，指的是这样一个数列：0、1、1、2、3、5、8、13、21、34、……在数学上，斐波纳契数列以如下被以递归的方法定义：F（0）=0，F（1）=1，F（n）=F(n-1)+F(n-2)（n≥2，n∈N*）
     */
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        //System.out.println("运算结果: " + calFib3(46));
        System.out.println("运算结果: " + calFib2(45, 0,1));
        //System.out.println("运算结果: " + calFib(5));
        stopWatch.stop();
        //System.out.println("递推耗时:" + stopWatch.getTime(TimeUnit.NANOSECONDS));
        //System.out.println("尾指针耗时:" + stopWatch.getTime(TimeUnit.NANOSECONDS));
        //System.out.println("递归耗时:" + stopWatch.getTime(TimeUnit.MILLISECONDS));
    }

    /**
     * 运算结果: 1134903170
     * 递归耗时:3688
     */
    /**
     * 运算结果: 1134903170
     * 尾指针耗时:0
     */
    /**
     * 运算结果: 1134903170
     * 递推耗时:0
     */
    /**
     * 运算结果: 1134903170
     * 递推耗时:180881 ns
     */
    /**
     * 运算结果: 1134903170
     * 尾指针耗时:201381 ns
     */

    public static long calFib(long n) {
        if (n < 2) {
            return n;
        }
        return calFib(n - 1) + calFib(n - 2);
    }

    public static long calFib2(int n, long a, long b) {
        if (n < 1) {
            return a;
        }
        return calFib2(n - 1, b, a+b);
    }

    public static long calFib3(int n) {
        long[] result = new long[100];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i< n;i++) {
            result[i] = result[i -1] + result[i - 2];
        }
        return result[n - 1];
    }
}
