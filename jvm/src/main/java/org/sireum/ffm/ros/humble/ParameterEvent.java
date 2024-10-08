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
 * typedef struct rcl_interfaces__msg__ParameterEvent {
 *     builtin_interfaces__msg__Time stamp;
 *     rosidl_runtime_c__String node;
 *     rcl_interfaces__msg__Parameter__Sequence new_parameters;
 *     rcl_interfaces__msg__Parameter__Sequence changed_parameters;
 *     rcl_interfaces__msg__Parameter__Sequence deleted_parameters;
 * } ParameterEvent
 * }
 */
public class ParameterEvent extends rcl_interfaces__msg__ParameterEvent {

    ParameterEvent() {
        // Should not be called directly
    }
}

