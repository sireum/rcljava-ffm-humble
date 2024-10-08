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
 * typedef struct rcl_wait_set_s {
 *     const rcl_subscription_t **subscriptions;
 *     size_t size_of_subscriptions;
 *     const rcl_guard_condition_t **guard_conditions;
 *     size_t size_of_guard_conditions;
 *     const rcl_timer_t **timers;
 *     size_t size_of_timers;
 *     const rcl_client_t **clients;
 *     size_t size_of_clients;
 *     const rcl_service_t **services;
 *     size_t size_of_services;
 *     const rcl_event_t **events;
 *     size_t size_of_events;
 *     rcl_wait_set_impl_t *impl;
 * } rcl_wait_set_t
 * }
 */
public class rcl_wait_set_t extends rcl_wait_set_s {

    rcl_wait_set_t() {
        // Should not be called directly
    }
}

