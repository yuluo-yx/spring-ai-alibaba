package com.alibaba.cloud.ai.graph.repository.impl.filesystem;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import com.alibaba.cloud.ai.graph.checkpoint.Checkpoint;
import com.alibaba.cloud.ai.graph.repository.AbstractFileSystemStorage;

/**
 * @author yuluo
 * @author <a href="mailto:yuluo08290126@gmail.com">yuluo</a>
 */
public class OSSStorageImpl extends AbstractFileSystemStorage {

	@Override
	public void close() throws Exception {

	}

	@Override
	public void preCheck() {

	}

	@Override
	public Connection getConnection() {
		return null;
	}

	@Override
	public List<Checkpoint> read() throws IOException {
		return null;
	}

	@Override
	public void write(List<Checkpoint> checkpoints) throws IOException {

	}

	@Override
	public void delete(Checkpoint checkpoint) throws IOException {

	}

}
