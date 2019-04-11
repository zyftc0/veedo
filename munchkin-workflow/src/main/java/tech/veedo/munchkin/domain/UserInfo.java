package tech.veedo.munchkin.domain;

import lombok.Data;

import java.util.List;

/**
 * @description: 用户信息
 * @author: chaus
 * @create: 2018-10-15 14:24
 **/
@Data
public class UserInfo {
    // 用户主键
    private String id;
    // 用户名称
    private String username;
    // 用户主岗位编码
    private String postCode;
    // 用户主岗位名称
    private String postName;
    // 岗位全路径
    private String postPath;
    // 用户岗位列表信息
    private List<String> postCodes;
    // sub信息
    private String sub;
    //  政治面貌
    private String zhengzhimianmao;
}
