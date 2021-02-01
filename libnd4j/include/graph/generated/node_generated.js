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
 * @constructor
 */
nd4j.graph.FlatNode = function() {
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
 * @returns {nd4j.graph.FlatNode}
 */
nd4j.graph.FlatNode.prototype.__init = function(i, bb) {
  this.bb_pos = i;
  this.bb = bb;
  return this;
};

/**
 * @param {flatbuffers.ByteBuffer} bb
 * @param {nd4j.graph.FlatNode=} obj
 * @returns {nd4j.graph.FlatNode}
 */
nd4j.graph.FlatNode.getRootAsFlatNode = function(bb, obj) {
  return (obj || new nd4j.graph.FlatNode).__init(bb.readInt32(bb.position()) + bb.position(), bb);
};

/**
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.id = function() {
  var offset = this.bb.__offset(this.bb_pos, 4);
  return offset ? this.bb.readInt32(this.bb_pos + offset) : 0;
};

/**
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array|null}
 */
nd4j.graph.FlatNode.prototype.name = function(optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 6);
  return offset ? this.bb.__string(this.bb_pos + offset, optionalEncoding) : null;
};

/**
 * @returns {nd4j.graph.OpType}
 */
nd4j.graph.FlatNode.prototype.opType = function() {
  var offset = this.bb.__offset(this.bb_pos, 8);
  return offset ? /** @type {nd4j.graph.OpType} */ (this.bb.readInt8(this.bb_pos + offset)) : nd4j.graph.OpType.TRANSFORM_FLOAT;
};

/**
 * @returns {flatbuffers.Long}
 */
nd4j.graph.FlatNode.prototype.opNum = function() {
  var offset = this.bb.__offset(this.bb_pos, 10);
  return offset ? this.bb.readInt64(this.bb_pos + offset) : this.bb.createLong(0, 0);
};

/**
 * @param {number} index
 * @param {nd4j.graph.FlatProperties=} obj
 * @returns {nd4j.graph.FlatProperties}
 */
nd4j.graph.FlatNode.prototype.properties = function(index, obj) {
  var offset = this.bb.__offset(this.bb_pos, 12);
  return offset ? (obj || new nd4j.graph.FlatProperties).__init(this.bb.__indirect(this.bb.__vector(this.bb_pos + offset) + index * 4), this.bb) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.propertiesLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 12);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {number} index
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.input = function(index) {
  var offset = this.bb.__offset(this.bb_pos, 14);
  return offset ? this.bb.readInt32(this.bb.__vector(this.bb_pos + offset) + index * 4) : 0;
};

/**
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.inputLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 14);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @returns {Int32Array}
 */
nd4j.graph.FlatNode.prototype.inputArray = function() {
  var offset = this.bb.__offset(this.bb_pos, 14);
  return offset ? new Int32Array(this.bb.bytes().buffer, this.bb.bytes().byteOffset + this.bb.__vector(this.bb_pos + offset), this.bb.__vector_len(this.bb_pos + offset)) : null;
};

/**
 * @param {number} index
 * @param {nd4j.graph.IntPair=} obj
 * @returns {nd4j.graph.IntPair}
 */
nd4j.graph.FlatNode.prototype.inputPaired = function(index, obj) {
  var offset = this.bb.__offset(this.bb_pos, 16);
  return offset ? (obj || new nd4j.graph.IntPair).__init(this.bb.__indirect(this.bb.__vector(this.bb_pos + offset) + index * 4), this.bb) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.inputPairedLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 16);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {number} index
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.output = function(index) {
  var offset = this.bb.__offset(this.bb_pos, 18);
  return offset ? this.bb.readInt32(this.bb.__vector(this.bb_pos + offset) + index * 4) : 0;
};

/**
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.outputLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 18);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @returns {Int32Array}
 */
nd4j.graph.FlatNode.prototype.outputArray = function() {
  var offset = this.bb.__offset(this.bb_pos, 18);
  return offset ? new Int32Array(this.bb.bytes().buffer, this.bb.bytes().byteOffset + this.bb.__vector(this.bb_pos + offset), this.bb.__vector_len(this.bb_pos + offset)) : null;
};

/**
 * @param {number} index
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.extraParams = function(index) {
  var offset = this.bb.__offset(this.bb_pos, 20);
  return offset ? this.bb.readFloat64(this.bb.__vector(this.bb_pos + offset) + index * 8) : 0;
};

/**
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.extraParamsLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 20);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @returns {Float64Array}
 */
nd4j.graph.FlatNode.prototype.extraParamsArray = function() {
  var offset = this.bb.__offset(this.bb_pos, 20);
  return offset ? new Float64Array(this.bb.bytes().buffer, this.bb.bytes().byteOffset + this.bb.__vector(this.bb_pos + offset), this.bb.__vector_len(this.bb_pos + offset)) : null;
};

/**
 * @param {number} index
 * @returns {flatbuffers.Long}
 */
nd4j.graph.FlatNode.prototype.extraInteger = function(index) {
  var offset = this.bb.__offset(this.bb_pos, 22);
  return offset ? this.bb.readInt64(this.bb.__vector(this.bb_pos + offset) + index * 8) : this.bb.createLong(0, 0);
};

/**
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.extraIntegerLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 22);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {number} index
 * @returns {boolean}
 */
nd4j.graph.FlatNode.prototype.extraBools = function(index) {
  var offset = this.bb.__offset(this.bb_pos, 24);
  return offset ? !!this.bb.readInt8(this.bb.__vector(this.bb_pos + offset) + index) : false;
};

/**
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.extraBoolsLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 24);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @returns {Int8Array}
 */
nd4j.graph.FlatNode.prototype.extraBoolsArray = function() {
  var offset = this.bb.__offset(this.bb_pos, 24);
  return offset ? new Int8Array(this.bb.bytes().buffer, this.bb.bytes().byteOffset + this.bb.__vector(this.bb_pos + offset), this.bb.__vector_len(this.bb_pos + offset)) : null;
};

/**
 * @param {number} index
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.dimensions = function(index) {
  var offset = this.bb.__offset(this.bb_pos, 26);
  return offset ? this.bb.readInt32(this.bb.__vector(this.bb_pos + offset) + index * 4) : 0;
};

/**
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.dimensionsLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 26);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @returns {Int32Array}
 */
nd4j.graph.FlatNode.prototype.dimensionsArray = function() {
  var offset = this.bb.__offset(this.bb_pos, 26);
  return offset ? new Int32Array(this.bb.bytes().buffer, this.bb.bytes().byteOffset + this.bb.__vector(this.bb_pos + offset), this.bb.__vector_len(this.bb_pos + offset)) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.device = function() {
  var offset = this.bb.__offset(this.bb_pos, 28);
  return offset ? this.bb.readInt32(this.bb_pos + offset) : 0;
};

/**
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.scopeId = function() {
  var offset = this.bb.__offset(this.bb_pos, 30);
  return offset ? this.bb.readInt32(this.bb_pos + offset) : 0;
};

/**
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array|null}
 */
nd4j.graph.FlatNode.prototype.scopeName = function(optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 32);
  return offset ? this.bb.__string(this.bb_pos + offset, optionalEncoding) : null;
};

/**
 * @param {number} index
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array}
 */
nd4j.graph.FlatNode.prototype.outputNames = function(index, optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 34);
  return offset ? this.bb.__string(this.bb.__vector(this.bb_pos + offset) + index * 4, optionalEncoding) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.outputNamesLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 34);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array|null}
 */
nd4j.graph.FlatNode.prototype.opName = function(optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 36);
  return offset ? this.bb.__string(this.bb_pos + offset, optionalEncoding) : null;
};

/**
 * @param {number} index
 * @returns {nd4j.graph.DType}
 */
nd4j.graph.FlatNode.prototype.outputTypes = function(index) {
  var offset = this.bb.__offset(this.bb_pos, 38);
  return offset ? /** @type {nd4j.graph.DType} */ (this.bb.readInt8(this.bb.__vector(this.bb_pos + offset) + index)) : /** @type {nd4j.graph.DType} */ (0);
};

/**
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.outputTypesLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 38);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @returns {Int8Array}
 */
nd4j.graph.FlatNode.prototype.outputTypesArray = function() {
  var offset = this.bb.__offset(this.bb_pos, 38);
  return offset ? new Int8Array(this.bb.bytes().buffer, this.bb.bytes().byteOffset + this.bb.__vector(this.bb_pos + offset), this.bb.__vector_len(this.bb_pos + offset)) : null;
};

/**
 * @param {nd4j.graph.FlatArray=} obj
 * @returns {nd4j.graph.FlatArray|null}
 */
nd4j.graph.FlatNode.prototype.scalar = function(obj) {
  var offset = this.bb.__offset(this.bb_pos, 40);
  return offset ? (obj || new nd4j.graph.FlatArray).__init(this.bb.__indirect(this.bb_pos + offset), this.bb) : null;
};

/**
 * @param {number} index
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array}
 */
nd4j.graph.FlatNode.prototype.controlDeps = function(index, optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 42);
  return offset ? this.bb.__string(this.bb.__vector(this.bb_pos + offset) + index * 4, optionalEncoding) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.controlDepsLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 42);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {number} index
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array}
 */
nd4j.graph.FlatNode.prototype.varControlDeps = function(index, optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 44);
  return offset ? this.bb.__string(this.bb.__vector(this.bb_pos + offset) + index * 4, optionalEncoding) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.varControlDepsLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 44);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {number} index
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array}
 */
nd4j.graph.FlatNode.prototype.controlDepFor = function(index, optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 46);
  return offset ? this.bb.__string(this.bb.__vector(this.bb_pos + offset) + index * 4, optionalEncoding) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.controlDepForLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 46);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {number} index
 * @returns {nd4j.graph.DType}
 */
nd4j.graph.FlatNode.prototype.extraTypes = function(index) {
  var offset = this.bb.__offset(this.bb_pos, 48);
  return offset ? /** @type {nd4j.graph.DType} */ (this.bb.readInt8(this.bb.__vector(this.bb_pos + offset) + index)) : /** @type {nd4j.graph.DType} */ (0);
};

/**
 * @returns {number}
 */
nd4j.graph.FlatNode.prototype.extraTypesLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 48);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @returns {Int8Array}
 */
nd4j.graph.FlatNode.prototype.extraTypesArray = function() {
  var offset = this.bb.__offset(this.bb_pos, 48);
  return offset ? new Int8Array(this.bb.bytes().buffer, this.bb.bytes().byteOffset + this.bb.__vector(this.bb_pos + offset), this.bb.__vector_len(this.bb_pos + offset)) : null;
};

/**
 * @param {flatbuffers.Builder} builder
 */
nd4j.graph.FlatNode.startFlatNode = function(builder) {
  builder.startObject(23);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} id
 */
nd4j.graph.FlatNode.addId = function(builder, id) {
  builder.addFieldInt32(0, id, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} nameOffset
 */
nd4j.graph.FlatNode.addName = function(builder, nameOffset) {
  builder.addFieldOffset(1, nameOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {nd4j.graph.OpType} opType
 */
nd4j.graph.FlatNode.addOpType = function(builder, opType) {
  builder.addFieldInt8(2, opType, nd4j.graph.OpType.TRANSFORM_FLOAT);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Long} opNum
 */
nd4j.graph.FlatNode.addOpNum = function(builder, opNum) {
  builder.addFieldInt64(3, opNum, builder.createLong(0, 0));
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} propertiesOffset
 */
nd4j.graph.FlatNode.addProperties = function(builder, propertiesOffset) {
  builder.addFieldOffset(4, propertiesOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatNode.createPropertiesVector = function(builder, data) {
  builder.startVector(4, data.length, 4);
  for (var i = data.length - 1; i >= 0; i--) {
    builder.addOffset(data[i]);
  }
  return builder.endVector();
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} numElems
 */
nd4j.graph.FlatNode.startPropertiesVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} inputOffset
 */
nd4j.graph.FlatNode.addInput = function(builder, inputOffset) {
  builder.addFieldOffset(5, inputOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<number>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatNode.createInputVector = function(builder, data) {
  builder.startVector(4, data.length, 4);
  for (var i = data.length - 1; i >= 0; i--) {
    builder.addInt32(data[i]);
  }
  return builder.endVector();
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} numElems
 */
nd4j.graph.FlatNode.startInputVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} inputPairedOffset
 */
nd4j.graph.FlatNode.addInputPaired = function(builder, inputPairedOffset) {
  builder.addFieldOffset(6, inputPairedOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatNode.createInputPairedVector = function(builder, data) {
  builder.startVector(4, data.length, 4);
  for (var i = data.length - 1; i >= 0; i--) {
    builder.addOffset(data[i]);
  }
  return builder.endVector();
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} numElems
 */
nd4j.graph.FlatNode.startInputPairedVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} outputOffset
 */
nd4j.graph.FlatNode.addOutput = function(builder, outputOffset) {
  builder.addFieldOffset(7, outputOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<number>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatNode.createOutputVector = function(builder, data) {
  builder.startVector(4, data.length, 4);
  for (var i = data.length - 1; i >= 0; i--) {
    builder.addInt32(data[i]);
  }
  return builder.endVector();
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} numElems
 */
nd4j.graph.FlatNode.startOutputVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} extraParamsOffset
 */
nd4j.graph.FlatNode.addExtraParams = function(builder, extraParamsOffset) {
  builder.addFieldOffset(8, extraParamsOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<number>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatNode.createExtraParamsVector = function(builder, data) {
  builder.startVector(8, data.length, 8);
  for (var i = data.length - 1; i >= 0; i--) {
    builder.addFloat64(data[i]);
  }
  return builder.endVector();
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} numElems
 */
nd4j.graph.FlatNode.startExtraParamsVector = function(builder, numElems) {
  builder.startVector(8, numElems, 8);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} extraIntegerOffset
 */
nd4j.graph.FlatNode.addExtraInteger = function(builder, extraIntegerOffset) {
  builder.addFieldOffset(9, extraIntegerOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Long>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatNode.createExtraIntegerVector = function(builder, data) {
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
nd4j.graph.FlatNode.startExtraIntegerVector = function(builder, numElems) {
  builder.startVector(8, numElems, 8);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} extraBoolsOffset
 */
nd4j.graph.FlatNode.addExtraBools = function(builder, extraBoolsOffset) {
  builder.addFieldOffset(10, extraBoolsOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<boolean>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatNode.createExtraBoolsVector = function(builder, data) {
  builder.startVector(1, data.length, 1);
  for (var i = data.length - 1; i >= 0; i--) {
    builder.addInt8(+data[i]);
  }
  return builder.endVector();
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} numElems
 */
nd4j.graph.FlatNode.startExtraBoolsVector = function(builder, numElems) {
  builder.startVector(1, numElems, 1);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} dimensionsOffset
 */
nd4j.graph.FlatNode.addDimensions = function(builder, dimensionsOffset) {
  builder.addFieldOffset(11, dimensionsOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<number>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatNode.createDimensionsVector = function(builder, data) {
  builder.startVector(4, data.length, 4);
  for (var i = data.length - 1; i >= 0; i--) {
    builder.addInt32(data[i]);
  }
  return builder.endVector();
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} numElems
 */
nd4j.graph.FlatNode.startDimensionsVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} device
 */
nd4j.graph.FlatNode.addDevice = function(builder, device) {
  builder.addFieldInt32(12, device, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} scopeId
 */
nd4j.graph.FlatNode.addScopeId = function(builder, scopeId) {
  builder.addFieldInt32(13, scopeId, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} scopeNameOffset
 */
nd4j.graph.FlatNode.addScopeName = function(builder, scopeNameOffset) {
  builder.addFieldOffset(14, scopeNameOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} outputNamesOffset
 */
nd4j.graph.FlatNode.addOutputNames = function(builder, outputNamesOffset) {
  builder.addFieldOffset(15, outputNamesOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatNode.createOutputNamesVector = function(builder, data) {
  builder.startVector(4, data.length, 4);
  for (var i = data.length - 1; i >= 0; i--) {
    builder.addOffset(data[i]);
  }
  return builder.endVector();
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} numElems
 */
nd4j.graph.FlatNode.startOutputNamesVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} opNameOffset
 */
nd4j.graph.FlatNode.addOpName = function(builder, opNameOffset) {
  builder.addFieldOffset(16, opNameOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} outputTypesOffset
 */
nd4j.graph.FlatNode.addOutputTypes = function(builder, outputTypesOffset) {
  builder.addFieldOffset(17, outputTypesOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<nd4j.graph.DType>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatNode.createOutputTypesVector = function(builder, data) {
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
nd4j.graph.FlatNode.startOutputTypesVector = function(builder, numElems) {
  builder.startVector(1, numElems, 1);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} scalarOffset
 */
nd4j.graph.FlatNode.addScalar = function(builder, scalarOffset) {
  builder.addFieldOffset(18, scalarOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} controlDepsOffset
 */
nd4j.graph.FlatNode.addControlDeps = function(builder, controlDepsOffset) {
  builder.addFieldOffset(19, controlDepsOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatNode.createControlDepsVector = function(builder, data) {
  builder.startVector(4, data.length, 4);
  for (var i = data.length - 1; i >= 0; i--) {
    builder.addOffset(data[i]);
  }
  return builder.endVector();
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} numElems
 */
nd4j.graph.FlatNode.startControlDepsVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} varControlDepsOffset
 */
nd4j.graph.FlatNode.addVarControlDeps = function(builder, varControlDepsOffset) {
  builder.addFieldOffset(20, varControlDepsOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatNode.createVarControlDepsVector = function(builder, data) {
  builder.startVector(4, data.length, 4);
  for (var i = data.length - 1; i >= 0; i--) {
    builder.addOffset(data[i]);
  }
  return builder.endVector();
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} numElems
 */
nd4j.graph.FlatNode.startVarControlDepsVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} controlDepForOffset
 */
nd4j.graph.FlatNode.addControlDepFor = function(builder, controlDepForOffset) {
  builder.addFieldOffset(21, controlDepForOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatNode.createControlDepForVector = function(builder, data) {
  builder.startVector(4, data.length, 4);
  for (var i = data.length - 1; i >= 0; i--) {
    builder.addOffset(data[i]);
  }
  return builder.endVector();
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} numElems
 */
nd4j.graph.FlatNode.startControlDepForVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} extraTypesOffset
 */
nd4j.graph.FlatNode.addExtraTypes = function(builder, extraTypesOffset) {
  builder.addFieldOffset(22, extraTypesOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<nd4j.graph.DType>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatNode.createExtraTypesVector = function(builder, data) {
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
nd4j.graph.FlatNode.startExtraTypesVector = function(builder, numElems) {
  builder.startVector(1, numElems, 1);
};

/**
 * @param {flatbuffers.Builder} builder
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.FlatNode.endFlatNode = function(builder) {
  var offset = builder.endObject();
  return offset;
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} offset
 */
nd4j.graph.FlatNode.finishFlatNodeBuffer = function(builder, offset) {
  builder.finish(offset);
};

// Exports for Node.js and RequireJS
this.nd4j = nd4j;
