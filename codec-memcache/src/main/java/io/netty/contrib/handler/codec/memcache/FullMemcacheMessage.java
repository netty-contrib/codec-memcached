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
package io.netty.contrib.handler.codec.memcache;

import io.netty.buffer.ByteBuf;
import io.netty.util.internal.UnstableApi;

/**
 * Combines {@link MemcacheMessage} and {@link LastMemcacheContent} into one
 * message. So it represent a <i>complete</i> memcache message.
 */
@UnstableApi
public interface FullMemcacheMessage extends MemcacheMessage, LastMemcacheContent {

    @Override
    FullMemcacheMessage copy();

    @Override
    FullMemcacheMessage duplicate();

    @Override
    FullMemcacheMessage retainedDuplicate();

    @Override
    FullMemcacheMessage replace(ByteBuf content);

    @Override
    FullMemcacheMessage retain(int increment);

    @Override
    FullMemcacheMessage retain();

    @Override
    FullMemcacheMessage touch();

    @Override
    FullMemcacheMessage touch(Object hint);
}
