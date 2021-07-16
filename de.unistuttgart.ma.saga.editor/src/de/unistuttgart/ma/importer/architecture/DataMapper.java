package de.unistuttgart.ma.importer.architecture;

import java.util.HashMap;
import java.util.Map;

import com.shopify.graphql.support.ID;

import de.unistuttgart.gropius.Component;
import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.ma.saga.SagaFactory;

public class DataMapper {
	
	private Map<ID, Component> componentMap;
	private Map<ID, ComponentInterface> interfaceMap;

	SagaFactory factory = SagaFactory.eINSTANCE;
	
	public DataMapper() {
		componentMap = new HashMap<>();
		interfaceMap = new HashMap<>();
	}
	
	/**
	 * component with name set but interfaces not set
	 * @param component
	 * @return
	 */
	public Component getEcoreComponent(de.foo.generated.Component component) {
		ID id = component.getId();
		if(componentMap.containsKey(id)) {
			return componentMap.get(id);
		} 
		
		var result = factory.createComponentAdapter();
		result.setName(component.getName());
		componentMap.put(id, result);
		return result;
	}
	
	/**
	 * interface with name & provider set
	 * @param compInterface
	 * @return
	 */
	public ComponentInterface getEcoreInterface(de.foo.generated.ComponentInterface compInterface) {
		ID id = compInterface.getId();
		if(interfaceMap.containsKey(id)) {
			return interfaceMap.get(id);
		}
		
		var result = factory.createComponentInterfaceAdapter();
		result.setName(compInterface.getName());
		result.setComponent(getEcoreComponent(compInterface.getComponent()));
		interfaceMap.put(id, result);
		return result;
	}
}
