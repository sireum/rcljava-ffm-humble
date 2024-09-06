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
 * struct lifecycle_msgs__srv__GetAvailableStates_Request {
 *     uint8_t structure_needs_at_least_one_member;
 * }
 * }
 */
public class lifecycle_msgs__srv__GetAvailableStates_Request {

    lifecycle_msgs__srv__GetAvailableStates_Request() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        gen_h.C_CHAR.withName("structure_needs_at_least_one_member")
    ).withName("lifecycle_msgs__srv__GetAvailableStates_Request");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte structure_needs_at_least_one_member$LAYOUT = (OfByte)$LAYOUT.select(groupElement("structure_needs_at_least_one_member"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t structure_needs_at_least_one_member
     * }
     */
    public static final OfByte structure_needs_at_least_one_member$layout() {
        return structure_needs_at_least_one_member$LAYOUT;
    }

    private static final long structure_needs_at_least_one_member$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t structure_needs_at_least_one_member
     * }
     */
    public static final long structure_needs_at_least_one_member$offset() {
        return structure_needs_at_least_one_member$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t structure_needs_at_least_one_member
     * }
     */
    public static byte structure_needs_at_least_one_member(MemorySegment struct) {
        return struct.get(structure_needs_at_least_one_member$LAYOUT, structure_needs_at_least_one_member$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t structure_needs_at_least_one_member
     * }
     */
    public static void structure_needs_at_least_one_member(MemorySegment struct, byte fieldValue) {
        struct.set(structure_needs_at_least_one_member$LAYOUT, structure_needs_at_least_one_member$OFFSET, fieldValue);
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

