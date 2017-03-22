package ys.service;

public interface RedisService {
	void set(String key, String val);
	String get(String key);
}
