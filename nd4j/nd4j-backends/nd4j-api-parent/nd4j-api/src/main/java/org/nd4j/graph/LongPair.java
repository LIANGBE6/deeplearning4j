/*
 *  ******************************************************************************
 *  *
 *  *
 *  * This program and the accompanying materials are made available under the
 *  * terms of the Apache License, Version 2.0 which is available at
 *  * https://www.apache.org/licenses/LICENSE-2.0.
 *  *
 *  *  See the NOTICE file distributed with this work for additional
 *  *  information regarding copyright ownership.
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  * License for the specific language governing permissions and limitations
 *  * under the License.
 *  *
 *  * SPDX-License-Identifier: Apache-2.0
 *  *****************************************************************************
 */

package org.nd4j.graph;

import java.nio.*;
import java.lang.*;
import java.nio.ByteOrder;

import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class LongPair extends Table {
  public static LongPair getRootAsLongPair(ByteBuffer _bb) { return getRootAsLongPair(_bb, new LongPair()); }
  public static LongPair getRootAsLongPair(ByteBuffer _bb, LongPair obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public LongPair __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long first() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public long second() { int o = __offset(6); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }

  public static int createLongPair(FlatBufferBuilder builder,
      long first,
      long second) {
    builder.startObject(2);
    LongPair.addSecond(builder, second);
    LongPair.addFirst(builder, first);
    return LongPair.endLongPair(builder);
  }

  public static void startLongPair(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addFirst(FlatBufferBuilder builder, long first) { builder.addLong(0, first, 0L); }
  public static void addSecond(FlatBufferBuilder builder, long second) { builder.addLong(1, second, 0L); }
  public static int endLongPair(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

