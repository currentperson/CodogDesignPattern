package thread_local;

import java.util.stream.IntStream;

/**
 * @author : wangwenhan
 * @since : 2020/8/30
 */
public class Test {
    public static final ThreadLocal<User> INTEGER_THREAD_LOCAL = new ThreadLocal<>();

    public static void main(String[] args) {
        IntStream.range(1, 10)
            .parallel().forEach(i -> {
            try {
                final User user = new User();
                user.setName("凯文·梅耶尔" + i);
                user.setPlace("字节跳动");
                INTEGER_THREAD_LOCAL.set(user);
                print();
            } finally {
                INTEGER_THREAD_LOCAL.remove();
            }
        });
    }

    public static void print() {
        System.out.println(
            INTEGER_THREAD_LOCAL.get()
                .getName() + "从" +
                INTEGER_THREAD_LOCAL.get()
                    .getPlace() + "离开");
    }
}
