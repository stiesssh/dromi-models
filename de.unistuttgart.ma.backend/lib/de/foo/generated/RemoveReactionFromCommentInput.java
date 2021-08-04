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

public class RemoveReactionFromCommentInput implements Serializable {
    private ID comment;

    private String reactionToRemove;

    private Input<String> clientMutationId = Input.undefined();

    public RemoveReactionFromCommentInput(ID comment, String reactionToRemove) {
        this.comment = comment;

        this.reactionToRemove = reactionToRemove;
    }

    public ID getComment() {
        return comment;
    }

    public RemoveReactionFromCommentInput setComment(ID comment) {
        this.comment = comment;
        return this;
    }

    public String getReactionToRemove() {
        return reactionToRemove;
    }

    public RemoveReactionFromCommentInput setReactionToRemove(String reactionToRemove) {
        this.reactionToRemove = reactionToRemove;
        return this;
    }

    public String getClientMutationId() {
        return clientMutationId.getValue();
    }

    public Input<String> getClientMutationIdInput() {
        return clientMutationId;
    }

    public RemoveReactionFromCommentInput setClientMutationId(String clientMutationId) {
        this.clientMutationId = Input.optional(clientMutationId);
        return this;
    }

    public RemoveReactionFromCommentInput setClientMutationIdInput(Input<String> clientMutationId) {
        if (clientMutationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.clientMutationId = clientMutationId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("comment:");
        Query.appendQuotedString(_queryBuilder, comment.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("reactionToRemove:");
        Query.appendQuotedString(_queryBuilder, reactionToRemove.toString());

        if (this.clientMutationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("clientMutationID:");
            if (clientMutationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, clientMutationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}