/*
 * Copyright 2011 pivotal.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package demo.pivotal.datasync;

import com.gemstone.gemfire.cache.*;

import java.util.Properties;

/**
 * User: Charlie Black
 */
public class CacheServerListener implements CacheListener<Object,Object>, Declarable {


    /**
     * Handles the event of new key being added to a region. The entry did not
     * previously exist in this region in the local cache (even with a null
     * value).
     *
     * @param event the EntryEvent
     * @see com.gemstone.gemfire.cache.Region#create(Object, Object)
     * @see com.gemstone.gemfire.cache.Region#put(Object, Object)
     * @see com.gemstone.gemfire.cache.Region#get(Object)
     */
    public void afterCreate(EntryEvent<Object,Object> entryEvent) {
    }

    /**
     * Handles the event of an entry's value being modified in a region. This
     * entry previously existed in this region in the local cache, but its
     * previous value may have been null.
     *
     * @param event the EntryEvent
     * @see com.gemstone.gemfire.cache.Region#put(Object, Object)
     */
    public void afterUpdate(EntryEvent<Object,Object> entryEvent) {
    }

    /**
     * Handles the event of an entry's value being invalidated.
     *
     * @param event the EntryEvent
     * @see com.gemstone.gemfire.cache.Region#invalidate(Object)
     */
    public void afterInvalidate(EntryEvent<Object,Object> entryEvent) {

    }

    /**
     * Handles the event of an entry being destroyed.
     *
     * @param event the EntryEvent
     * @see com.gemstone.gemfire.cache.Region#destroy(Object)
     */
    public void afterDestroy(EntryEvent<Object,Object> entryEvent) {
        
    }

    /**
     * Handles the event of a region being invalidated. Events are not invoked for
     * each individual value that is invalidated as a result of the region being
     * invalidated. Each subregion, however, gets its own
     * <code>regionInvalidated</code> event invoked on its listener.
     *
     * @param event the RegionEvent
     * @see com.gemstone.gemfire.cache.Region#invalidateRegion()
     * @see com.gemstone.gemfire.cache.Region#localInvalidateRegion()
     */
    public void afterRegionInvalidate(RegionEvent<Object,Object> regionEvent) {

    }

    /**
     * Handles the event of a region being destroyed. Events are not invoked for
     * each individual entry that is destroyed as a result of the region being
     * destroyed. Each subregion, however, gets its own
     * <code>afterRegionDestroyed</code> event invoked on its listener.
     *
     * @param event the RegionEvent
     * @see com.gemstone.gemfire.cache.Region#destroyRegion()
     * @see com.gemstone.gemfire.cache.Region#localDestroyRegion()
     * @see com.gemstone.gemfire.cache.Region#close
     * @see com.gemstone.gemfire.cache.Cache#close()
     */
    public void afterRegionDestroy(RegionEvent<Object,Object> regionEvent) {

    }

    /**
     * Handles the event of a region being cleared. Events are not invoked for
     * each individual entry that is removed as a result of the region being
     * cleared.
     *
     * @param event the RegionEvent
     * @see com.gemstone.gemfire.cache.Region#clear
     * @since 5.0
     */
    public void afterRegionClear(RegionEvent<Object,Object> regionEvent) {


    }

    /**
     * Handles the event of a region being created. Events are invoked for
     * each individual region that is created.
     * <p>Note that this method is only called
     * for creates done in the local vm. To be notified of creates done in remote
     * vms use {@link com.gemstone.gemfire.cache.RegionMembershipListener#afterRemoteRegionCreate}.
     *
     * @param event the RegionEvent
     * @see com.gemstone.gemfire.cache.Cache#createRegion
     * @see com.gemstone.gemfire.cache.Region#createSubregion
     * @since 5.0
     */
    public void afterRegionCreate(RegionEvent<Object,Object> regionEvent) {

    }

    /**
     * Handles the event of a region being live after receiving the marker from the server.
     *
     * @param event the RegionEvent
     * @see com.gemstone.gemfire.cache.Cache#readyForEvents
     * @since 5.5
     */
    public void afterRegionLive(RegionEvent<Object,Object> regionEvent) {

    }

    /**
     * Called when the region containing this callback is closed or destroyed, when
     * the cache is closed, or when a callback is removed from a region
     * using an <code>AttributesMutator</code>.
     * <p/>
     * <p>Implementations should cleanup any external
     * resources such as database connections. Any runtime exceptions this method
     * throws will be logged.
     * <p/>
     * <p>It is possible for this method to be called multiple times on a single
     * callback instance, so implementations must be tolerant of this.
     *
     * @see com.gemstone.gemfire.cache.Cache#close()
     * @see com.gemstone.gemfire.cache.Region#close
     * @see com.gemstone.gemfire.cache.Region#localDestroyRegion()
     * @see com.gemstone.gemfire.cache.Region#destroyRegion()
     * @see com.gemstone.gemfire.cache.AttributesMutator
     */
    public void close() {

    }

    /**
     * Initializes a user-defined object using the given properties.
     * Note that any uncaught exception thrown by this method will cause
     * the <code>Cache</code> initialization to fail.
     *
     * @param props Contains the parameters declared in the declarative xml
     *              file.
     * @throws IllegalArgumentException If one of the configuration options in <code>props</code>
     *                                  is illegal or malformed.
     */
    public void init(Properties props) {
        String value = props.getProperty("someParameter");
        System.out.println("props.getProperty(\"someParameter\") = " + value);
    }
}


