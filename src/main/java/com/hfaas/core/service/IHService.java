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
package com.hfaas.core.service;

import java.util.List;

import com.hfaas.core.input.HServiceInput;
import com.hfaas.core.instance.HServiceInstance;
import com.hfaas.core.instance.ServiceMethod;
import com.hfaas.core.output.HServiceOutput;

/**
 * Hfaas核心函数服务接口
 * @author helk.huang
 * @since 2021-10-31
 * @version 1.0
 */
public interface IHService {
	/**
	 * 根据函数服务名称获取函数服务实例
	 * @param serviceName 函数服务名称
	 * @return 函数服务实例
	 */
	public HServiceInstance getHServiceInstance(String serviceName);
	/**
	 * 根据函数服务名称、函数服务命名空间获取函数服务实例
	 * @param namespace 函数服务命名空间
	 * @param serviceName 函数服务名称
	 * @return 函数服务实例
	 */
	public HServiceInstance getHServiceInstance(String namespace,String serviceName);
	
	/**
	 * 执行函数服务
	 * @param serviceInstance 函数服务实例
	 * @param methodName 需要执行的函数名称
	 * @param serviceInput 函数输入数据
	 * @return 函数服务执行结果
	 */
	public HServiceOutput exactServiceMethod(HServiceInstance serviceInstance,String methodName,HServiceInput serviceInput);
	
	/**
	 * 根据函数服务名称、函数服务命名空间获取该服务下所有函数实例
	 * @param namespace 函数服务命名空间
	 * @param serviceName 函数服务名称
	 * @return 函数实例
	 */
	public List<ServiceMethod> getHServiceMethods(String namespace,String serviceName);
	/**
	 * 根据函数服务名称、函数服务命名空间、函数名称获取函数实例
	 * @param namespace 函数服务命名空间
	 * @param serviceName 函数服务名称
	 * @param methodName 函数实例名称
	 * @return 函数实例
	 */
	public ServiceMethod getHServiceMethods(String namespace,String serviceName,String methodName);

}