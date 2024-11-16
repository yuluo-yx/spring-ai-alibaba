package com.alibaba.cloud.ai.graph.repository.enums;

import com.alibaba.cloud.ai.graph.repository.constant.GraphStorageConstants;

/**
 * @author yuluo
 * @author <a href="mailto:yuluo08290126@gmail.com">yuluo</a>
 */

public enum DBStorageEnums implements StorageEnums {

	MYSQL(GraphStorageConstants.DBStorageConstants.MYSQL),

	REDIS(GraphStorageConstants.DBStorageConstants.REDIS),

	// todo: add others db.
	;

	private final String types;

	DBStorageEnums(String types) {
		this.types = types;
	}

	@Override
	public String getTypes() {

		return types;
	}

}
