package com.lce.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName user_info
 */
@TableName(value ="user_info")
@Data
public class UserInfo implements Serializable {
    private String userId;

    private String nickName;

    private String email;

    private String password;

    private Date joinTime;

    private Date lastLoginTime;

    private Integer status;

    private Long useSpace;

    private Long totalSpace;

    private Integer identity;

    private static final long serialVersionUID = 1L;
}