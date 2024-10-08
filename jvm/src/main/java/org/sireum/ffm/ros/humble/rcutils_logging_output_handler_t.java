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
 * typedef void (*rcutils_logging_output_handler_t)(const rcutils_log_location_t *, int, const char *, rcutils_time_point_value_t, const char *, va_list *)
 * }
 */
public class rcutils_logging_output_handler_t {

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(MemorySegment _x0, int _x1, MemorySegment _x2, long _x3, MemorySegment _x4, MemorySegment _x5);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        gen_h.C_POINTER,
        gen_h.C_INT,
        gen_h.C_POINTER,
        gen_h.C_LONG,
        gen_h.C_POINTER,
        gen_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = gen_h.upcallHandle(rcutils_logging_output_handler_t.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(rcutils_logging_output_handler_t.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, MemorySegment _x2, long _x3, MemorySegment _x4, MemorySegment _x5) {
        try {
             DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4, _x5);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

