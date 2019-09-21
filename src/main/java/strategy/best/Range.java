package strategy.best;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

/**
 * 范围类
 * @param <T>
 */
@Data
@AllArgsConstructor
public class Range<T extends Comparable<T>> {

    private T start;

    private T end;

    public Range(T start, T end) {
        this.start = start;
        this.end = end;
    }

    private boolean isIncludeStart = true;

    private boolean isIncludeEnd = false;

    /**
     * 判断是否在范围内
     * @param target
     * @return
     */
    public boolean inRange(T target) {
        if(isIncludeStart) {
            if(start.compareTo(target) > 0) {
                return false;
            }
        } else {
            if(start.compareTo(target) >= 0) {
                return false;
            }
        }
        if(isIncludeEnd) {
            if(end.compareTo(target) < 0) {
                return false;
            }
        } else {
            if(end.compareTo(target) <= 0) {
                return false;
            }
        }
        return true;
    }
}
