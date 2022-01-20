package com.markerhub.service.impl;

import com.markerhub.entity.User;
import com.markerhub.mapper.UserMapper;
import com.markerhub.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YaaXxx_Guo
 * @since 2021-09-01
 */
@Service
public class IUserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
