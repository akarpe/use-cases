package com.customer.app.inbound;
//
//import org.junit.rules.ExternalResource;


import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.store.memory.MemoryPersistenceAdapter;
import org.junit.rules.ExternalResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmbeddedActiveMQBroker extends ExternalResource {
	private final Logger log = LoggerFactory.getLogger(EmbeddedActiveMQBroker.class);
	private String brokerId = "embedded";
	private BrokerService brokerService;
	private String uri;

	public EmbeddedActiveMQBroker(String brokerId) {
		if (brokerId!=null) this.brokerId = brokerId;
		//tcpConnectorUri = "tcp://localhost:" + AvailablePortFinder.getNextAvailable(61616);
		uri= "vm://"+brokerId;
		brokerService = new BrokerService();
		brokerService.setBrokerId(brokerId);
		brokerService.setPersistent(false);
		brokerService.setUseJmx(false);
		try {
			brokerService.setPersistenceAdapter(new MemoryPersistenceAdapter());
			//brokerService.addConnector(tcpConnectorUri);
		} catch (Exception e) {
			throw new RuntimeException("Problem creating brokerService", e);
		}
	}

	@Override
	protected void before() throws Throwable {
		log.info("Starting embedded broker[{}] on {}", brokerId, uri);
		brokerService.start();
	}

	@Override
	protected void after() {
		try {
			log.info("Stopping embedded broker[{}]", brokerId);
			brokerService.stop();
		} catch (Exception e) {
			throw new RuntimeException("Exception shutting down broker service", e);
		}
	}

	public String getUri() {
		return uri;
	}
}