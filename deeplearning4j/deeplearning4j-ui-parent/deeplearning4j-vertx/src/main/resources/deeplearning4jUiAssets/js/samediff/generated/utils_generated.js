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
nd4j.graph.OpType = {
  TRANSFORM_FLOAT: 0,
  TRANSFORM_SAME: 1,
  TRANSFORM_BOOL: 2,
  TRANSFORM_STRICT: 3,
  TRANSFORM_ANY: 4,
  REDUCE_FLOAT: 5,
  REDUCE_SAME: 6,
  REDUCE_LONG: 7,
  REDUCE_BOOL: 8,
  INDEX_REDUCE: 9,
  SCALAR: 10,
  SCALAR_BOOL: 11,
  BROADCAST: 12,
  BROADCAST_BOOL: 13,
  PAIRWISE: 14,
  PAIRWISE_BOOL: 15,
  REDUCE_3: 16,
  SUMMARYSTATS: 17,
  SHAPE: 18,
  AGGREGATION: 19,
  RANDOM: 20,
  CUSTOM: 21,
  GRAPH: 22,
  VARIABLE: 40,
  BOOLEAN: 60,
  LOGIC: 119
};

/**
 * @enum
 */
nd4j.graph.InputType = {
  UNDEFINED: 0,
  NUMERIC: 1,
  STRINGULAR: 2,
  NUMERIC_SET: 3,
  STRINGULAR_SET: 4
};

/**
 * @enum
 */
nd4j.graph.OpClass = {
  TRANSFORM: 0,
  REDUCTION: 1,
  MULTIPLICATOR: 2,
  GRAPH: 3,
  CONDITIONAL: 4,
  LOOP: 5
};

/**
 * @constructor
 */
nd4j.graph.LongPair = function() {
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
 * @returns {nd4j.graph.LongPair}
 */
nd4j.graph.LongPair.prototype.__init = function(i, bb) {
  this.bb_pos = i;
  this.bb = bb;
  return this;
};

/**
 * @param {flatbuffers.ByteBuffer} bb
 * @param {nd4j.graph.LongPair=} obj
 * @returns {nd4j.graph.LongPair}
 */
nd4j.graph.LongPair.getRootAsLongPair = function(bb, obj) {
  return (obj || new nd4j.graph.LongPair).__init(bb.readInt32(bb.position()) + bb.position(), bb);
};

/**
 * @returns {flatbuffers.Long}
 */
nd4j.graph.LongPair.prototype.first = function() {
  var offset = this.bb.__offset(this.bb_pos, 4);
  return offset ? this.bb.readInt64(this.bb_pos + offset) : this.bb.createLong(0, 0);
};

/**
 * @returns {flatbuffers.Long}
 */
nd4j.graph.LongPair.prototype.second = function() {
  var offset = this.bb.__offset(this.bb_pos, 6);
  return offset ? this.bb.readInt64(this.bb_pos + offset) : this.bb.createLong(0, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 */
nd4j.graph.LongPair.startLongPair = function(builder) {
  builder.startObject(2);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Long} first
 */
nd4j.graph.LongPair.addFirst = function(builder, first) {
  builder.addFieldInt64(0, first, builder.createLong(0, 0));
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Long} second
 */
nd4j.graph.LongPair.addSecond = function(builder, second) {
  builder.addFieldInt64(1, second, builder.createLong(0, 0));
};

/**
 * @param {flatbuffers.Builder} builder
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.LongPair.endLongPair = function(builder) {
  var offset = builder.endObject();
  return offset;
};

/**
 * @constructor
 */
nd4j.graph.LongTriple = function() {
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
 * @returns {nd4j.graph.LongTriple}
 */
nd4j.graph.LongTriple.prototype.__init = function(i, bb) {
  this.bb_pos = i;
  this.bb = bb;
  return this;
};

/**
 * @param {flatbuffers.ByteBuffer} bb
 * @param {nd4j.graph.LongTriple=} obj
 * @returns {nd4j.graph.LongTriple}
 */
nd4j.graph.LongTriple.getRootAsLongTriple = function(bb, obj) {
  return (obj || new nd4j.graph.LongTriple).__init(bb.readInt32(bb.position()) + bb.position(), bb);
};

/**
 * @returns {flatbuffers.Long}
 */
nd4j.graph.LongTriple.prototype.first = function() {
  var offset = this.bb.__offset(this.bb_pos, 4);
  return offset ? this.bb.readInt64(this.bb_pos + offset) : this.bb.createLong(0, 0);
};

/**
 * @returns {flatbuffers.Long}
 */
nd4j.graph.LongTriple.prototype.second = function() {
  var offset = this.bb.__offset(this.bb_pos, 6);
  return offset ? this.bb.readInt64(this.bb_pos + offset) : this.bb.createLong(0, 0);
};

/**
 * @returns {flatbuffers.Long}
 */
nd4j.graph.LongTriple.prototype.third = function() {
  var offset = this.bb.__offset(this.bb_pos, 8);
  return offset ? this.bb.readInt64(this.bb_pos + offset) : this.bb.createLong(0, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 */
nd4j.graph.LongTriple.startLongTriple = function(builder) {
  builder.startObject(3);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Long} first
 */
nd4j.graph.LongTriple.addFirst = function(builder, first) {
  builder.addFieldInt64(0, first, builder.createLong(0, 0));
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Long} second
 */
nd4j.graph.LongTriple.addSecond = function(builder, second) {
  builder.addFieldInt64(1, second, builder.createLong(0, 0));
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {flatbuffers.Long} third
 */
nd4j.graph.LongTriple.addThird = function(builder, third) {
  builder.addFieldInt64(2, third, builder.createLong(0, 0));
};

/**
 * @param {flatbuffers.Builder} builder
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.LongTriple.endLongTriple = function(builder) {
  var offset = builder.endObject();
  return offset;
};

/**
 * @constructor
 */
nd4j.graph.IntPair = function() {
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
 * @returns {nd4j.graph.IntPair}
 */
nd4j.graph.IntPair.prototype.__init = function(i, bb) {
  this.bb_pos = i;
  this.bb = bb;
  return this;
};

/**
 * @param {flatbuffers.ByteBuffer} bb
 * @param {nd4j.graph.IntPair=} obj
 * @returns {nd4j.graph.IntPair}
 */
nd4j.graph.IntPair.getRootAsIntPair = function(bb, obj) {
  return (obj || new nd4j.graph.IntPair).__init(bb.readInt32(bb.position()) + bb.position(), bb);
};

/**
 * @returns {number}
 */
nd4j.graph.IntPair.prototype.first = function() {
  var offset = this.bb.__offset(this.bb_pos, 4);
  return offset ? this.bb.readInt32(this.bb_pos + offset) : 0;
};

/**
 * @returns {number}
 */
nd4j.graph.IntPair.prototype.second = function() {
  var offset = this.bb.__offset(this.bb_pos, 6);
  return offset ? this.bb.readInt32(this.bb_pos + offset) : 0;
};

/**
 * @param {flatbuffers.Builder} builder
 */
nd4j.graph.IntPair.startIntPair = function(builder) {
  builder.startObject(2);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} first
 */
nd4j.graph.IntPair.addFirst = function(builder, first) {
  builder.addFieldInt32(0, first, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} second
 */
nd4j.graph.IntPair.addSecond = function(builder, second) {
  builder.addFieldInt32(1, second, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.IntPair.endIntPair = function(builder) {
  var offset = builder.endObject();
  return offset;
};

/**
 * @constructor
 */
nd4j.graph.IntTriple = function() {
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
 * @returns {nd4j.graph.IntTriple}
 */
nd4j.graph.IntTriple.prototype.__init = function(i, bb) {
  this.bb_pos = i;
  this.bb = bb;
  return this;
};

/**
 * @param {flatbuffers.ByteBuffer} bb
 * @param {nd4j.graph.IntTriple=} obj
 * @returns {nd4j.graph.IntTriple}
 */
nd4j.graph.IntTriple.getRootAsIntTriple = function(bb, obj) {
  return (obj || new nd4j.graph.IntTriple).__init(bb.readInt32(bb.position()) + bb.position(), bb);
};

/**
 * @returns {number}
 */
nd4j.graph.IntTriple.prototype.first = function() {
  var offset = this.bb.__offset(this.bb_pos, 4);
  return offset ? this.bb.readInt32(this.bb_pos + offset) : 0;
};

/**
 * @returns {number}
 */
nd4j.graph.IntTriple.prototype.second = function() {
  var offset = this.bb.__offset(this.bb_pos, 6);
  return offset ? this.bb.readInt32(this.bb_pos + offset) : 0;
};

/**
 * @returns {number}
 */
nd4j.graph.IntTriple.prototype.third = function() {
  var offset = this.bb.__offset(this.bb_pos, 8);
  return offset ? this.bb.readInt32(this.bb_pos + offset) : 0;
};

/**
 * @param {flatbuffers.Builder} builder
 */
nd4j.graph.IntTriple.startIntTriple = function(builder) {
  builder.startObject(3);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} first
 */
nd4j.graph.IntTriple.addFirst = function(builder, first) {
  builder.addFieldInt32(0, first, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} second
 */
nd4j.graph.IntTriple.addSecond = function(builder, second) {
  builder.addFieldInt32(1, second, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @param {number} third
 */
nd4j.graph.IntTriple.addThird = function(builder, third) {
  builder.addFieldInt32(2, third, 0);
};

/**
 * @param {flatbuffers.Builder} builder
 * @returns {flatbuffers.Offset}
 */
nd4j.graph.IntTriple.endIntTriple = function(builder) {
  var offset = builder.endObject();
  return offset;
};

// Exports for Node.js and RequireJS
this.nd4j = nd4j;
