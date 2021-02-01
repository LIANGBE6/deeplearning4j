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

/**
 * @const
 * @namespace
 */
var nd4j = nd4j || {};

/**
 * @const
 * @namespace
 */
nd4j.graph = nd4j.graph || {};

/**
 * @enum
 */
nd4j.graph.ByteOrder = {
  LE: 0,
  BE: 1
};

/**
 * @enum
 */
nd4j.graph.DType = {
  INHERIT: 0,
  BOOL: 1,
  FLOAT8: 2,
  HALF: 3,
  HALF2: 4,
  FLOAT: 5,
  DOUBLE: 6,
  INT8: 7,
  INT16: 8,
  INT32: 9,
  INT64: 10,
  UINT8: 11,
  UINT16: 12,
  UINT32: 13,
  UINT64: 14,
  QINT8: 15,
  QINT16: 16,
  BFLOAT16: 17,
  UTF8: 50,
  UTF16: 51,
  UTF32: 52
};

/**
 * @constructor
 */
nd4j.graph.FlatArray = function() {
  /**
   * @type {flatbuffers.ByteBuffer}
   */
  this.bb = null;

  /**
   * @type {number}
   */
  this.bb_pos = 0;
};

/**
 * @param {number} i
 * @param {flatbuffers.ByteBuffer} bb
 * @returns {nd4j.graph.FlatArray}
 */
nd4j.graph.FlatArray.prototype.__init = function(i, bb) {
  this.bb_pos = i;
  this.bb = bb;
  return this;
};

/**
 * @param {flatbuffers.ByteBuffer} bb
 * @param {nd4j.graph.FlatArray=} obj
 * @returns {nd4j.graph.FlatArray}
 */
nd4j.graph.FlatArray.getRootAsFlatArray = function(bb, obj) {
  return (obj || new nd4j.graph.FlatArray).__init(bb.readInt32(bb.position()) + bb.position(), bb);
};

/**
 * @param {number} index
 * @returns {flatbuffers.Long}
 */
nd4j.graph.FlatArray.prototype.shape = function(index) {
  var offset = this.bb.__offset(this.bb_pos, 4);
  return offset ? this.bb.readInt64(this.bb.__vector(this.bb_pos + offset) + index * 8) : this.bb.createLong(0, 0);
};

/**
 * @returns {number}
 */
nd4j.graph.FlatArray.prototype.shapeLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 4);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {number} index
 * @returns {number}
 */
nd4j.graph.FlatArray.prototype.buffer = function(index) {
  var offset = this.bb.__offset(this.bb_pos, 6);
  return offset ? this.bb.readInt8(this.bb.__vector(this.bb_pos + offset) + index) : 0;
};

/**
 * @returns {number}
 */
nd4j.graph.FlatArray.prototype.bufferLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 6);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @returns {Int8Array}
 */
nd4j.graph.FlatArray.prototype.bufferArray = function() {
  var offset = this.bb.__offset(this.bb_pos, 6);
  return offset ? new Int8Array(this.bb.bytes().buffer, this.bb.bytes().byteOffset + this.bb.__vector(this.bb_pos + offset), this.bb.__vector_len(this.bb_pos + offset)) : null;
};

/**
 * @returns {nd4j.graph.DType}
 */
nd4j.graph.FlatArray.prototype.dtype = function() {
  var offset = this.bb.__offset(this.bb_pos, 8);
  return offset ? /** @type {nd4j.graph.DType} */ (this.bb.readInt8(this.bb_pos + offset)) : nd4j.graph.DType.INHERIT;
};

/**
 * @returns {nd4j.graph.ByteOrder}
 */
nd4j.graph.FlatArray.prototype.byteOrder = function() {
  var offset = this.bb.__offset(this.bb_pos, 10);
  return offset ? /** @type {nd4j.graph.ByteOrder} */ (this.bb.readInt8(this.bb_pos + offset)) : nd4j.graph.ByteOrder.LE;
};

/**
 * @param {flatbuffers.Builder} builder
 */
nd4j.graph.FlatArray.startFlatArray = function(builder) {
  builder.startObject(4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} shapeOffset
 */
nd4j.graph.FlatArray.addShape = function(builder, shapeOffset) {
  builder.addFieldOffset(0, shapeOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Long>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatArray.createShapeVector = function(builder, data) {
  builder.startVector(8, data.length, 8);
  for (var i = data.length - 1; i >= 0; i--) {
    builder.addInt64(data[i]);
  }
  return builder.endVector();
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} numElems
 */
nd4j.graph.FlatArray.startShapeVector = function(builder, numElems) {
  builder.startVector(8, numElems, 8);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} bufferOffset
 */
nd4j.graph.FlatArray.addBuffer = function(builder, bufferOffset) {
  builder.addFieldOffset(1, bufferOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<number>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatArray.createBufferVector = function(builder, data) {
  builder.startVector(1, data.length, 1);
  for (var i = data.length - 1; i >= 0; i--) {
    builder.addInt8(data[i]);
  }
  return builder.endVector();
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} numElems
 */
nd4j.graph.FlatArray.startBufferVector = function(builder, numElems) {
  builder.startVector(1, numElems, 1);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {nd4j.graph.DType} dtype
 */
nd4j.graph.FlatArray.addDtype = function(builder, dtype) {
  builder.addFieldInt8(2, dtype, nd4j.graph.DType.INHERIT);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {nd4j.graph.ByteOrder} byteOrder
 */
nd4j.graph.FlatArray.addByteOrder = function(builder, byteOrder) {
  builder.addFieldInt8(3, byteOrder, nd4j.graph.ByteOrder.LE);
};

/**
 * @param {flatbuffers.Builder} builder
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatArray.endFlatArray = function(builder) {
  var offset = builder.endObject();
  return offset;
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} offset
 */
nd4j.graph.FlatArray.finishFlatArrayBuffer = function(builder, offset) {
  builder.finish(offset);
};

// Exports for Node.js and RequireJS
this.nd4j = nd4j;
