package tech.veedo.munchkin.domain;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class WorkflowException extends RuntimeException {

    private Integer status;

    private String detailMessage;

    public WorkflowException(Integer status, String detailMessage){
        this.status = status;
        this.detailMessage = detailMessage;
    }

}
