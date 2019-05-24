package tech.veedo.munchkin.utils;

import tech.veedo.munchkin.constant.OperateTypeEnum;
import tech.veedo.munchkin.domain.UserInfo;
import tech.veedo.munchkin.domain.WorkflowRoot;

import java.time.LocalDateTime;
import java.util.Optional;

public class AutoFillUtil {

    /**
     * 注入实现，因为暂时没想到获取可能启用也可能没有启用Security的项目的用户，
     * 所以，要插件使用者去自己插入User信息
     * @param t
     * @param userInfo
     * @param operateTypeEnum
     * @param <T>
     * @return
     */
    public static synchronized <T extends WorkflowRoot> T autofill(T t, UserInfo userInfo, OperateTypeEnum operateTypeEnum) {

        Optional<UserInfo> user = Optional.ofNullable(userInfo);

        switch (operateTypeEnum) {
            case ADD:
                t.getClass().f
                break;
            case UPDATE:
                if ()
                break;
        }


        if (operateTypeEnum == OperateTypeEnum.ADD) {
            t.
        }

        if (userInfo != null) {
            switch (operateTypeEnum) {
                case ADD:
                    t.setCreatePsnSub(userInfo.getSub());
                    t.setCreatePsnOrg(userInfo.getPostName());
                    t.setCreatePerson(userInfo.getUsername());
                    t.setCreateTime(LocalDateTime.now());
                    break;
                case UPDATE:
                    t.setUpdatePsnSub(userInfo.getSub());
                    t.setUpdatePsnOrg(userInfo.getPostName());
                    t.setUpdatePerson(userInfo.getUsername());
                    t.setUpdateTime(LocalDateTime.now());
            }
        }
        switch (operateTypeEnum) {
            case ADD:
                t.setId(IdWorker.get32UUID());
                t.setVersion(1);
                break;
        }

        return t;
    }

}
