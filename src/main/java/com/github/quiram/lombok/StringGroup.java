package com.github.quiram.lombok;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Accessors;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

@Value
@Builder
@Accessors(fluent = true)
public class StringGroup {
    List<String> elements;

    public static class StringGroupBuilder {
        List<String> elements = Collections.emptyList();

        public StringGroupBuilder elements(String... strings) {
            return elements(asList(strings));
        }

        public StringGroupBuilder elements(List<String> elements) {
            this.elements = elements;
            return this;
        }
    }
}
