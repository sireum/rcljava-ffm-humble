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
 * struct rclc_action_goal_handle_t {
 *     struct rclc_action_goal_handle_t *next;
 *     union {
 *         struct rclc_action_server_t *action_server;
 *         struct rclc_action_client_t *action_client;
 *     };
 *     rcl_action_goal_state_t status;
 *     unique_identifier_msgs__msg__UUID goal_id;
 *     struct Generic_SendGoal_Request *ros_goal_request;
 *     bool available_goal_response;
 *     bool goal_accepted;
 *     bool available_feedback;
 *     bool available_result_response;
 *     bool available_cancel_response;
 *     bool goal_cancelled;
 *     union {
 *         rmw_request_id_t goal_request_header;
 *         int64_t goal_request_sequence_number;
 *     };
 *     union {
 *         rmw_request_id_t result_request_header;
 *         int64_t result_request_sequence_number;
 *     };
 *     union {
 *         rmw_request_id_t cancel_request_header;
 *         int64_t cancel_request_sequence_number;
 *     };
 * }
 * }
 */
public class rclc_action_goal_handle_t {

    rclc_action_goal_handle_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        gen_h.C_POINTER.withName("next"),
        MemoryLayout.unionLayout(
            gen_h.C_POINTER.withName("action_server"),
            gen_h.C_POINTER.withName("action_client")
        ).withName("$anon$32:3"),
        gen_h.C_CHAR.withName("status"),
        unique_identifier_msgs__msg__UUID.layout().withName("goal_id"),
        MemoryLayout.paddingLayout(7),
        gen_h.C_POINTER.withName("ros_goal_request"),
        gen_h.C_BOOL.withName("available_goal_response"),
        gen_h.C_BOOL.withName("goal_accepted"),
        gen_h.C_BOOL.withName("available_feedback"),
        gen_h.C_BOOL.withName("available_result_response"),
        gen_h.C_BOOL.withName("available_cancel_response"),
        gen_h.C_BOOL.withName("goal_cancelled"),
        MemoryLayout.paddingLayout(2),
        MemoryLayout.unionLayout(
            rmw_request_id_s.layout().withName("goal_request_header"),
            gen_h.C_LONG.withName("goal_request_sequence_number")
        ).withName("$anon$50:3"),
        MemoryLayout.unionLayout(
            rmw_request_id_s.layout().withName("result_request_header"),
            gen_h.C_LONG.withName("result_request_sequence_number")
        ).withName("$anon$55:3"),
        MemoryLayout.unionLayout(
            rmw_request_id_s.layout().withName("cancel_request_header"),
            gen_h.C_LONG.withName("cancel_request_sequence_number")
        ).withName("$anon$60:3")
    ).withName("rclc_action_goal_handle_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout next$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("next"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct rclc_action_goal_handle_t *next
     * }
     */
    public static final AddressLayout next$layout() {
        return next$LAYOUT;
    }

    private static final long next$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct rclc_action_goal_handle_t *next
     * }
     */
    public static final long next$offset() {
        return next$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct rclc_action_goal_handle_t *next
     * }
     */
    public static MemorySegment next(MemorySegment struct) {
        return struct.get(next$LAYOUT, next$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct rclc_action_goal_handle_t *next
     * }
     */
    public static void next(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(next$LAYOUT, next$OFFSET, fieldValue);
    }

    private static final AddressLayout action_server$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$32:3"), groupElement("action_server"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct rclc_action_server_t *action_server
     * }
     */
    public static final AddressLayout action_server$layout() {
        return action_server$LAYOUT;
    }

    private static final long action_server$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct rclc_action_server_t *action_server
     * }
     */
    public static final long action_server$offset() {
        return action_server$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct rclc_action_server_t *action_server
     * }
     */
    public static MemorySegment action_server(MemorySegment struct) {
        return struct.get(action_server$LAYOUT, action_server$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct rclc_action_server_t *action_server
     * }
     */
    public static void action_server(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(action_server$LAYOUT, action_server$OFFSET, fieldValue);
    }

    private static final AddressLayout action_client$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$32:3"), groupElement("action_client"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct rclc_action_client_t *action_client
     * }
     */
    public static final AddressLayout action_client$layout() {
        return action_client$LAYOUT;
    }

    private static final long action_client$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct rclc_action_client_t *action_client
     * }
     */
    public static final long action_client$offset() {
        return action_client$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct rclc_action_client_t *action_client
     * }
     */
    public static MemorySegment action_client(MemorySegment struct) {
        return struct.get(action_client$LAYOUT, action_client$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct rclc_action_client_t *action_client
     * }
     */
    public static void action_client(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(action_client$LAYOUT, action_client$OFFSET, fieldValue);
    }

    private static final OfByte status$LAYOUT = (OfByte)$LAYOUT.select(groupElement("status"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rcl_action_goal_state_t status
     * }
     */
    public static final OfByte status$layout() {
        return status$LAYOUT;
    }

    private static final long status$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rcl_action_goal_state_t status
     * }
     */
    public static final long status$offset() {
        return status$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rcl_action_goal_state_t status
     * }
     */
    public static byte status(MemorySegment struct) {
        return struct.get(status$LAYOUT, status$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rcl_action_goal_state_t status
     * }
     */
    public static void status(MemorySegment struct, byte fieldValue) {
        struct.set(status$LAYOUT, status$OFFSET, fieldValue);
    }

    private static final GroupLayout goal_id$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("goal_id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unique_identifier_msgs__msg__UUID goal_id
     * }
     */
    public static final GroupLayout goal_id$layout() {
        return goal_id$LAYOUT;
    }

    private static final long goal_id$OFFSET = 17;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unique_identifier_msgs__msg__UUID goal_id
     * }
     */
    public static final long goal_id$offset() {
        return goal_id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unique_identifier_msgs__msg__UUID goal_id
     * }
     */
    public static MemorySegment goal_id(MemorySegment struct) {
        return struct.asSlice(goal_id$OFFSET, goal_id$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unique_identifier_msgs__msg__UUID goal_id
     * }
     */
    public static void goal_id(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, goal_id$OFFSET, goal_id$LAYOUT.byteSize());
    }

    private static final AddressLayout ros_goal_request$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ros_goal_request"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct Generic_SendGoal_Request *ros_goal_request
     * }
     */
    public static final AddressLayout ros_goal_request$layout() {
        return ros_goal_request$LAYOUT;
    }

    private static final long ros_goal_request$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct Generic_SendGoal_Request *ros_goal_request
     * }
     */
    public static final long ros_goal_request$offset() {
        return ros_goal_request$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct Generic_SendGoal_Request *ros_goal_request
     * }
     */
    public static MemorySegment ros_goal_request(MemorySegment struct) {
        return struct.get(ros_goal_request$LAYOUT, ros_goal_request$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct Generic_SendGoal_Request *ros_goal_request
     * }
     */
    public static void ros_goal_request(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ros_goal_request$LAYOUT, ros_goal_request$OFFSET, fieldValue);
    }

    private static final OfBoolean available_goal_response$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("available_goal_response"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool available_goal_response
     * }
     */
    public static final OfBoolean available_goal_response$layout() {
        return available_goal_response$LAYOUT;
    }

    private static final long available_goal_response$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool available_goal_response
     * }
     */
    public static final long available_goal_response$offset() {
        return available_goal_response$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool available_goal_response
     * }
     */
    public static boolean available_goal_response(MemorySegment struct) {
        return struct.get(available_goal_response$LAYOUT, available_goal_response$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool available_goal_response
     * }
     */
    public static void available_goal_response(MemorySegment struct, boolean fieldValue) {
        struct.set(available_goal_response$LAYOUT, available_goal_response$OFFSET, fieldValue);
    }

    private static final OfBoolean goal_accepted$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("goal_accepted"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool goal_accepted
     * }
     */
    public static final OfBoolean goal_accepted$layout() {
        return goal_accepted$LAYOUT;
    }

    private static final long goal_accepted$OFFSET = 49;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool goal_accepted
     * }
     */
    public static final long goal_accepted$offset() {
        return goal_accepted$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool goal_accepted
     * }
     */
    public static boolean goal_accepted(MemorySegment struct) {
        return struct.get(goal_accepted$LAYOUT, goal_accepted$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool goal_accepted
     * }
     */
    public static void goal_accepted(MemorySegment struct, boolean fieldValue) {
        struct.set(goal_accepted$LAYOUT, goal_accepted$OFFSET, fieldValue);
    }

    private static final OfBoolean available_feedback$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("available_feedback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool available_feedback
     * }
     */
    public static final OfBoolean available_feedback$layout() {
        return available_feedback$LAYOUT;
    }

    private static final long available_feedback$OFFSET = 50;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool available_feedback
     * }
     */
    public static final long available_feedback$offset() {
        return available_feedback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool available_feedback
     * }
     */
    public static boolean available_feedback(MemorySegment struct) {
        return struct.get(available_feedback$LAYOUT, available_feedback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool available_feedback
     * }
     */
    public static void available_feedback(MemorySegment struct, boolean fieldValue) {
        struct.set(available_feedback$LAYOUT, available_feedback$OFFSET, fieldValue);
    }

    private static final OfBoolean available_result_response$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("available_result_response"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool available_result_response
     * }
     */
    public static final OfBoolean available_result_response$layout() {
        return available_result_response$LAYOUT;
    }

    private static final long available_result_response$OFFSET = 51;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool available_result_response
     * }
     */
    public static final long available_result_response$offset() {
        return available_result_response$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool available_result_response
     * }
     */
    public static boolean available_result_response(MemorySegment struct) {
        return struct.get(available_result_response$LAYOUT, available_result_response$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool available_result_response
     * }
     */
    public static void available_result_response(MemorySegment struct, boolean fieldValue) {
        struct.set(available_result_response$LAYOUT, available_result_response$OFFSET, fieldValue);
    }

    private static final OfBoolean available_cancel_response$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("available_cancel_response"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool available_cancel_response
     * }
     */
    public static final OfBoolean available_cancel_response$layout() {
        return available_cancel_response$LAYOUT;
    }

    private static final long available_cancel_response$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool available_cancel_response
     * }
     */
    public static final long available_cancel_response$offset() {
        return available_cancel_response$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool available_cancel_response
     * }
     */
    public static boolean available_cancel_response(MemorySegment struct) {
        return struct.get(available_cancel_response$LAYOUT, available_cancel_response$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool available_cancel_response
     * }
     */
    public static void available_cancel_response(MemorySegment struct, boolean fieldValue) {
        struct.set(available_cancel_response$LAYOUT, available_cancel_response$OFFSET, fieldValue);
    }

    private static final OfBoolean goal_cancelled$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("goal_cancelled"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool goal_cancelled
     * }
     */
    public static final OfBoolean goal_cancelled$layout() {
        return goal_cancelled$LAYOUT;
    }

    private static final long goal_cancelled$OFFSET = 53;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool goal_cancelled
     * }
     */
    public static final long goal_cancelled$offset() {
        return goal_cancelled$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool goal_cancelled
     * }
     */
    public static boolean goal_cancelled(MemorySegment struct) {
        return struct.get(goal_cancelled$LAYOUT, goal_cancelled$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool goal_cancelled
     * }
     */
    public static void goal_cancelled(MemorySegment struct, boolean fieldValue) {
        struct.set(goal_cancelled$LAYOUT, goal_cancelled$OFFSET, fieldValue);
    }

    private static final GroupLayout goal_request_header$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$50:3"), groupElement("goal_request_header"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rmw_request_id_t goal_request_header
     * }
     */
    public static final GroupLayout goal_request_header$layout() {
        return goal_request_header$LAYOUT;
    }

    private static final long goal_request_header$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rmw_request_id_t goal_request_header
     * }
     */
    public static final long goal_request_header$offset() {
        return goal_request_header$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rmw_request_id_t goal_request_header
     * }
     */
    public static MemorySegment goal_request_header(MemorySegment struct) {
        return struct.asSlice(goal_request_header$OFFSET, goal_request_header$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rmw_request_id_t goal_request_header
     * }
     */
    public static void goal_request_header(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, goal_request_header$OFFSET, goal_request_header$LAYOUT.byteSize());
    }

    private static final OfLong goal_request_sequence_number$LAYOUT = (OfLong)$LAYOUT.select(groupElement("$anon$50:3"), groupElement("goal_request_sequence_number"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t goal_request_sequence_number
     * }
     */
    public static final OfLong goal_request_sequence_number$layout() {
        return goal_request_sequence_number$LAYOUT;
    }

    private static final long goal_request_sequence_number$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t goal_request_sequence_number
     * }
     */
    public static final long goal_request_sequence_number$offset() {
        return goal_request_sequence_number$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t goal_request_sequence_number
     * }
     */
    public static long goal_request_sequence_number(MemorySegment struct) {
        return struct.get(goal_request_sequence_number$LAYOUT, goal_request_sequence_number$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t goal_request_sequence_number
     * }
     */
    public static void goal_request_sequence_number(MemorySegment struct, long fieldValue) {
        struct.set(goal_request_sequence_number$LAYOUT, goal_request_sequence_number$OFFSET, fieldValue);
    }

    private static final GroupLayout result_request_header$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$55:3"), groupElement("result_request_header"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rmw_request_id_t result_request_header
     * }
     */
    public static final GroupLayout result_request_header$layout() {
        return result_request_header$LAYOUT;
    }

    private static final long result_request_header$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rmw_request_id_t result_request_header
     * }
     */
    public static final long result_request_header$offset() {
        return result_request_header$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rmw_request_id_t result_request_header
     * }
     */
    public static MemorySegment result_request_header(MemorySegment struct) {
        return struct.asSlice(result_request_header$OFFSET, result_request_header$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rmw_request_id_t result_request_header
     * }
     */
    public static void result_request_header(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, result_request_header$OFFSET, result_request_header$LAYOUT.byteSize());
    }

    private static final OfLong result_request_sequence_number$LAYOUT = (OfLong)$LAYOUT.select(groupElement("$anon$55:3"), groupElement("result_request_sequence_number"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t result_request_sequence_number
     * }
     */
    public static final OfLong result_request_sequence_number$layout() {
        return result_request_sequence_number$LAYOUT;
    }

    private static final long result_request_sequence_number$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t result_request_sequence_number
     * }
     */
    public static final long result_request_sequence_number$offset() {
        return result_request_sequence_number$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t result_request_sequence_number
     * }
     */
    public static long result_request_sequence_number(MemorySegment struct) {
        return struct.get(result_request_sequence_number$LAYOUT, result_request_sequence_number$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t result_request_sequence_number
     * }
     */
    public static void result_request_sequence_number(MemorySegment struct, long fieldValue) {
        struct.set(result_request_sequence_number$LAYOUT, result_request_sequence_number$OFFSET, fieldValue);
    }

    private static final GroupLayout cancel_request_header$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$60:3"), groupElement("cancel_request_header"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rmw_request_id_t cancel_request_header
     * }
     */
    public static final GroupLayout cancel_request_header$layout() {
        return cancel_request_header$LAYOUT;
    }

    private static final long cancel_request_header$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rmw_request_id_t cancel_request_header
     * }
     */
    public static final long cancel_request_header$offset() {
        return cancel_request_header$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rmw_request_id_t cancel_request_header
     * }
     */
    public static MemorySegment cancel_request_header(MemorySegment struct) {
        return struct.asSlice(cancel_request_header$OFFSET, cancel_request_header$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rmw_request_id_t cancel_request_header
     * }
     */
    public static void cancel_request_header(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, cancel_request_header$OFFSET, cancel_request_header$LAYOUT.byteSize());
    }

    private static final OfLong cancel_request_sequence_number$LAYOUT = (OfLong)$LAYOUT.select(groupElement("$anon$60:3"), groupElement("cancel_request_sequence_number"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t cancel_request_sequence_number
     * }
     */
    public static final OfLong cancel_request_sequence_number$layout() {
        return cancel_request_sequence_number$LAYOUT;
    }

    private static final long cancel_request_sequence_number$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t cancel_request_sequence_number
     * }
     */
    public static final long cancel_request_sequence_number$offset() {
        return cancel_request_sequence_number$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t cancel_request_sequence_number
     * }
     */
    public static long cancel_request_sequence_number(MemorySegment struct) {
        return struct.get(cancel_request_sequence_number$LAYOUT, cancel_request_sequence_number$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t cancel_request_sequence_number
     * }
     */
    public static void cancel_request_sequence_number(MemorySegment struct, long fieldValue) {
        struct.set(cancel_request_sequence_number$LAYOUT, cancel_request_sequence_number$OFFSET, fieldValue);
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

