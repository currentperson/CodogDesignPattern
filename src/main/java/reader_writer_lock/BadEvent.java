package reader_writer_lock;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @author : wangwenhan
 * @since : 2020/6/19
 */
//公关事件名称
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class BadEvent {

    private String peopleName;

    private String eventName;

    private LocalDateTime happenedTime;
}
