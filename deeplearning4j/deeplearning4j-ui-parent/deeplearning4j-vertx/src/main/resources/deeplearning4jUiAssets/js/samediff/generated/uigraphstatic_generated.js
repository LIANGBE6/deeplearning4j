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
nd4j.graph.UIInfoType = {
  GRAPH_STRUCTURE: 0,
  SYTEM_INFO: 1,
  START_EVENTS: 2
};

/**
 * @constructor
 */
nd4j.graph.UIStaticInfoRecord = function() {
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
 * @returns {nd4j.graph.UIStaticInfoRecord}
 */
nd4j.graph.UIStaticInfoRecord.prototype.__init = function(i, bb) {
  this.bb_pos = i;
  this.bb = bb;
  return this;
};

/**
 * @param {flatbuffers.ByteBuffer} bb
 * @param {nd4j.graph.UIStaticInfoRecord=} obj
 * @returns {nd4j.graph.UIStaticInfoRecord}
 */
nd4j.graph.UIStaticInfoRecord.getRootAsUIStaticInfoRecord = function(bb, obj) {
  return (obj || new nd4j.graph.UIStaticInfoRecord).__init(bb.readInt32(bb.position()) + bb.position(), bb);
};

/**
 * @returns {nd4j.graph.UIInfoType}
 */
nd4j.graph.UIStaticInfoRecord.prototype.infoType = function() {
  var offset = this.bb.__offset(this.bb_pos, 4);
  return offset ? /** @type {nd4j.graph.UIInfoType} */ (this.bb.readInt8(this.bb_pos + offset)) : nd4j.graph.UIInfoType.GRAPH_STRUCTURE;
};

/**
 * @param {flatbuffers.Builder} builder
 */
nd4j.graph.UIStaticInfoRecord.startUIStaticInfoRecord = function(builder) {
  builder.startObject(1);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {nd4j.graph.UIInfoType} infoType
 */
nd4j.graph.UIStaticInfoRecord.addInfoType = function(builder, infoType) {
  builder.addFieldInt8(0, infoType, nd4j.graph.UIInfoType.GRAPH_STRUCTURE);
};

/**
 * @param {flatbuffers.Builder} builder
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UIStaticInfoRecord.endUIStaticInfoRecord = function(builder) {
  var offset = builder.endObject();
  return offset;
};

/**
 * @constructor
 */
nd4j.graph.UISystemInfo = function() {
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
 * @returns {nd4j.graph.UISystemInfo}
 */
nd4j.graph.UISystemInfo.prototype.__init = function(i, bb) {
  this.bb_pos = i;
  this.bb = bb;
  return this;
};

/**
 * @param {flatbuffers.ByteBuffer} bb
 * @param {nd4j.graph.UISystemInfo=} obj
 * @returns {nd4j.graph.UISystemInfo}
 */
nd4j.graph.UISystemInfo.getRootAsUISystemInfo = function(bb, obj) {
  return (obj || new nd4j.graph.UISystemInfo).__init(bb.readInt32(bb.position()) + bb.position(), bb);
};

/**
 * @returns {number}
 */
nd4j.graph.UISystemInfo.prototype.physicalCores = function() {
  var offset = this.bb.__offset(this.bb_pos, 4);
  return offset ? this.bb.readInt32(this.bb_pos + offset) : 0;
};

/**
 * @param {flatbuffers.Builder} builder
 */
nd4j.graph.UISystemInfo.startUISystemInfo = function(builder) {
  builder.startObject(1);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} physicalCores
 */
nd4j.graph.UISystemInfo.addPhysicalCores = function(builder, physicalCores) {
  builder.addFieldInt32(0, physicalCores, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UISystemInfo.endUISystemInfo = function(builder) {
  var offset = builder.endObject();
  return offset;
};

/**
 * @constructor
 */
nd4j.graph.UIGraphStructure = function() {
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
 * @returns {nd4j.graph.UIGraphStructure}
 */
nd4j.graph.UIGraphStructure.prototype.__init = function(i, bb) {
  this.bb_pos = i;
  this.bb = bb;
  return this;
};

/**
 * @param {flatbuffers.ByteBuffer} bb
 * @param {nd4j.graph.UIGraphStructure=} obj
 * @returns {nd4j.graph.UIGraphStructure}
 */
nd4j.graph.UIGraphStructure.getRootAsUIGraphStructure = function(bb, obj) {
  return (obj || new nd4j.graph.UIGraphStructure).__init(bb.readInt32(bb.position()) + bb.position(), bb);
};

/**
 * @param {number} index
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array}
 */
nd4j.graph.UIGraphStructure.prototype.inputs = function(index, optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 4);
  return offset ? this.bb.__string(this.bb.__vector(this.bb_pos + offset) + index * 4, optionalEncoding) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.UIGraphStructure.prototype.inputsLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 4);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {number} index
 * @param {nd4j.graph.IntPair=} obj
 * @returns {nd4j.graph.IntPair}
 */
nd4j.graph.UIGraphStructure.prototype.inputsPair = function(index, obj) {
  var offset = this.bb.__offset(this.bb_pos, 6);
  return offset ? (obj || new nd4j.graph.IntPair).__init(this.bb.__indirect(this.bb.__vector(this.bb_pos + offset) + index * 4), this.bb) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.UIGraphStructure.prototype.inputsPairLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 6);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {number} index
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array}
 */
nd4j.graph.UIGraphStructure.prototype.outputs = function(index, optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 8);
  return offset ? this.bb.__string(this.bb.__vector(this.bb_pos + offset) + index * 4, optionalEncoding) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.UIGraphStructure.prototype.outputsLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 8);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {number} index
 * @param {nd4j.graph.UIVariable=} obj
 * @returns {nd4j.graph.UIVariable}
 */
nd4j.graph.UIGraphStructure.prototype.variables = function(index, obj) {
  var offset = this.bb.__offset(this.bb_pos, 10);
  return offset ? (obj || new nd4j.graph.UIVariable).__init(this.bb.__indirect(this.bb.__vector(this.bb_pos + offset) + index * 4), this.bb) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.UIGraphStructure.prototype.variablesLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 10);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {number} index
 * @param {nd4j.graph.UIOp=} obj
 * @returns {nd4j.graph.UIOp}
 */
nd4j.graph.UIGraphStructure.prototype.ops = function(index, obj) {
  var offset = this.bb.__offset(this.bb_pos, 12);
  return offset ? (obj || new nd4j.graph.UIOp).__init(this.bb.__indirect(this.bb.__vector(this.bb_pos + offset) + index * 4), this.bb) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.UIGraphStructure.prototype.opsLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 12);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {flatbuffers.Builder} builder
 */
nd4j.graph.UIGraphStructure.startUIGraphStructure = function(builder) {
  builder.startObject(5);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} inputsOffset
 */
nd4j.graph.UIGraphStructure.addInputs = function(builder, inputsOffset) {
  builder.addFieldOffset(0, inputsOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UIGraphStructure.createInputsVector = function(builder, data) {
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
nd4j.graph.UIGraphStructure.startInputsVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} inputsPairOffset
 */
nd4j.graph.UIGraphStructure.addInputsPair = function(builder, inputsPairOffset) {
  builder.addFieldOffset(1, inputsPairOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UIGraphStructure.createInputsPairVector = function(builder, data) {
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
nd4j.graph.UIGraphStructure.startInputsPairVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} outputsOffset
 */
nd4j.graph.UIGraphStructure.addOutputs = function(builder, outputsOffset) {
  builder.addFieldOffset(2, outputsOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UIGraphStructure.createOutputsVector = function(builder, data) {
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
nd4j.graph.UIGraphStructure.startOutputsVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} variablesOffset
 */
nd4j.graph.UIGraphStructure.addVariables = function(builder, variablesOffset) {
  builder.addFieldOffset(3, variablesOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UIGraphStructure.createVariablesVector = function(builder, data) {
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
nd4j.graph.UIGraphStructure.startVariablesVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} opsOffset
 */
nd4j.graph.UIGraphStructure.addOps = function(builder, opsOffset) {
  builder.addFieldOffset(4, opsOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UIGraphStructure.createOpsVector = function(builder, data) {
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
nd4j.graph.UIGraphStructure.startOpsVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UIGraphStructure.endUIGraphStructure = function(builder) {
  var offset = builder.endObject();
  return offset;
};

/**
 * @constructor
 */
nd4j.graph.UIVariable = function() {
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
 * @returns {nd4j.graph.UIVariable}
 */
nd4j.graph.UIVariable.prototype.__init = function(i, bb) {
  this.bb_pos = i;
  this.bb = bb;
  return this;
};

/**
 * @param {flatbuffers.ByteBuffer} bb
 * @param {nd4j.graph.UIVariable=} obj
 * @returns {nd4j.graph.UIVariable}
 */
nd4j.graph.UIVariable.getRootAsUIVariable = function(bb, obj) {
  return (obj || new nd4j.graph.UIVariable).__init(bb.readInt32(bb.position()) + bb.position(), bb);
};

/**
 * @param {nd4j.graph.IntPair=} obj
 * @returns {nd4j.graph.IntPair|null}
 */
nd4j.graph.UIVariable.prototype.id = function(obj) {
  var offset = this.bb.__offset(this.bb_pos, 4);
  return offset ? (obj || new nd4j.graph.IntPair).__init(this.bb.__indirect(this.bb_pos + offset), this.bb) : null;
};

/**
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array|null}
 */
nd4j.graph.UIVariable.prototype.name = function(optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 6);
  return offset ? this.bb.__string(this.bb_pos + offset, optionalEncoding) : null;
};

/**
 * @returns {nd4j.graph.VarType}
 */
nd4j.graph.UIVariable.prototype.type = function() {
  var offset = this.bb.__offset(this.bb_pos, 8);
  return offset ? /** @type {nd4j.graph.VarType} */ (this.bb.readInt8(this.bb_pos + offset)) : nd4j.graph.VarType.VARIABLE;
};

/**
 * @returns {nd4j.graph.DataType}
 */
nd4j.graph.UIVariable.prototype.datatype = function() {
  var offset = this.bb.__offset(this.bb_pos, 10);
  return offset ? /** @type {nd4j.graph.DataType} */ (this.bb.readInt8(this.bb_pos + offset)) : nd4j.graph.DataType.INHERIT;
};

/**
 * @param {number} index
 * @returns {flatbuffers.Long}
 */
nd4j.graph.UIVariable.prototype.shape = function(index) {
  var offset = this.bb.__offset(this.bb_pos, 12);
  return offset ? this.bb.readInt64(this.bb.__vector(this.bb_pos + offset) + index * 8) : this.bb.createLong(0, 0);
};

/**
 * @returns {number}
 */
nd4j.graph.UIVariable.prototype.shapeLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 12);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {number} index
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array}
 */
nd4j.graph.UIVariable.prototype.controlDeps = function(index, optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 14);
  return offset ? this.bb.__string(this.bb.__vector(this.bb_pos + offset) + index * 4, optionalEncoding) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.UIVariable.prototype.controlDepsLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 14);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array|null}
 */
nd4j.graph.UIVariable.prototype.outputOfOp = function(optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 16);
  return offset ? this.bb.__string(this.bb_pos + offset, optionalEncoding) : null;
};

/**
 * @param {number} index
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array}
 */
nd4j.graph.UIVariable.prototype.inputsForOp = function(index, optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 18);
  return offset ? this.bb.__string(this.bb.__vector(this.bb_pos + offset) + index * 4, optionalEncoding) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.UIVariable.prototype.inputsForOpLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 18);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {number} index
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array}
 */
nd4j.graph.UIVariable.prototype.controlDepsForOp = function(index, optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 20);
  return offset ? this.bb.__string(this.bb.__vector(this.bb_pos + offset) + index * 4, optionalEncoding) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.UIVariable.prototype.controlDepsForOpLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 20);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {number} index
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array}
 */
nd4j.graph.UIVariable.prototype.controlDepsForVar = function(index, optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 22);
  return offset ? this.bb.__string(this.bb.__vector(this.bb_pos + offset) + index * 4, optionalEncoding) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.UIVariable.prototype.controlDepsForVarLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 22);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array|null}
 */
nd4j.graph.UIVariable.prototype.gradientVariable = function(optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 24);
  return offset ? this.bb.__string(this.bb_pos + offset, optionalEncoding) : null;
};

/**
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array|null}
 */
nd4j.graph.UIVariable.prototype.uiLabelExtra = function(optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 26);
  return offset ? this.bb.__string(this.bb_pos + offset, optionalEncoding) : null;
};

/**
 * @param {nd4j.graph.FlatArray=} obj
 * @returns {nd4j.graph.FlatArray|null}
 */
nd4j.graph.UIVariable.prototype.constantValue = function(obj) {
  var offset = this.bb.__offset(this.bb_pos, 28);
  return offset ? (obj || new nd4j.graph.FlatArray).__init(this.bb.__indirect(this.bb_pos + offset), this.bb) : null;
};

/**
 * @param {flatbuffers.Builder} builder
 */
nd4j.graph.UIVariable.startUIVariable = function(builder) {
  builder.startObject(13);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} idOffset
 */
nd4j.graph.UIVariable.addId = function(builder, idOffset) {
  builder.addFieldOffset(0, idOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} nameOffset
 */
nd4j.graph.UIVariable.addName = function(builder, nameOffset) {
  builder.addFieldOffset(1, nameOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {nd4j.graph.VarType} type
 */
nd4j.graph.UIVariable.addType = function(builder, type) {
  builder.addFieldInt8(2, type, nd4j.graph.VarType.VARIABLE);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {nd4j.graph.DataType} datatype
 */
nd4j.graph.UIVariable.addDatatype = function(builder, datatype) {
  builder.addFieldInt8(3, datatype, nd4j.graph.DataType.INHERIT);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} shapeOffset
 */
nd4j.graph.UIVariable.addShape = function(builder, shapeOffset) {
  builder.addFieldOffset(4, shapeOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Long>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UIVariable.createShapeVector = function(builder, data) {
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
nd4j.graph.UIVariable.startShapeVector = function(builder, numElems) {
  builder.startVector(8, numElems, 8);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} controlDepsOffset
 */
nd4j.graph.UIVariable.addControlDeps = function(builder, controlDepsOffset) {
  builder.addFieldOffset(5, controlDepsOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UIVariable.createControlDepsVector = function(builder, data) {
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
nd4j.graph.UIVariable.startControlDepsVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} outputOfOpOffset
 */
nd4j.graph.UIVariable.addOutputOfOp = function(builder, outputOfOpOffset) {
  builder.addFieldOffset(6, outputOfOpOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} inputsForOpOffset
 */
nd4j.graph.UIVariable.addInputsForOp = function(builder, inputsForOpOffset) {
  builder.addFieldOffset(7, inputsForOpOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UIVariable.createInputsForOpVector = function(builder, data) {
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
nd4j.graph.UIVariable.startInputsForOpVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} controlDepsForOpOffset
 */
nd4j.graph.UIVariable.addControlDepsForOp = function(builder, controlDepsForOpOffset) {
  builder.addFieldOffset(8, controlDepsForOpOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UIVariable.createControlDepsForOpVector = function(builder, data) {
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
nd4j.graph.UIVariable.startControlDepsForOpVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} controlDepsForVarOffset
 */
nd4j.graph.UIVariable.addControlDepsForVar = function(builder, controlDepsForVarOffset) {
  builder.addFieldOffset(9, controlDepsForVarOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UIVariable.createControlDepsForVarVector = function(builder, data) {
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
nd4j.graph.UIVariable.startControlDepsForVarVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} gradientVariableOffset
 */
nd4j.graph.UIVariable.addGradientVariable = function(builder, gradientVariableOffset) {
  builder.addFieldOffset(10, gradientVariableOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} uiLabelExtraOffset
 */
nd4j.graph.UIVariable.addUiLabelExtra = function(builder, uiLabelExtraOffset) {
  builder.addFieldOffset(11, uiLabelExtraOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} constantValueOffset
 */
nd4j.graph.UIVariable.addConstantValue = function(builder, constantValueOffset) {
  builder.addFieldOffset(12, constantValueOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UIVariable.endUIVariable = function(builder) {
  var offset = builder.endObject();
  return offset;
};

/**
 * @constructor
 */
nd4j.graph.UIOp = function() {
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
 * @returns {nd4j.graph.UIOp}
 */
nd4j.graph.UIOp.prototype.__init = function(i, bb) {
  this.bb_pos = i;
  this.bb = bb;
  return this;
};

/**
 * @param {flatbuffers.ByteBuffer} bb
 * @param {nd4j.graph.UIOp=} obj
 * @returns {nd4j.graph.UIOp}
 */
nd4j.graph.UIOp.getRootAsUIOp = function(bb, obj) {
  return (obj || new nd4j.graph.UIOp).__init(bb.readInt32(bb.position()) + bb.position(), bb);
};

/**
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array|null}
 */
nd4j.graph.UIOp.prototype.name = function(optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 4);
  return offset ? this.bb.__string(this.bb_pos + offset, optionalEncoding) : null;
};

/**
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array|null}
 */
nd4j.graph.UIOp.prototype.opName = function(optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 6);
  return offset ? this.bb.__string(this.bb_pos + offset, optionalEncoding) : null;
};

/**
 * @param {number} index
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array}
 */
nd4j.graph.UIOp.prototype.inputs = function(index, optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 8);
  return offset ? this.bb.__string(this.bb.__vector(this.bb_pos + offset) + index * 4, optionalEncoding) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.UIOp.prototype.inputsLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 8);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {number} index
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array}
 */
nd4j.graph.UIOp.prototype.outputs = function(index, optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 10);
  return offset ? this.bb.__string(this.bb.__vector(this.bb_pos + offset) + index * 4, optionalEncoding) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.UIOp.prototype.outputsLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 10);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {number} index
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array}
 */
nd4j.graph.UIOp.prototype.controlDeps = function(index, optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 12);
  return offset ? this.bb.__string(this.bb.__vector(this.bb_pos + offset) + index * 4, optionalEncoding) : null;
};

/**
 * @returns {number}
 */
nd4j.graph.UIOp.prototype.controlDepsLength = function() {
  var offset = this.bb.__offset(this.bb_pos, 12);
  return offset ? this.bb.__vector_len(this.bb_pos + offset) : 0;
};

/**
 * @param {flatbuffers.Encoding=} optionalEncoding
 * @returns {string|Uint8Array|null}
 */
nd4j.graph.UIOp.prototype.uiLabelExtra = function(optionalEncoding) {
  var offset = this.bb.__offset(this.bb_pos, 14);
  return offset ? this.bb.__string(this.bb_pos + offset, optionalEncoding) : null;
};

/**
 * @param {flatbuffers.Builder} builder
 */
nd4j.graph.UIOp.startUIOp = function(builder) {
  builder.startObject(6);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} nameOffset
 */
nd4j.graph.UIOp.addName = function(builder, nameOffset) {
  builder.addFieldOffset(0, nameOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} opNameOffset
 */
nd4j.graph.UIOp.addOpName = function(builder, opNameOffset) {
  builder.addFieldOffset(1, opNameOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} inputsOffset
 */
nd4j.graph.UIOp.addInputs = function(builder, inputsOffset) {
  builder.addFieldOffset(2, inputsOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UIOp.createInputsVector = function(builder, data) {
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
nd4j.graph.UIOp.startInputsVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} outputsOffset
 */
nd4j.graph.UIOp.addOutputs = function(builder, outputsOffset) {
  builder.addFieldOffset(3, outputsOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UIOp.createOutputsVector = function(builder, data) {
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
nd4j.graph.UIOp.startOutputsVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} controlDepsOffset
 */
nd4j.graph.UIOp.addControlDeps = function(builder, controlDepsOffset) {
  builder.addFieldOffset(4, controlDepsOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {Array.<flatbuffers.Offset>} data
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UIOp.createControlDepsVector = function(builder, data) {
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
nd4j.graph.UIOp.startControlDepsVector = function(builder, numElems) {
  builder.startVector(4, numElems, 4);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Offset} uiLabelExtraOffset
 */
nd4j.graph.UIOp.addUiLabelExtra = function(builder, uiLabelExtraOffset) {
  builder.addFieldOffset(5, uiLabelExtraOffset, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.UIOp.endUIOp = function(builder) {
  var offset = builder.endObject();
  return offset;
};

// Exports for Node.js and RequireJS
this.nd4j = nd4j;
