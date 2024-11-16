package com.alibaba.cloud.ai.graph.repository.impl.db;

import java.sql.Connection;
import java.util.List;

import com.alibaba.cloud.ai.graph.checkpoint.Checkpoint;
import com.alibaba.cloud.ai.graph.repository.AbstractDBStorage;
import com.alibaba.cloud.ai.graph.repository.enums.DBStorageEnums;

/**
 * @author yuluo
 * @author <a href="mailto:yuluo08290126@gmail.com">yuluo</a>
 */

public class MYSQLStorageImpl extends AbstractDBStorage {

	@Override
	public String getTypes() {

		return DBStorageEnums.MYSQL.getTypes();
	}

	@Override
	public List<Checkpoint> get() throws Exception {
		return null;
	}

	@Override
	public Checkpoint get(String id) throws Exception {
		return null;
	}

	@Override
	public int save(List<Checkpoint> checkpoints) throws Exception {
		return 0;
	}

	@Override
	public int save(Checkpoint checkpoint) throws Exception {
		return 0;
	}

	@Override
	public int delete(Checkpoint checkpoint) throws Exception {
		return 0;
	}

	@Override
	public int delete(String id) throws Exception {
		return 0;
	}

	@Override
	public Checkpoint update(Checkpoint checkpoint) throws Exception {
		return null;
	}

	@Override
	public void preCheck() {

	}

	@Override
	public Connection getConnection() {
		return null;
	}

	@Override
	public void close() throws Exception {

	}

}
