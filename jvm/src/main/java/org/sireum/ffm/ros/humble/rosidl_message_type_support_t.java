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
 * struct rosidl_message_type_support_t {
 *     const char *typesupport_identifier;
 *     const void *data;
 *     rosidl_message_typesupport_handle_function func;
 * }
 * }
 */
public class rosidl_message_type_support_t {

    rosidl_message_type_support_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        gen_h.C_POINTER.withName("typesupport_identifier"),
        gen_h.C_POINTER.withName("data"),
        gen_h.C_POINTER.withName("func")
    ).withName("rosidl_message_type_support_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout typesupport_identifier$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("typesupport_identifier"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *typesupport_identifier
     * }
     */
    public static final AddressLayout typesupport_identifier$layout() {
        return typesupport_identifier$LAYOUT;
    }

    private static final long typesupport_identifier$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *typesupport_identifier
     * }
     */
    public static final long typesupport_identifier$offset() {
        return typesupport_identifier$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *typesupport_identifier
     * }
     */
    public static MemorySegment typesupport_identifier(MemorySegment struct) {
        return struct.get(typesupport_identifier$LAYOUT, typesupport_identifier$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *typesupport_identifier
     * }
     */
    public static void typesupport_identifier(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(typesupport_identifier$LAYOUT, typesupport_identifier$OFFSET, fieldValue);
    }

    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const void *data
     * }
     */
    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const void *data
     * }
     */
    public static final long data$offset() {
        return data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const void *data
     * }
     */
    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const void *data
     * }
     */
    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, data$OFFSET, fieldValue);
    }

    private static final AddressLayout func$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("func"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rosidl_message_typesupport_handle_function func
     * }
     */
    public static final AddressLayout func$layout() {
        return func$LAYOUT;
    }

    private static final long func$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rosidl_message_typesupport_handle_function func
     * }
     */
    public static final long func$offset() {
        return func$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rosidl_message_typesupport_handle_function func
     * }
     */
    public static MemorySegment func(MemorySegment struct) {
        return struct.get(func$LAYOUT, func$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rosidl_message_typesupport_handle_function func
     * }
     */
    public static void func(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(func$LAYOUT, func$OFFSET, fieldValue);
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

