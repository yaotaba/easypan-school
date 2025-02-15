package com.lce.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName file_share
 */
@TableName(value ="file_share")
@Data
public class FileShare implements Serializable {
    private String shareId;

    private String fileId;

    private String userId;

    private Integer validType;

    private Date expireTime;

    private Date shareTime;

    private String code;

    private Integer showCount;

    private static final long serialVersionUID = 1L;
}