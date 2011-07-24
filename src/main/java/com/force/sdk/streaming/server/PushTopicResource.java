package com.force.sdk.streaming.server;

import com.force.sdk.streaming.client.PushTopicManager;
import com.force.sdk.streaming.model.PushTopic;
import com.google.gson.Gson;

import javax.inject.Inject;
import javax.ws.rs.*;

/**
 * @author naamannewbold
 */
@Path("/pushtopic")
public class PushTopicResource {

    @Inject
    PushTopicManager pushTopicManager;

    @GET
    @Produces("application/json")
    public String getPushTopics() {
        return new Gson().toJson(pushTopicManager.getTopics());
    }

    @GET @Path("/{id: [a-zA-Z0-9]{15,18}}")
    @Produces("application/json")
    public String getPushTopic(@PathParam("id") String pushTopicId) {
        return new Gson().toJson(pushTopicManager.getTopicById(pushTopicId));
    }

    @POST
    @Consumes("application/json")
    public String createPushTopic(PushTopic pushTopic) {
        return new Gson().toJson(pushTopicManager.createPushTopic(pushTopic));
    }

    @PUT @Path("/{id: [a-zA-Z0-9]{15,18}}")
    @Consumes("application/json")
    public String updatePushTopic(@PathParam("id") String pushTopicId, PushTopic pushTopic) {
        return new Gson().toJson(pushTopicManager.updatePushTopic(pushTopicId, pushTopic));
    }

    @DELETE @Path("/{id: [a-zA-Z0-9]{15,18}}")
    @Produces("application/json")
    public String deletePushTopic(@PathParam("id") String pushTopicId) {
        pushTopicManager.delete(pushTopicId);
        return new Gson().toJson("Deleted " + pushTopicId);
    }
}
