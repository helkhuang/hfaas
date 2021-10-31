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
package com.hfaas.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.hfaas.core.henum.ComputeResource;

/**
 * Hfaas�ֲ�ʽ���к���
 * @author helk.huang
 * @since 2021-10-31
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.METHOD)
public @interface DistributedService {
	 /**��������**/
    public  String name = "";
    /**���������ռ�**/
    public String namespace="";
    /**�ֲ�ʽ����ִ����Сʵ��**/
    public int minInstance = 1;
    /**�ֲ�ʽ����ִ�����ʵ��**/
    public int maxInstance = 100;
    /**�ֲ�ʽ����ִ������**/
    public ComputeResource resource = ComputeResource.CPU;
}
