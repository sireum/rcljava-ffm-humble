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
 * struct rcl_lifecycle_state_s {
 *     const char *label;
 *     uint8_t id;
 *     rcl_lifecycle_transition_t *valid_transitions;
 *     unsigned int valid_transition_size;
 * }
 * }
 */
public class rcl_lifecycle_state_s {

    rcl_lifecycle_state_s() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        gen_h.C_POINTER.withName("label"),
        gen_h.C_CHAR.withName("id"),
        MemoryLayout.paddingLayout(7),
        gen_h.C_POINTER.withName("valid_transitions"),
        gen_h.C_INT.withName("valid_transition_size"),
        MemoryLayout.paddingLayout(4)
    ).withName("rcl_lifecycle_state_s");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout label$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("label"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *label
     * }
     */
    public static final AddressLayout label$layout() {
        return label$LAYOUT;
    }

    private static final long label$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *label
     * }
     */
    public static final long label$offset() {
        return label$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *label
     * }
     */
    public static MemorySegment label(MemorySegment struct) {
        return struct.get(label$LAYOUT, label$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *label
     * }
     */
    public static void label(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(label$LAYOUT, label$OFFSET, fieldValue);
    }

    private static final OfByte id$LAYOUT = (OfByte)$LAYOUT.select(groupElement("id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t id
     * }
     */
    public static final OfByte id$layout() {
        return id$LAYOUT;
    }

    private static final long id$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t id
     * }
     */
    public static final long id$offset() {
        return id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t id
     * }
     */
    public static byte id(MemorySegment struct) {
        return struct.get(id$LAYOUT, id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t id
     * }
     */
    public static void id(MemorySegment struct, byte fieldValue) {
        struct.set(id$LAYOUT, id$OFFSET, fieldValue);
    }

    private static final AddressLayout valid_transitions$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("valid_transitions"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rcl_lifecycle_transition_t *valid_transitions
     * }
     */
    public static final AddressLayout valid_transitions$layout() {
        return valid_transitions$LAYOUT;
    }

    private static final long valid_transitions$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rcl_lifecycle_transition_t *valid_transitions
     * }
     */
    public static final long valid_transitions$offset() {
        return valid_transitions$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rcl_lifecycle_transition_t *valid_transitions
     * }
     */
    public static MemorySegment valid_transitions(MemorySegment struct) {
        return struct.get(valid_transitions$LAYOUT, valid_transitions$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rcl_lifecycle_transition_t *valid_transitions
     * }
     */
    public static void valid_transitions(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(valid_transitions$LAYOUT, valid_transitions$OFFSET, fieldValue);
    }

    private static final OfInt valid_transition_size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("valid_transition_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int valid_transition_size
     * }
     */
    public static final OfInt valid_transition_size$layout() {
        return valid_transition_size$LAYOUT;
    }

    private static final long valid_transition_size$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int valid_transition_size
     * }
     */
    public static final long valid_transition_size$offset() {
        return valid_transition_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int valid_transition_size
     * }
     */
    public static int valid_transition_size(MemorySegment struct) {
        return struct.get(valid_transition_size$LAYOUT, valid_transition_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int valid_transition_size
     * }
     */
    public static void valid_transition_size(MemorySegment struct, int fieldValue) {
        struct.set(valid_transition_size$LAYOUT, valid_transition_size$OFFSET, fieldValue);
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

