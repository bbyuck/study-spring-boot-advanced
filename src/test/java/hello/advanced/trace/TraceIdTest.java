package hello.advanced.trace;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraceIdTest {

    @Test
    @DisplayName("UUID 아이디 생성")
    void createIdTest() {
        TraceId traceId = new TraceId();

        System.out.println("traceId.getId() = " + traceId.getId());

        Assertions.assertThat(traceId.getId().length()).isEqualTo(8);
    }
}