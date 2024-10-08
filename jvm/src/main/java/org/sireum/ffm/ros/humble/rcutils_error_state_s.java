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
 * struct rcutils_error_state_s {
 *     char message[768];
 *     char file[229];
 *     uint64_t line_number;
 * }
 * }
 */
public class rcutils_error_state_s {

    rcutils_error_state_s() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(768, gen_h.C_CHAR).withName("message"),
        MemoryLayout.sequenceLayout(229, gen_h.C_CHAR).withName("file"),
        MemoryLayout.paddingLayout(3),
        gen_h.C_LONG.withName("line_number")
    ).withName("rcutils_error_state_s");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout message$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("message"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char message[768]
     * }
     */
    public static final SequenceLayout message$layout() {
        return message$LAYOUT;
    }

    private static final long message$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char message[768]
     * }
     */
    public static final long message$offset() {
        return message$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char message[768]
     * }
     */
    public static MemorySegment message(MemorySegment struct) {
        return struct.asSlice(message$OFFSET, message$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char message[768]
     * }
     */
    public static void message(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, message$OFFSET, message$LAYOUT.byteSize());
    }

    private static long[] message$DIMS = { 768 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char message[768]
     * }
     */
    public static long[] message$dimensions() {
        return message$DIMS;
    }
    private static final VarHandle message$ELEM_HANDLE = message$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char message[768]
     * }
     */
    public static byte message(MemorySegment struct, long index0) {
        return (byte)message$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char message[768]
     * }
     */
    public static void message(MemorySegment struct, long index0, byte fieldValue) {
        message$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout file$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("file"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char file[229]
     * }
     */
    public static final SequenceLayout file$layout() {
        return file$LAYOUT;
    }

    private static final long file$OFFSET = 768;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char file[229]
     * }
     */
    public static final long file$offset() {
        return file$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char file[229]
     * }
     */
    public static MemorySegment file(MemorySegment struct) {
        return struct.asSlice(file$OFFSET, file$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char file[229]
     * }
     */
    public static void file(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, file$OFFSET, file$LAYOUT.byteSize());
    }

    private static long[] file$DIMS = { 229 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char file[229]
     * }
     */
    public static long[] file$dimensions() {
        return file$DIMS;
    }
    private static final VarHandle file$ELEM_HANDLE = file$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char file[229]
     * }
     */
    public static byte file(MemorySegment struct, long index0) {
        return (byte)file$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char file[229]
     * }
     */
    public static void file(MemorySegment struct, long index0, byte fieldValue) {
        file$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfLong line_number$LAYOUT = (OfLong)$LAYOUT.select(groupElement("line_number"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t line_number
     * }
     */
    public static final OfLong line_number$layout() {
        return line_number$LAYOUT;
    }

    private static final long line_number$OFFSET = 1000;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t line_number
     * }
     */
    public static final long line_number$offset() {
        return line_number$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t line_number
     * }
     */
    public static long line_number(MemorySegment struct) {
        return struct.get(line_number$LAYOUT, line_number$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t line_number
     * }
     */
    public static void line_number(MemorySegment struct, long fieldValue) {
        struct.set(line_number$LAYOUT, line_number$OFFSET, fieldValue);
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

