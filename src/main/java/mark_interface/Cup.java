package mark_interface;

import builder.enums.CupEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cup implements NotPrint {

    private CupEnum cupType;

    private Integer bustSize;
}
