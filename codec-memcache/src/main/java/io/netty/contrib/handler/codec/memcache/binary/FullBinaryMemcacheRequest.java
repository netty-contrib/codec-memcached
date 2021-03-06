/*
 * Copyright 2021 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.contrib.handler.codec.memcache.binary;

import io.netty.buffer.ByteBuf;
import io.netty.contrib.handler.codec.memcache.FullMemcacheMessage;
import io.netty.util.internal.UnstableApi;

/**
 * A {@link BinaryMemcacheRequest} that also includes the content.
 */
@UnstableApi
public interface FullBinaryMemcacheRequest extends BinaryMemcacheRequest, FullMemcacheMessage {

    @Override
    FullBinaryMemcacheRequest copy();

    @Override
    FullBinaryMemcacheRequest duplicate();

    @Override
    FullBinaryMemcacheRequest retainedDuplicate();

    @Override
    FullBinaryMemcacheRequest replace(ByteBuf content);

    @Override
    FullBinaryMemcacheRequest retain(int increment);

    @Override
    FullBinaryMemcacheRequest retain();

    @Override
    FullBinaryMemcacheRequest touch();

    @Override
    FullBinaryMemcacheRequest touch(Object hint);
}
