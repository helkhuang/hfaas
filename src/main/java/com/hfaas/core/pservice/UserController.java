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
package com.hfaas.core.pservice;

import java.util.HashMap;
import java.util.Map;

import org.leo.web.annotation.DeleteMapping;
import org.leo.web.annotation.GetMapping;
import org.leo.web.annotation.JsonResponse;
import org.leo.web.annotation.PathVariable;
import org.leo.web.annotation.PostMapping;
import org.leo.web.annotation.PutMapping;
import org.leo.web.annotation.RequestBody;
import org.leo.web.annotation.RequestMapping;
import org.leo.web.annotation.RestController;
import org.leo.web.rest.HttpStatus;
import org.leo.web.rest.ResponseEntity;

import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping("/users")
public class UserController {
	@GetMapping("")
    @JsonResponse
    public ResponseEntity<Map> listUser() {
        // 查询用户
        Map user = new HashMap();
        user.put("id", 1);
        user.put("name", "Leo");
        user.put("age", 18);
        return ResponseEntity.ok().build(user);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> putMethod(@PathVariable("id") int id, @RequestBody String body) {
        // 更新用户
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMethod(@PathVariable int id) {
        // 删除用户
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    
    @PostMapping("")
    public ResponseEntity<?> postMethod(@RequestBody String body) {
        // 添加用户
        JSONObject json = JSONObject.parseObject(body);
        Map user = new HashMap();
        user.put("id", json.getIntValue("id"));
        user.put("name", json.getString("name"));
        user.put("age", json.getShortValue("age"));
        return ResponseEntity.status(HttpStatus.CREATED).build(user);
    }
}
