package tech.veedo.munchkin.utils;

import tech.veedo.munchkin.constant.OperateTypeEnum;
import tech.veedo.munchkin.domain.WorkflowUser;
import tech.veedo.munchkin.domain.WorkflowRoot;

import java.time.LocalDateTime;
import java.util.Optional;

public class AutoFillUtil {

    /**
     * 注入实现，因为暂时没想到获取可能启用也可能没有启用Security的项目的用户，
     * 所以，要插件使用者去自己插入User信息
     * @param t
     * @param workflowUser
     * @param operateTypeEnum
     * @param <T>
     * @return
     */
    public static <T extends WorkflowRoot> T autofill(T t, WorkflowUser workflowUser, OperateTypeEnum operateTypeEnum) {

        WorkflowUser user = Optional.ofNullable(workflowUser).orElseGet(() -> new WorkflowUser());

//        switch (operateTypeEnum) {
//            case ADD:
//                t.getClass().f
//                break;
//            case UPDATE:
//                if ()
//                break;
//        }
//
//
//        if (operateTypeEnum == OperateTypeEnum.ADD) {
//            t.
//        }
//
//        if (workflowUser != null) {
//            switch (operateTypeEnum) {
//                case ADD:
//                    t.setCreatePsnSub(workflowUser.getSub());
//                    t.setCreatePsnOrg(workflowUser.getPostName());
//                    t.setCreatePerson(workflowUser.getUsername());
//                    t.setCreateTime(LocalDateTime.now());
//                    break;
//                case UPDATE:
//                    t.setUpdatePsnSub(workflowUser.getSub());
//                    t.setUpdatePsnOrg(workflowUser.getPostName());
//                    t.setUpdatePerson(workflowUser.getUsername());
//                    t.setUpdateTime(LocalDateTime.now());
//            }
//        }
//        switch (operateTypeEnum) {
//            case ADD:
//                t.setId(IdWorker.get32UUID());
//                t.setVersion(1);
//                break;
//        }

        return t;
    }

}
