package com.luck.cow.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luck.cow.entity.BaseAdminUser;
import com.luck.cow.mapper.BaseAdminUserMapper;


import com.luck.cow.service.IBaseAdminUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统管理员帐号 服务实现类
 * </p>
 *
 * @author zhangliang
 * @since 2021-07-07
 */
@Service("iBaseAdminUserService")
public class BaseAdminUserServiceImpl extends ServiceImpl<BaseAdminUserMapper, BaseAdminUser> implements IBaseAdminUserService {

}
