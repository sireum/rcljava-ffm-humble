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
 * struct rmw_wait_set_s {
 *     const char *implementation_identifier;
 *     rmw_guard_conditions_t *guard_conditions;
 *     void *data;
 * }
 * }
 */
public class rmw_wait_set_s {

    rmw_wait_set_s() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        gen_h.C_POINTER.withName("implementation_identifier"),
        gen_h.C_POINTER.withName("guard_conditions"),
        gen_h.C_POINTER.withName("data")
    ).withName("rmw_wait_set_s");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout implementation_identifier$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("implementation_identifier"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *implementation_identifier
     * }
     */
    public static final AddressLayout implementation_identifier$layout() {
        return implementation_identifier$LAYOUT;
    }

    private static final long implementation_identifier$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *implementation_identifier
     * }
     */
    public static final long implementation_identifier$offset() {
        return implementation_identifier$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *implementation_identifier
     * }
     */
    public static MemorySegment implementation_identifier(MemorySegment struct) {
        return struct.get(implementation_identifier$LAYOUT, implementation_identifier$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *implementation_identifier
     * }
     */
    public static void implementation_identifier(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(implementation_identifier$LAYOUT, implementation_identifier$OFFSET, fieldValue);
    }

    private static final AddressLayout guard_conditions$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("guard_conditions"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rmw_guard_conditions_t *guard_conditions
     * }
     */
    public static final AddressLayout guard_conditions$layout() {
        return guard_conditions$LAYOUT;
    }

    private static final long guard_conditions$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rmw_guard_conditions_t *guard_conditions
     * }
     */
    public static final long guard_conditions$offset() {
        return guard_conditions$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rmw_guard_conditions_t *guard_conditions
     * }
     */
    public static MemorySegment guard_conditions(MemorySegment struct) {
        return struct.get(guard_conditions$LAYOUT, guard_conditions$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rmw_guard_conditions_t *guard_conditions
     * }
     */
    public static void guard_conditions(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(guard_conditions$LAYOUT, guard_conditions$OFFSET, fieldValue);
    }

    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static final long data$offset() {
        return data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, data$OFFSET, fieldValue);
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

