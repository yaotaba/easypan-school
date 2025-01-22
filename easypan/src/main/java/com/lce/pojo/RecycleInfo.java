package com.lce.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName recycle_info
 */
@TableName(value ="recycle_info")
@Data
public class RecycleInfo implements Serializable {
    private String fileId;

    private String userId;

    private String fileMd5;

    private String filePid;

    private Long fileSize;

    private String fileName;

    private String fileCover;

    private String filePath;

    private Date createTime;

    private Date lastUpdateTime;

    private Integer folderType;

    private Integer fileCategory;

    private Integer fileType;

    private Integer status;

    private Date recoveryTime;

    private Integer delFlag;

    private static final long serialVersionUID = 1L;
}