package com.yahoo.ycsb.db;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Redis {
	public abstract void connect();
	
	public abstract void disconnect();
	
	public abstract String auth(String password);
	
	public abstract List<String> hmget(String key, String... field);
	
	public abstract Long zadd(String key, double score, String member);
	
	public abstract Long del(String key);
	
	public abstract Long zrem(String key, String... members);

	public abstract String hmset(String key, Map<String, String> hash);
	
	public abstract Set<String> zrangeByScore(String key, double min, double max, int offset, int count);

	public abstract Map<String, String> hgetAll(String key);
	
}
