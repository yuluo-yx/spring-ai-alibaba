/*
 * Copyright 2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.cloud.ai.graph.storage.impl.db;

import java.sql.Connection;
import java.util.List;

import com.alibaba.cloud.ai.graph.checkpoint.Checkpoint;
import com.alibaba.cloud.ai.graph.storage.AbstractDBStorage;
import com.alibaba.cloud.ai.graph.storage.enums.DBStorageEnums;

/**
 * @author yuluo
 * @author <a href="mailto:yuluo08290126@gmail.com">yuluo</a>
 */

public class MySQLStorageImpl extends AbstractDBStorage {

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
