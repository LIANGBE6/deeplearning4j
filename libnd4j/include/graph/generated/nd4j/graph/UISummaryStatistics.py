#  /* ******************************************************************************
#   *
#   *
#   * This program and the accompanying materials are made available under the
#   * terms of the Apache License, Version 2.0 which is available at
#   * https://www.apache.org/licenses/LICENSE-2.0.
#   *
#   *  See the NOTICE file distributed with this work for additional
#   *  information regarding copyright ownership.
#   * Unless required by applicable law or agreed to in writing, software
#   * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
#   * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
#   * License for the specific language governing permissions and limitations
#   * under the License.
#   *
#   * SPDX-License-Identifier: Apache-2.0
#   ******************************************************************************/

import flatbuffers

class UISummaryStatistics(object):
    __slots__ = ['_tab']

    @classmethod
    def GetRootAsUISummaryStatistics(cls, buf, offset):
        n = flatbuffers.encode.Get(flatbuffers.packer.uoffset, buf, offset)
        x = UISummaryStatistics()
        x.Init(buf, n + offset)
        return x

    # UISummaryStatistics
    def Init(self, buf, pos):
        self._tab = flatbuffers.table.Table(buf, pos)

    # UISummaryStatistics
    def Bitmask(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(4))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Uint32Flags, o + self._tab.Pos)
        return 0

    # UISummaryStatistics
    def Min(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(6))
        if o != 0:
            x = self._tab.Indirect(o + self._tab.Pos)
            from .FlatArray import FlatArray
            obj = FlatArray()
            obj.Init(self._tab.Bytes, x)
            return obj
        return None

    # UISummaryStatistics
    def Max(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(8))
        if o != 0:
            x = self._tab.Indirect(o + self._tab.Pos)
            from .FlatArray import FlatArray
            obj = FlatArray()
            obj.Init(self._tab.Bytes, x)
            return obj
        return None

    # UISummaryStatistics
    def Mean(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(10))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Float64Flags, o + self._tab.Pos)
        return 0.0

    # UISummaryStatistics
    def Stdev(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(12))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Float64Flags, o + self._tab.Pos)
        return 0.0

    # UISummaryStatistics
    def Countzero(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(14))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Int64Flags, o + self._tab.Pos)
        return 0

    # UISummaryStatistics
    def Countpositive(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(16))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Int64Flags, o + self._tab.Pos)
        return 0

    # UISummaryStatistics
    def Countnegative(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(18))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Int64Flags, o + self._tab.Pos)
        return 0

    # UISummaryStatistics
    def Countnan(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(20))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Int64Flags, o + self._tab.Pos)
        return 0

    # UISummaryStatistics
    def Countinf(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(22))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Int64Flags, o + self._tab.Pos)
        return 0

def UISummaryStatisticsStart(builder): builder.StartObject(10)
def UISummaryStatisticsAddBitmask(builder, bitmask): builder.PrependUint32Slot(0, bitmask, 0)
def UISummaryStatisticsAddMin(builder, min): builder.PrependUOffsetTRelativeSlot(1, flatbuffers.number_types.UOffsetTFlags.py_type(min), 0)
def UISummaryStatisticsAddMax(builder, max): builder.PrependUOffsetTRelativeSlot(2, flatbuffers.number_types.UOffsetTFlags.py_type(max), 0)
def UISummaryStatisticsAddMean(builder, mean): builder.PrependFloat64Slot(3, mean, 0.0)
def UISummaryStatisticsAddStdev(builder, stdev): builder.PrependFloat64Slot(4, stdev, 0.0)
def UISummaryStatisticsAddCountzero(builder, countzero): builder.PrependInt64Slot(5, countzero, 0)
def UISummaryStatisticsAddCountpositive(builder, countpositive): builder.PrependInt64Slot(6, countpositive, 0)
def UISummaryStatisticsAddCountnegative(builder, countnegative): builder.PrependInt64Slot(7, countnegative, 0)
def UISummaryStatisticsAddCountnan(builder, countnan): builder.PrependInt64Slot(8, countnan, 0)
def UISummaryStatisticsAddCountinf(builder, countinf): builder.PrependInt64Slot(9, countinf, 0)
def UISummaryStatisticsEnd(builder): return builder.EndObject()
