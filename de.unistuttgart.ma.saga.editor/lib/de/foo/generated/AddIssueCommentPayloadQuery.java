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
* The Payload/Response for the addIssueComment mutation
*/
public class AddIssueCommentPayloadQuery extends Query<AddIssueCommentPayloadQuery> {
    AddIssueCommentPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The string provided by the client on sending the mutation
    */
    public AddIssueCommentPayloadQuery clientMutationId() {
        startField("clientMutationID");

        return this;
    }

    /**
    * The issue comment object that was created.
    * __NOTE:__This is also the timeline event!
    */
    public AddIssueCommentPayloadQuery comment(IssueCommentQueryDefinition queryDef) {
        startField("comment");

        _queryBuilder.append('{');
        queryDef.define(new IssueCommentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The issue to which the user was assigned
    */
    public AddIssueCommentPayloadQuery issue(IssueQueryDefinition queryDef) {
        startField("issue");

        _queryBuilder.append('{');
        queryDef.define(new IssueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The edge to be able to request other timeline items from this timeline item
    */
    public AddIssueCommentPayloadQuery timelineEdge(IssueTimelineItemEdgeQueryDefinition queryDef) {
        startField("timelineEdge");

        _queryBuilder.append('{');
        queryDef.define(new IssueTimelineItemEdgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
