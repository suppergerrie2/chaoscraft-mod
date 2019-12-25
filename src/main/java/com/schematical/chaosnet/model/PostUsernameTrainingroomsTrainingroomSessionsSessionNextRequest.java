/**

*/
package com.schematical.chaosnet.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.auth.RequestSigner;
import com.amazonaws.opensdk.protect.auth.RequestSignerAware;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chaosnet-2019-09-20T20:35:34Z/PostUsernameTrainingroomsTrainingroomSessionsSessionNext"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostUsernameTrainingroomsTrainingroomSessionsSessionNextRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable,
        RequestSignerAware {

    private String session;

    private TrainingRoomSessionNextRequest trainingRoomSessionNextRequest;

    private String trainingroom;

    private String username;

    /**
     * @param session
     */

    public void setSession(String session) {
        this.session = session;
    }

    /**
     * @return
     */

    public String getSession() {
        return this.session;
    }

    /**
     * @param session
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostUsernameTrainingroomsTrainingroomSessionsSessionNextRequest session(String session) {
        setSession(session);
        return this;
    }

    /**
     * @param trainingRoomSessionNextRequest
     */

    public void setTrainingRoomSessionNextRequest(TrainingRoomSessionNextRequest trainingRoomSessionNextRequest) {
        this.trainingRoomSessionNextRequest = trainingRoomSessionNextRequest;
    }

    /**
     * @return
     */

    public TrainingRoomSessionNextRequest getTrainingRoomSessionNextRequest() {
        return this.trainingRoomSessionNextRequest;
    }

    /**
     * @param trainingRoomSessionNextRequest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostUsernameTrainingroomsTrainingroomSessionsSessionNextRequest trainingRoomSessionNextRequest(
            TrainingRoomSessionNextRequest trainingRoomSessionNextRequest) {
        setTrainingRoomSessionNextRequest(trainingRoomSessionNextRequest);
        return this;
    }

    /**
     * @param trainingroom
     */

    public void setTrainingroom(String trainingroom) {
        this.trainingroom = trainingroom;
    }

    /**
     * @return
     */

    public String getTrainingroom() {
        return this.trainingroom;
    }

    /**
     * @param trainingroom
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostUsernameTrainingroomsTrainingroomSessionsSessionNextRequest trainingroom(String trainingroom) {
        setTrainingroom(trainingroom);
        return this;
    }

    /**
     * @param username
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * @param username
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostUsernameTrainingroomsTrainingroomSessionsSessionNextRequest username(String username) {
        setUsername(username);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSession() != null)
            sb.append("Session: ").append(getSession()).append(",");
        if (getTrainingRoomSessionNextRequest() != null)
            sb.append("TrainingRoomSessionNextRequest: ").append(getTrainingRoomSessionNextRequest()).append(",");
        if (getTrainingroom() != null)
            sb.append("Trainingroom: ").append(getTrainingroom()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostUsernameTrainingroomsTrainingroomSessionsSessionNextRequest == false)
            return false;
        PostUsernameTrainingroomsTrainingroomSessionsSessionNextRequest other = (PostUsernameTrainingroomsTrainingroomSessionsSessionNextRequest) obj;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        if (other.getTrainingRoomSessionNextRequest() == null ^ this.getTrainingRoomSessionNextRequest() == null)
            return false;
        if (other.getTrainingRoomSessionNextRequest() != null
                && other.getTrainingRoomSessionNextRequest().equals(this.getTrainingRoomSessionNextRequest()) == false)
            return false;
        if (other.getTrainingroom() == null ^ this.getTrainingroom() == null)
            return false;
        if (other.getTrainingroom() != null && other.getTrainingroom().equals(this.getTrainingroom()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        hashCode = prime * hashCode + ((getTrainingRoomSessionNextRequest() == null) ? 0 : getTrainingRoomSessionNextRequest().hashCode());
        hashCode = prime * hashCode + ((getTrainingroom() == null) ? 0 : getTrainingroom().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public PostUsernameTrainingroomsTrainingroomSessionsSessionNextRequest clone() {
        return (PostUsernameTrainingroomsTrainingroomSessionsSessionNextRequest) super.clone();
    }

    @Override
    public Class<? extends RequestSigner> signerType() {
        return com.schematical.chaosnet.auth.ChaosnetCognitoUserPool.class;
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PostUsernameTrainingroomsTrainingroomSessionsSessionNextRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}