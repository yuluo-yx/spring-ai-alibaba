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

package com.alibaba.cloud.ai.graph.storage;

import java.io.IOException;
import java.util.List;

import com.alibaba.cloud.ai.graph.checkpoint.Checkpoint;
import com.alibaba.cloud.ai.graph.storage.constant.GraphStorageConstants;

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
