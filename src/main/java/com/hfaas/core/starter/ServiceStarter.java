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
package com.hfaas.core.starter;

import org.leo.web.core.WebServer;

import com.hfaas.core.corsInterceptor.CorsInterceptor;

import io.netty.util.internal.StringUtil;

/**
 * Hfaas函数服务运行入口
 * @author helk.huang
 * @since 2021-11-02
 * @version 1.0
 */
public class ServiceStarter {
   public static void main(String[] args){
	   // 忽略指定url  
	    WebServer.getIgnoreUrls().add("/favicon.ico"); 
	    // 设置监听端口号  
	    int server_port = 8888;
	    if(args.length>0){
	    	if(!StringUtil.isNullOrEmpty(args[0])){
		    	server_port = Integer.parseInt(args[0]);
		    }
	    }
	    WebServer server = new WebServer(server_port); 
	    // 设置Http最大内容长度（默认 为10M）  
	    server.setMaxContentLength(1024 * 1024 * 50);
	    // 设置服务所在包  
	    server.setControllerBasePackage("com.hfaas.core.pservice"); 
	    // 添加拦截器，按照添加的顺序执行。  
	    // 跨域拦截器  
	    server.addInterceptor(new CorsInterceptor(), "/不用拦截的url"); 
	    try {  
	        server.start();  
	        System.out.println("服务已经启动，监听端口为:"+server_port);
	    } catch (InterruptedException e) {  
	        e.printStackTrace();  
	    }  
   }
}
