/*
 * *
 *  Copyright (C) 2014 Open Whisper Systems
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 * /
 */

package org.anhonesteffort.flock.webdav.caldav;

import com.google.common.base.Optional;

import net.fortuna.ical4j.model.Calendar;
import org.anhonesteffort.flock.webdav.DavComponentCollection;
import org.anhonesteffort.flock.webdav.PropertyParseException;
import org.apache.jackrabbit.webdav.DavException;

import java.io.IOException;
import java.util.List;

/**
 * Programmer: rhodey
 */
public interface DavCalendarCollection extends DavComponentCollection<Calendar> {

  public Optional<String> getDescription() throws PropertyParseException;

  public void setDescription(String description) throws IOException, DavException;

  public Optional<Calendar> getTimeZone() throws PropertyParseException;

  public void setTimeZone(Calendar timezone) throws IOException, DavException;

  public List<String> getSupportedComponentSet() throws PropertyParseException;

  public Optional<Long> getMaxResourceSize() throws PropertyParseException;

  public Optional<String> getMinDateTime() throws PropertyParseException;

  public Optional<String> getMaxDateTime() throws PropertyParseException;

  public Optional<Integer> getMaxInstances() throws PropertyParseException;

  public Optional<Integer> getMaxAttendeesPerInstance() throws PropertyParseException;

  public Optional<Integer> getColor() throws PropertyParseException;

  public void setColor(int color) throws IOException, DavException;

  public Optional<Integer> getOrder() throws PropertyParseException;

  public void setOrder(Integer order) throws IOException, DavException;

}
