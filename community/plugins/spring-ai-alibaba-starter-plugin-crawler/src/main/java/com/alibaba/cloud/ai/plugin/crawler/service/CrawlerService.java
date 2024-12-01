package com.alibaba.cloud.ai.plugin.crawler.service;

/**
 * @author yuluo
 * @author <a href="mailto:yuluo08290126@gmail.com">yuluo</a>
 */

public interface CrawlerService {

	/**
	 * LLMs web crawler runs interface definitions
	 * @param url target url
	 * @return Adapt to different crawler applications Use string to return and realize serialization
	 * as objects in the class {@link com.alibaba.cloud.ai.plugin.crawler.entity.JinaResponse}
	 */
	String run(String url);

}