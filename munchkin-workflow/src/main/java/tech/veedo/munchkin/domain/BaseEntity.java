package tech.veedo.munchkin.domain;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class BaseEntity<T extends Model> extends Model<T> implements Serializable {

    /**
     * 创建人sub信息
     */
    @TableField(value = "create_psn_sub", fill = FieldFill.INSERT)
    public String createPsnSub;

    /**
     * 创建人组织路径
     */
    @TableField(value = "create_psn_org", fill = FieldFill.INSERT)
    public String createPsnOrg;

    /**
     * 创建人
     */
    @TableField(value = "create_psn", fill = FieldFill.INSERT)
    public String createPerson;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    public LocalDateTime createTime;

    /**
     * 修改人sub信息
     */
    @TableField(value = "update_psn_sub", fill = FieldFill.UPDATE)
    public String updatePsnSub;

    /**
     * 修改人组织路径
     */
    @TableField(value = "update_psn_org", fill = FieldFill.UPDATE)
    public String updatePsnOrg;

    /**
     * 修改人
     */
    @TableField(value = "update_psn", fill = FieldFill.UPDATE)
    public String updatePerson;

    /**
     * 修改时间
     */
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    public LocalDateTime updateTime;

    /**
     * 版本（乐观锁）
     */
    @Version
    @TableField(fill = FieldFill.INSERT)
    public Integer version;

    /**
     * id
     */
    @TableId(type = IdType.UUID)
    public String id;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
