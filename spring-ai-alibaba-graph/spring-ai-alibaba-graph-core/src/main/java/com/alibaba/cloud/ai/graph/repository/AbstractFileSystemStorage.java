package com.alibaba.cloud.ai.graph.repository;

import java.io.IOException;
import java.util.List;

import com.alibaba.cloud.ai.graph.checkpoint.Checkpoint;
import com.alibaba.cloud.ai.graph.repository.constant.GraphStorageConstants;

/**
 * @author yuluo
 * @author <a href="mailto:yuluo08290126@gmail.com">yuluo</a>
 */

public abstract class AbstractFileSystemStorage implements Storage{

	@Override
	public String getTypes() {

		return GraphStorageConstants.FILE_SYSTEM;
	}

	public abstract List<Checkpoint> read() throws IOException;

	public abstract void write(List<Checkpoint> checkpoints) throws IOException;

	public abstract void delete(Checkpoint checkpoint) throws IOException;

}
