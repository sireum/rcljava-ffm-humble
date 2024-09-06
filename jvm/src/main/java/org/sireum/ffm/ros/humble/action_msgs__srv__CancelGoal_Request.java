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
 * struct action_msgs__srv__CancelGoal_Request {
 *     action_msgs__msg__GoalInfo goal_info;
 * }
 * }
 */
public class action_msgs__srv__CancelGoal_Request {

    action_msgs__srv__CancelGoal_Request() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        action_msgs__msg__GoalInfo.layout().withName("goal_info")
    ).withName("action_msgs__srv__CancelGoal_Request");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout goal_info$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("goal_info"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * action_msgs__msg__GoalInfo goal_info
     * }
     */
    public static final GroupLayout goal_info$layout() {
        return goal_info$LAYOUT;
    }

    private static final long goal_info$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * action_msgs__msg__GoalInfo goal_info
     * }
     */
    public static final long goal_info$offset() {
        return goal_info$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * action_msgs__msg__GoalInfo goal_info
     * }
     */
    public static MemorySegment goal_info(MemorySegment struct) {
        return struct.asSlice(goal_info$OFFSET, goal_info$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * action_msgs__msg__GoalInfo goal_info
     * }
     */
    public static void goal_info(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, goal_info$OFFSET, goal_info$LAYOUT.byteSize());
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

