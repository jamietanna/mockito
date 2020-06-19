/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.internal.creation;

import org.mockito.Incubating;

@Incubating
public interface StaticMockControl<T> {

    Class<T> getType();

    void enable();

    void disable();
}
