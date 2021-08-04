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
* The Payload/Response for the removeIssueFromLocation mutation
*/
public class RemoveIssueFromLocationPayloadQuery extends Query<RemoveIssueFromLocationPayloadQuery> {
    RemoveIssueFromLocationPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The string provided by the client on sending the mutation
    */
    public RemoveIssueFromLocationPayloadQuery clientMutationId() {
        startField("clientMutationID");

        return this;
    }

    /**
    * The issue location the issue was removed from
    */
    public RemoveIssueFromLocationPayloadQuery location(IssueLocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new IssueLocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The issue which removed from the location
    */
    public RemoveIssueFromLocationPayloadQuery issue(IssueQueryDefinition queryDef) {
        startField("issue");

        _queryBuilder.append('{');
        queryDef.define(new IssueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The issue timeline event for the removal of the issue from the location
    */
    public RemoveIssueFromLocationPayloadQuery event(RemovedFromLocationEventQueryDefinition queryDef) {
        startField("event");

        _queryBuilder.append('{');
        queryDef.define(new RemovedFromLocationEventQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The edge to be able to request other timeline items from this timeline item
    */
    public RemoveIssueFromLocationPayloadQuery timelineEdge(IssueTimelineItemEdgeQueryDefinition queryDef) {
        startField("timelineEdge");

        _queryBuilder.append('{');
        queryDef.define(new IssueTimelineItemEdgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}