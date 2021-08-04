package de.unistuttgart.ma.backend.importer.architecture;

import java.util.List;

import com.shopify.graphql.support.ID;

import de.foo.generated.ComponentInterfacePageQuery;
import de.foo.generated.ComponentInterfacePageQueryDefinition;
import de.foo.generated.ComponentInterfaceQuery;
import de.foo.generated.ComponentInterfaceQueryDefinition;
import de.foo.generated.ComponentPageQuery;
import de.foo.generated.ComponentPageQueryDefinition;
import de.foo.generated.ComponentQuery;
import de.foo.generated.ComponentQueryDefinition;
import de.foo.generated.Operations;
import de.foo.generated.ProjectFilter;
import de.foo.generated.ProjectPageQuery;
import de.foo.generated.ProjectPageQueryDefinition;
import de.foo.generated.ProjectQuery;
import de.foo.generated.ProjectQueryDefinition;
import de.foo.generated.QueryQuery;
import de.foo.generated.QueryQueryDefinition;
import de.foo.generated.UserQuery;
import de.foo.generated.UserQueryDefinition;
import de.foo.generated.QueryQuery.ProjectsArguments;
import de.foo.generated.QueryQuery.ProjectsArgumentsDefinition;

public class GropiusApiQueries {

	private static ProjectPageQueryDefinition projectPageQueryDef;
	
	/**
	 * query for all project with all there components and interface. omit everything else because i dont care. 
	 * @return
	 */
	public static QueryQuery getAllProjectsQuery() {
		QueryQueryDefinition qqd = (QueryQuery qq) -> {qq.projects(projectPageQueryDef);};
		return Operations.query(qqd);
	}
	
	/**
	 * 
	 * @return
	 */
	public static QueryQuery getAllUsersQuery() {
		UserQueryDefinition uqd = (UserQuery uq) -> uq.username();
		
		QueryQueryDefinition qqd = (QueryQuery qq) -> {qq.projects(ppqd -> ppqd.nodes(pqd -> pqd.owner(uqd)));};
		return Operations.query(qqd);
	}
	
	/**
	 * 
	 * @param userName
	 * @return
	 */
	public static QueryQuery getProjectForUserQuery(String userName) {
		QueryQueryDefinition qqd = (QueryQuery qq) -> {qq.projects(makeUserFilter(userName), projectPageQueryDef);};
		return Operations.query(qqd);
	}
	
	/**
	 * 
	 * @param projectName
	 * @return
	 */
	public static QueryQuery getSingleProjectQuery(String projectName) {
		QueryQueryDefinition qqd= (QueryQuery qq) -> {qq.projects(makeFilter(projectName), projectPageQueryDef);};
		return Operations.query(qqd);
	}
	
	static {
		ComponentInterfaceQueryDefinition ciqd = (ComponentInterfaceQuery ciq) -> {ciq.name().component((ComponentQuery cq) -> {cq.name();});};	
		ComponentInterfacePageQueryDefinition cipqd = (ComponentInterfacePageQuery cip) -> {cip.nodes(ciqd);};
		
		ComponentQueryDefinition cqd = (ComponentQuery cq) -> {cq.name().consumedInterfaces(cipqd).interfaces(cipqd);};	
		ComponentPageQueryDefinition cpqd = (ComponentPageQuery cpq) -> {cpq.nodes(cqd);};
	
		ProjectQueryDefinition pqd = (ProjectQuery pq) -> {pq.components(cpqd);};
		projectPageQueryDef = (ProjectPageQuery ppq) -> {ppq.nodes(pqd);};
	}

	private static ProjectsArgumentsDefinition makeUserFilter(String userid) {
		ProjectFilter filter = new ProjectFilter().setOwner(List.of(new ID(userid)));
		
		ProjectsArgumentsDefinition argsDef = (ProjectsArguments args) -> args.filterBy(filter);
		return argsDef;
	}
	
	private static ProjectsArgumentsDefinition makeFilter(String projectName) {
		ProjectFilter filter = new ProjectFilter().setName(projectName);
		
		ProjectsArgumentsDefinition argsDef = (ProjectsArguments args) -> args.filterBy(filter);
		return argsDef;
	}
}
