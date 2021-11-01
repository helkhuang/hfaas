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
 * Hfaas函数服务实例类
 * @author helk.huang
 * @since 2021-10-31
 * @version 1.0
 */
public class HServiceInstance {
	/**函数服务名称*/
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ServiceMethod> getMethods() {
		return methods;
	}

	public void setMethods(List<ServiceMethod> methods) {
		this.methods = methods;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRtype() {
		return rtype;
	}

	public void setRtype(String rtype) {
		this.rtype = rtype;
	}

	/**函数服务包含的函数实例*/
	private List<ServiceMethod> methods;
	/**函数服务网关地址*/
	private String uri;
	/**函数服务调用类型(本地、分布式)*/
	private String type;
	/**函数服务计算资源类型(CPU、GPU、FPGA)*/
	private String rtype;
	
	public  HServiceInstance(String name,
			                 List<ServiceMethod> methods,String uri,String type,String rtype){
		this.name = name;
		this.methods = methods;
		this.uri = uri;
		this.type = type;
		this.rtype = rtype;
	}
}
