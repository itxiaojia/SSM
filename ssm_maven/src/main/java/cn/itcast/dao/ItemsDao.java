package cn.itcast.dao;

import cn.itcast.domain.Item;

/**
 * @Author: Mr.jia
 * @Date: 2018/9/5 15:07
 */
public interface ItemsDao {

	public Item findItemById(Integer id);
}
