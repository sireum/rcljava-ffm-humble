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
 * typedef struct rmw_message_info_s {
 *     rmw_time_point_value_t source_timestamp;
 *     rmw_time_point_value_t received_timestamp;
 *     uint64_t publication_sequence_number;
 *     uint64_t reception_sequence_number;
 *     rmw_gid_t publisher_gid;
 *     bool from_intra_process;
 * } rmw_message_info_t
 * }
 */
public class rmw_message_info_t extends rmw_message_info_s {

    rmw_message_info_t() {
        // Should not be called directly
    }
}

