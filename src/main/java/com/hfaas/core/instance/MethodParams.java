/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hfaas.core.instance;

/**
 * Hfaas函数实例参数
 * @author helk.huang
 * @since 2021-10-31
 * @version 1.0
 */
public class MethodParams {
	/**
	 * 参数名称
	 */
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 参数类型
	 */
	private String type;
	/**
	 * 参数描述
	 */
	private String description;
	/**
	 * 构造函数
	 * @param name 参数名称
	 * @param type 参数类型
	 * @param description 参数描述
	 */
	public MethodParams(String name,String type,String description){
		this.name = name;
		this.type = type;
		this.description = description;
	}
}
