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
 * struct rmw_message_info_s {
 *     rmw_time_point_value_t source_timestamp;
 *     rmw_time_point_value_t received_timestamp;
 *     uint64_t publication_sequence_number;
 *     uint64_t reception_sequence_number;
 *     rmw_gid_t publisher_gid;
 *     bool from_intra_process;
 * }
 * }
 */
public class rmw_message_info_s {

    rmw_message_info_s() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        gen_h.C_LONG.withName("source_timestamp"),
        gen_h.C_LONG.withName("received_timestamp"),
        gen_h.C_LONG.withName("publication_sequence_number"),
        gen_h.C_LONG.withName("reception_sequence_number"),
        rmw_gid_s.layout().withName("publisher_gid"),
        gen_h.C_BOOL.withName("from_intra_process"),
        MemoryLayout.paddingLayout(7)
    ).withName("rmw_message_info_s");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong source_timestamp$LAYOUT = (OfLong)$LAYOUT.select(groupElement("source_timestamp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rmw_time_point_value_t source_timestamp
     * }
     */
    public static final OfLong source_timestamp$layout() {
        return source_timestamp$LAYOUT;
    }

    private static final long source_timestamp$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rmw_time_point_value_t source_timestamp
     * }
     */
    public static final long source_timestamp$offset() {
        return source_timestamp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rmw_time_point_value_t source_timestamp
     * }
     */
    public static long source_timestamp(MemorySegment struct) {
        return struct.get(source_timestamp$LAYOUT, source_timestamp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rmw_time_point_value_t source_timestamp
     * }
     */
    public static void source_timestamp(MemorySegment struct, long fieldValue) {
        struct.set(source_timestamp$LAYOUT, source_timestamp$OFFSET, fieldValue);
    }

    private static final OfLong received_timestamp$LAYOUT = (OfLong)$LAYOUT.select(groupElement("received_timestamp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rmw_time_point_value_t received_timestamp
     * }
     */
    public static final OfLong received_timestamp$layout() {
        return received_timestamp$LAYOUT;
    }

    private static final long received_timestamp$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rmw_time_point_value_t received_timestamp
     * }
     */
    public static final long received_timestamp$offset() {
        return received_timestamp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rmw_time_point_value_t received_timestamp
     * }
     */
    public static long received_timestamp(MemorySegment struct) {
        return struct.get(received_timestamp$LAYOUT, received_timestamp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rmw_time_point_value_t received_timestamp
     * }
     */
    public static void received_timestamp(MemorySegment struct, long fieldValue) {
        struct.set(received_timestamp$LAYOUT, received_timestamp$OFFSET, fieldValue);
    }

    private static final OfLong publication_sequence_number$LAYOUT = (OfLong)$LAYOUT.select(groupElement("publication_sequence_number"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t publication_sequence_number
     * }
     */
    public static final OfLong publication_sequence_number$layout() {
        return publication_sequence_number$LAYOUT;
    }

    private static final long publication_sequence_number$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t publication_sequence_number
     * }
     */
    public static final long publication_sequence_number$offset() {
        return publication_sequence_number$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t publication_sequence_number
     * }
     */
    public static long publication_sequence_number(MemorySegment struct) {
        return struct.get(publication_sequence_number$LAYOUT, publication_sequence_number$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t publication_sequence_number
     * }
     */
    public static void publication_sequence_number(MemorySegment struct, long fieldValue) {
        struct.set(publication_sequence_number$LAYOUT, publication_sequence_number$OFFSET, fieldValue);
    }

    private static final OfLong reception_sequence_number$LAYOUT = (OfLong)$LAYOUT.select(groupElement("reception_sequence_number"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t reception_sequence_number
     * }
     */
    public static final OfLong reception_sequence_number$layout() {
        return reception_sequence_number$LAYOUT;
    }

    private static final long reception_sequence_number$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t reception_sequence_number
     * }
     */
    public static final long reception_sequence_number$offset() {
        return reception_sequence_number$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t reception_sequence_number
     * }
     */
    public static long reception_sequence_number(MemorySegment struct) {
        return struct.get(reception_sequence_number$LAYOUT, reception_sequence_number$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t reception_sequence_number
     * }
     */
    public static void reception_sequence_number(MemorySegment struct, long fieldValue) {
        struct.set(reception_sequence_number$LAYOUT, reception_sequence_number$OFFSET, fieldValue);
    }

    private static final GroupLayout publisher_gid$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("publisher_gid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rmw_gid_t publisher_gid
     * }
     */
    public static final GroupLayout publisher_gid$layout() {
        return publisher_gid$LAYOUT;
    }

    private static final long publisher_gid$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rmw_gid_t publisher_gid
     * }
     */
    public static final long publisher_gid$offset() {
        return publisher_gid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rmw_gid_t publisher_gid
     * }
     */
    public static MemorySegment publisher_gid(MemorySegment struct) {
        return struct.asSlice(publisher_gid$OFFSET, publisher_gid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rmw_gid_t publisher_gid
     * }
     */
    public static void publisher_gid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, publisher_gid$OFFSET, publisher_gid$LAYOUT.byteSize());
    }

    private static final OfBoolean from_intra_process$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("from_intra_process"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool from_intra_process
     * }
     */
    public static final OfBoolean from_intra_process$layout() {
        return from_intra_process$LAYOUT;
    }

    private static final long from_intra_process$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool from_intra_process
     * }
     */
    public static final long from_intra_process$offset() {
        return from_intra_process$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool from_intra_process
     * }
     */
    public static boolean from_intra_process(MemorySegment struct) {
        return struct.get(from_intra_process$LAYOUT, from_intra_process$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool from_intra_process
     * }
     */
    public static void from_intra_process(MemorySegment struct, boolean fieldValue) {
        struct.set(from_intra_process$LAYOUT, from_intra_process$OFFSET, fieldValue);
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

