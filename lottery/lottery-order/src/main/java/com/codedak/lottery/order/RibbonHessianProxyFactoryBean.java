package com.codedak.lottery.order;
import java.net.URI;
import java.util.HashMap;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

public class RibbonHessianProxyFactoryBean extends HessianProxyFactoryBean{
	@Autowired
	private  SpringClientFactory clientFactory;
	
	private volatile HashMap<String, HessianProxyFactoryBean> beans=new HashMap<>();
	
	

	
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String superUrl=super.getServiceUrl();
		URI asUri = URI.create(superUrl);
		String clientName = asUri.getHost();
		ILoadBalancer lb=clientFactory.getLoadBalancer(clientName);
		Server server= lb.chooseServer("");
		if(beans.containsKey(server.getHostPort())) {
			return beans.get(server.getHostPort()).invoke(invocation);
		}
		HessianProxyFactoryBean bean=new HessianProxyFactoryBean();
		bean.setServiceUrl("http://data/lotteryOrderService");
		bean.setServiceInterface(getServiceInterface());
		beans.put(server.getHostPort(), bean);
	   return bean.invoke(invocation);
	}
}
