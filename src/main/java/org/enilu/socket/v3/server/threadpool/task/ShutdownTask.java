package org.enilu.socket.v3.server.threadpool.task;

/**
 * 服务器停止worker
 * <p>
 * <li>该worker用来标识服务器即将被停止，当ServiceEngine读取到该worker的时候，不再监听工作队列，准备停止工作</li>
 * <p>
 * 2014年8月19日
 * <p>
 * 
 * @author enilu(82552623@qq.com)
 * 
 */
public class ShutdownTask extends Task {

	@Override
	public String work() {
		return "shutdown";

	}

	@Override
	/**
	 * 必须返回shutdown字符串，以便ServiceEngine
	 */
	public String toString() {
		return "shutdown";
	}

}
