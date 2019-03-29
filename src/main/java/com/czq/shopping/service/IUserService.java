package com.czq.shopping.service;

import com.czq.shopping.model.User;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户会员表 服务类
 * </p>
 *
 * @author ChenZeQiang	
 * @since 2019-03-25
 */
public interface IUserService extends IService<User> {
	public User findAllUser();
}
