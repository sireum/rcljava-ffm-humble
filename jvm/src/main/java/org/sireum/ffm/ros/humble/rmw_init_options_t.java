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
 * typedef struct rmw_init_options_s {
 *     uint64_t instance_id;
 *     const char *implementation_identifier;
 *     size_t domain_id;
 *     rmw_security_options_t security_options;
 *     rmw_localhost_only_t localhost_only;
 *     char *enclave;
 *     rcutils_allocator_t allocator;
 *     rmw_init_options_impl_t *impl;
 * } rmw_init_options_t
 * }
 */
public class rmw_init_options_t extends rmw_init_options_s {

    rmw_init_options_t() {
        // Should not be called directly
    }
}

