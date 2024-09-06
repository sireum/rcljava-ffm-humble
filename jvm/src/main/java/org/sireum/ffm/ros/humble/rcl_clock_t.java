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
 * typedef struct rcl_clock_s {
 *     rcl_clock_type_t type;
 *     rcl_jump_callback_info_t *jump_callbacks;
 *     size_t num_jump_callbacks;
 *     rcl_ret_t (*get_now)(void *, rcl_time_point_value_t *);
 *     void *data;
 *     rcl_allocator_t allocator;
 * } rcl_clock_t
 * }
 */
public class rcl_clock_t extends rcl_clock_s {

    rcl_clock_t() {
        // Should not be called directly
    }
}

