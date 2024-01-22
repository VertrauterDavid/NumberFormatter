package net.vertrauterdavid;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Format {

    THOUSAND("k", 1000L, 999999L, 1000L),
    MILLION("M", 1000000L, 999999999L, 1000000L),
    BILLION("B", 1000000000L, 999999999999L, 1000000000L),
    TRILLION("T", 1000000000000L, 999999999999999L, 1000000000000L),
    QUADRILLION("Q", 1000000000000000L, 999999999999999999L, 1000000000000000L);

    private final String format;
    private final long rangeMin;
    private final long rangeMax;
    private final long divide;

}
