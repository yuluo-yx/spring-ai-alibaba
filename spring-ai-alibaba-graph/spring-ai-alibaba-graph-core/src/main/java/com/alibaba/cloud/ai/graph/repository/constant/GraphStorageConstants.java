package com.alibaba.cloud.ai.graph.repository.constant;

/**
 * @author yuluo
 * @author <a href="mailto:yuluo08290126@gmail.com">yuluo</a>
 */

public interface GraphStorageConstants {

	String GraphConfigPrefix = "spring.ai.graph.storage";

	String FILE_SYSTEM = "file_system";

	String DB = "db";

	interface FileSystemStorageConstants {

		String LOCAL = "local";

		String OSS = "oss";

	}

	interface DBStorageConstants {

		String MYSQL = "mysql";

		String REDIS = "redis";

	}

}
