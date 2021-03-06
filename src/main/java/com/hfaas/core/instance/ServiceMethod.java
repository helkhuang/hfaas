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

import java.util.List;

/**
 * Hfaas函数实例类
 * @author helk.huang
 * @since 2021-10-31
 * @version 1.0
 */
public class ServiceMethod {
	/**
	 * 函数名称
	 */
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<MethodParams> getParams() {
		return params;
	}
	public void setParams(List<MethodParams> params) {
		this.params = params;
	}
	/**
	 * 函数参数列表
	 */
	private List<MethodParams> params; 
	/**
	 * 构造函数
	 * @param name 函数名称
	 * @param params 函数参数列表
	 */
	public ServiceMethod(String name,List<MethodParams> params){
		this.name = name;
		this.params = params;
	}
}
