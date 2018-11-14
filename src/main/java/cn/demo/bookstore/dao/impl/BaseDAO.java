package cn.demo.bookstore.dao.impl;

import java.util.List;

import cn.demo.bookstore.dao.Dao;

public class BaseDAO<T> implements Dao<T> {

	@Override
	public long insert(String sql, Object... args) {
		return 0;
	}

	@Override
	public void update(String sql, Object... args) {

	}

	@Override
	public T query(String sql, Object... args) {
		return null;
	}

	@Override
	public List<T> queryForList(String sql, Object... args) {
		return null;
	}

	@Override
	public <V> V getSingleVal(String sql, Object... args) {
		return null;
	}

	@Override
	public void batch(String sql, Object[]... params) {

	}
}
