/**
 * Copyright 2019 Distributed Systems Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package SimBlock.settings;

public class SimulationConfiguration {
public static final int NUM_OF_NODES = 128;

	public static final String TABLE = "SimBlock.node.routingTable.BitcoinCoreTable";

	// Unit: millisecond
public static final long INTERVAL = 1000;

	// Mining power is the number of mining (hash calculation) executed per millisecond.
	public static final int AVERAGE_MINING_POWER = 400000;
	public static final int STDEV_OF_MINING_POWER = 0;

public static final int ENDBLOCKHEIGHT = 400;

	// Unit: byte
public static final long BLOCKSIZE = 535000;
}