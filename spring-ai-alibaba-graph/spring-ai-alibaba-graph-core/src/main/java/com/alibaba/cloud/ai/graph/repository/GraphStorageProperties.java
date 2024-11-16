package com.alibaba.cloud.ai.graph.repository;

import com.alibaba.cloud.ai.graph.repository.enums.StorageEnums;

/**
 * @author yuluo
 * @author <a href="mailto:yuluo08290126@gmail.com">yuluo</a>
 */

//@ConfigurationProperties(GraphStorageConstants.GraphConfigPrefix)
public class GraphStorageProperties {

	private StorageEnums types;

	/**
	 * todo；同 Storage 中的 getConnection 也没有必要
	 */
	private String address;

	public String getAddress() {

		return address;
	}

	public void setAddress(String address) {

		this.address = address;
	}

	public StorageEnums getTypes() {

		return types;
	}

	public void setTypes(StorageEnums types) {

		this.types = types;
	}

}
