package untitled.domain;

import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private List<Long> fieId;
    private List<String> keywords;
    private String fileId;
}
