// Generated by jextract

package org.sireum.ffm.ros.humble;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct rcl_interfaces__msg__ParameterValue {
 *     uint8_t type;
 *     bool bool_value;
 *     int64_t integer_value;
 *     double double_value;
 *     rosidl_runtime_c__String string_value;
 *     rosidl_runtime_c__octet__Sequence byte_array_value;
 *     rosidl_runtime_c__boolean__Sequence bool_array_value;
 *     rosidl_runtime_c__int64__Sequence integer_array_value;
 *     rosidl_runtime_c__double__Sequence double_array_value;
 *     rosidl_runtime_c__String__Sequence string_array_value;
 * }
 * }
 */
public class rcl_interfaces__msg__ParameterValue {

    rcl_interfaces__msg__ParameterValue() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        gen_h.C_CHAR.withName("type"),
        gen_h.C_BOOL.withName("bool_value"),
        MemoryLayout.paddingLayout(6),
        gen_h.C_LONG.withName("integer_value"),
        gen_h.C_DOUBLE.withName("double_value"),
        rosidl_runtime_c__String.layout().withName("string_value"),
        rosidl_runtime_c__octet__Sequence.layout().withName("byte_array_value"),
        rosidl_runtime_c__boolean__Sequence.layout().withName("bool_array_value"),
        rosidl_runtime_c__int64__Sequence.layout().withName("integer_array_value"),
        rosidl_runtime_c__double__Sequence.layout().withName("double_array_value"),
        rosidl_runtime_c__String__Sequence.layout().withName("string_array_value")
    ).withName("rcl_interfaces__msg__ParameterValue");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte type$LAYOUT = (OfByte)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t type
     * }
     */
    public static final OfByte type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t type
     * }
     */
    public static byte type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t type
     * }
     */
    public static void type(MemorySegment struct, byte fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final OfBoolean bool_value$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("bool_value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool bool_value
     * }
     */
    public static final OfBoolean bool_value$layout() {
        return bool_value$LAYOUT;
    }

    private static final long bool_value$OFFSET = 1;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool bool_value
     * }
     */
    public static final long bool_value$offset() {
        return bool_value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool bool_value
     * }
     */
    public static boolean bool_value(MemorySegment struct) {
        return struct.get(bool_value$LAYOUT, bool_value$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool bool_value
     * }
     */
    public static void bool_value(MemorySegment struct, boolean fieldValue) {
        struct.set(bool_value$LAYOUT, bool_value$OFFSET, fieldValue);
    }

    private static final OfLong integer_value$LAYOUT = (OfLong)$LAYOUT.select(groupElement("integer_value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t integer_value
     * }
     */
    public static final OfLong integer_value$layout() {
        return integer_value$LAYOUT;
    }

    private static final long integer_value$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t integer_value
     * }
     */
    public static final long integer_value$offset() {
        return integer_value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t integer_value
     * }
     */
    public static long integer_value(MemorySegment struct) {
        return struct.get(integer_value$LAYOUT, integer_value$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t integer_value
     * }
     */
    public static void integer_value(MemorySegment struct, long fieldValue) {
        struct.set(integer_value$LAYOUT, integer_value$OFFSET, fieldValue);
    }

    private static final OfDouble double_value$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("double_value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double double_value
     * }
     */
    public static final OfDouble double_value$layout() {
        return double_value$LAYOUT;
    }

    private static final long double_value$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double double_value
     * }
     */
    public static final long double_value$offset() {
        return double_value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double double_value
     * }
     */
    public static double double_value(MemorySegment struct) {
        return struct.get(double_value$LAYOUT, double_value$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double double_value
     * }
     */
    public static void double_value(MemorySegment struct, double fieldValue) {
        struct.set(double_value$LAYOUT, double_value$OFFSET, fieldValue);
    }

    private static final GroupLayout string_value$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("string_value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__String string_value
     * }
     */
    public static final GroupLayout string_value$layout() {
        return string_value$LAYOUT;
    }

    private static final long string_value$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__String string_value
     * }
     */
    public static final long string_value$offset() {
        return string_value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__String string_value
     * }
     */
    public static MemorySegment string_value(MemorySegment struct) {
        return struct.asSlice(string_value$OFFSET, string_value$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__String string_value
     * }
     */
    public static void string_value(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, string_value$OFFSET, string_value$LAYOUT.byteSize());
    }

    private static final GroupLayout byte_array_value$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("byte_array_value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__octet__Sequence byte_array_value
     * }
     */
    public static final GroupLayout byte_array_value$layout() {
        return byte_array_value$LAYOUT;
    }

    private static final long byte_array_value$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__octet__Sequence byte_array_value
     * }
     */
    public static final long byte_array_value$offset() {
        return byte_array_value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__octet__Sequence byte_array_value
     * }
     */
    public static MemorySegment byte_array_value(MemorySegment struct) {
        return struct.asSlice(byte_array_value$OFFSET, byte_array_value$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__octet__Sequence byte_array_value
     * }
     */
    public static void byte_array_value(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, byte_array_value$OFFSET, byte_array_value$LAYOUT.byteSize());
    }

    private static final GroupLayout bool_array_value$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("bool_array_value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__boolean__Sequence bool_array_value
     * }
     */
    public static final GroupLayout bool_array_value$layout() {
        return bool_array_value$LAYOUT;
    }

    private static final long bool_array_value$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__boolean__Sequence bool_array_value
     * }
     */
    public static final long bool_array_value$offset() {
        return bool_array_value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__boolean__Sequence bool_array_value
     * }
     */
    public static MemorySegment bool_array_value(MemorySegment struct) {
        return struct.asSlice(bool_array_value$OFFSET, bool_array_value$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__boolean__Sequence bool_array_value
     * }
     */
    public static void bool_array_value(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, bool_array_value$OFFSET, bool_array_value$LAYOUT.byteSize());
    }

    private static final GroupLayout integer_array_value$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("integer_array_value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__int64__Sequence integer_array_value
     * }
     */
    public static final GroupLayout integer_array_value$layout() {
        return integer_array_value$LAYOUT;
    }

    private static final long integer_array_value$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__int64__Sequence integer_array_value
     * }
     */
    public static final long integer_array_value$offset() {
        return integer_array_value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__int64__Sequence integer_array_value
     * }
     */
    public static MemorySegment integer_array_value(MemorySegment struct) {
        return struct.asSlice(integer_array_value$OFFSET, integer_array_value$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__int64__Sequence integer_array_value
     * }
     */
    public static void integer_array_value(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, integer_array_value$OFFSET, integer_array_value$LAYOUT.byteSize());
    }

    private static final GroupLayout double_array_value$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("double_array_value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__double__Sequence double_array_value
     * }
     */
    public static final GroupLayout double_array_value$layout() {
        return double_array_value$LAYOUT;
    }

    private static final long double_array_value$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__double__Sequence double_array_value
     * }
     */
    public static final long double_array_value$offset() {
        return double_array_value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__double__Sequence double_array_value
     * }
     */
    public static MemorySegment double_array_value(MemorySegment struct) {
        return struct.asSlice(double_array_value$OFFSET, double_array_value$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__double__Sequence double_array_value
     * }
     */
    public static void double_array_value(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, double_array_value$OFFSET, double_array_value$LAYOUT.byteSize());
    }

    private static final GroupLayout string_array_value$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("string_array_value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__String__Sequence string_array_value
     * }
     */
    public static final GroupLayout string_array_value$layout() {
        return string_array_value$LAYOUT;
    }

    private static final long string_array_value$OFFSET = 144;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__String__Sequence string_array_value
     * }
     */
    public static final long string_array_value$offset() {
        return string_array_value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__String__Sequence string_array_value
     * }
     */
    public static MemorySegment string_array_value(MemorySegment struct) {
        return struct.asSlice(string_array_value$OFFSET, string_array_value$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rosidl_runtime_c__String__Sequence string_array_value
     * }
     */
    public static void string_array_value(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, string_array_value$OFFSET, string_array_value$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

