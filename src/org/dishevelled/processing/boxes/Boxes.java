/*

    Boxes library for Processing.
    Copyright (c) 2020 held jointly by the individual authors.

    This file is part of Boxes library for Processing.

    Boxes library for Processing is free software: you can redistribute it and/or
    modify it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Boxes library for Processing is distributed in the hope that it will be
    useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Boxes library for Processing.  If not, see
    <http://www.gnu.org/licenses/>.

*/
package org.dishevelled.processing.boxes;

import processing.core.PApplet;

/**
 * Boxes.
 *
 * @author  Michael Heuer
 */
public final class Boxes
{
    /** Applet for this boxes library. */
    private final PApplet applet;


    /**
     * Create a new boxes library for the specified applet.
     *
     * @param applet applet, must not be null
     */
    public Boxes(final PApplet applet)
    {
        checkNotNull(applet, "applet must not be null");
        this.applet = applet;
    }


    private static void checkNotNull(final Object value, final String message)
    {
        if (value == null)
        {
            throw new NullPointerException(message);
        }
    }
}
