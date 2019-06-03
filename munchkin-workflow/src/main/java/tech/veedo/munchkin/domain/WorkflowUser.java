package tech.veedo.munchkin.domain;

import lombok.Data;

import java.util.HashMap;
import java.util.List;

/**
 * @program: workflow
 * @description: 用户信息
 * @author: zhang yif
 * @create: 2019-5-21 14:24
 **/
@Data
public class WorkflowUser {
    // 用户主键
    private String id;
    // 用户名称
    private String userName;
    // 用户主岗位编码
    private String postCode;
    // 用户主岗位名称
    private String postName;
    // 岗位全路径
    private String postPath;
    // 用户岗位列表信息
    private List<HashMap<String, Object>> posts;
    // 政治面貌
    private String politicalStatus;
    // 身份证号
    private String identity;
    // sub补充信息
    private String sub;
}
