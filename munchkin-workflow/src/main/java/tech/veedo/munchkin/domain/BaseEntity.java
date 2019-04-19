package tech.veedo.munchkin.domain;

import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {

    /**
     * 创建人sub信息
     */
    public String createPsnSub;

    /**
     * 创建人组织路径
     */
    public String createPsnOrg;

    /**
     * 创建人
     */
    public String createPerson;

    /**
     * 创建时间
     */
    public Date createTime;

    /**
     * 修改人sub信息
     */
    public String updatePsnSub;

    /**
     * 修改人组织路径
     */
    public String updatePsnOrg;

    /**
     * 修改人
     */
    public String updatePerson;

    /**
     * 修改时间
     */
    public LocalDateTime updateTime;

    /**
     * 版本（乐观锁）
     */
    public Integer version;

    /**
     * id
     */
    public String id;

}
