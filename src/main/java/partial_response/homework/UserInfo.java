package partial_response.homework;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserInfo {

    private String name;

    private Integer level;

    private LocalDateTime registerDate;

    private String email;

    private String phone;
}
