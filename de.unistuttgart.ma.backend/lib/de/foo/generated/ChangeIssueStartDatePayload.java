// Generated from graphql_java_gen gem

package de.foo.generated;

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
* The Payload/Response for the changeIssueStartDate mutation
*/
public class ChangeIssueStartDatePayload extends AbstractResponse<ChangeIssueStartDatePayload> {
    public ChangeIssueStartDatePayload() {
    }

    public ChangeIssueStartDatePayload(JsonObject fields) throws SchemaViolationError {
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

                case "issue": {
                    Issue optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Issue(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "event": {
                    StartDateChangedEvent optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StartDateChangedEvent(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "timelineEdge": {
                    IssueTimelineItemEdge optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssueTimelineItemEdge(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
        return "ChangeIssueStartDatePayload";
    }

    /**
    * The string provided by the client on sending the mutation
    */

    public String getClientMutationId() {
        return (String) get("clientMutationID");
    }

    public ChangeIssueStartDatePayload setClientMutationId(String arg) {
        optimisticData.put(getKey("clientMutationID"), arg);
        return this;
    }

    /**
    * The issue of which the start date was updated
    */

    public Issue getIssue() {
        return (Issue) get("issue");
    }

    public ChangeIssueStartDatePayload setIssue(Issue arg) {
        optimisticData.put(getKey("issue"), arg);
        return this;
    }

    /**
    * The issue timeline event for the changing start date
    */

    public StartDateChangedEvent getEvent() {
        return (StartDateChangedEvent) get("event");
    }

    public ChangeIssueStartDatePayload setEvent(StartDateChangedEvent arg) {
        optimisticData.put(getKey("event"), arg);
        return this;
    }

    /**
    * The edge to be able to request other timeline items from this timeline item
    */

    public IssueTimelineItemEdge getTimelineEdge() {
        return (IssueTimelineItemEdge) get("timelineEdge");
    }

    public ChangeIssueStartDatePayload setTimelineEdge(IssueTimelineItemEdge arg) {
        optimisticData.put(getKey("timelineEdge"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "clientMutationID": return false;

            case "issue": return true;

            case "event": return true;

            case "timelineEdge": return true;

            default: return false;
        }
    }
}
