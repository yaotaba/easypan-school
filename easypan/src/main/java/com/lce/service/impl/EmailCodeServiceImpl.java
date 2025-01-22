package com.lce.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lce.pojo.EmailCode;
import com.lce.service.EmailCodeService;
import com.lce.mapper.EmailCodeMapper;
import org.springframework.stereotype.Service;

/**
* @author lcn
* @description 针对表【email_code(邮箱验证码)】的数据库操作Service实现
* @createDate 2025-01-13 22:19:52
*/
@Service
public class EmailCodeServiceImpl extends ServiceImpl<EmailCodeMapper, EmailCode>
    implements EmailCodeService{

}




