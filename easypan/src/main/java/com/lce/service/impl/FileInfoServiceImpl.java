package com.lce.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lce.pojo.FileInfo;
import com.lce.service.FileInfoService;
import com.lce.mapper.FileInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author lcn
* @description 针对表【file_info(用户信息表)】的数据库操作Service实现
* @createDate 2025-01-13 22:19:52
*/
@Service
public class FileInfoServiceImpl extends ServiceImpl<FileInfoMapper, FileInfo>
    implements FileInfoService{

}




