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
 * typedef struct rcl_action_server_options_s {
 *     rmw_qos_profile_t goal_service_qos;
 *     rmw_qos_profile_t cancel_service_qos;
 *     rmw_qos_profile_t result_service_qos;
 *     rmw_qos_profile_t feedback_topic_qos;
 *     rmw_qos_profile_t status_topic_qos;
 *     rcl_allocator_t allocator;
 *     rcl_duration_t result_timeout;
 * } rcl_action_server_options_t
 * }
 */
public class rcl_action_server_options_t extends rcl_action_server_options_s {

    rcl_action_server_options_t() {
        // Should not be called directly
    }
}

