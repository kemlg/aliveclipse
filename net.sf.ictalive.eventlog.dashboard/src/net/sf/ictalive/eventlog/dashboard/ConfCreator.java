package net.sf.ictalive.eventlog.dashboard;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConfCreator
{
	public static String createStorageConf(String baseDir) throws IOException
	{
		FileOutputStream	fos;
		File				f;
		
		f = new File(baseDir + File.separator + "conf");
		f.mkdirs();
		
		f = new File(baseDir + File.separator + "conf" + File.separator + "storage-conf.xml");
		f.delete();
		f.createNewFile();
		fos = new FileOutputStream(f);
		fos.write(contentsStorageConf.replace("$dir$", baseDir).getBytes());
		fos.close();
		
		f = new File(baseDir + File.separator + "conf" + File.separator + "log4j.properties");
		f.delete();
		f.createNewFile();
		fos = new FileOutputStream(f);
		fos.write(contentsLog4j.getBytes());
		fos.close();
		
		return baseDir + File.separator + "conf";
	}
	
	private final static String	contentsStorageConf = "<!--\n" + 
			" ~ Licensed to the Apache Software Foundation (ASF) under one\n" + 
			" ~ or more contributor license agreements.  See the NOTICE file\n" + 
			" ~ distributed with this work for additional information\n" + 
			" ~ regarding copyright ownership.  The ASF licenses this file\n" + 
			" ~ to you under the Apache License, Version 2.0 (the\n" + 
			" ~ \"License\"); you may not use this file except in compliance\n" + 
			" ~ with the License.  You may obtain a copy of the License at\n" + 
			" ~\n" + 
			" ~    http://www.apache.org/licenses/LICENSE-2.0\n" + 
			" ~\n" + 
			" ~ Unless required by applicable law or agreed to in writing,\n" + 
			" ~ software distributed under the License is distributed on an\n" + 
			" ~ \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY\n" + 
			" ~ KIND, either express or implied.  See the License for the\n" + 
			" ~ specific language governing permissions and limitations\n" + 
			" ~ under the License.\n" + 
			"-->\n" + 
			"<Storage>\n" + 
			"  <!--======================================================================-->\n" + 
			"  <!-- Basic Configuration                                                  -->\n" + 
			"  <!--======================================================================-->\n" + 
			"\n" + 
			"  <!-- \n" + 
			"   ~ The name of this cluster.  This is mainly used to prevent machines in\n" + 
			"   ~ one logical cluster from joining another.\n" + 
			"  -->\n" + 
			"  <ClusterName>Test Cluster</ClusterName>\n" + 
			"\n" + 
			"  <!--\n" + 
			"   ~ Turn on to make new [non-seed] nodes automatically migrate the right data \n" + 
			"   ~ to themselves.  (If no InitialToken is specified, they will pick one \n" + 
			"   ~ such that they will get half the range of the most-loaded node.)\n" + 
			"   ~ If a node starts up without bootstrapping, it will mark itself bootstrapped\n" + 
			"   ~ so that you can't subsequently accidently bootstrap a node with\n" + 
			"   ~ data on it.  (You can reset this by wiping your data and commitlog\n" + 
			"   ~ directories.)\n" + 
			"   ~\n" + 
			"   ~ Off by default so that new clusters and upgraders from 0.4 don't\n" + 
			"   ~ bootstrap immediately.  You should turn this on when you start adding\n" + 
			"   ~ new nodes to a cluster that already has data on it.  (If you are upgrading\n" + 
			"   ~ from 0.4, start your cluster with it off once before changing it to true.\n" + 
			"   ~ Otherwise, no data will be lost but you will incur a lot of unnecessary\n" + 
			"   ~ I/O before your cluster starts up.)\n" + 
			"  -->\n" + 
			"  <AutoBootstrap>false</AutoBootstrap>\n" + 
			"\n" + 
			"  <!--\n" + 
			"   ~ Keyspaces and ColumnFamilies:\n" + 
			"   ~ A ColumnFamily is the Cassandra concept closest to a relational\n" + 
			"   ~ table.  Keyspaces are separate groups of ColumnFamilies.  Except in\n" + 
			"   ~ very unusual circumstances you will have one Keyspace per application.\n" + 
			"\n" + 
			"   ~ There is an implicit keyspace named 'system' for Cassandra internals.\n" + 
			"  -->\n" + 
			"  <Keyspaces>\n" + 
			"    <Keyspace Name=\"RDF\">\n" + 
			"      <ColumnFamily Name=\"Resources\"\n" + 
			"                    ColumnType=\"Super\"\n" + 
			"                    CompareWith=\"UTF8Type\"\n" + 
			"                    CompareSubcolumnsWith=\"BytesType\"\n" + 
			"                    Comment=\"RDF data.\"/>\n" + 
			"      <ReplicaPlacementStrategy>org.apache.cassandra.locator.RackUnawareStrategy</ReplicaPlacementStrategy>\n" + 
			"\n" + 
			"      <!-- Number of replicas of the data -->\n" + 
			"      <ReplicationFactor>1</ReplicationFactor>\n" + 
			"\n" + 
			"      <!--\n" + 
			"       ~ EndPointSnitch: Setting this to the class that implements\n" + 
			"       ~ AbstractEndpointSnitch, which lets Cassandra know enough\n" + 
			"       ~ about your network topology to route requests efficiently.\n" + 
			"       ~ Out of the box, Cassandra provides org.apache.cassandra.locator.EndPointSnitch,\n" + 
			"       ~ and PropertyFileEndPointSnitch is available in contrib/.\n" + 
			"      -->\n" + 
			"      <EndPointSnitch>org.apache.cassandra.locator.EndPointSnitch</EndPointSnitch>\n" + 
			"    </Keyspace>\n" + 
			"    <Keyspace Name=\"Keyspace1\">\n" + 
			"      <!--\n" + 
			"       ~ ColumnFamily definitions have one required attribute (Name)\n" + 
			"       ~ and several optional ones.\n" + 
			"       ~\n" + 
			"       ~ The CompareWith attribute tells Cassandra how to sort the columns\n" + 
			"       ~ for slicing operations.  The default is BytesType, which is a\n" + 
			"       ~ straightforward lexical comparison of the bytes in each column.\n" + 
			"       ~ Other options are AsciiType, UTF8Type, LexicalUUIDType, TimeUUIDType,\n" + 
			"       ~ and LongType.  You can also specify the fully-qualified class\n" + 
			"       ~ name to a class of your choice extending\n" + 
			"       ~ org.apache.cassandra.db.marshal.AbstractType.\n" + 
			"       ~ \n" + 
			"       ~ SuperColumns have a similar CompareSubcolumnsWith attribute.\n" + 
			"       ~ \n" + 
			"       ~ BytesType: Simple sort by byte value.  No validation is performed.\n" + 
			"       ~ AsciiType: Like BytesType, but validates that the input can be \n" + 
			"       ~            parsed as US-ASCII.\n" + 
			"       ~ UTF8Type: A string encoded as UTF8\n" + 
			"       ~ LongType: A 64bit long\n" + 
			"       ~ LexicalUUIDType: A 128bit UUID, compared lexically (by byte value)\n" + 
			"       ~ TimeUUIDType: a 128bit version 1 UUID, compared by timestamp\n" + 
			"       ~\n" + 
			"       ~ (To get the closest approximation to 0.3-style supercolumns, you\n" + 
			"       ~ would use CompareWith=UTF8Type CompareSubcolumnsWith=LongType.)\n" + 
			"       ~\n" + 
			"       ~ An optional `Comment` attribute may be used to attach additional\n" + 
			"       ~ human-readable information about the column family to its definition.\n" + 
			"       ~ \n" + 
			"       ~ The optional KeysCached attribute specifies\n" + 
			"       ~ the number of keys per sstable whose locations we keep in\n" + 
			"       ~ memory in \"mostly LRU\" order.  (JUST the key locations, NOT any\n" + 
			"       ~ column values.) Specify a fraction (value less than 1), a percentage\n" + 
			"       ~ (ending in a % sign) or an absolute number of keys to cache.\n" + 
			"       ~ KeysCached defaults to 200000 keys.\n" + 
			"       ~\n" + 
			"       ~ The optional RowsCached attribute specifies the number of rows\n" + 
			"       ~ whose entire contents we cache in memory. Do not use this on\n" + 
			"       ~ ColumnFamilies with large rows, or ColumnFamilies with high write:read\n" + 
			"       ~ ratios. Specify a fraction (value less than 1), a percentage (ending in\n" + 
			"       ~ a % sign) or an absolute number of rows to cache. \n" + 
			"       ~ RowsCached defaults to 0, i.e., row cache is off by default.\n" + 
			"       ~\n" + 
			"       ~ Remember, when using caches as a percentage, they WILL grow with\n" + 
			"       ~ your data set!\n" + 
			"      -->\n" + 
			"      <ColumnFamily Name=\"Standard1\" CompareWith=\"BytesType\"/>\n" + 
			"      <ColumnFamily Name=\"Standard2\" \n" + 
			"                    CompareWith=\"UTF8Type\"\n" + 
			"                    KeysCached=\"100%\"/>\n" + 
			"      <ColumnFamily Name=\"StandardByUUID1\" CompareWith=\"TimeUUIDType\" />\n" + 
			"      <ColumnFamily Name=\"Super1\"\n" + 
			"                    ColumnType=\"Super\"\n" + 
			"                    CompareWith=\"BytesType\"\n" + 
			"                    CompareSubcolumnsWith=\"BytesType\" />\n" + 
			"      <ColumnFamily Name=\"Super2\"\n" + 
			"                    ColumnType=\"Super\"\n" + 
			"                    CompareWith=\"UTF8Type\"\n" + 
			"                    CompareSubcolumnsWith=\"UTF8Type\"\n" + 
			"                    RowsCached=\"10000\"\n" + 
			"                    KeysCached=\"50%\"\n" + 
			"                    Comment=\"A column family with supercolumns, whose column and subcolumn names are UTF8 strings\"/>\n" + 
			"\n" + 
			"      <!--\n" + 
			"       ~ Strategy: Setting this to the class that implements\n" + 
			"       ~ IReplicaPlacementStrategy will change the way the node picker works.\n" + 
			"       ~ Out of the box, Cassandra provides\n" + 
			"       ~ org.apache.cassandra.locator.RackUnawareStrategy and\n" + 
			"       ~ org.apache.cassandra.locator.RackAwareStrategy (place one replica in\n" + 
			"       ~ a different datacenter, and the others on different racks in the same\n" + 
			"       ~ one.)\n" + 
			"      -->\n" + 
			"      <ReplicaPlacementStrategy>org.apache.cassandra.locator.RackUnawareStrategy</ReplicaPlacementStrategy>\n" + 
			"\n" + 
			"      <!-- Number of replicas of the data -->\n" + 
			"      <ReplicationFactor>1</ReplicationFactor>\n" + 
			"\n" + 
			"      <!--\n" + 
			"       ~ EndPointSnitch: Setting this to the class that implements\n" + 
			"       ~ AbstractEndpointSnitch, which lets Cassandra know enough\n" + 
			"       ~ about your network topology to route requests efficiently.\n" + 
			"       ~ Out of the box, Cassandra provides org.apache.cassandra.locator.EndPointSnitch,\n" + 
			"       ~ and PropertyFileEndPointSnitch is available in contrib/.\n" + 
			"      -->\n" + 
			"      <EndPointSnitch>org.apache.cassandra.locator.EndPointSnitch</EndPointSnitch>\n" + 
			"        \n" + 
			"    </Keyspace>\n" + 
			"    <Keyspace Name=\"EventLog\">\n" + 
			"      <ColumnFamily Name=\"Asserters\" ColumnType=\"Super\" CompareSubcolumnsWith=\"UTF8Type\"/>\n" + 
			"      <ColumnFamily Name=\"FactTypes\" ColumnType=\"Super\" CompareSubcolumnsWith=\"UTF8Type\"/>\n" + 
			"      <ColumnFamily Name=\"Roles\" ColumnType=\"Super\" CompareSubcolumnsWith=\"UTF8Type\"/>\n" + 
			"      <ColumnFamily Name=\"Objectives\" ColumnType=\"Super\" CompareSubcolumnsWith=\"UTF8Type\"/>\n" + 
			"      <ColumnFamily Name=\"Landmarks\" ColumnType=\"Super\" CompareSubcolumnsWith=\"UTF8Type\"/>\n" + 
			"      <ColumnFamily Name=\"Norms\" ColumnType=\"Super\" CompareSubcolumnsWith=\"UTF8Type\"/>\n" + 
			"      <ColumnFamily Name=\"Actors\" ColumnType=\"Super\" CompareSubcolumnsWith=\"UTF8Type\"/>\n" + 
			"      <ColumnFamily Name=\"NormInstances\" ColumnType=\"Super\" CompareSubcolumnsWith=\"UTF8Type\"/>\n" + 
			"      <ColumnFamily Name=\"Tasks\" ColumnType=\"Super\" CompareSubcolumnsWith=\"UTF8Type\"/>\n" + 
			"      <ColumnFamily Name=\"Events\" CompareWith=\"UTF8Type\"/>\n" + 
			"      <ReplicaPlacementStrategy>org.apache.cassandra.locator.RackUnawareStrategy</ReplicaPlacementStrategy>\n" + 
			"      <ReplicationFactor>1</ReplicationFactor>\n" + 
			"      <EndPointSnitch>org.apache.cassandra.locator.EndPointSnitch</EndPointSnitch>\n" + 
			"    </Keyspace>\n" + 
			"  </Keyspaces>\n" + 
			"\n" + 
			"  <!--\n" + 
			"   ~ Authenticator: any IAuthenticator may be used, including your own as long\n" + 
			"   ~ as it is on the classpath.  Out of the box, Cassandra provides\n" + 
			"   ~ org.apache.cassandra.auth.AllowAllAuthenticator and,\n" + 
			"   ~ org.apache.cassandra.auth.SimpleAuthenticator \n" + 
			"   ~ (SimpleAuthenticator uses access.properties and passwd.properties by\n" + 
			"   ~ default).\n" + 
			"   ~\n" + 
			"   ~ If you don't specify an authenticator, AllowAllAuthenticator is used.\n" + 
			"  -->\n" + 
			"  <Authenticator>org.apache.cassandra.auth.AllowAllAuthenticator</Authenticator>\n" + 
			"\n" + 
			"  <!--\n" + 
			"   ~ Partitioner: any IPartitioner may be used, including your own as long\n" + 
			"   ~ as it is on the classpath.  Out of the box, Cassandra provides\n" + 
			"   ~ org.apache.cassandra.dht.RandomPartitioner,\n" + 
			"   ~ org.apache.cassandra.dht.OrderPreservingPartitioner, and\n" + 
			"   ~ org.apache.cassandra.dht.CollatingOrderPreservingPartitioner.\n" + 
			"   ~ (CollatingOPP colates according to EN,US rules, not naive byte\n" + 
			"   ~ ordering.  Use this as an example if you need locale-aware collation.)\n" + 
			"   ~ Range queries require using an order-preserving partitioner.\n" + 
			"   ~\n" + 
			"   ~ Achtung!  Changing this parameter requires wiping your data\n" + 
			"   ~ directories, since the partitioner can modify the sstable on-disk\n" + 
			"   ~ format.\n" + 
			"  -->\n" + 
			"  <Partitioner>org.apache.cassandra.dht.RandomPartitioner</Partitioner>\n" + 
			"\n" + 
			"  <!--\n" + 
			"   ~ If you are using an order-preserving partitioner and you know your key\n" + 
			"   ~ distribution, you can specify the token for this node to use. (Keys\n" + 
			"   ~ are sent to the node with the \"closest\" token, so distributing your\n" + 
			"   ~ tokens equally along the key distribution space will spread keys\n" + 
			"   ~ evenly across your cluster.)  This setting is only checked the first\n" + 
			"   ~ time a node is started. \n" + 
			"\n" + 
			"   ~ This can also be useful with RandomPartitioner to force equal spacing\n" + 
			"   ~ of tokens around the hash space, especially for clusters with a small\n" + 
			"   ~ number of nodes.\n" + 
			"  -->\n" + 
			"  <InitialToken></InitialToken>\n" + 
			"\n" + 
			"  <!--\n" + 
			"   ~ Directories: Specify where Cassandra should store different data on\n" + 
			"   ~ disk.  Keep the data disks and the CommitLog disks separate for best\n" + 
			"   ~ performance\n" + 
			"  -->\n" + 
			"  <CommitLogDirectory>$dir$/commitlog</CommitLogDirectory>\n" + 
			"  <DataFileDirectories>\n" + 
			"      <DataFileDirectory>$dir$/data</DataFileDirectory>\n" + 
			"  </DataFileDirectories>\n" + 
			"\n" + 
			"\n" + 
			"  <!--\n" + 
			"   ~ Addresses of hosts that are deemed contact points. Cassandra nodes\n" + 
			"   ~ use this list of hosts to find each other and learn the topology of\n" + 
			"   ~ the ring. You must change this if you are running multiple nodes!\n" + 
			"  -->\n" + 
			"  <Seeds>\n" + 
			"      <Seed>127.0.0.1</Seed>\n" + 
			"  </Seeds>\n" + 
			"\n" + 
			"\n" + 
			"  <!-- Miscellaneous -->\n" + 
			"\n" + 
			"  <!-- Time to wait for a reply from other nodes before failing the command -->\n" + 
			"  <RpcTimeoutInMillis>10000</RpcTimeoutInMillis>\n" + 
			"  <!-- Size to allow commitlog to grow to before creating a new segment -->\n" + 
			"  <CommitLogRotationThresholdInMB>128</CommitLogRotationThresholdInMB>\n" + 
			"\n" + 
			"\n" + 
			"  <!-- Local hosts and ports -->\n" + 
			"\n" + 
			"  <!-- \n" + 
			"   ~ Address to bind to and tell other nodes to connect to.  You _must_\n" + 
			"   ~ change this if you want multiple nodes to be able to communicate!  \n" + 
			"   ~\n" + 
			"   ~ Leaving it blank leaves it up to InetAddress.getLocalHost(). This\n" + 
			"   ~ will always do the Right Thing *if* the node is properly configured\n" + 
			"   ~ (hostname, name resolution, etc), and the Right Thing is to use the\n" + 
			"   ~ address associated with the hostname (it might not be).\n" + 
			"  -->\n" + 
			"  <ListenAddress>127.0.0.1</ListenAddress>\n" + 
			"  <!-- internal communications port -->\n" + 
			"  <StoragePort>7000</StoragePort>\n" + 
			"\n" + 
			"  <!--\n" + 
			"   ~ The address to bind the Thrift RPC service to. Unlike ListenAddress\n" + 
			"   ~ above, you *can* specify 0.0.0.0 here if you want Thrift to listen on\n" + 
			"   ~ all interfaces.\n" + 
			"   ~\n" + 
			"   ~ Leaving this blank has the same effect it does for ListenAddress,\n" + 
			"   ~ (i.e. it will be based on the configured hostname of the node).\n" + 
			"  -->\n" + 
			"  <ThriftAddress>127.0.0.1</ThriftAddress>\n" + 
			"  <!-- Thrift RPC port (the port clients connect to). -->\n" + 
			"  <ThriftPort>9160</ThriftPort>\n" + 
			"  <!-- \n" + 
			"   ~ Whether or not to use a framed transport for Thrift. If this option\n" + 
			"   ~ is set to true then you must also use a framed transport on the \n" + 
			"   ~ client-side, (framed and non-framed transports are not compatible).\n" + 
			"  -->\n" + 
			"  <ThriftFramedTransport>false</ThriftFramedTransport>\n" + 
			"\n" + 
			"\n" + 
			"  <!--======================================================================-->\n" + 
			"  <!-- Memory, Disk, and Performance                                        -->\n" + 
			"  <!--======================================================================-->\n" + 
			"\n" + 
			"  <!--\n" + 
			"   ~ Access mode.  mmapped i/o is substantially faster, but only practical on\n" + 
			"   ~ a 64bit machine (which notably does not include EC2 \"small\" instances)\n" + 
			"   ~ or relatively small datasets.  \"auto\", the safe choice, will enable\n" + 
			"   ~ mmapping on a 64bit JVM.  Other values are \"mmap\", \"mmap_index_only\"\n" + 
			"   ~ (which may allow you to get part of the benefits of mmap on a 32bit\n" + 
			"   ~ machine by mmapping only index files) and \"standard\".\n" + 
			"   ~ (The buffer size settings that follow only apply to standard,\n" + 
			"   ~ non-mmapped i/o.)\n" + 
			"   -->\n" + 
			"  <DiskAccessMode>auto</DiskAccessMode>\n" + 
			"\n" + 
			"  <!--\n" + 
			"   ~ Size of compacted row above which to log a warning.  (If compacted\n" + 
			"   ~ rows do not fit in memory, Cassandra will crash.  This is explained\n" + 
			"   ~ in http://wiki.apache.org/cassandra/CassandraLimitations and is\n" + 
			"   ~ scheduled to be fixed in 0.7.)\n" + 
			"  -->\n" + 
			"  <RowWarningThresholdInMB>512</RowWarningThresholdInMB>\n" + 
			"\n" + 
			"  <!--\n" + 
			"   ~ Buffer size to use when performing contiguous column slices. Increase\n" + 
			"   ~ this to the size of the column slices you typically perform. \n" + 
			"   ~ (Name-based queries are performed with a buffer size of \n" + 
			"   ~ ColumnIndexSizeInKB.)\n" + 
			"  -->\n" + 
			"  <SlicedBufferSizeInKB>64</SlicedBufferSizeInKB>\n" + 
			"\n" + 
			"  <!--\n" + 
			"   ~ Buffer size to use when flushing memtables to disk. (Only one \n" + 
			"   ~ memtable is ever flushed at a time.) Increase (decrease) the index\n" + 
			"   ~ buffer size relative to the data buffer if you have few (many) \n" + 
			"   ~ columns per key.  Bigger is only better _if_ your memtables get large\n" + 
			"   ~ enough to use the space. (Check in your data directory after your\n" + 
			"   ~ app has been running long enough.) -->\n" + 
			"  <FlushDataBufferSizeInMB>32</FlushDataBufferSizeInMB>\n" + 
			"  <FlushIndexBufferSizeInMB>8</FlushIndexBufferSizeInMB>\n" + 
			"\n" + 
			"  <!--\n" + 
			"   ~ Add column indexes to a row after its contents reach this size.\n" + 
			"   ~ Increase if your column values are large, or if you have a very large\n" + 
			"   ~ number of columns.  The competing causes are, Cassandra has to\n" + 
			"   ~ deserialize this much of the row to read a single column, so you want\n" + 
			"   ~ it to be small - at least if you do many partial-row reads - but all\n" + 
			"   ~ the index data is read for each access, so you don't want to generate\n" + 
			"   ~ that wastefully either.\n" + 
			"  -->\n" + 
			"  <ColumnIndexSizeInKB>64</ColumnIndexSizeInKB>\n" + 
			"\n" + 
			"  <!--\n" + 
			"   ~ Flush memtable after this much data has been inserted, including\n" + 
			"   ~ overwritten data.  There is one memtable per column family, and \n" + 
			"   ~ this threshold is based solely on the amount of data stored, not\n" + 
			"   ~ actual heap memory usage (there is some overhead in indexing the\n" + 
			"   ~ columns).\n" + 
			"  -->\n" + 
			"  <MemtableThroughputInMB>64</MemtableThroughputInMB>\n" + 
			"  <!--\n" + 
			"   ~ Throughput setting for Binary Memtables.  Typically these are\n" + 
			"   ~ used for bulk load so you want them to be larger.\n" + 
			"  -->\n" + 
			"  <BinaryMemtableThroughputInMB>256</BinaryMemtableThroughputInMB>\n" + 
			"  <!--\n" + 
			"   ~ The maximum number of columns in millions to store in memory per\n" + 
			"   ~ ColumnFamily before flushing to disk.  This is also a per-memtable\n" + 
			"   ~ setting.  Use with MemtableThroughputInMB to tune memory usage.\n" + 
			"  -->\n" + 
			"  <MemtableOperationsInMillions>0.3</MemtableOperationsInMillions>\n" + 
			"  <!--\n" + 
			"   ~ The maximum time to leave a dirty memtable unflushed.\n" + 
			"   ~ (While any affected columnfamilies have unflushed data from a\n" + 
			"   ~ commit log segment, that segment cannot be deleted.)\n" + 
			"   ~ This needs to be large enough that it won't cause a flush storm\n" + 
			"   ~ of all your memtables flushing at once because none has hit\n" + 
			"   ~ the size or count thresholds yet.  For production, a larger\n" + 
			"   ~ value such as 1440 is recommended.\n" + 
			"  -->\n" + 
			"  <MemtableFlushAfterMinutes>60</MemtableFlushAfterMinutes>\n" + 
			"\n" + 
			"  <!--\n" + 
			"   ~ Unlike most systems, in Cassandra writes are faster than reads, so\n" + 
			"   ~ you can afford more of those in parallel.  A good rule of thumb is 2\n" + 
			"   ~ concurrent reads per processor core.  Increase ConcurrentWrites to\n" + 
			"   ~ the number of clients writing at once if you enable CommitLogSync +\n" + 
			"   ~ CommitLogSyncDelay. -->\n" + 
			"  <ConcurrentReads>8</ConcurrentReads>\n" + 
			"  <ConcurrentWrites>32</ConcurrentWrites>\n" + 
			"\n" + 
			"  <!--\n" + 
			"   ~ CommitLogSync may be either \"periodic\" or \"batch.\"  When in batch\n" + 
			"   ~ mode, Cassandra won't ack writes until the commit log has been\n" + 
			"   ~ fsynced to disk.  It will wait up to CommitLogSyncBatchWindowInMS\n" + 
			"   ~ milliseconds for other writes, before performing the sync.\n" + 
			"\n" + 
			"   ~ This is less necessary in Cassandra than in traditional databases\n" + 
			"   ~ since replication reduces the odds of losing data from a failure\n" + 
			"   ~ after writing the log entry but before it actually reaches the disk.\n" + 
			"   ~ So the other option is \"periodic,\" where writes may be acked immediately\n" + 
			"   ~ and the CommitLog is simply synced every CommitLogSyncPeriodInMS\n" + 
			"   ~ milliseconds.\n" + 
			"  -->\n" + 
			"  <CommitLogSync>periodic</CommitLogSync>\n" + 
			"  <!--\n" + 
			"   ~ Interval at which to perform syncs of the CommitLog in periodic mode.\n" + 
			"   ~ Usually the default of 10000ms is fine; increase it if your i/o\n" + 
			"   ~ load is such that syncs are taking excessively long times.\n" + 
			"  -->\n" + 
			"  <CommitLogSyncPeriodInMS>10000</CommitLogSyncPeriodInMS>\n" + 
			"  <!--\n" + 
			"   ~ Delay (in milliseconds) during which additional commit log entries\n" + 
			"   ~ may be written before fsync in batch mode.  This will increase\n" + 
			"   ~ latency slightly, but can vastly improve throughput where there are\n" + 
			"   ~ many writers.  Set to zero to disable (each entry will be synced\n" + 
			"   ~ individually).  Reasonable values range from a minimal 0.1 to 10 or\n" + 
			"   ~ even more if throughput matters more than latency.\n" + 
			"  -->\n" + 
			"  <!-- <CommitLogSyncBatchWindowInMS>1</CommitLogSyncBatchWindowInMS> --> \n" + 
			"\n" + 
			"  <!--\n" + 
			"   ~ Time to wait before garbage-collection deletion markers.  Set this to\n" + 
			"   ~ a large enough value that you are confident that the deletion marker\n" + 
			"   ~ will be propagated to all replicas by the time this many seconds has\n" + 
			"   ~ elapsed, even in the face of hardware failures.  The default value is\n" + 
			"   ~ ten days.\n" + 
			"  -->\n" + 
			"  <GCGraceSeconds>864000</GCGraceSeconds>\n" + 
			"</Storage>\n" + 
			"";

	public static final String	contentsLog4j = "# Licensed to the Apache Software Foundation (ASF) under one\n" + 
			"# or more contributor license agreements.  See the NOTICE file\n" + 
			"# distributed with this work for additional information\n" + 
			"# regarding copyright ownership.  The ASF licenses this file\n" + 
			"# to you under the Apache License, Version 2.0 (the\n" + 
			"# \"License\"); you may not use this file except in compliance\n" + 
			"# with the License.  You may obtain a copy of the License at\n" + 
			"#\n" + 
			"#     http://www.apache.org/licenses/LICENSE-2.0\n" + 
			"#\n" + 
			"# Unless required by applicable law or agreed to in writing, software\n" + 
			"# distributed under the License is distributed on an \"AS IS\" BASIS,\n" + 
			"# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n" + 
			"# See the License for the specific language governing permissions and\n" + 
			"# limitations under the License.\n" + 
			"\n" + 
			"# for production, you should probably set the root to INFO\n" + 
			"# and the pattern to %c instead of %l.  (%l is slower.)\n" + 
			"\n" + 
			"# output messages into a rolling log file as well as stdout\n" + 
			"log4j.rootLogger=INFO,stdout,R\n" + 
			"\n" + 
			"# stdout\n" + 
			"log4j.appender.stdout=org.apache.log4j.ConsoleAppender\n" + 
			"log4j.appender.stdout.layout=org.apache.log4j.PatternLayout\n" + 
			"log4j.appender.stdout.layout.ConversionPattern=%5p %d{HH:mm:ss,SSS} %m%n\n" + 
			"\n" + 
			"# rolling log file\n" + 
			"log4j.appender.R=org.apache.log4j.RollingFileAppender\n" + 
			"log4j.appender.file.maxFileSize=20MB\n" + 
			"log4j.appender.file.maxBackupIndex=50\n" + 
			"log4j.appender.R.layout=org.apache.log4j.PatternLayout\n" + 
			"log4j.appender.R.layout.ConversionPattern=%5p [%t] %d{ISO8601} %F (line %L) %m%n\n" + 
			"# Edit the next line to point to your logs directory\n" + 
			"log4j.appender.R.File=/tmp/cassandra.log\n" + 
			"\n" + 
			"# Application logging options\n" + 
			"#log4j.logger.com.facebook=DEBUG\n" + 
			"#log4j.logger.com.facebook.infrastructure.gms=DEBUG\n" + 
			"#log4j.logger.com.facebook.infrastructure.db=DEBUG\n" + 
			"";
}
