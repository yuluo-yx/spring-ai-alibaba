package com.alibaba.cloud.ai.graph.repository;

import java.sql.Connection;

/**
 * @author yuluo
 * @author <a href="mailto:yuluo08290126@gmail.com">yuluo</a>
 */

public interface Storage extends AutoCloseable {

	void preCheck();

	String getTypes();

	/**
	 * todo：关于这里，如果使用 orm 框架，这里其实并没有必要做获取连接接口！
	 */
	Connection getConnection();

}
