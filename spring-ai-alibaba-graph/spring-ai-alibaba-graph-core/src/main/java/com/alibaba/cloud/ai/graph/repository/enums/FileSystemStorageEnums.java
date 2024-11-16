package com.alibaba.cloud.ai.graph.repository.enums;

import com.alibaba.cloud.ai.graph.repository.constant.GraphStorageConstants;

/**
 * @author yuluo
 * @author <a href="mailto:yuluo08290126@gmail.com">yuluo</a>
 */
public enum FileSystemStorageEnums implements StorageEnums {

	LOCAL(GraphStorageConstants.FileSystemStorageConstants.LOCAL),

	OSS(GraphStorageConstants.FileSystemStorageConstants.OSS),

	// todo: add others
	;

	private final String types;

	FileSystemStorageEnums(String types) {

		this.types = types;
	}

	@Override
	public String getTypes() {

		return types;
	}

}
