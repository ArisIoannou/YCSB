package com.yahoo.ycsb.db;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

public class RedisCluster implements Redis {
	
	private JedisCluster jedis;
	
	public RedisCluster(String host, int port) {
		Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
		
		jedisClusterNodes.add(new HostAndPort(host, port));
		this.jedis = new JedisCluster(jedisClusterNodes);
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String auth(String password) {
		// TODO Auto-generated method stub
		return jedis.auth(password);
	}

	@Override
	public List<String> hmget(String key, String... field) {
		// TODO Auto-generated method stub
		return jedis.hmget(key, field);
	}

	@Override
	public Long zadd(String key, double score, String member) {
		// TODO Auto-generated method stub
		return jedis.zadd(key, score, member);
	}

	@Override
	public Long del(String key) {
		// TODO Auto-generated method stub
		return jedis.del(key);
	}

	@Override
	public Long zrem(String key, String... members) {
		// TODO Auto-generated method stub
		return jedis.zrem(key, members);
	}

	@Override
	public String hmset(String key, Map<String, String> hash) {
		// TODO Auto-generated method stub
		return jedis.hmset(key, hash);
	}

	@Override
	public Set<String> zrangeByScore(String key, double min, double max,
			int offset, int count) {
		// TODO Auto-generated method stub
		return jedis.zrangeByScore(key, min, max, offset, count);
	}

	@Override
	public Map<String, String> hgetAll(String key) {
		// TODO Auto-generated method stub
		return jedis.hgetAll(key);
	}

}
