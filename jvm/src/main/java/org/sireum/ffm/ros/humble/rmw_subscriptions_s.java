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
 * struct rmw_subscriptions_s {
 *     size_t subscriber_count;
 *     void **subscribers;
 * }
 * }
 */
public class rmw_subscriptions_s {

    rmw_subscriptions_s() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        gen_h.C_LONG.withName("subscriber_count"),
        gen_h.C_POINTER.withName("subscribers")
    ).withName("rmw_subscriptions_s");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong subscriber_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("subscriber_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t subscriber_count
     * }
     */
    public static final OfLong subscriber_count$layout() {
        return subscriber_count$LAYOUT;
    }

    private static final long subscriber_count$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t subscriber_count
     * }
     */
    public static final long subscriber_count$offset() {
        return subscriber_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t subscriber_count
     * }
     */
    public static long subscriber_count(MemorySegment struct) {
        return struct.get(subscriber_count$LAYOUT, subscriber_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t subscriber_count
     * }
     */
    public static void subscriber_count(MemorySegment struct, long fieldValue) {
        struct.set(subscriber_count$LAYOUT, subscriber_count$OFFSET, fieldValue);
    }

    private static final AddressLayout subscribers$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("subscribers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void **subscribers
     * }
     */
    public static final AddressLayout subscribers$layout() {
        return subscribers$LAYOUT;
    }

    private static final long subscribers$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void **subscribers
     * }
     */
    public static final long subscribers$offset() {
        return subscribers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void **subscribers
     * }
     */
    public static MemorySegment subscribers(MemorySegment struct) {
        return struct.get(subscribers$LAYOUT, subscribers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void **subscribers
     * }
     */
    public static void subscribers(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(subscribers$LAYOUT, subscribers$OFFSET, fieldValue);
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

