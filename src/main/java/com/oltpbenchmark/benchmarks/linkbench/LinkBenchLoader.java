/******************************************************************************
 *  Copyright 2015 by OLTPBenchmark Project                                   *
 *                                                                            *
 *  Licensed under the Apache License, Version 2.0 (the "License");           *
 *  you may not use this file except in compliance with the License.          *
 *  You may obtain a copy of the License at                                   *
 *                                                                            *
 *    http://www.apache.org/licenses/LICENSE-2.0                              *
 *                                                                            *
 *  Unless required by applicable law or agreed to in writing, software       *
 *  distributed under the License is distributed on an "AS IS" BASIS,         *
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  *
 *  See the License for the specific language governing permissions and       *
 *  limitations under the License.                                            *
 ******************************************************************************/

package com.oltpbenchmark.benchmarks.linkbench;

import com.oltpbenchmark.api.Loader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class LinkBenchLoader extends Loader<LinkBenchBenchmark> {
    private static final Logger LOG = LoggerFactory.getLogger(LinkBenchLoader.class);
    private final int num_record;

    public LinkBenchLoader(LinkBenchBenchmark benchmark, Connection c) {
        super(benchmark, c);
        this.num_record = (int) Math.round(this.scaleFactor - LinkBenchConstants.START_ID + 1);
        if (LOG.isDebugEnabled()) {
            LOG.debug("# of RECORDS:  " + this.num_record);
        }
    }

    @Override
    public List<LoaderThread> createLoaderThreads() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void load() throws SQLException {
        // NEEDS PORTING
        // TODO https://github.com/mdcallag/linkbench/blob/master/src/main/java/com/facebook/LinkBench/LinkBenchLoad.java#L99
    }
}
