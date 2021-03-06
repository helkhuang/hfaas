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
package com.hfaas.core.henum;

/**
 * 计算负载资源枚举类
 * @author helk.huang
 * @since 2021-10-31
 * @version 1.0
 */
public enum ComputeResource {
	GPU("GPU"),CPU("CPU"),FPGA("FPGA");
	/**资源类型**/
	private String type;
	ComputeResource(String type){
		this.type = type;
	}
	/**
	 * 获取计算资源类型
	 * @return 返回计算资源类型
	 */
	public String getType(){
		return type;
	}
}
