/*
 * Copyright 2023 Enaium
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.enaium.kookstarter.client.http;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * @author Enaium
 * @since 0.3.0
 */
public interface InviteService {
    /**
     * 获取邀请列表
     *
     * @since 0.3.0
     */
    @GetExchange("invite/list")
    Mono<Map<String, Object>> getInviteList(@RequestParam Map<String, Object> params);


    /**
     * 创建邀请链接
     *
     * @since 0.3.0
     */
    @GetExchange("invite/create")
    Mono<Map<String, Object>> postInviteCreate(@RequestBody Map<String, Object> params);


    /**
     * 删除邀请链接
     *
     * @since 0.3.0
     */
    @GetExchange("invite/delete")
    Mono<Map<String, Object>> postInviteDelete(@RequestBody Map<String, Object> params);
}
