package com.alibaba.cloud.ai.graph.repository;

import java.util.List;

import com.alibaba.cloud.ai.graph.checkpoint.Checkpoint;
import com.alibaba.cloud.ai.graph.repository.constant.GraphStorageConstants;

/**
 * @author yuluo
 * @author <a href="mailto:yuluo08290126@gmail.com">yuluo</a>
 */

public abstract class AbstractDBStorage implements Storage {

	@Override
	public String getTypes() {

		return GraphStorageConstants.DB;
	}

	public abstract List<Checkpoint> get() throws Exception;

	public abstract Checkpoint get(String id) throws Exception;

	public abstract int save(List<Checkpoint> checkpoints) throws Exception;

	public abstract int save(Checkpoint checkpoint) throws Exception;

	public abstract int delete(Checkpoint checkpoint) throws Exception;

	public abstract int delete(String id) throws Exception;

	public abstract Checkpoint update(Checkpoint checkpoint) throws Exception;

}
