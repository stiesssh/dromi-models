package de.unistuttgart.ma.saga.presentation;

/**
 * Default values to fill into the field of the creation wizard.
 */
public class Literals {
	public static final String gropiusUrl = "http://localhost:8080/api/";
	public static final String gropiusProjectName = "t2-project";
	
	public static final String solomonUrl = "http://localhost:6400/solomon/slos/";
	public static final String solomonDeploymentEnvironment= "kubernetes";
	
	public static final String bpmnFilePath = "processes/t2Process.bpmn2";
	
	public static final String backendUrl = "http://localhost:8083/";
	
	public static final String backendPostModelEndpoint = "api/model/";// {systemid}
}