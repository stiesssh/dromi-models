// Generated from graphql_java_gen gem

package de.unistuttgart.gropius.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.time.Instant;

import java.time.format.DateTimeFormatter;

import java.time.temporal.TemporalAccessor;

import java.util.Date;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The Payload/Response for the removeComponentFromProject mutation
*/
public class RemoveComponentFromProjectPayload extends AbstractResponse<RemoveComponentFromProjectPayload> {
    public RemoveComponentFromProjectPayload() {
    }

    public RemoveComponentFromProjectPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "clientMutationID": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "project": {
                    responseData.put(key, new Project(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "component": {
                    responseData.put(key, new Component(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "RemoveComponentFromProjectPayload";
    }

    /**
    * The string provided by the client on sending the mutation
    */

    public String getClientMutationId() {
        return (String) get("clientMutationID");
    }

    public RemoveComponentFromProjectPayload setClientMutationId(String arg) {
        optimisticData.put(getKey("clientMutationID"), arg);
        return this;
    }

    /**
    * The project from which the component was removed
    */

    public Project getProject() {
        return (Project) get("project");
    }

    public RemoveComponentFromProjectPayload setProject(Project arg) {
        optimisticData.put(getKey("project"), arg);
        return this;
    }

    /**
    * The component which was removed from the project
    */

    public Component getComponent() {
        return (Component) get("component");
    }

    public RemoveComponentFromProjectPayload setComponent(Component arg) {
        optimisticData.put(getKey("component"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "clientMutationID": return false;

            case "project": return true;

            case "component": return true;

            default: return false;
        }
    }
}
