/*
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, B3log Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.b3log.solo.util;


import java.util.TimeZone;
import org.b3log.latke.util.freemarker.Templates;


/**
 * Time zone utilities.
 *
 * @author <a href="http://88250.b3log.org">Liang Ding</a>
 * @version 1.0.0.5, Oct 30, 2013
 */
public final class TimeZones {

    /**
     * Sets time zone by the specified time zone id.
     *
     * <p>
     * This method will call {@linkplain TimeZone#setDefault(java.util.TimeZone)},
     * and set time zone for all date formats and template configuration.
     * </p>
     *
     * @param timeZoneId the specified time zone id
     */
    public static void setTimeZone(final String timeZoneId) {
        final TimeZone timeZone = TimeZone.getTimeZone(timeZoneId);

        TimeZone.setDefault(timeZone);
        System.setProperty("user.timezone", timeZoneId);
        Templates.MAIN_CFG.setTimeZone(timeZone);
        Templates.MOBILE_CFG.setTimeZone(timeZone);
    }

    /**
     * Private default constructor.
     */
    private TimeZones() {}
}
