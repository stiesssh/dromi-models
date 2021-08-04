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

public class Profile extends AbstractResponse<Profile> {
    public Profile() {
    }

    public Profile(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "age": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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
        return "Profile";
    }

    public String getName() {
        return (String) get("name");
    }

    public Profile setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public Integer getAge() {
        return (Integer) get("age");
    }

    public Profile setAge(Integer arg) {
        optimisticData.put(getKey("age"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "name": return false;

            case "age": return false;

            default: return false;
        }
    }
}

