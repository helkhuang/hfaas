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
 * @author ThinkPad
 *
 */
public class HService implements IHService {
	
	public HService(){
		
	}

	/* (non-Javadoc)
	 * @see com.hfaas.core.service.IHService#getHServiceInstance(java.lang.String)
	 */
	@Override
	public HServiceInstance getHServiceInstance(String serviceName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.hfaas.core.service.IHService#getHServiceInstance(java.lang.String, java.lang.String)
	 */
	@Override
	public HServiceInstance getHServiceInstance(String namespace, String serviceName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.hfaas.core.service.IHService#exactServiceMethod(com.hfaas.core.instance.HServiceInstance, java.lang.String, com.hfaas.core.input.HServiceInput)
	 */
	@Override
	public HServiceOutput exactServiceMethod(HServiceInstance serviceInstance, String methodName,
			HServiceInput serviceInput) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.hfaas.core.service.IHService#getHServiceMethods(java.lang.String, java.lang.String)
	 */
	@Override
	public List<ServiceMethod> getHServiceMethods(String namespace, String serviceName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.hfaas.core.service.IHService#getHServiceMethods(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public ServiceMethod getHServiceMethods(String namespace, String serviceName, String methodName) {
		// TODO Auto-generated method stub
		return null;
	}

}
