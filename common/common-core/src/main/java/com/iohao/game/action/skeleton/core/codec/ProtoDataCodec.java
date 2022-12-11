/*
 * # iohao.com . 渔民小镇
 * Copyright (C) 2021 - 2022 double joker （262610965@qq.com） . All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.iohao.game.action.skeleton.core.codec;

import com.iohao.game.common.kit.ProtoKit;

/**
 * 业务参数的 proto 编解码器
 *
 * @author 渔民小镇
 * @date 2022-05-18
 */
@SuppressWarnings("unchecked")
public final class ProtoDataCodec implements DataCodec {
    @Override
    public byte[] encode(Object data) {
        return ProtoKit.toBytes(data);
    }

    @Override
    public <T> T decode(byte[] data, Class<?> dataClass) {
        return (T) ProtoKit.parseProtoByte(data, dataClass);
    }

    @Override
    public String codecName() {
        return "j-protobuf";
    }
}