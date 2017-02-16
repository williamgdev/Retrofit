
package com.gthub.williamg.myapplication.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LiveStream  extends BaseDto{

    @SerializedName("aspect_ratio_height")
    @Expose
    private int aspectRatioHeight;
    @SerializedName("aspect_ratio_width")
    @Expose
    private int aspectRatioWidth;
    @SerializedName("billing_mode")
    @Expose
    private String billingMode;
    @SerializedName("broadcast_location")
    @Expose
    private String broadcastLocation;
    @SerializedName("closed_caption_type")
    @Expose
    private String closedCaptionType;
    @SerializedName("connection_code")
    @Expose
    private String connectionCode;
    @SerializedName("connection_code_expires_at")
    @Expose
    private String connectionCodeExpiresAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("delivery_method")
    @Expose
    private String deliveryMethod;
    @SerializedName("delivery_protocols")
    @Expose
    private List<String> deliveryProtocols = null;
    @SerializedName("delivery_type")
    @Expose
    private String deliveryType;
    @SerializedName("direct_playback_urls")
    @Expose
    private List<DirectPlaybackUrl> directPlaybackUrls = null;
    @SerializedName("encoder")
    @Expose
    private String encoder;
    @SerializedName("hosted_page")
    @Expose
    private boolean hostedPage;
    @SerializedName("hosted_page_description")
    @Expose
    private String hostedPageDescription;
    @SerializedName("hosted_page_logo_image_url")
    @Expose
    private String hostedPageLogoImageUrl;
    @SerializedName("hosted_page_sharing_icons")
    @Expose
    private boolean hostedPageSharingIcons;
    @SerializedName("hosted_page_title")
    @Expose
    private String hostedPageTitle;
    @SerializedName("hosted_page_url")
    @Expose
    private String hostedPageUrl;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("player_countdown")
    @Expose
    private boolean playerCountdown;
    @SerializedName("player_countdown_at")
    @Expose
    private String playerCountdownAt;
    @SerializedName("player_embed_code")
    @Expose
    private String playerEmbedCode;
    @SerializedName("player_hds_playback_url")
    @Expose
    private String playerHdsPlaybackUrl;
    @SerializedName("player_hls_playback_url")
    @Expose
    private String playerHlsPlaybackUrl;
    @SerializedName("player_id")
    @Expose
    private String playerId;
    @SerializedName("player_logo_image_url")
    @Expose
    private String playerLogoImageUrl;
    @SerializedName("player_logo_position")
    @Expose
    private String playerLogoPosition;
    @SerializedName("player_responsive")
    @Expose
    private boolean playerResponsive;
    @SerializedName("player_type")
    @Expose
    private String playerType;
    @SerializedName("player_video_poster_image_url")
    @Expose
    private String playerVideoPosterImageUrl;
    @SerializedName("player_width")
    @Expose
    private int playerWidth;
    @SerializedName("recording")
    @Expose
    private boolean recording;
    @SerializedName("stream_source_id")
    @Expose
    private String streamSourceId;
    @SerializedName("stream_targets")
    @Expose
    private List<StreamTarget> streamTargets = null;
    @SerializedName("target_delivery_protocol")
    @Expose
    private String targetDeliveryProtocol;
    @SerializedName("transcoder_type")
    @Expose
    private String transcoderType;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("use_stream_source")
    @Expose
    private boolean useStreamSource;
    @SerializedName("video_fallback")
    @Expose
    private boolean videoFallback;

    @SerializedName("state")
    @Expose
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAspectRatioHeight() {
        return aspectRatioHeight;
    }

    public void setAspectRatioHeight(int aspectRatioHeight) {
        this.aspectRatioHeight = aspectRatioHeight;
    }

    public int getAspectRatioWidth() {
        return aspectRatioWidth;
    }

    public void setAspectRatioWidth(int aspectRatioWidth) {
        this.aspectRatioWidth = aspectRatioWidth;
    }

    public String getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(String billingMode) {
        this.billingMode = billingMode;
    }

    public String getBroadcastLocation() {
        return broadcastLocation;
    }

    public void setBroadcastLocation(String broadcastLocation) {
        this.broadcastLocation = broadcastLocation;
    }

    public String getClosedCaptionType() {
        return closedCaptionType;
    }

    public void setClosedCaptionType(String closedCaptionType) {
        this.closedCaptionType = closedCaptionType;
    }

    public String getConnectionCode() {
        return connectionCode;
    }

    public void setConnectionCode(String connectionCode) {
        this.connectionCode = connectionCode;
    }

    public String getConnectionCodeExpiresAt() {
        return connectionCodeExpiresAt;
    }

    public void setConnectionCodeExpiresAt(String connectionCodeExpiresAt) {
        this.connectionCodeExpiresAt = connectionCodeExpiresAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public List<String> getDeliveryProtocols() {
        return deliveryProtocols;
    }

    public void setDeliveryProtocols(List<String> deliveryProtocols) {
        this.deliveryProtocols = deliveryProtocols;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public List<DirectPlaybackUrl> getDirectPlaybackUrls() {
        return directPlaybackUrls;
    }

    public void setDirectPlaybackUrls(List<DirectPlaybackUrl> directPlaybackUrls) {
        this.directPlaybackUrls = directPlaybackUrls;
    }

    public String getEncoder() {
        return encoder;
    }

    public void setEncoder(String encoder) {
        this.encoder = encoder;
    }

    public boolean isHostedPage() {
        return hostedPage;
    }

    public void setHostedPage(boolean hostedPage) {
        this.hostedPage = hostedPage;
    }

    public String getHostedPageDescription() {
        return hostedPageDescription;
    }

    public void setHostedPageDescription(String hostedPageDescription) {
        this.hostedPageDescription = hostedPageDescription;
    }

    public String getHostedPageLogoImageUrl() {
        return hostedPageLogoImageUrl;
    }

    public void setHostedPageLogoImageUrl(String hostedPageLogoImageUrl) {
        this.hostedPageLogoImageUrl = hostedPageLogoImageUrl;
    }

    public boolean isHostedPageSharingIcons() {
        return hostedPageSharingIcons;
    }

    public void setHostedPageSharingIcons(boolean hostedPageSharingIcons) {
        this.hostedPageSharingIcons = hostedPageSharingIcons;
    }

    public String getHostedPageTitle() {
        return hostedPageTitle;
    }

    public void setHostedPageTitle(String hostedPageTitle) {
        this.hostedPageTitle = hostedPageTitle;
    }

    public String getHostedPageUrl() {
        return hostedPageUrl;
    }

    public void setHostedPageUrl(String hostedPageUrl) {
        this.hostedPageUrl = hostedPageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPlayerCountdown() {
        return playerCountdown;
    }

    public void setPlayerCountdown(boolean playerCountdown) {
        this.playerCountdown = playerCountdown;
    }

    public String getPlayerCountdownAt() {
        return playerCountdownAt;
    }

    public void setPlayerCountdownAt(String playerCountdownAt) {
        this.playerCountdownAt = playerCountdownAt;
    }

    public String getPlayerEmbedCode() {
        return playerEmbedCode;
    }

    public void setPlayerEmbedCode(String playerEmbedCode) {
        this.playerEmbedCode = playerEmbedCode;
    }

    public String getPlayerHdsPlaybackUrl() {
        return playerHdsPlaybackUrl;
    }

    public void setPlayerHdsPlaybackUrl(String playerHdsPlaybackUrl) {
        this.playerHdsPlaybackUrl = playerHdsPlaybackUrl;
    }

    public String getPlayerHlsPlaybackUrl() {
        return playerHlsPlaybackUrl;
    }

    public void setPlayerHlsPlaybackUrl(String playerHlsPlaybackUrl) {
        this.playerHlsPlaybackUrl = playerHlsPlaybackUrl;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerLogoImageUrl() {
        return playerLogoImageUrl;
    }

    public void setPlayerLogoImageUrl(String playerLogoImageUrl) {
        this.playerLogoImageUrl = playerLogoImageUrl;
    }

    public String getPlayerLogoPosition() {
        return playerLogoPosition;
    }

    public void setPlayerLogoPosition(String playerLogoPosition) {
        this.playerLogoPosition = playerLogoPosition;
    }

    public boolean isPlayerResponsive() {
        return playerResponsive;
    }

    public void setPlayerResponsive(boolean playerResponsive) {
        this.playerResponsive = playerResponsive;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public String getPlayerVideoPosterImageUrl() {
        return playerVideoPosterImageUrl;
    }

    public void setPlayerVideoPosterImageUrl(String playerVideoPosterImageUrl) {
        this.playerVideoPosterImageUrl = playerVideoPosterImageUrl;
    }

    public int getPlayerWidth() {
        return playerWidth;
    }

    public void setPlayerWidth(int playerWidth) {
        this.playerWidth = playerWidth;
    }

    public boolean isRecording() {
        return recording;
    }

    public void setRecording(boolean recording) {
        this.recording = recording;
    }

    public String getStreamSourceId() {
        return streamSourceId;
    }

    public void setStreamSourceId(String streamSourceId) {
        this.streamSourceId = streamSourceId;
    }

    public List<StreamTarget> getStreamTargets() {
        return streamTargets;
    }

    public void setStreamTargets(List<StreamTarget> streamTargets) {
        this.streamTargets = streamTargets;
    }

    public String getTargetDeliveryProtocol() {
        return targetDeliveryProtocol;
    }

    public void setTargetDeliveryProtocol(String targetDeliveryProtocol) {
        this.targetDeliveryProtocol = targetDeliveryProtocol;
    }

    public String getTranscoderType() {
        return transcoderType;
    }

    public void setTranscoderType(String transcoderType) {
        this.transcoderType = transcoderType;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isUseStreamSource() {
        return useStreamSource;
    }

    public void setUseStreamSource(boolean useStreamSource) {
        this.useStreamSource = useStreamSource;
    }

    public boolean isVideoFallback() {
        return videoFallback;
    }

    public void setVideoFallback(boolean videoFallback) {
        this.videoFallback = videoFallback;
    }

}
