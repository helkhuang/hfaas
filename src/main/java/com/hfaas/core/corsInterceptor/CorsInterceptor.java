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
package com.hfaas.core.corsInterceptor;

import org.leo.web.rest.HttpResponse;
import org.leo.web.rest.interceptor.Interceptor;

import io.netty.handler.codec.http.FullHttpRequest;

/**
 * 跨域控制器
 * @author helk.huang
 * @since 2021-10-31
 * @version 1.0
 */
public final class CorsInterceptor implements Interceptor {

    @Override
    public boolean preHandle(FullHttpRequest request, HttpResponse response) throws Exception {
        // 使用axios发送cookie，这里不能用*，需要使用Web前端地址，如：http://localhost:8080
        // response.getHeaders().put("Access-Control-Allow-Origin", "*");
        response.getHeaders().put("Access-Control-Allow-Origin", System.getProperty("http.origin"));
        response.getHeaders().put("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE, PATCH");
        response.getHeaders().put("Access-Control-Max-Age", "3600");
        response.getHeaders().put("Access-Control-Allow-Headers", "Content-Type,X-Token");
        response.getHeaders().put("Access-Control-Allow-Credentials", "true");
        return true;
    }

    @Override
    public void postHandle(FullHttpRequest request, HttpResponse response) throws Exception {
    }

    @Override
    public void afterCompletion(FullHttpRequest request, HttpResponse response) {
    }

}