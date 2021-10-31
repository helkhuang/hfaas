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
 * Hfaas���ĺ�������ӿ�
 * @author helk.huang
 * @since 2021-10-31
 * @version 1.0
 */
public interface IHService {
	/**
	 * ���ݺ����������ƻ�ȡ��������ʵ��
	 * @param serviceName ������������
	 * @return ��������ʵ��
	 */
	public HServiceInstance getHServiceInstance(String serviceName);
	/**
	 * ���ݺ����������ơ��������������ռ��ȡ��������ʵ��
	 * @param namespace �������������ռ�
	 * @param serviceName ������������
	 * @return ��������ʵ��
	 */
	public HServiceInstance getHServiceInstance(String namespace,String serviceName);
	
	/**
	 * ִ�к�������
	 * @param serviceInstance ��������ʵ��
	 * @param methodName ��Ҫִ�еĺ�������
	 * @param serviceInput ������������
	 * @return ��������ִ�н��
	 */
	public HServiceOutput exactServiceMethod(HServiceInstance serviceInstance,String methodName,HServiceInput serviceInput);
	
	/**
	 * ���ݺ����������ơ��������������ռ��ȡ�÷��������к���ʵ��
	 * @param namespace �������������ռ�
	 * @param serviceName ������������
	 * @return ����ʵ��
	 */
	public List<ServiceMethod> getHServiceMethods(String namespace,String serviceName);
	/**
	 * ���ݺ����������ơ��������������ռ䡢�������ƻ�ȡ����ʵ��
	 * @param namespace �������������ռ�
	 * @param serviceName ������������
	 * @param methodName ����ʵ������
	 * @return ����ʵ��
	 */
	public ServiceMethod getHServiceMethods(String namespace,String serviceName,String methodName);

}
