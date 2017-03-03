/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.implementation;

import com.microsoft.azure.management.redis.DayOfWeek;
import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Patch schedule entry for a Premium Redis Cache.
 */
public class ScheduleEntryInner {
    /**
     * Day of the week when a cache can be patched. Possible values include:
     * 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday',
     * 'Sunday', 'Everyday', 'Weekend'.
     */
    @JsonProperty(value = "dayOfWeek", required = true)
    private DayOfWeek dayOfWeek;

    /**
     * Start hour after which cache patching can start.
     */
    @JsonProperty(value = "startHourUtc", required = true)
    private int startHourUtc;

    /**
     * ISO8601 timespan specifying how much time cache patching can take.
     */
    @JsonProperty(value = "maintenanceWindow")
    private Period maintenanceWindow;

    /**
     * Get the dayOfWeek value.
     *
     * @return the dayOfWeek value
     */
    public DayOfWeek dayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * Set the dayOfWeek value.
     *
     * @param dayOfWeek the dayOfWeek value to set
     * @return the ScheduleEntryInner object itself.
     */
    public ScheduleEntryInner withDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * Get the startHourUtc value.
     *
     * @return the startHourUtc value
     */
    public int startHourUtc() {
        return this.startHourUtc;
    }

    /**
     * Set the startHourUtc value.
     *
     * @param startHourUtc the startHourUtc value to set
     * @return the ScheduleEntryInner object itself.
     */
    public ScheduleEntryInner withStartHourUtc(int startHourUtc) {
        this.startHourUtc = startHourUtc;
        return this;
    }

    /**
     * Get the maintenanceWindow value.
     *
     * @return the maintenanceWindow value
     */
    public Period maintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * Set the maintenanceWindow value.
     *
     * @param maintenanceWindow the maintenanceWindow value to set
     * @return the ScheduleEntryInner object itself.
     */
    public ScheduleEntryInner withMaintenanceWindow(Period maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

}
