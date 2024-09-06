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
 * struct rmw_names_and_types_s {
 *     rcutils_string_array_t names;
 *     rcutils_string_array_t *types;
 * }
 * }
 */
public class rmw_names_and_types_s {

    rmw_names_and_types_s() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        rcutils_string_array_s.layout().withName("names"),
        gen_h.C_POINTER.withName("types")
    ).withName("rmw_names_and_types_s");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout names$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("names"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rcutils_string_array_t names
     * }
     */
    public static final GroupLayout names$layout() {
        return names$LAYOUT;
    }

    private static final long names$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rcutils_string_array_t names
     * }
     */
    public static final long names$offset() {
        return names$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rcutils_string_array_t names
     * }
     */
    public static MemorySegment names(MemorySegment struct) {
        return struct.asSlice(names$OFFSET, names$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rcutils_string_array_t names
     * }
     */
    public static void names(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, names$OFFSET, names$LAYOUT.byteSize());
    }

    private static final AddressLayout types$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("types"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rcutils_string_array_t *types
     * }
     */
    public static final AddressLayout types$layout() {
        return types$LAYOUT;
    }

    private static final long types$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rcutils_string_array_t *types
     * }
     */
    public static final long types$offset() {
        return types$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rcutils_string_array_t *types
     * }
     */
    public static MemorySegment types(MemorySegment struct) {
        return struct.get(types$LAYOUT, types$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rcutils_string_array_t *types
     * }
     */
    public static void types(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(types$LAYOUT, types$OFFSET, fieldValue);
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

